/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.management.resources.AzureResourceAuthenticated;
import com.microsoft.rest.credentials.ServiceClientCredentials;

public final class AzureResource {
    public static AzureResourceAuthenticated authenticate(ServiceClientCredentials credentials) {
        return new AzureResourceAuthenticatedImpl(credentials);
    }
}
