package typingsJapgolly.libnpmsearch

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.libnpmsearch.libnpmsearchBooleans.`true`
import typingsJapgolly.libnpmsearch.libnpmsearchStrings.maintenance
import typingsJapgolly.libnpmsearch.libnpmsearchStrings.optimal
import typingsJapgolly.libnpmsearch.libnpmsearchStrings.popularity
import typingsJapgolly.libnpmsearch.libnpmsearchStrings.quality
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.npmPackageArg.mod.Result
import typingsJapgolly.npmRegistryFetch.PartialAuthOptions
import typingsJapgolly.npmRegistryFetch.PartialFetchRetryOptions
import typingsJapgolly.npmlog.mod.Logger
import typingsJapgolly.ssri.mod.Integrity
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined libnpmsearch.libnpmsearch.Options & {  detailed  :true} */
trait Optionsdetailedtrue
  extends /* key */ StringDictionary[js.Any] {
  /**
    * @deprecated
    * This is a legacy authentication token supported only for
    * compatibility. Please use `opts.token` instead.
    */
  var _auth: js.UndefOr[String] = js.undefined
  /**
    * Alias for `token`.
    */
  var _authToken: js.UndefOr[String] = js.undefined
  /**
    * Alias for `password`
    */
  var _password: js.UndefOr[String] = js.undefined
  /**
    * An `Agent` instance to be shared across requests. This allows
    * multiple concurrent fetch requests to happen on the same socket.
    *
    * You do not need to provide this option unless you want something
    * particularly specialized, since proxy configurations and http/https
    * agents are already automatically managed internally when this option
    * is not passed through.
    */
  var agent: js.UndefOr[Agent] = js.undefined
  var `always-auth`: js.UndefOr[Boolean] = js.undefined
  var alwaysAuth: js.UndefOr[Boolean] = js.undefined
  /**
    * Request body to send through the outgoing request. Buffers and
    * Streams will be passed through as-is, with a default `content-type`
    * of `application/octet-stream`. Plain JavaScript objects will be
    * `JSON.stringify`ed and the `content-type` will default to
    * `application/json`.
    *
    * Use `opts.headers` to set the content-type to something else.
    */
  var body: js.UndefOr[Buffer | Stream | js.Object | String] = js.undefined
  /**
    * The Certificate Authority signing certificate that is trusted for SSL
    * connections to the registry. Values should be in PEM format (Windows
    * calls it "Base-64 encoded X.509 (.CER)") with newlines replaced by
    * the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * ca: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
    * }
    * ```
    *
    * Set to `null` to only allow "known" registrars, or to a specific CA
    * cert to trust only that specific signing authority.
    *
    * Multiple CAs can be trusted by specifying an array of certificates
    * instead of a single string.
    *
    * See also `opts.strict-ssl`, `opts.ca` and `opts.key`
    */
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer]) | Null] = js.undefined
  /**
    * The location of the http cache directory. If provided, certain
    * cachable requests will be cached according to
    * [IETF RFC 7234](https://tools.ietf.org/html/rfc7234) rules. This will
    * speed up future requests, as well as make the cached data available
    * offline if necessary/requested.
    *
    * See also `offline`, `prefer-offline`, and `prefer-online`.
    */
  var cache: js.UndefOr[String] = js.undefined
  /**
    * A client certificate to pass when accessing the registry. Values
    * should be in PEM format (Windows calls it "Base-64 encoded X.509
    * (.CER)") with newlines replaced by the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * cert: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
    * }
    * ```
    *
    * It is *not* the path to a certificate file (and there is no "certfile"
    * option).
    *
    * See also: `opts.ca` and `opts.key`
    */
  var cert: js.UndefOr[String] = js.undefined
  /**
    * If true, returns an object with `package`, `score`, and `searchScore`
    * fields, with `package` being what would usually be returned, and the
    * other two containing details about how that package scored. Useful
    * for UIs. Default: `false`
    */
  var detailed: js.UndefOr[Boolean with `true`] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  /**
    * The "retries" config for `retry` to use when fetching packages from
    * the registry.
    *
    * See also `opts.retry` to provide all retry options as a single object.
    */
  var `fetch-retries`: js.UndefOr[Double] = js.undefined
  /**
    * The "factor" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var `fetch-retry-factor`: js.UndefOr[Double] = js.undefined
  /**
    * The "maxTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var `fetch-retry-maxtimeout`: js.UndefOr[Double] = js.undefined
  /**
    * The "minTimeout" config for `retry` to use when fetching packages.
    *
    * See also `opts.retry` to provide all retry options as a single
    * object.
    */
  var `fetch-retry-mintimeout`: js.UndefOr[Double] = js.undefined
  /**
    * If present, other auth-related values in `opts` will be completely
    * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
    * auth for a request, and the auth details in `opts.forceAuth` will be
    * used instead.
    */
  var `force-auth`: js.UndefOr[PartialAuthOptions] = js.undefined
  /**
    * Alias for `force-auth`
    */
  var forceAuth: js.UndefOr[PartialAuthOptions] = js.undefined
  /**
    * Offset number for results. Used with `opts.limit` for pagination.
    * Default: `0`
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * If true, `npm-registry-fetch` will set the `Content-Encoding` header
    * to `gzip` and use `zlib.gzip()` or `zlib.createGzip()` to gzip-encode
    * `opts.body`.
    */
  var gzip: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional headers for the outgoing request. This option can also be
    * used to override headers automatically generated by
    * `npm-registry-fetch`, such as `Content-Type`.
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * If true, the response body will be thrown away and `res.body` set to
    * `null`. This will prevent dangling response sockets for requests
    * where you don't usually care what the response body is.
    */
  var `ignore-body`: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for `ignore-body`.
    */
  var ignoreBody: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, the response body's will be verified against this
    * integrity string, using [`ssri`](https://npm.im/ssri). If
    * verification succeeds, the response will complete as normal. If
    * verification fails, the response body will error with an `EINTEGRITY`
    * error.
    *
    * Body integrity is only verified if the body is actually consumed to
    * completion -- that is, if you use `res.json()`/`res.buffer()`, or if
    * you consume the default `res` stream data to its end.
    *
    * Cached data will have its integrity automatically verified using the
    * previously-generated integrity hash for the saved request
    * information, so `EINTEGRITY` errors can happen if `opts.cache` is
    * used, even if `opts.integrity` is not passed in.
    */
  var integrity: js.UndefOr[String | Integrity] = js.undefined
  /**
    * This is used to populate the `npm-in-ci` request header sent to the
    * registry.
    */
  var `is-from-ci`: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for `is-from-ci`
    */
  var isFromCI: js.UndefOr[Boolean] = js.undefined
  /**
    * A client key to pass when accessing the registry. Values should be in
    * PEM format with newlines replaced by the string `'\n'`. For example:
    *
    * ```typescript
    * {
    * key: '-----BEGIN PRIVATE KEY-----\nXXXX\nXXXX\n-----END PRIVATE KEY-----'
    * }
    * ```
    *
    * It is *not* the path to a key file (and there is no "keyfile"
    * option).
    *
    * See also: `opts.ca` and `opts.cert`
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Number of results to limit the query to. Default: `20`
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The IP address of the local interface to use when making connections
    * to the registry.
    *
    * See also `opts.proxy`
    */
  var `local-address`: js.UndefOr[String] = js.undefined
  /**
    * Logger object to use for logging operation details.
    */
  var log: js.UndefOr[Logger] = js.undefined
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `maintenance` metrics when scoring and sorting packages.
    * Default: `0.65` (same as `opts.sortBy: 'optimal'`)
    */
  var maintenance: js.UndefOr[Double] = js.undefined
  /**
    * When using `fetch.json.stream()` (NOT `fetch.json()`), this will be
    * passed down to `JSONStream` as the second argument to
    * `JSONStream.parse`, and can be used to transform stream data before
    * output.
    */
  var `map-json`: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.undefined
  /**
    * Alias for `map-json`
    */
  var mapJSON: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.undefined
  /**
    * Alias for `map-json`
    */
  var mapJson: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.undefined
  /**
    * Alias for `maxsockets`
    */
  var `max-sockets`: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of sockets to keep open during requests. Has no effect
    * if `opts.agent` is used.
    */
  var maxsockets: js.UndefOr[Double] = js.undefined
  /**
    * HTTP method to use for the outgoing request. Case-insensitive.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * If true, proxying will be disabled even if `opts.proxy` is used.
    */
  var noproxy: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, will be sent in the `npm-session` header. This header is
    * used by the npm registry to identify individual user sessions
    * (usually individual invocations of the CLI).
    */
  var `npm-session`: js.UndefOr[String] = js.undefined
  /**
    * Alias for `npm-session`
    */
  var npmSession: js.UndefOr[String] = js.undefined
  /**
    * Force offline mode: no network requests will be done during install.
    * To allow `npm-registry-fetch` to fill in missing cache data, see
    * `opts.prefer-offline`.
    *
    * This option is only really useful if you're also using `opts.cache`.
    */
  var offline: js.UndefOr[Boolean] = js.undefined
  /**
    * This is a one-time password from a two-factor authenticator. It is
    * required for certain registry interactions when two-factor auth is
    * enabled for a user account.
    */
  var otp: js.UndefOr[Double | String] = js.undefined
  /**
    * Password used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:password': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.username`
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `popularity` metrics when scoring and sorting packages.
    * Default: `0.98` (same as `opts.sortBy: 'optimal'`)
    */
  var popularity: js.UndefOr[Double] = js.undefined
  /**
    * If true, staleness checks for cached data will be bypassed, but
    * missing data will be requested from the server. To force full offline
    * mode, use `opts.offline`.
    *
    * This option is generally only useful if you're also using `opts.cache`.
    */
  var `prefer-offline`: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, staleness checks for cached data will be forced, making the
    * CLI look for updates immediately even for fresh package data.
    *
    * This option is generally only useful if you're also using `opts.cache`.
    */
  var `prefer-online`: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, will be sent in the npm-scope header. This header is
    * used by the npm registry to identify the toplevel package scope that
    * a particular project installation is using.
    */
  var `project-scope`: js.UndefOr[String] = js.undefined
  /**
    * Alias for `project-scope`.
    */
  var projectScope: js.UndefOr[String] = js.undefined
  /**
    * A proxy to use for outgoing http requests. If not passed in, the
    * `HTTP(S)_PROXY` environment variable will be used.
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `quality` metrics when scoring and sorting packages.
    * Default: `0.5` (same as `opts.sortBy: 'optimal'`)
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * If provided, the request URI will have a query string appended to it
    * using this query. If `opts.query` is an object, it will be converted
    * to a query string using [`querystring.stringify()`](https://nodejs.org/api/querystring.html#querystring_querystring_stringify_obj_sep_eq_options).
    *
    * If the request URI already has a query string, it will be merged with
    * `opts.query`, preferring `opts.query` values.
    */
  var query: js.UndefOr[String | js.Object] = js.undefined
  /**
    * Value to use for the `Referer` header. The npm CLI itself uses this
    * to serialize the npm command line using the given request.
    */
  var refer: js.UndefOr[String] = js.undefined
  /**
    * Alias for `refer`.
    */
  var referer: js.UndefOr[String] = js.undefined
  /**
    * Registry configuration for a request. If a request URL only includes
    * the URL path, this registry setting will be prepended. This
    * configuration is also used to determine authentication details, so
    * even if the request URL references a completely different host,
    * `opts.registry` will be used to find the auth details for that
    * request.
    *
    * See also `opts.scope`, `opts.spec`, and `opts.<scope>:registry` which
    * can all affect the actual registry URL used by the outgoing request.
    */
  var registry: js.UndefOr[String] = js.undefined
  /**
    * Single-object configuration for request retry settings. If passed in,
    * will override individually-passed `fetch-retry-*` settings.
    */
  var retry: js.UndefOr[PartialFetchRetryOptions] = js.undefined
  /**
    * Associate an operation with a scope for a scoped registry. This
    * option can force lookup of scope-specific registries and
    * authentication.
    *
    * See also `opts.<scope>:registry` and `opts.spec` for interactions
    * with this option.
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * Used as a shorthand to set `opts.quality`, `opts.maintenance`, and
    * `opts.popularity` with values that prioritize each one.
    */
  var sortBy: js.UndefOr[optimal | quality | maintenance | popularity] = js.undefined
  /**
    * If provided, can be used to automatically configure `opts.scope`
    * based on a specific package name. Non-registry package specs will
    * throw an error.
    */
  var spec: js.UndefOr[String | Result] = js.undefined
  /**
    * Whether or not to do SSL key validation when making requests to the
    * registry via https.
    *
    * See also `opts.ca`.
    */
  var `strict-ssl`: js.UndefOr[Boolean] = js.undefined
  /**
    * Time before a hanging request times out.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Authentication token string.
    *
    * Can be scoped to a registry by using a "nerf dart" for that registry.
    * That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:token': 't0k3nH34r'
    * }
    * ```
    */
  var token: js.UndefOr[String] = js.undefined
  /**
    * User agent string to send in the `User-Agent` header.
    */
  var `user-agent`: js.UndefOr[String] = js.undefined
  /**
    * Username used for basic authentication. For the more modern
    * authentication method, please use the (more secure) `opts.token`
    *
    * Can optionally be scoped to a registry by using a "nerf dart" for
    * that registry. That is:
    *
    * ```typescript
    * {
    * '//registry.npmjs.org/:username': 't0k3nH34r'
    * }
    * ```
    *
    * See also `opts.password`
    */
  var username: js.UndefOr[String] = js.undefined
}

object Optionsdetailedtrue {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _auth: String = null,
    _authToken: String = null,
    _password: String = null,
    agent: Agent = null,
    `always-auth`: js.UndefOr[Boolean] = js.undefined,
    alwaysAuth: js.UndefOr[Boolean] = js.undefined,
    body: Buffer | Stream | js.Object | String = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cache: String = null,
    cert: String = null,
    detailed: js.UndefOr[Boolean with `true`] = js.undefined,
    email: String = null,
    `fetch-retries`: Int | Double = null,
    `fetch-retry-factor`: Int | Double = null,
    `fetch-retry-maxtimeout`: Int | Double = null,
    `fetch-retry-mintimeout`: Int | Double = null,
    `force-auth`: PartialAuthOptions = null,
    forceAuth: PartialAuthOptions = null,
    from: Int | Double = null,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: Record[String, String] = null,
    `ignore-body`: js.UndefOr[Boolean] = js.undefined,
    ignoreBody: js.UndefOr[Boolean] = js.undefined,
    integrity: String | Integrity = null,
    `is-from-ci`: js.UndefOr[Boolean] = js.undefined,
    isFromCI: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    limit: Int | Double = null,
    `local-address`: String = null,
    log: Logger = null,
    maintenance: Int | Double = null,
    `map-json`: /* v */ js.Any => CallbackTo[js.Any] = null,
    mapJSON: /* v */ js.Any => CallbackTo[js.Any] = null,
    mapJson: /* v */ js.Any => CallbackTo[js.Any] = null,
    `max-sockets`: Int | Double = null,
    maxsockets: Int | Double = null,
    method: String = null,
    noproxy: js.UndefOr[Boolean] = js.undefined,
    `npm-session`: String = null,
    npmSession: String = null,
    offline: js.UndefOr[Boolean] = js.undefined,
    otp: Double | String = null,
    password: String = null,
    popularity: Int | Double = null,
    `prefer-offline`: js.UndefOr[Boolean] = js.undefined,
    `prefer-online`: js.UndefOr[Boolean] = js.undefined,
    `project-scope`: String = null,
    projectScope: String = null,
    proxy: String = null,
    quality: Int | Double = null,
    query: String | js.Object = null,
    refer: String = null,
    referer: String = null,
    registry: String = null,
    retry: PartialFetchRetryOptions = null,
    scope: String = null,
    sortBy: optimal | quality | maintenance | popularity = null,
    spec: String | Result = null,
    `strict-ssl`: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    `user-agent`: String = null,
    username: String = null
  ): Optionsdetailedtrue = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_auth != null) __obj.updateDynamic("_auth")(_auth.asInstanceOf[js.Any])
    if (_authToken != null) __obj.updateDynamic("_authToken")(_authToken.asInstanceOf[js.Any])
    if (_password != null) __obj.updateDynamic("_password")(_password.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(`always-auth`)) __obj.updateDynamic("always-auth")(`always-auth`.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysAuth)) __obj.updateDynamic("alwaysAuth")(alwaysAuth.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (`fetch-retries` != null) __obj.updateDynamic("fetch-retries")(`fetch-retries`.asInstanceOf[js.Any])
    if (`fetch-retry-factor` != null) __obj.updateDynamic("fetch-retry-factor")(`fetch-retry-factor`.asInstanceOf[js.Any])
    if (`fetch-retry-maxtimeout` != null) __obj.updateDynamic("fetch-retry-maxtimeout")(`fetch-retry-maxtimeout`.asInstanceOf[js.Any])
    if (`fetch-retry-mintimeout` != null) __obj.updateDynamic("fetch-retry-mintimeout")(`fetch-retry-mintimeout`.asInstanceOf[js.Any])
    if (`force-auth` != null) __obj.updateDynamic("force-auth")(`force-auth`.asInstanceOf[js.Any])
    if (forceAuth != null) __obj.updateDynamic("forceAuth")(forceAuth.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(`ignore-body`)) __obj.updateDynamic("ignore-body")(`ignore-body`.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBody)) __obj.updateDynamic("ignoreBody")(ignoreBody.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(`is-from-ci`)) __obj.updateDynamic("is-from-ci")(`is-from-ci`.asInstanceOf[js.Any])
    if (!js.isUndefined(isFromCI)) __obj.updateDynamic("isFromCI")(isFromCI.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`local-address` != null) __obj.updateDynamic("local-address")(`local-address`.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (maintenance != null) __obj.updateDynamic("maintenance")(maintenance.asInstanceOf[js.Any])
    if (`map-json` != null) __obj.updateDynamic("map-json")(js.Any.fromFunction1((t0: /* v */ js.Any) => `map-json`(t0).runNow()))
    if (mapJSON != null) __obj.updateDynamic("mapJSON")(js.Any.fromFunction1((t0: /* v */ js.Any) => mapJSON(t0).runNow()))
    if (mapJson != null) __obj.updateDynamic("mapJson")(js.Any.fromFunction1((t0: /* v */ js.Any) => mapJson(t0).runNow()))
    if (`max-sockets` != null) __obj.updateDynamic("max-sockets")(`max-sockets`.asInstanceOf[js.Any])
    if (maxsockets != null) __obj.updateDynamic("maxsockets")(maxsockets.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(noproxy)) __obj.updateDynamic("noproxy")(noproxy.asInstanceOf[js.Any])
    if (`npm-session` != null) __obj.updateDynamic("npm-session")(`npm-session`.asInstanceOf[js.Any])
    if (npmSession != null) __obj.updateDynamic("npmSession")(npmSession.asInstanceOf[js.Any])
    if (!js.isUndefined(offline)) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (otp != null) __obj.updateDynamic("otp")(otp.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (popularity != null) __obj.updateDynamic("popularity")(popularity.asInstanceOf[js.Any])
    if (!js.isUndefined(`prefer-offline`)) __obj.updateDynamic("prefer-offline")(`prefer-offline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`prefer-online`)) __obj.updateDynamic("prefer-online")(`prefer-online`.asInstanceOf[js.Any])
    if (`project-scope` != null) __obj.updateDynamic("project-scope")(`project-scope`.asInstanceOf[js.Any])
    if (projectScope != null) __obj.updateDynamic("projectScope")(projectScope.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (refer != null) __obj.updateDynamic("refer")(refer.asInstanceOf[js.Any])
    if (referer != null) __obj.updateDynamic("referer")(referer.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (!js.isUndefined(`strict-ssl`)) __obj.updateDynamic("strict-ssl")(`strict-ssl`.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsdetailedtrue]
  }
}

