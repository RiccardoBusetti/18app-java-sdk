package sdk.soap.check;

import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per anonymous complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkResp" type="{http://bonus.mibact.it/VerificaVoucher/}CheckResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "checkResp"
})
@XmlRootElement(name = "CheckResponseObj")
public class CheckResponseObj {

    @XmlElement(required = true)
    protected CheckResponse checkResp;

    /**
     * Recupera il valore della proprietà checkResp.
     *
     * @return possible object is
     * {@link CheckResponse }
     */
    public CheckResponse getCheckResp() {
        return checkResp;
    }

    /**
     * Imposta il valore della proprietà checkResp.
     *
     * @param value allowed object is
     *              {@link CheckResponse }
     */
    public void setCheckResp(CheckResponse value) {
        this.checkResp = value;
    }

}
