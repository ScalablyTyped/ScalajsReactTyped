package typingsJapgolly.expressRateLimit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressRateLimit.anon.PartialOptions
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import typingsJapgolly.node.timersMod.global.NodeJS.Timer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-rate-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): RateLimitRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[RateLimitRequestHandler]
  inline def default(passedOptions: PartialOptions): RateLimitRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(passedOptions.asInstanceOf[js.Any]).asInstanceOf[RateLimitRequestHandler]
  
  @JSImport("express-rate-limit", "MemoryStore")
  @js.native
  open class MemoryStore ()
    extends StObject
       with Store {
    
    /**
    	 * Method to decrement a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    /* CompleteClass */
    override def decrement(key: String): js.Promise[Unit] | Unit = js.native
    
    /**
    	 * The map that stores the number of hits for each client in memory.
    	 */
    var hits: StringDictionary[js.UndefOr[Double]] = js.native
    
    /**
    	 * Method to increment a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 *
    	 * @returns {IncrementResponse} - The number of hits and reset time for that client.
    	 */
    /* CompleteClass */
    override def increment(key: String): js.Promise[IncrementResponse] | IncrementResponse = js.native
    
    /**
    	 * Method that initializes the store.
    	 *
    	 * @param options {Options} - The options used to setup the middleware.
    	 */
    @JSName("init")
    def init_MMemoryStore(options: Options): Unit = js.native
    
    /**
    	 * Reference to the active timer.
    	 */
    var interval: js.UndefOr[Timer] = js.native
    
    /**
    	 * Method to reset everyone's hit counter.
    	 *
    	 * @public
    	 */
    @JSName("resetAll")
    def resetAll_MMemoryStore(): js.Promise[Unit] = js.native
    
    /**
    	 * Method to reset a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    /* CompleteClass */
    override def resetKey(key: String): js.Promise[Unit] | Unit = js.native
    
    /**
    	 * The time at which all hit counts will be reset.
    	 */
    var resetTime: js.Date = js.native
    
    /**
    	 * Method to stop the timer (if currently running) and prevent any memory
    	 * leaks.
    	 *
    	 * @public
    	 */
    @JSName("shutdown")
    def shutdown_MMemoryStore(): Unit = js.native
    
    /**
    	 * The duration of time before which all hit counts are reset (in milliseconds).
    	 */
    var windowMs: Double = js.native
  }
  
  inline def rateLimit(): RateLimitRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("rateLimit")().asInstanceOf[RateLimitRequestHandler]
  inline def rateLimit(passedOptions: PartialOptions): RateLimitRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("rateLimit")(passedOptions.asInstanceOf[js.Any]).asInstanceOf[RateLimitRequestHandler]
  
  @js.native
  trait AugmentedRequest
    extends StObject
       with Request
       with /* key */ StringDictionary[RateLimitInfo]
  
  type IncrementCallback = js.Function3[
    /* error */ js.UndefOr[js.Error], 
    /* totalHits */ Double, 
    /* resetTime */ js.UndefOr[js.Date], 
    Unit
  ]
  
  trait IncrementResponse extends StObject {
    
    var resetTime: js.UndefOr[js.Date] = js.undefined
    
    var totalHits: Double
  }
  object IncrementResponse {
    
    inline def apply(totalHits: Double): IncrementResponse = {
      val __obj = js.Dynamic.literal(totalHits = totalHits.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncrementResponse]
    }
    
    extension [Self <: IncrementResponse](x: Self) {
      
      inline def setResetTime(value: js.Date): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      inline def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
      
      inline def setTotalHits(value: Double): Self = StObject.set(x, "totalHits", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegacyStore extends StObject {
    
    /**
    	 * Method to decrement a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    def decrement(key: String): Unit
    
    /**
    	 * Method to increment a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 * @param callback {IncrementCallback} - The callback to call once the counter is incremented.
    	 */
    def incr(key: String, callback: IncrementCallback): Unit
    
    /**
    	 * Method to reset everyone's hit counter.
    	 */
    var resetAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
    	 * Method to reset a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    def resetKey(key: String): Unit
  }
  object LegacyStore {
    
    inline def apply(
      decrement: String => Callback,
      incr: (String, IncrementCallback) => Callback,
      resetKey: String => Callback
    ): LegacyStore = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1((t0: String) => decrement(t0).runNow()), incr = js.Any.fromFunction2((t0: String, t1: IncrementCallback) => (incr(t0, t1)).runNow()), resetKey = js.Any.fromFunction1((t0: String) => resetKey(t0).runNow()))
      __obj.asInstanceOf[LegacyStore]
    }
    
    extension [Self <: LegacyStore](x: Self) {
      
      inline def setDecrement(value: String => Callback): Self = StObject.set(x, "decrement", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setIncr(value: (String, IncrementCallback) => Callback): Self = StObject.set(x, "incr", js.Any.fromFunction2((t0: String, t1: IncrementCallback) => (value(t0, t1)).runNow()))
      
      inline def setResetAll(value: Callback): Self = StObject.set(x, "resetAll", value.toJsFn)
      
      inline def setResetAllUndefined: Self = StObject.set(x, "resetAll", js.undefined)
      
      inline def setResetKey(value: String => Callback): Self = StObject.set(x, "resetKey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    /**
    	 * Whether to send `RateLimit-*` headers with the rate limit and the number
    	 * of requests.
    	 *
    	 * @deprecated 6.x - This option was renamed to `standardHeaders`.
    	 */
    var draft_polli_ratelimit_headers: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Express request handler that sends back a response when a client is
    	 * rate-limited.
    	 *
    	 * By default, sends back the `statusCode` and `message` set via the options.
    	 */
    def handler(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]],
      next: NextFunction,
      optionsUsed: Options
    ): Unit
    
    /**
    	 * Whether to send `X-RateLimit-*` headers with the rate limit and the number
    	 * of requests.
    	 *
    	 * @deprecated 6.x - This option was renamed to `legacyHeaders`.
    	 */
    var headers: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Method to generate custom identifiers for clients.
    	 *
    	 * By default, the client's IP address is used.
    	 */
    def keyGenerator(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]]
    ): String | js.Promise[String]
    
    /**
    	 * Whether to send `X-RateLimit-*` headers with the rate limit and the number
    	 * of requests.
    	 *
    	 * Defaults to `true` (for backward compatibility).
    	 */
    val legacyHeaders: Boolean
    
    /**
    	 * The maximum number of connections to allow during the `window` before
    	 * rate limiting the client.
    	 *
    	 * Can be the limit itself as a number or express middleware that parses
    	 * the request and then figures out the limit.
    	 *
    	 * Defaults to `5`.
    	 */
    val max: Double | ValueDeterminingMiddleware[Double]
    
    /**
    	 * The response body to send back when a client is rate limited.
    	 *
    	 * Defaults to `'Too many requests, please try again later.'`
    	 */
    val message: Any | ValueDeterminingMiddleware[Any]
    
    /**
    	 * Express request handler that sends back a response when a client has
    	 * reached their rate limit, and will be rate limited on their next request.
    	 *
    	 * @deprecated 6.x - Please use a custom `handler` that checks the number of
    	 * hits instead.
    	 */
    def onLimitReached(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]],
      optionsUsed: Options
    ): Unit
    
    /**
    	 * The name of the property on the request object to store the rate limit info.
    	 *
    	 * Defaults to `rateLimit`.
    	 */
    val requestPropertyName: String
    
    /**
    	 * Method to determine whether or not the request counts as 'succesful'. Used
    	 * when either `skipSuccessfulRequests` or `skipFailedRequests` is set to true.
    	 *
    	 * By default, requests with a response status code less than 400 are considered
    	 * successful.
    	 */
    def requestWasSuccessful(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]]
    ): Boolean | js.Promise[Boolean]
    
    /**
    	 * Method (in the form of middleware) to determine whether or not this request
    	 * counts towards a client's quota.
    	 *
    	 * By default, skips no requests.
    	 */
    def skip(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]]
    ): Boolean | js.Promise[Boolean]
    
    /**
    	 * If `true`, the library will (by default) skip all requests that have a 4XX
    	 * or 5XX status.
    	 *
    	 * Defaults to `false`.
    	 */
    val skipFailedRequests: Boolean
    
    /**
    	 * If `true`, the library will (by default) skip all requests that have a
    	 * status code less than 400.
    	 *
    	 * Defaults to `false`.
    	 */
    val skipSuccessfulRequests: Boolean
    
    /**
    	 * Whether to enable support for the standardized rate limit headers (`RateLimit-*`).
    	 *
    	 * Defaults to `false` (for backward compatibility, but its use is recommended).
    	 */
    val standardHeaders: Boolean
    
    /**
    	 * The HTTP status code to send back when a client is rate limited.
    	 *
    	 * Defaults to `HTTP 429 Too Many Requests` (RFC 6585).
    	 */
    val statusCode: Double
    
    /**
    	 * The `Store` to use to store the hit count for each client.
    	 *
    	 * By default, the built-in `MemoryStore` will be used.
    	 */
    var store: Store | LegacyStore
    
    /**
    	 * How long we should remember the requests.
    	 *
    	 * Defaults to `60000` ms (= 1 minute).
    	 */
    val windowMs: Double
  }
  object Options {
    
    inline def apply(
      handler: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]], NextFunction, Options) => Callback,
      keyGenerator: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]]) => String | js.Promise[String],
      legacyHeaders: Boolean,
      max: Double | ValueDeterminingMiddleware[Double],
      message: Any | ValueDeterminingMiddleware[Any],
      onLimitReached: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]], Options) => Callback,
      requestPropertyName: String,
      requestWasSuccessful: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean],
      skip: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean],
      skipFailedRequests: Boolean,
      skipSuccessfulRequests: Boolean,
      standardHeaders: Boolean,
      statusCode: Double,
      store: Store | LegacyStore,
      windowMs: Double
    ): Options = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction4((t0: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], t1: Response_[Any, Record[String, Any]], t2: NextFunction, t3: Options) => (handler(t0, t1, t2, t3)).runNow()), keyGenerator = js.Any.fromFunction2(keyGenerator), legacyHeaders = legacyHeaders.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onLimitReached = js.Any.fromFunction3((t0: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], t1: Response_[Any, Record[String, Any]], t2: Options) => (onLimitReached(t0, t1, t2)).runNow()), requestPropertyName = requestPropertyName.asInstanceOf[js.Any], requestWasSuccessful = js.Any.fromFunction2(requestWasSuccessful), skip = js.Any.fromFunction2(skip), skipFailedRequests = skipFailedRequests.asInstanceOf[js.Any], skipSuccessfulRequests = skipSuccessfulRequests.asInstanceOf[js.Any], standardHeaders = standardHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], windowMs = windowMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDraft_polli_ratelimit_headers(value: Boolean): Self = StObject.set(x, "draft_polli_ratelimit_headers", value.asInstanceOf[js.Any])
      
      inline def setDraft_polli_ratelimit_headersUndefined: Self = StObject.set(x, "draft_polli_ratelimit_headers", js.undefined)
      
      inline def setHandler(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]], NextFunction, Options) => Callback
      ): Self = StObject.set(x, "handler", js.Any.fromFunction4((t0: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: Response_[Any, Record[String, Any]], t2: NextFunction, t3: Options) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setKeyGenerator(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]]) => String | js.Promise[String]
      ): Self = StObject.set(x, "keyGenerator", js.Any.fromFunction2(value))
      
      inline def setLegacyHeaders(value: Boolean): Self = StObject.set(x, "legacyHeaders", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double | ValueDeterminingMiddleware[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxFunction2(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Double | js.Promise[Double]
      ): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
      
      inline def setMessage(value: Any | ValueDeterminingMiddleware[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction2(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Any | js.Promise[Any]
      ): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      inline def setOnLimitReached(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]], Options) => Callback
      ): Self = StObject.set(x, "onLimitReached", js.Any.fromFunction3((t0: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: Response_[Any, Record[String, Any]], t2: Options) => (value(t0, t1, t2)).runNow()))
      
      inline def setRequestPropertyName(value: String): Self = StObject.set(x, "requestPropertyName", value.asInstanceOf[js.Any])
      
      inline def setRequestWasSuccessful(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "requestWasSuccessful", js.Any.fromFunction2(value))
      
      inline def setSkip(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      inline def setSkipFailedRequests(value: Boolean): Self = StObject.set(x, "skipFailedRequests", value.asInstanceOf[js.Any])
      
      inline def setSkipSuccessfulRequests(value: Boolean): Self = StObject.set(x, "skipSuccessfulRequests", value.asInstanceOf[js.Any])
      
      inline def setStandardHeaders(value: Boolean): Self = StObject.set(x, "standardHeaders", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Store | LegacyStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setWindowMs(value: Double): Self = StObject.set(x, "windowMs", value.asInstanceOf[js.Any])
    }
  }
  
  type RateLimitExceededEventHandler = js.Function4[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* response */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    /* optionsUsed */ Options, 
    Unit
  ]
  
  trait RateLimitInfo extends StObject {
    
    val current: Double
    
    val limit: Double
    
    val remaining: Double
    
    val resetTime: js.UndefOr[js.Date] = js.undefined
  }
  object RateLimitInfo {
    
    inline def apply(current: Double, limit: Double, remaining: Double): RateLimitInfo = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitInfo]
    }
    
    extension [Self <: RateLimitInfo](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setResetTime(value: js.Date): Self = StObject.set(x, "resetTime", value.asInstanceOf[js.Any])
      
      inline def setResetTimeUndefined: Self = StObject.set(x, "resetTime", js.undefined)
    }
  }
  
  type RateLimitReachedEventHandler = js.Function3[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* response */ Response_[Any, Record[String, Any]], 
    /* optionsUsed */ Options, 
    Unit
  ]
  
  @js.native
  trait RateLimitRequestHandler extends RequestHandler {
    
    /**
    	 * Method to reset a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    def resetKey(key: String): Unit = js.native
  }
  
  trait Store extends StObject {
    
    /**
    	 * Method to decrement a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    def decrement(key: String): js.Promise[Unit] | Unit
    
    /**
    	 * Method to increment a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 *
    	 * @returns {IncrementResponse} - The number of hits and reset time for that client.
    	 */
    def increment(key: String): js.Promise[IncrementResponse] | IncrementResponse
    
    /**
    	 * Method that initializes the store, and has access to the options passed to
    	 * the middleware too.
    	 *
    	 * @param options {Options} - The options used to setup the middleware.
    	 */
    var init: js.UndefOr[js.Function1[/* options */ Options, Unit]] = js.undefined
    
    /**
    	 * Method to reset everyone's hit counter.
    	 */
    var resetAll: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
    	 * Method to reset a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    def resetKey(key: String): js.Promise[Unit] | Unit
    
    /**
    	 * Method to shutdown the store, stop timers, and release all resources.
    	 */
    var shutdown: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  }
  object Store {
    
    inline def apply(
      decrement: String => js.Promise[Unit] | Unit,
      increment: String => js.Promise[IncrementResponse] | IncrementResponse,
      resetKey: String => js.Promise[Unit] | Unit
    ): Store = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), increment = js.Any.fromFunction1(increment), resetKey = js.Any.fromFunction1(resetKey))
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setDecrement(value: String => js.Promise[Unit] | Unit): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      inline def setIncrement(value: String => js.Promise[IncrementResponse] | IncrementResponse): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setInit(value: /* options */ Options => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Options) => value(t0).runNow()))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setResetAll(value: CallbackTo[js.Promise[Unit] | Unit]): Self = StObject.set(x, "resetAll", value.toJsFn)
      
      inline def setResetAllUndefined: Self = StObject.set(x, "resetAll", js.undefined)
      
      inline def setResetKey(value: String => js.Promise[Unit] | Unit): Self = StObject.set(x, "resetKey", js.Any.fromFunction1(value))
      
      inline def setShutdown(value: CallbackTo[js.Promise[Unit] | Unit]): Self = StObject.set(x, "shutdown", value.toJsFn)
      
      inline def setShutdownUndefined: Self = StObject.set(x, "shutdown", js.undefined)
    }
  }
  
  type ValueDeterminingMiddleware[T] = js.Function2[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* response */ Response_[Any, Record[String, Any]], 
    T | js.Promise[T]
  ]
}
