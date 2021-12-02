package dto;

public class CompteResponseDTO {
    private String numCompte;
    private String messageErr;

    public String getMessageErr() {
        return messageErr;
    }

    public void setMessageErr(String messageErr) {
        this.messageErr = messageErr;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }
}
