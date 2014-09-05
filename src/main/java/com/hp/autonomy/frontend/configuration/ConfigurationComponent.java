/*
 * Copyright 2013-2014 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.frontend.configuration;

/**
 * A sub component of a Configuration object which is designed for use with a {@link Validator}
 */
public interface ConfigurationComponent {

    boolean isEnabled();

}