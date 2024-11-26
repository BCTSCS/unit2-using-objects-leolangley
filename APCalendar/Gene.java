public class Gene {
    private String dna;
    private int geneCount;

    public Gene(String d) {
        dna = d;
        geneCount = 0;
    }

    public static int findStopCodon(String genome, int start){
        if (genome.length()%3 != 0) return -1;
        for (int i = start; i < genome.length()-2;i+=3){
            if (genome.substring(i,i+3).equals("TAA")
    || genome.substring(i,i+3).equals("TAG")
    || genome.substring(i,i+3).equals("TGA")){
        return i;
    }
        }
        return -1;
    }    

    public static int countNucelotides(String g, char nucleotide) {
        int count = 0;
        for(int i=0; i<g.length(); i++){
            if(g.charAt(i) == nucleotide){
                count++;
            }
        }

        return count;
    }

    public boolean potentialGene(String g) {
        int startCoIn = g.indexOf("ATG");
        if (startCoIn == -1) {
            return false;
        }
        int stopCoIn = findStopCodon(g, startCoIn + 3);
        if (stopCoIn == -1) {
            return false;
        }
        int length = stopCoIn - startCoIn;
        if (length % 3 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Gene gene = new Gene("ATGCATAGCGCATAG");
        System.out.println(gene.potentialGene("ATGCATAGCGCATAG"));
    }
}
