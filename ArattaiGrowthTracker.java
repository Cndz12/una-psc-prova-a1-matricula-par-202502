//Nome: Vitor Hugo Xavier Afonso dos Santos
//Matricula: 4251924736
public class ArattaiGrowthTracker {
    public static void main(String[] args) {
    
        int[] downloadsDiarios = {
            850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000
        };
        String[] diasDaSemana = {
            "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"
        };
        System.out.println("Analise Semanal");
    
        long totalDownloads = 0; 
        
        for (int downloads : downloadsDiarios) {
            totalDownloads += downloads;
        }
        String totalFormatado = String.format("%,d", totalDownloads).replace(",", ".");
        System.out.println("total de Downloads na Semana: " + totalFormatado);
        
        int picoDownloads = downloadsDiarios[0]; 
        String diaPico = diasDaSemana[0];
        
        int minimoDownloads = downloadsDiarios[0]; 
        String diaMinimo = diasDaSemana[0];
        
        for (int i = 0; i < downloadsDiarios.length; i++) {
            int downloadsDoDia = downloadsDiarios[i];
            String dia = diasDaSemana[i];
            if (downloadsDoDia > picoDownloads) {
                picoDownloads = downloadsDoDia;
                diaPico = dia;
            }
            if (downloadsDoDia < minimoDownloads) {
                minimoDownloads = downloadsDoDia;
                diaMinimo = dia;
            }
        }
        String picoFormatado = String.format("%,d", picoDownloads).replace(",", ".");
        String minimoFormatado = String.format("%,d", minimoDownloads).replace(",", ".");
        
        System.out.println("dia de Pico de Downloads: " + diaPico + " com " + picoFormatado + " downloads.");
        System.out.println("dia de Mínimo de Downloads: " + diaMinimo + " com " + minimoFormatado + " downloads.");

        final int META_DIARIA = 1000000; 

        int diasAcimaDaMeta = 0;

        for (int downloads : downloadsDiarios) {
            
            if (downloads > META_DIARIA) {
                diasAcimaDaMeta++; 
            }
        }

      
        System.out.println("meta diaria: " + String.format("%,d", META_DIARIA).replace(",", "."));
        System.out.println("O Arattai superou a meta diaria em " + diasAcimaDaMeta + " dias esta semana.");
    }
}
