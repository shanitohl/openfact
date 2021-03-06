package org.openfact.representations.idm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.security.PublicKey;
//import org.keycloak.common.util.PemUtils;

public class PublishedOrganizationRepresentation {
    
	protected String realm;

    //@JsonProperty("public_key")
    //protected String publicKeyPem;

    //@JsonProperty("token-service")
    //protected String tokenServiceUrl;

    //@JsonProperty("account-service")
    //protected String accountServiceUrl;

    @JsonProperty("admin-api")
    protected String adminApiUrl;

    //@JsonProperty("tokens-not-before")
    //protected int notBefore;

    //@JsonIgnore
    //protected volatile transient PublicKey publicKey;

    public String getOrganization() {
        return realm;
    }

    public void setOrganization(String organization) {
        this.realm = organization;
    }

    /*public String getPublicKeyPem() {
        return publicKeyPem;
    }

    public void setPublicKeyPem(String publicKeyPem) {
        this.publicKeyPem = publicKeyPem;
        this.publicKey = null;
    }*/


    /*@JsonIgnore
    public PublicKey getPublicKey() {
        if (publicKey != null) return publicKey;
        if (publicKeyPem != null) {
            try {
                publicKey = PemUtils.decodePublicKey(publicKeyPem);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return publicKey;
    }*/

    @JsonIgnore
    public void setPublicKey(PublicKey publicKey) {
        /*this.publicKey = publicKey;
        StringWriter writer = new StringWriter();
        PEMWriter pemWriter = new PEMWriter(writer);
        try {
            pemWriter.writeObject(publicKey);
            pemWriter.flush();
            pemWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String s = writer.toString();
        this.publicKeyPem = PemUtils.removeBeginEnd(s);*/
    }

    /*public String getTokenServiceUrl() {
        return tokenServiceUrl;
    }

    public void setTokenServiceUrl(String tokenServiceUrl) {
        this.tokenServiceUrl = tokenServiceUrl;
    }

    public String getAccountServiceUrl() {
        return accountServiceUrl;
    }

    public void setAccountServiceUrl(String accountServiceUrl) {
        this.accountServiceUrl = accountServiceUrl;
    }*/

    public String getAdminApiUrl() {
        return adminApiUrl;
    }

    public void setAdminApiUrl(String adminApiUrl) {
        this.adminApiUrl = adminApiUrl;
    }

    /*public int getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(int notBefore) {
        this.notBefore = notBefore;
    }*/
}
