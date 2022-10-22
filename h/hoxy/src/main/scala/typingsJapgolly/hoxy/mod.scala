package typingsJapgolly.hoxy

import typingsJapgolly.hoxy.anon.PartialSlow
import typingsJapgolly.hoxy.anon.Typeofcheerio
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hoxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hoxy", "Cycle")
  @js.native
  /* private */ open class Cycle () extends StObject {
    
    /**
      * Stores and retrieves data on a cycle instance. This is useful since the same
      * instance is shared across all interceptors for a given request/response cycle,
      * allowing you to share related data across disparate scopes. With two params this
      * method behaves as a setter, with one param as a getter.
      */
    def data(name: String): Any = js.native
    def data(name: String, value: Any): Any = js.native
    
    /**
      * Provisions responses from the local filesystem. Generally, the reason you'd do
      * this is to be able to edit those files locally and test them as if they were
      * live on the remote server. This action populates the response object; see
      * response population for more info. The completion of this action is asynchronous,
      * so serve() returns a promise.
      *
      * The returned promise resolves after the response has been populated. There are at
      * least three use cases worth mentioning.
      */
    def serve(): js.Promise[Unit] = js.native
    def serve(opts: String): js.Promise[Unit] = js.native
    def serve(opts: ServeOptions): js.Promise[Unit] = js.native
  }
  
  @JSImport("hoxy", "Proxy")
  @js.native
  open class Proxy protected () extends StObject {
    /* protected */ def this(opts: CreateServerOptions) = this()
    
    /**
      * Stops proxy receiving requests. Finalizes and/or cleans up any
      * resources the proxy uses internally.
      */
    def close(): Unit = js.native
    def close(cb: PossibleErrorCallback): Unit = js.native
    
    /**
      * This is the entry point for intercepting and operating on requests and responses.
      * This first example intercepts all requests:
      * ```javascript
      * proxy.intercept('request', req => console.log(req.url));
      * ```
      * This is more verbose, but identical to the above:
      * ```javascript
      * proxy.intercept({
      *     phase: 'request'
      * }, function(req, resp, cycle) {
      *     console.log(req.url);
      * });
      * ```
      */
    def intercept(opts: String, handler: InterceptionHandler): Unit = js.native
    def intercept(opts: InterceptOptions, handler: InterceptionHandler): Unit = js.native
    
    /**
      * Starts proxy listening on port. Returns itself.
      * A callback may be provided, to run when the proxy has started listening.
      * This method simply passes its arguments to Node's server.listen() method.
      */
    def listen(port: Double): this.type = js.native
    def listen(port: Double, callback: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, host: String): this.type = js.native
    def listen(port: Double, host: String, backlog: Double): this.type = js.native
    def listen(port: Double, host: String, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
    def listen(port: Double, host: String, callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Deals with various logging events.
      *
      * This first example listens for error,
      * warn, and debug logging events, and prints them to stderr:
      * ```javascript
      * proxy.log('error warn debug');
      * ```
      * Or, print logging events to various writable streams:
      * ```javascript
      * proxy.log('error warn debug', process.stderr);
      * proxy.log('info', process.stdout);
      * ```
      *
      * Or, explicitly handle logging event:
      * ```javascript
      * proxy.log('error warn', function(event) {
      *     console.error(event.level + ': ' + event.message);
      *     if (event.error) console.error(event.error.stack);
      * });
      * ```
      */
    def log(levels: String): this.type = js.native
    def log(levels: String, cb: LoggerCallbackFunction): this.type = js.native
    def log(levels: String, cb: Writable): this.type = js.native
    
    /**
      * Get/set proxy-level slow options. If options is provided, it's a setter.
      * If options is not provided, it's a getter.
      * @param opts
      */
    def slow(opts: Slow): this.type = js.native
  }
  
  @JSImport("hoxy", "Request")
  @js.native
  /* private */ open class Request () extends StObject {
    
    /**
      * Request body binary buffer. This is only present if you intercept the
      * request as:'buffer'. Changes made to this object will be seen by the server.
      */
    var buffer: js.UndefOr[Buffer] = js.native
    
    /**
      * If url is provided, sets the request's absolute protocol, hostname, port and
      * url. Otherwise it returns the absolute URL of this request. This is mainly a
      * convenience method.
      */
    def fullUrl(): String = js.native
    def fullUrl(url: String): String = js.native
    
    /**
      * HTTP request header name/value JS object. These are all-lowercase, e.g. accept-encoding
      */
    var headers: Record[String, String] = js.native
    
    /**
      * Destination server hostname, sans port
      */
    var hostname: String = js.native
    
    /**
      * Request body parsed as JSON. This is only present if you intercept the
      * request as:'json'. Changes made to this object will be seen by the server.
      */
    var json: js.UndefOr[Record[String, Any]] = js.native
    
    /**
      * All-caps HTTP method used. Lowercase values are converted to uppercase
      */
    var method: HttpMethod = js.native
    
    /**
      * Request body parsed as form-url-encoded params. This will be a key/value
      * object. This object will only present if you intercept the request
      * as:'params'. Changes made to this object will be seen by the server.
      *
      * Note: parameters from the URL querystring are not included in this object.
      */
    var params: js.UndefOr[Record[String, String]] = js.native
    
    /**
      * Destination server port
      */
    var port: Double = js.native
    
    /**
      * Protocol of the request
      */
    var protocol: String = js.native
    
    /**
      * An object representing querystring params in the URL.
      * For example if the URL is /foo/bar?baz=qux, then this
      * object will look like { baz: 'qux' }.
      */
    var query: Record[String, String] = js.native
    
    /**
      * Simulates slowness during request phase. With this method you can set a minimum
      * latency and/or maximum transfer rate. Since these are minimum/maximum, if your
      * native connection is already slower than these values, this method will have no
      * effect.
      */
    def slow(opts: PartialSlow): Unit = js.native
    
    /**
      * Request body string. This is only present if you intercept the request
      * as:'string'. Overwriting this will overwrite the request body sent to
      * the server.
      */
    var string: js.UndefOr[String] = js.native
    
    /**
      * Whatever request body gets sent to the server, tee() pipes an identical copy
      * to your writable stream. Your stream is held in memory, and only gets written
      * to if and when the request is sent to the server. In other words, your stream
      * sees whatever the server sees. If the server sees nothing, your stream sees
      * nothing. You can tee() as many times as you want.
      *
      * @param stream - target stream
      */
    def tee(stream: Writable): Unit = js.native
    
    /**
      * Root-relative request URL, including query string, like /foo/bar?baz=qux
      */
    var url: String = js.native
  }
  
  @JSImport("hoxy", "Response")
  @js.native
  /* private */ open class Response () extends StObject {
    
    /**
      * Response body parsed as DOM. This object is only present if you intercept
      * the response as:'$'. This is a cheerio object, which provides a jQuery-like
      * API. Changes made to it will be seen by the client.
      */
    @JSName("$")
    var $: js.UndefOr[ReturnType[Typeofcheerio]] = js.native
    
    /**
      * Response body binary buffer. This is only present if you intercept the
      * response as:'buffer'. Changes made to this object will be seen by the client.
      */
    var buffer: js.UndefOr[Buffer] = js.native
    
    /**
      * HTTP response header name/value JS object. Header names are all-lowercase,
      * such as 'content-type'.
      */
    var headers: Record[String, String] = js.native
    
    /**
      * Response body parsed as JSON. This is only present if you intercept the
      * response as:'json'. Changes to this object will be seen by the client.
      */
    var json: js.UndefOr[Any] = js.native
    
    /**
      * Simulates slowness during request phase. With this method you can set a minimum
      * latency and/or maximum transfer rate. Since these are minimum/maximum, if your
      * native connection is already slower than these values, this method will have no
      * effect.
      */
    def slow(opts: PartialSlow): Unit = js.native
    
    /**
      * HTTP status code being sent to the client.
      */
    var statusCode: Double = js.native
    
    /**
      * Response body string. This is only present if you intercept the response
      * as:'string'. Overwriting this will overwrite the response body sent to the
      * client.
      */
    var string: js.UndefOr[String] = js.native
    
    /**
      * Whatever request body gets sent to the server, tee() pipes an identical copy
      * to your writable stream. Your stream is held in memory, and only gets written
      * to if and when the request is sent to the server. In other words, your stream
      * sees whatever the server sees. If the server sees nothing, your stream sees
      * nothing. You can tee() as many times as you want.
      *
      * @param stream - target stream
      */
    def tee(stream: Writable): Unit = js.native
  }
  
  inline def createServer(): Proxy = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Proxy]
  inline def createServer(opts: CreateServerOptions): Proxy = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any]).asInstanceOf[Proxy]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hoxy.hoxyStrings.$
    - typingsJapgolly.hoxy.hoxyStrings.json
    - typingsJapgolly.hoxy.hoxyStrings.params
    - typingsJapgolly.hoxy.hoxyStrings.buffer
    - typingsJapgolly.hoxy.hoxyStrings.string
  */
  trait BodyParser extends StObject
  object BodyParser {
    
    inline def $: typingsJapgolly.hoxy.hoxyStrings.$ = "$".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.$]
    
    inline def buffer: typingsJapgolly.hoxy.hoxyStrings.buffer = "buffer".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.buffer]
    
    inline def json: typingsJapgolly.hoxy.hoxyStrings.json = "json".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.json]
    
    inline def params: typingsJapgolly.hoxy.hoxyStrings.params = "params".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.params]
    
    inline def string: typingsJapgolly.hoxy.hoxyStrings.string = "string".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.string]
  }
  
  trait CertificateParams extends StObject {
    
    var cert: String | (js.Array[Buffer | String]) | Buffer
    
    var key: String | (js.Array[Buffer | js.Object | String]) | Buffer
  }
  object CertificateParams {
    
    inline def apply(
      cert: String | (js.Array[Buffer | String]) | Buffer,
      key: String | (js.Array[Buffer | js.Object | String]) | Buffer
    ): CertificateParams = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateParams]
    }
    
    extension [Self <: CertificateParams](x: Self) {
      
      inline def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: (Buffer | js.Object | String)*): Self = StObject.set(x, "key", js.Array(value*))
    }
  }
  
  trait CreateServerOptions extends StObject {
    
    /**
      * If present, this should contain a key/cert combo representing a certificate
      * authority that your client trusts. See these instructions for how to
      * generate these files. You'll then need to configure your client to use this
      * proxy for https in addition to http. Once you've got all of that set up,
      * Hoxy will generate fake keys/cert combos for every hostname you visit,
      * caching them in memory for subsequent visits, thus allowing the proxy to
      * handle https requests as cleartext
      */
    var certAuthority: js.UndefOr[CertificateParams] = js.undefined
    
    /**
      *  If present, this proxy will run as a reverse proxy for the given server.
      *  This allows you to point your client directly at the proxy, instead of
      *  configuring it in the client's proxy settings.
      *  This value should take the form scheme://host:port.
      */
    var reverse: js.UndefOr[String] = js.undefined
    
    /**
      * Latency emulation
      */
    var slow: js.UndefOr[Slow] = js.undefined
    
    /**
      * Should only be used in combination with reverse. If present, causes Hoxy to
      * run as an https server. Passed as opts to https.createServer(opts, function)
      */
    var tls: js.UndefOr[CertificateParams] = js.undefined
    
    /**
      * If present, this proxy will in turn use another proxy.
      * This allows Hoxy to play well with other proxies.
      * This value should take the form host:port
      */
    var upstreamProxy: js.UndefOr[String] = js.undefined
  }
  object CreateServerOptions {
    
    inline def apply(): CreateServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateServerOptions]
    }
    
    extension [Self <: CreateServerOptions](x: Self) {
      
      inline def setCertAuthority(value: CertificateParams): Self = StObject.set(x, "certAuthority", value.asInstanceOf[js.Any])
      
      inline def setCertAuthorityUndefined: Self = StObject.set(x, "certAuthority", js.undefined)
      
      inline def setReverse(value: String): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSlow(value: Slow): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTls(value: CertificateParams): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUpstreamProxy(value: String): Self = StObject.set(x, "upstreamProxy", value.asInstanceOf[js.Any])
      
      inline def setUpstreamProxyUndefined: Self = StObject.set(x, "upstreamProxy", js.undefined)
    }
  }
  
  type Filter[T] = js.RegExp | TesterFunction[T] | T
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hoxy.hoxyStrings.POST
    - typingsJapgolly.hoxy.hoxyStrings.GET
    - typingsJapgolly.hoxy.hoxyStrings.PUT
    - typingsJapgolly.hoxy.hoxyStrings.PATCH
    - typingsJapgolly.hoxy.hoxyStrings.DELETE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def DELETE: typingsJapgolly.hoxy.hoxyStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.DELETE]
    
    inline def GET: typingsJapgolly.hoxy.hoxyStrings.GET = "GET".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.GET]
    
    inline def PATCH: typingsJapgolly.hoxy.hoxyStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.PATCH]
    
    inline def POST: typingsJapgolly.hoxy.hoxyStrings.POST = "POST".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.POST]
    
    inline def PUT: typingsJapgolly.hoxy.hoxyStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.PUT]
  }
  
  trait InterceptOptions extends StObject {
    
    /**
      * Body-parsers
      */
    var as: js.UndefOr[BodyParser] = js.undefined
    
    /**
      * Match the full content-type header of the request or
      * response (depending on the phase)
      */
    var contentType: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Match the full request URL including protocol and hostname.
      * Patterns like /foo/ * are allowed
      */
    var fullUrl: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Match the host, not including :port.
      */
    var hostname: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Match the all-uppercase HTTP request method
      */
    var method: js.UndefOr[Filter[HttpMethod]] = js.undefined
    
    /**
      * Match just the mime type portion of the content-type header
      * of the request or response (depending on the phase). I.e.,
      * if the entire header is "text/html; charset=utf-8", just
      * match the "text/html" part
      */
    var mimeType: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Request phase to listen to
      */
    var phase: Phase
    
    /**
      * Match the port number.
      */
    var port: js.UndefOr[Filter[Double | String]] = js.undefined
    
    /**
      * Match the request protocol
      */
    var protocol: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Same as contentType but only matches request
      */
    var requestContentType: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Same as mimeType but only matches request
      */
    var requestMimeType: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Same as contentType but only matches response
      */
    var responseContentType: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Same as mimeType but only matches response
      */
    var responseMimeType: js.UndefOr[Filter[String]] = js.undefined
    
    /**
      * Match the request URL. Patterns like /foo/ * are allowed
      */
    var url: js.UndefOr[Filter[String]] = js.undefined
  }
  object InterceptOptions {
    
    inline def apply(phase: Phase): InterceptOptions = {
      val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptOptions]
    }
    
    extension [Self <: InterceptOptions](x: Self) {
      
      inline def setAs(value: BodyParser): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setContentType(value: Filter[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeFunction1(value: String => Boolean): Self = StObject.set(x, "contentType", js.Any.fromFunction1(value))
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setFullUrl(value: Filter[String]): Self = StObject.set(x, "fullUrl", value.asInstanceOf[js.Any])
      
      inline def setFullUrlFunction1(value: String => Boolean): Self = StObject.set(x, "fullUrl", js.Any.fromFunction1(value))
      
      inline def setFullUrlUndefined: Self = StObject.set(x, "fullUrl", js.undefined)
      
      inline def setHostname(value: Filter[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameFunction1(value: String => Boolean): Self = StObject.set(x, "hostname", js.Any.fromFunction1(value))
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: Filter[HttpMethod]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: HttpMethod => Boolean): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMimeType(value: Filter[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeFunction1(value: String => Boolean): Self = StObject.set(x, "mimeType", js.Any.fromFunction1(value))
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPhase(value: Phase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Filter[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortFunction1(value: Double | String => Boolean): Self = StObject.set(x, "port", js.Any.fromFunction1(value))
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: Filter[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolFunction1(value: String => Boolean): Self = StObject.set(x, "protocol", js.Any.fromFunction1(value))
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequestContentType(value: Filter[String]): Self = StObject.set(x, "requestContentType", value.asInstanceOf[js.Any])
      
      inline def setRequestContentTypeFunction1(value: String => Boolean): Self = StObject.set(x, "requestContentType", js.Any.fromFunction1(value))
      
      inline def setRequestContentTypeUndefined: Self = StObject.set(x, "requestContentType", js.undefined)
      
      inline def setRequestMimeType(value: Filter[String]): Self = StObject.set(x, "requestMimeType", value.asInstanceOf[js.Any])
      
      inline def setRequestMimeTypeFunction1(value: String => Boolean): Self = StObject.set(x, "requestMimeType", js.Any.fromFunction1(value))
      
      inline def setRequestMimeTypeUndefined: Self = StObject.set(x, "requestMimeType", js.undefined)
      
      inline def setResponseContentType(value: Filter[String]): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
      
      inline def setResponseContentTypeFunction1(value: String => Boolean): Self = StObject.set(x, "responseContentType", js.Any.fromFunction1(value))
      
      inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
      
      inline def setResponseMimeType(value: Filter[String]): Self = StObject.set(x, "responseMimeType", value.asInstanceOf[js.Any])
      
      inline def setResponseMimeTypeFunction1(value: String => Boolean): Self = StObject.set(x, "responseMimeType", js.Any.fromFunction1(value))
      
      inline def setResponseMimeTypeUndefined: Self = StObject.set(x, "responseMimeType", js.undefined)
      
      inline def setUrl(value: Filter[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: String => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type InterceptionHandler = js.ThisFunction3[
    /* this */ Proxy, 
    /* req */ Request, 
    /* res */ Response, 
    /* cycle */ Cycle, 
    js.Promise[Unit] | Unit
  ]
  
  trait Log extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var level: LogLevel
    
    var message: String
  }
  object Log {
    
    inline def apply(level: LogLevel, message: String): Log = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hoxy.hoxyStrings.error
    - typingsJapgolly.hoxy.hoxyStrings.warn
    - typingsJapgolly.hoxy.hoxyStrings.info
    - typingsJapgolly.hoxy.hoxyStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typingsJapgolly.hoxy.hoxyStrings.debug = "debug".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.debug]
    
    inline def error: typingsJapgolly.hoxy.hoxyStrings.error = "error".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.error]
    
    inline def info: typingsJapgolly.hoxy.hoxyStrings.info = "info".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.info]
    
    inline def warn: typingsJapgolly.hoxy.hoxyStrings.warn = "warn".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.warn]
  }
  
  type LoggerCallbackFunction = js.Function1[/* log */ Log, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hoxy.hoxyStrings.request
    - typingsJapgolly.hoxy.hoxyStrings.`request-sent`
    - typingsJapgolly.hoxy.hoxyStrings.response
    - typingsJapgolly.hoxy.hoxyStrings.`response-sent`
  */
  trait Phase extends StObject
  object Phase {
    
    inline def request: typingsJapgolly.hoxy.hoxyStrings.request = "request".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.request]
    
    inline def `request-sent`: typingsJapgolly.hoxy.hoxyStrings.`request-sent` = "request-sent".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.`request-sent`]
    
    inline def response: typingsJapgolly.hoxy.hoxyStrings.response = "response".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.response]
    
    inline def `response-sent`: typingsJapgolly.hoxy.hoxyStrings.`response-sent` = "response-sent".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.`response-sent`]
  }
  
  type PossibleErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error], Any]
  
  trait ServeOptions extends StObject {
    
    /**
      * Which local directory to serve out of. Defaults to filesystem root "/"
      */
    var docroot: js.UndefOr[String] = js.undefined
    
    /**
      * Which file to serve. Defaults to the request URL. Normally this would
      * be used in mutual exclusion with docroot. Strictly speaking, path is
      * always rooted to docroot, which defaults to "/"
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Mainly relevant when using the docroot option. Describes the relationship
      * between the local docroot and the remote one. Strictly speaking, this
      * controls what happens when the local docroot is missing a requested file.
      * Accepted values:
      * * replace - (default) Replaces the remote docroot with the local one. In
      * other words, if a requested file doesn't exist locally, it populates the
      * response with a 404, even if it would have been found remotely.
      * * overlay - Overlays the local docroot on top of the remote one. In other
      * words, if a requested file doesn't exist locally, the request will
      * transparently fall through to the remote server.
      * * mirror - Automatically mirror the remote docroot locally. In other words,
      * if a requested file doesn't exist locally, it's copied to the local docroot
      * from the remote one, and will be found locally on subsequent requests.
      */
    var strategy: js.UndefOr[ServeStrategy] = js.undefined
  }
  object ServeOptions {
    
    inline def apply(): ServeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServeOptions]
    }
    
    extension [Self <: ServeOptions](x: Self) {
      
      inline def setDocroot(value: String): Self = StObject.set(x, "docroot", value.asInstanceOf[js.Any])
      
      inline def setDocrootUndefined: Self = StObject.set(x, "docroot", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStrategy(value: ServeStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hoxy.hoxyStrings.replace
    - typingsJapgolly.hoxy.hoxyStrings.overlay
    - typingsJapgolly.hoxy.hoxyStrings.mirror
  */
  trait ServeStrategy extends StObject
  object ServeStrategy {
    
    inline def mirror: typingsJapgolly.hoxy.hoxyStrings.mirror = "mirror".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.mirror]
    
    inline def overlay: typingsJapgolly.hoxy.hoxyStrings.overlay = "overlay".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.overlay]
    
    inline def replace: typingsJapgolly.hoxy.hoxyStrings.replace = "replace".asInstanceOf[typingsJapgolly.hoxy.hoxyStrings.replace]
  }
  
  trait Slow extends StObject {
    
    /**
      * Imposes a single rate-limiting bottleneck (in bytes per second) on all downloads
      */
    var down: Double
    
    /**
      * Imposes a single rate-limiting bottleneck (in bytes per second) on all throughput
      */
    var latency: Double
    
    /**
      * Imposes a delay (in milliseconds) between all requests and responses
      */
    var rate: Double
    
    /**
      * Imposes a single rate-limiting bottleneck (in bytes per second) on all uploads
      */
    var up: Double
  }
  object Slow {
    
    inline def apply(down: Double, latency: Double, rate: Double, up: Double): Slow = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slow]
    }
    
    extension [Self <: Slow](x: Self) {
      
      inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  type TesterFunction[T] = js.Function1[/* arg */ T, Boolean]
}
