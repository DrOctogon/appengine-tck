package com.google.appengine.tck.common;

/**
 * Enhance TestContext just before we create web archive.
 *
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
public interface TestContextEnhancer {
    void enhance(TestContext context);
}