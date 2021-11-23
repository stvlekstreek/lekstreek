package com.lekstreek.portal.exception;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 15-11-21.
 */
public class RelatieNotFoundException extends RuntimeException {

    public RelatieNotFoundException(Long id) {
        super("Relatie " + id + " kon niet worden gevonden");
    }
}
