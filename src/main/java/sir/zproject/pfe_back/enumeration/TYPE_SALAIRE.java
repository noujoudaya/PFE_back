package sir.zproject.pfe_back.enumeration;


import lombok.Getter;

@Getter
public enum TYPE_SALAIRE {
    MENSUEL("Mensuel"),
    PAR_HEURE("Par heure");

    // Getter for label
    private final String label;

    TYPE_SALAIRE(String label) {
        this.label = label;
    }

}
