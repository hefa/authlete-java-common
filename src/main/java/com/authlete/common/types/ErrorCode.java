/*
 * Copyright (C) 2014 Authlete, Inc.
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
package com.authlete.common.types;


/**
 * Values for {@code error} from OAuth 2.0 endpoints.
 *
 * <p>
 * Some error codes are not used by Authlete. For example, because
 * Authlete supports the {@code request} parameter and the {@code
 * request_uri} parameter, {@link #request_not_supported} and {@link
 * #request_uri_not_supported} are not used.
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc6749#section-4.1.2.1"
 *      >RFC 6749 (OAuth 2.0), 4.1.2.1. Error Response</a>
 *
 * @see <a href="http://tools.ietf.org/html/rfc6749#section-4.2.2.1"
 *      >RFC 6749 (OAuth 2.0), 4.2.2.1. Error Response</a>
 *
 * @see <a href="http://tools.ietf.org/html/rfc6749#section-5.2"
 *      >RFC 6749 (OAuth 2.0), 5.2. Error Response</a>
 *
 * @see <a href="http://tools.ietf.org/html/rfc6750#section-3.1"
 *      >RFC 6750 (OAuth 2.0 Bearer Token Usage), 3.1. Error Codes</a>
 *
 * @see <a href="http://openid.net/specs/openid-connect-core-1_0.html#AuthError"
 *      >OpenID Connect Core 1.0, 3.1.2.6. Authorization Error Response</a>
 *
 * @author Takahiko Kawasaki
 */
public enum ErrorCode
{
    /**
     * The resource owner or authorization server denied the
     * request.
     */
    access_denied,


    /**
     * The End-User is REQUIRED to select a session at the
     * Authorization Server. The End-User MAY be authenticated
     * at the Authorization Server with different associated
     * accounts, but the End-User did not select a session.
     * This error MAY be returned when the {@code prompt}
     * parameter value in the Authentication Request is
     * {@code none}, but the Authentication Request cannot be
     * completed without displaying a user interface to prompt
     * for a session to use.
     */
    account_selection_required,


    /**
     * The Authorization Server requires End-User consent.
     * This error MAY be returned when the {@code prompt}
     * parameter value in the Authentication Request is
     * {@code none}, but the Authentication Request cannot
     * be completed without displaying a user interface for
     * End-User consent.
     */
    consent_required,


    /**
     * The request requires higher privileges than provided by the
     * access token.
     */
    insufficient_scope,


    /**
     * The Authorization Server requires End-User interaction of
     * some form to proceed. This error MAY be returned when the
     * {@code prompt} parameter value in the Authentication Request
     * is {@code none}, but the Authentication Request cannot be
     * completed without displaying a user interface for End-User
     * interaction.
     */
    interaction_required,


    /**
     * Client authentication failed (e.g., unknown client, no
     * client authentication included, or unsupported
     * authentication method).  The authorization server MAY
     * return an HTTP 401 (Unauthorized) status code to indicate
     * which HTTP authentication schemes are supported.  If the
     * client attempted to authenticate via the "Authorization"
     * request header field, the authorization server MUST
     * respond with an HTTP 401 (Unauthorized) status code and
     * include the "WWW-Authenticate" response header field
     * matching the authentication scheme used by the client.
     */
    invalid_client,


    /**
     * The provided authorization grant (e.g., authorization
     * code, resource owner credentials) or refresh token is
     * invalid, expired, revoked, does not match the redirection
     * URI used in the authorization request, or was issued to
     * another client.
     */
    invalid_grant,


    /**
     * The request is missing a required parameter, includes an
     * invalid parameter value, includes a parameter more than
     * once, or is otherwise malformed.
     */
    invalid_request,


    /**
     * The {@code request_uri} in the Authorization Request
     * returns an error or contains invalid data.
     */
    invalid_request_uri,


    /**
     * The {@code request} parameter contains an invalid Request Object.
     */
    invalid_request_object,


    /**
     * The requested scope is invalid, unknown, or malformed.
     */
    invalid_scope,


    /**
     * The access token provided is expired, revoked, malformed, or
     * invalid for other reasons.
     */
    invalid_token,

    /**
     * The Authorization Server requires End-User authentication.
     * This error MAY be returned when the {@code prompt} parameter
     * value in the Authentication Request is {@code none}, but the
     * Authentication Request cannot be completed without displaying
     * a user interface for End-User authentication.
     */
    login_required,


    /**
     * The OP does not support use of the {@code registration}
     * parameter defined in <a href="http://openid.net/specs/openid-connect-core-1_0.html#RegistrationParameter"
     * >Section 7.2.1</a>.
     */
    registration_not_supported,


    /**
     * The OP does not support use of the {@code request} parameter
     * defined in <a href="http://openid.net/specs/openid-connect-core-1_0.html#JWTRequests"
     * >Section 6</a>.
     */
    request_not_supported,


    /**
     * The OP does not support use of the {@code request_uri} parameter
     * defined in <a href="http://openid.net/specs/openid-connect-core-1_0.html#JWTRequests"
     * >Section 6</a>.
     */
    request_uri_not_supported,


    /**
     * The authorization server encountered an unexpected
     * condition that prevented it from fulfilling the request.
     * (This error code is needed because a 500 Internal Server
     * Error HTTP status code cannot be returned to the client
     * via an HTTP redirect.)
     */
    server_error,


    /**
     * The authorization server is currently unable to handle
     * the request due to a temporary overloading or maintenance
     * of the server. (This error code is needed because a 503
     * Service Unavailable HTTP status code cannot be returned
     * to the client via an HTTP redirect.)
     */
    temporarily_unavailable,


    /**
     * The client is not authorized to request an authorization
     * code or an access token using this method.
     */
    unauthorized_client,


    /**
     * The authorization grant type is not supported by the
     * authorization server.
     */
    unsupported_grant_type,


    /**
     * The authorization server does not support obtaining an
     * authorization code or an access token using this method.
     */
    unsupported_response_type
    ;
}
