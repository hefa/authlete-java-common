/*
 * Copyright (C) 2016 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.authlete.common.dto;


import java.io.Serializable;


/**
 * Request to Authlete's {@code /auth/token/update} API.
 *
 * <p>
 * The API is used to update an existing access token.
 * </p>
 *
 *
 * <blockquote>
 * <dl>
 * <dt><b><code>accessToken</code></b></dt>
 * <dd>
 * <p>
 * An existing access token.
 * </p>
 * </dd>
 *
 * <dt><b><code>accessTokenExpiresAt</code></b></dt>
 * <dd>
 * <p>
 * A new date at which the access token will expire in milliseconds
 * since the Unix epoch (1970-01-01).  If the {@code accessTokenExpiresAt}
 * request parameter is not included in a request or its value is 0
 * (or negative), the expiration date of the access token is not changed.
 * </p>
 * </dd>
 *
 * <dt><b><code>scopes</code></b></dt>
 * <dd>
 * <p>
 * A new set of scopes assigned to the access token. Scopes that are
 * not supported by the service and those that the client application
 * associated with the access token is not allowed to request are
 * ignored on the server side. If the {@code scopes} request parameter
 * is not included in a request or its value is {@code null}, the scopes
 * of the access token are not changed.
 * </p>
 * </dd>
 *
 * <dt><b><code>properties</code></b></dt>
 * <dd>
 * <p>
 * A new set of properties assigned to the access token. If the
 * {@code properties} request parameter is not included in a request
 * or its value is {@code null}, the properties of the access token
 * are not changed.
 * </p>
 * </dd>
 * </dl>
 * </blockquote>
 *
 * @see TokenUpdateResponse
 *
 * @author Takahiko Kawasaki
 *
 * @since 1.34
 */
public class TokenUpdateRequest implements Serializable
{
    private static final long serialVersionUID = 1L;


    private String accessToken;
    private long accessTokenExpiresAt;
    private String[] scopes;
    private Property[] properties;


    /**
     * Get the access token to update.
     *
     * @return
     *         The access token to update.
     */
    public String getAccessToken()
    {
        return accessToken;
    }


    /**
     * Set an existing access token to update.
     *
     * @param accessToken
     *         An existing access token to update.
     *
     * @return
     *         {@code this} object.
     */
    public TokenUpdateRequest setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;

        return this;
    }


    /**
     * Get the new date at which the access token will expire.
     *
     * @return
     *         The new expiration date in milliseconds since the Unix epoch (1970-01-01).
     */
    public long getAccessTokenExpiresAt()
    {
        return accessTokenExpiresAt;
    }


    /**
     * Set the new date at which the access token will expire.
     *
     * <p>
     * If 0 or a negative value is given, the expiration date of the access token
     * is not changed.
     * </p>
     *
     * @param expiresAt
     *         The new expiration date in milliseconds since the Unix epoch (1970-01-01).
     *
     * @return
     *         {@code this} object.
     */
    public TokenUpdateRequest setAccessTokenExpiresAt(long expiresAt)
    {
        this.accessTokenExpiresAt = expiresAt;

        return this;
    }


    /**
     * Get the new set of scopes assigned to the access token.
     *
     * @return
     *         The new set of scopes.
     */
    public String[] getScopes()
    {
        return scopes;
    }


    /**
     * Set a new set of scopes assigned to the access token.
     *
     * <p>
     * If {@code null} is given, the scope set associated with the access token
     * is not changed.
     * </p>
     *
     * @param scopes
     *         A new set of scopes. {@code null} means that scopes are not changed.
     *
     * @return
     *         {@code this} object.
     */
    public TokenUpdateRequest setScopes(String[] scopes)
    {
        this.scopes = scopes;

        return this;
    }


    /**
     * Get a new set of properties assigned to the access token.
     *
     * @return
     *         A new set of properties.
     */
    public Property[] getProperties()
    {
        return properties;
    }


    /**
     * Set a new set of properties assigned to the access token.
     *
     * <p>
     * If {@code null} is given, the property set associated with the access token
     * is not changed.
     * </p>
     *
     * @param properties
     *         A new set of properties. {@code null} means that properties are not changed.
     *
     * @return
     *         {@code this} object.
     */
    public TokenUpdateRequest setProperties(Property[] properties)
    {
        this.properties = properties;

        return this;
    }
}
