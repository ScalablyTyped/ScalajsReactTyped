package typingsJapgolly.autocannon

import japgolly.scalajs.react.Callback
import typingsJapgolly.autocannon.anon.Histogramsentnumber
import typingsJapgolly.autocannon.autocannonStrings.ACL
import typingsJapgolly.autocannon.autocannonStrings.BIND
import typingsJapgolly.autocannon.autocannonStrings.CHECKOUT
import typingsJapgolly.autocannon.autocannonStrings.CONNECT
import typingsJapgolly.autocannon.autocannonStrings.COPY
import typingsJapgolly.autocannon.autocannonStrings.DELETE
import typingsJapgolly.autocannon.autocannonStrings.GET
import typingsJapgolly.autocannon.autocannonStrings.HEAD
import typingsJapgolly.autocannon.autocannonStrings.LINK
import typingsJapgolly.autocannon.autocannonStrings.LOCK
import typingsJapgolly.autocannon.autocannonStrings.MERGE
import typingsJapgolly.autocannon.autocannonStrings.MKACTIVITY
import typingsJapgolly.autocannon.autocannonStrings.MKCALENDAR
import typingsJapgolly.autocannon.autocannonStrings.MKCOL
import typingsJapgolly.autocannon.autocannonStrings.MOVE
import typingsJapgolly.autocannon.autocannonStrings.NOTIFY
import typingsJapgolly.autocannon.autocannonStrings.OPTIONS
import typingsJapgolly.autocannon.autocannonStrings.PATCH
import typingsJapgolly.autocannon.autocannonStrings.POST
import typingsJapgolly.autocannon.autocannonStrings.PROPFIND
import typingsJapgolly.autocannon.autocannonStrings.PROPPATCH
import typingsJapgolly.autocannon.autocannonStrings.PURGE
import typingsJapgolly.autocannon.autocannonStrings.PUT
import typingsJapgolly.autocannon.autocannonStrings.REBIND
import typingsJapgolly.autocannon.autocannonStrings.REPORT
import typingsJapgolly.autocannon.autocannonStrings.SEARCH
import typingsJapgolly.autocannon.autocannonStrings.SOURCE
import typingsJapgolly.autocannon.autocannonStrings.SUBSCRIBE
import typingsJapgolly.autocannon.autocannonStrings.TRACE
import typingsJapgolly.autocannon.autocannonStrings.UNBIND
import typingsJapgolly.autocannon.autocannonStrings.UNLINK
import typingsJapgolly.autocannon.autocannonStrings.UNLOCK
import typingsJapgolly.autocannon.autocannonStrings.UNSUBSCRIBE
import typingsJapgolly.autocannon.autocannonStrings.`M-SEARCH`
import typingsJapgolly.autocannon.autocannonStrings.body
import typingsJapgolly.autocannon.autocannonStrings.done
import typingsJapgolly.autocannon.autocannonStrings.error
import typingsJapgolly.autocannon.autocannonStrings.headers
import typingsJapgolly.autocannon.autocannonStrings.reqError
import typingsJapgolly.autocannon.autocannonStrings.response
import typingsJapgolly.autocannon.autocannonStrings.start
import typingsJapgolly.autocannon.autocannonStrings.tick
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  /**
    * Start autocannon against the given target.
    */
  inline def apply(options: Options, callback: js.Function2[/* err */ Any, /* result */ Result, Any]): Instance = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("autocannon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return string to print the result tables to the terminal, programmatically.
    */
  inline def printResult(result: Result): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printResult")(result.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def printResult(result: Result, options: PrintResultOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printResult")(result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Track the progress of your autocannon.
    */
  inline def track(instance: Instance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def track(instance: Instance, options: TrackingOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(instance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This object is passed as the first parameter of both the `setupClient` function and the `response` event from an autocannon instance.
    *
    * You can use this to modify the requests you are sending while benchmarking.
    */
  @js.native
  trait Client
    extends StObject
       with EventEmitter {
    
    /**
      * Emitted when a request sent from this client has received the body of a reply.
      */
    @JSName("on")
    def on_body(event: body, listener: js.Function1[/* body */ Buffer, Unit]): this.type = js.native
    /**
      * Emitted when a request sent from this client has received the headers of its reply.
      */
    @JSName("on")
    def on_headers(event: headers, listener: js.Function1[/* headers */ IncomingHttpHeaders, Unit]): this.type = js.native
    /**
      * Emitted when the client has received a completed response for a request it made.
      */
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function3[/* statusCode */ Double, /* resBytes */ Double, /* responseTime */ Double, Unit]
    ): this.type = js.native
    
    /**
      * Used to modify the body of the request this client iterator is currently on. body
      * @param body - should be a `String` or `Buffer`, or `undefined` if you want to remove the body.
      */
    def setBody(): Unit = js.native
    def setBody(body: String): Unit = js.native
    def setBody(body: Buffer): Unit = js.native
    
    /**
      * Used to modify the headers of the request this client iterator is currently on.
      * @param headers - should be an `Object`, or `undefined` if you want to remove your headers.
      */
    def setHeaders(): Unit = js.native
    def setHeaders(headers: IncomingHttpHeaders): Unit = js.native
    
    /**
      * Used to modify the both the headers and body this client iterator is currently on.
      * @param headers - should be an `Object`, or `undefined` if you want to remove your headers.
      * @param body - should be a `String` or `Buffer`, or `undefined` if you want to remove the body.
      */
    def setHeadersAndBody(): Unit = js.native
    def setHeadersAndBody(headers: Unit, body: String): Unit = js.native
    def setHeadersAndBody(headers: Unit, body: Buffer): Unit = js.native
    def setHeadersAndBody(headers: IncomingHttpHeaders): Unit = js.native
    def setHeadersAndBody(headers: IncomingHttpHeaders, body: String): Unit = js.native
    def setHeadersAndBody(headers: IncomingHttpHeaders, body: Buffer): Unit = js.native
    
    /**
      * Used to modify the both the entire request that this client iterator is currently on.
      * Defaults to the values passed into the autocannon instance when it was created.
      *
      * _Note: call this when modifying multiple request values for faster encoding._
      */
    def setRequest(request: Request): Unit = js.native
    
    /**
      * Used to overwrite the entire requests array that was passed into the instance on initiation.
      *
      * _Note: call this when modifying multiple requests for faster encoding._
      */
    def setRequests(newRequests: js.Array[Request]): Unit = js.native
  }
  
  trait Histogram extends StObject {
    
    /** The average (mean) value. */
    var average: Double
    
    /** The highest value for this statistic. */
    var max: Double
    
    /** The average (mean) value */
    var mean: Double
    
    /** The lowest value for this statistic. */
    var min: Double
    
    /** The 0.001st percentile value for this statistic. */
    var p0_001: Double
    
    /** The 0.01st percentile value for this statistic. */
    var p0_01: Double
    
    /** The 0.1st percentile value for this statistic. */
    var p0_1: Double
    
    /** The 1st percentile value for this statistic. */
    var p1: Double
    
    /** The 10th percentile value for this statistic. */
    var p10: Double
    
    /** The 25th percentile value for this statistic. */
    var p25: Double
    
    /** The 2.5th percentile value for this statistic. */
    var p2_5: Double
    
    /** The 50th percentile value for this statistic. */
    var p50: Double
    
    /** The 75th percentile value for this statistic. */
    var p75: Double
    
    /** The 90th percentile value for this statistic. */
    var p90: Double
    
    /** The 97.5th percentile value for this statistic. */
    var p97_5: Double
    
    /** The 99th percentile value for this statistic. */
    var p99: Double
    
    /** The 99.9th percentile value for this statistic. */
    var p99_9: Double
    
    /** The 99.99th percentile value for this statistic. */
    var p99_99: Double
    
    /** The 99.999th percentile value for this statistic. */
    var p99_999: Double
    
    /** The standard deviation. */
    var stddev: Double
    
    var total: Double
  }
  object Histogram {
    
    inline def apply(
      average: Double,
      max: Double,
      mean: Double,
      min: Double,
      p0_001: Double,
      p0_01: Double,
      p0_1: Double,
      p1: Double,
      p10: Double,
      p25: Double,
      p2_5: Double,
      p50: Double,
      p75: Double,
      p90: Double,
      p97_5: Double,
      p99: Double,
      p99_9: Double,
      p99_99: Double,
      p99_999: Double,
      stddev: Double,
      total: Double
    ): Histogram = {
      val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], p0_001 = p0_001.asInstanceOf[js.Any], p0_01 = p0_01.asInstanceOf[js.Any], p0_1 = p0_1.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p10 = p10.asInstanceOf[js.Any], p25 = p25.asInstanceOf[js.Any], p2_5 = p2_5.asInstanceOf[js.Any], p50 = p50.asInstanceOf[js.Any], p75 = p75.asInstanceOf[js.Any], p90 = p90.asInstanceOf[js.Any], p97_5 = p97_5.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any], p99_9 = p99_9.asInstanceOf[js.Any], p99_99 = p99_99.asInstanceOf[js.Any], p99_999 = p99_999.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Histogram]
    }
    
    extension [Self <: Histogram](x: Self) {
      
      inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setP0_001(value: Double): Self = StObject.set(x, "p0_001", value.asInstanceOf[js.Any])
      
      inline def setP0_01(value: Double): Self = StObject.set(x, "p0_01", value.asInstanceOf[js.Any])
      
      inline def setP0_1(value: Double): Self = StObject.set(x, "p0_1", value.asInstanceOf[js.Any])
      
      inline def setP1(value: Double): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP10(value: Double): Self = StObject.set(x, "p10", value.asInstanceOf[js.Any])
      
      inline def setP25(value: Double): Self = StObject.set(x, "p25", value.asInstanceOf[js.Any])
      
      inline def setP2_5(value: Double): Self = StObject.set(x, "p2_5", value.asInstanceOf[js.Any])
      
      inline def setP50(value: Double): Self = StObject.set(x, "p50", value.asInstanceOf[js.Any])
      
      inline def setP75(value: Double): Self = StObject.set(x, "p75", value.asInstanceOf[js.Any])
      
      inline def setP90(value: Double): Self = StObject.set(x, "p90", value.asInstanceOf[js.Any])
      
      inline def setP97_5(value: Double): Self = StObject.set(x, "p97_5", value.asInstanceOf[js.Any])
      
      inline def setP99(value: Double): Self = StObject.set(x, "p99", value.asInstanceOf[js.Any])
      
      inline def setP99_9(value: Double): Self = StObject.set(x, "p99_9", value.asInstanceOf[js.Any])
      
      inline def setP99_99(value: Double): Self = StObject.set(x, "p99_99", value.asInstanceOf[js.Any])
      
      inline def setP99_999(value: Double): Self = StObject.set(x, "p99_999", value.asInstanceOf[js.Any])
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Autocannon instance/event emitter for tracking progress, etc.
    */
  @js.native
  trait Instance
    extends StObject
       with EventEmitter {
    
    // tslint:disable-line:unified-signatures
    /**
      * Emitted when the autocannon finishes a benchmark.
      */
    @JSName("on")
    def on_done(event: done, listener: js.Function1[/* result */ Result, Unit]): this.type = js.native
    /**
      * Emitted if there is an error during the setup phase of autocannon.
      */
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    /**
      * Emitted in the case of a request error e.g. a timeout.
      */
    @JSName("on")
    def on_reqError(event: reqError, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    /**
      * Emitted when the autocannons http-client gets a http response from the server.
      */
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function4[
          /* client */ Client, 
          /* statusCode */ Double, 
          /* resBytes */ Double, 
          /* responseTime */ Double, 
          Unit
        ]
    ): this.type = js.native
    /**
      * Emitted once everything has been setup in your autocannon instance and it has started.
      * Useful for if running the instance forever.
      */
    @JSName("on")
    def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted every second this autocannon is running a benchmark.
      * Useful for displaying stats, etc. Used by the `track` function.
      */
    @JSName("on")
    def on_tick(event: tick, listener: js.Function0[Unit]): this.type = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A `Number` stating the amount of requests to make before ending the test.
      * This overrides duration and takes precedence, so the test won't end
      * until the amount of requests needed to be completed are completed.
      */
    var amount: js.UndefOr[Double] = js.undefined
    
    /**
      * The threshold of the number of errors when making the requests to the server before this instance bail's out.
      * This instance will take all existing results so far and aggregate them into the results.
      * If none passed here, the instance will ignore errors and never bail out.
      */
    var bailout: js.UndefOr[Double] = js.undefined
    
    /**
      * A `String` or a `Buffer` containing the body of the request.
      *
      * Insert one or more randomly generated IDs into the body by including `[<id>]`
      * where the randomly generated ID should be inserted (Must also set idReplacement to true).
      *
      * This can be useful in soak testing POST endpoints where one or more fields must be unique.
      *
      * Leave undefined for an empty body.
      */
    var body: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * A `Number` stating the rate of requests to make per second from each individual connection.
      * No rate limiting by default.
      */
    var connectionRate: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of concurrent connections.
      * @default 10
      */
    var connections: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of seconds to run the autocannon.
      * Can be a [timestring](https://www.npmjs.com/package/timestring).
      * @default 10
      */
    var duration: js.UndefOr[Double | String] = js.undefined
    
    /**
      * A `Boolean` which allows you to disable tracking non 2xx code responses in latency and bytes per second calculations.
      * @default false
      */
    var excludeErrorStats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A `Boolean` which allows you to setup an instance of autocannon that restarts indefinitely after emiting results with the `done` event.
      * Useful for efficiently restarting your instance. To stop running forever, you must cause a `SIGINT` or call the `.stop()` function on your instance.
      * @default false
      */
    var forever: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An `Object` containing the headers of the request.
      * @default {}
      */
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    /**
      * A `Boolean` which enables the replacement of `[<id>]` tags within the request body with a randomly generated ID,
      * allowing for unique fields to be sent with requests.
      * @default false
      */
    var idReplacement: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A `Number` stating the max requests to make per connection.
      * `amount` takes precedence if both are set.
      */
    var maxConnectionRequests: js.UndefOr[Double] = js.undefined
    
    /**
      * A `Number` stating the max requests to make overall.
      * Can't be less than `connections`.
      */
    var maxOverallRequests: js.UndefOr[Double] = js.undefined
    
    /**
      * The http method to use.
      * @default 'GET'
      */
    var method: js.UndefOr[
        ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
      ] = js.undefined
    
    /**
      * A `Number` stating the rate of requests to make per second from all connections.
      * `connectionRate` takes precedence if both are set.
      * No rate limiting by default.
      */
    var overallRate: js.UndefOr[Double] = js.undefined
    
    /**
      *  The number of [pipelined requests](https://en.wikipedia.org/wiki/HTTP_pipelining) for each connection.
      * Will cause the `Client` API to throw when greater than 1
      * @default 1
      */
    var pipelining: js.UndefOr[Double] = js.undefined
    
    /**
      * A `Number` which makes the individual connections disconnect and reconnect to the server
      * whenever it has sent that number of requests.
      */
    var reconnectRate: js.UndefOr[Double] = js.undefined
    
    /**
      * An `Array` of `Objects` which represents the sequence of requests to make while benchmarking.
      * Can be used in conjunction with the `body`, `headers` and `method` params above.
      *
      * The `Objects` in this array can have `body`, `headers`, `method`, or `path` attributes, which overwrite those that are passed in this `opts` object.
      * Therefore, the ones in this (`opts`) object take precedence and should be viewed as defaults.
      */
    var requests: js.UndefOr[js.Array[Request]] = js.undefined
    
    /**
      * A `String` identifying the server name for the SNI (Server Name Indication) TLS extension.
      */
    var servername: js.UndefOr[String] = js.undefined
    
    /**
      * A `Function` which will be passed the Client object for each connection to be made.
      * This can be used to customise each individual connection headers and body using the API shown below.
      *
      * The changes you make to the client in this function will take precedence over the default body and headers you pass in here.
      *
      * @default noop(){}
      */
    var setupClient: js.UndefOr[js.Function1[/* client */ Client, Unit]] = js.undefined
    
    /**
      * A path to a Unix Domain Socket or a Windows Named Pipe.
      * A `url` is still required in order to send the correct Host header and path.
      */
    var socketPath: js.UndefOr[String] = js.undefined
    
    /**
      * The number of seconds to wait for a response before timeout.
      * @default 10
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * A `String` to be added to the results for identification.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The given target. Can be http or https.
      */
    var url: String
    
    /**
      * The number of worker threads to use to fire requests.
      */
    var workers: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setBailout(value: Double): Self = StObject.set(x, "bailout", value.asInstanceOf[js.Any])
      
      inline def setBailoutUndefined: Self = StObject.set(x, "bailout", js.undefined)
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setConnectionRate(value: Double): Self = StObject.set(x, "connectionRate", value.asInstanceOf[js.Any])
      
      inline def setConnectionRateUndefined: Self = StObject.set(x, "connectionRate", js.undefined)
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setExcludeErrorStats(value: Boolean): Self = StObject.set(x, "excludeErrorStats", value.asInstanceOf[js.Any])
      
      inline def setExcludeErrorStatsUndefined: Self = StObject.set(x, "excludeErrorStats", js.undefined)
      
      inline def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      inline def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIdReplacement(value: Boolean): Self = StObject.set(x, "idReplacement", value.asInstanceOf[js.Any])
      
      inline def setIdReplacementUndefined: Self = StObject.set(x, "idReplacement", js.undefined)
      
      inline def setMaxConnectionRequests(value: Double): Self = StObject.set(x, "maxConnectionRequests", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionRequestsUndefined: Self = StObject.set(x, "maxConnectionRequests", js.undefined)
      
      inline def setMaxOverallRequests(value: Double): Self = StObject.set(x, "maxOverallRequests", value.asInstanceOf[js.Any])
      
      inline def setMaxOverallRequestsUndefined: Self = StObject.set(x, "maxOverallRequests", js.undefined)
      
      inline def setMethod(
        value: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOverallRate(value: Double): Self = StObject.set(x, "overallRate", value.asInstanceOf[js.Any])
      
      inline def setOverallRateUndefined: Self = StObject.set(x, "overallRate", js.undefined)
      
      inline def setPipelining(value: Double): Self = StObject.set(x, "pipelining", value.asInstanceOf[js.Any])
      
      inline def setPipeliningUndefined: Self = StObject.set(x, "pipelining", js.undefined)
      
      inline def setReconnectRate(value: Double): Self = StObject.set(x, "reconnectRate", value.asInstanceOf[js.Any])
      
      inline def setReconnectRateUndefined: Self = StObject.set(x, "reconnectRate", js.undefined)
      
      inline def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
      
      inline def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value*))
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      inline def setSetupClient(value: /* client */ Client => Callback): Self = StObject.set(x, "setupClient", js.Any.fromFunction1((t0: /* client */ Client) => value(t0).runNow()))
      
      inline def setSetupClientUndefined: Self = StObject.set(x, "setupClient", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait PrintResultOptions extends StObject {
    
    /**
      * The stream to output to.
      * @default process.stderr
      */
    var outputStream: js.UndefOr[WritableStream] = js.undefined
    
    /**
      * A truthy value to enable the rendering of the advanced latency table.
      * @default false
      */
    var renderLatencyTable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A truthy value to enable the rendering of the results table.
      * @default true
      */
    var renderResultsTable: js.UndefOr[Boolean] = js.undefined
  }
  object PrintResultOptions {
    
    inline def apply(): PrintResultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintResultOptions]
    }
    
    extension [Self <: PrintResultOptions](x: Self) {
      
      inline def setOutputStream(value: WritableStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      inline def setRenderLatencyTable(value: Boolean): Self = StObject.set(x, "renderLatencyTable", value.asInstanceOf[js.Any])
      
      inline def setRenderLatencyTableUndefined: Self = StObject.set(x, "renderLatencyTable", js.undefined)
      
      inline def setRenderResultsTable(value: Boolean): Self = StObject.set(x, "renderResultsTable", value.asInstanceOf[js.Any])
      
      inline def setRenderResultsTableUndefined: Self = StObject.set(x, "renderResultsTable", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    var body: js.UndefOr[String | Buffer] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var method: js.UndefOr[
        ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
      ] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(
        value: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /**
    * The results object emitted by `done` and passed to the `autocannon()` callback.
    */
  trait Result extends StObject {
    
    /** The number of 1xx response status codes received. */
    var `1XX`: Double
    
    /** The number of 2xx response status codes received. */
    var `2XX`: Double
    
    /** The number of 3xx response status codes received. */
    var `3XX`: Double
    
    /** The number of 4xx response status codes received. */
    var `4XX`: Double
    
    /** The number of 5xx response status codes received. */
    var `5XX`: Double
    
    /** The amount of connections used (value of `options.connections`). */
    var connections: Double
    
    /** The amount of time the test took, **in seconds**. */
    var duration: Double
    
    /** The number of connection errors (including timeouts) that occurred. */
    var errors: Double
    
    /** A Date object representing when the test ended. */
    var finish: js.Date
    
    /** A histogram object containing statistics about response latency. */
    var latency: Histogram
    
    /** The number of requests with a mismatched body. */
    var mismatches: Double
    
    /** The number of non-2xx response status codes received. */
    var non2xx: Double
    
    /** The number of pipelined requests used per connection (value of `options.pipelining`). */
    var pipelining: Double
    
    /** A histogram object containing statistics about the amount of requests that were sent per second. */
    var requests: Histogramsentnumber
    
    /** How many times the requests pipeline was reset due to setupRequest returning a falsey value. */
    var resets: Double
    
    /** The UNIX Domain Socket or Windows Named Pipe that was targeted, or `undefined`. */
    var socketPath: js.UndefOr[String] = js.undefined
    
    /** A Date object representing when the test started. */
    var start: js.Date
    
    /** A histogram object containing statistics about the response data throughput per second. */
    var throughput: Histogram
    
    /** The number of connection timeouts that occurred. */
    var timeouts: Double
    
    /** Value of the `title` option passed to `autocannon()`. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The URL that was targeted. */
    var url: String
  }
  object Result {
    
    inline def apply(
      `1XX`: Double,
      `2XX`: Double,
      `3XX`: Double,
      `4XX`: Double,
      `5XX`: Double,
      connections: Double,
      duration: Double,
      errors: Double,
      finish: js.Date,
      latency: Histogram,
      mismatches: Double,
      non2xx: Double,
      pipelining: Double,
      requests: Histogramsentnumber,
      resets: Double,
      start: js.Date,
      throughput: Histogram,
      timeouts: Double,
      url: String
    ): Result = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], mismatches = mismatches.asInstanceOf[js.Any], non2xx = non2xx.asInstanceOf[js.Any], pipelining = pipelining.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], resets = resets.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], throughput = throughput.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("1XX")(`1XX`.asInstanceOf[js.Any])
      __obj.updateDynamic("2XX")(`2XX`.asInstanceOf[js.Any])
      __obj.updateDynamic("3XX")(`3XX`.asInstanceOf[js.Any])
      __obj.updateDynamic("4XX")(`4XX`.asInstanceOf[js.Any])
      __obj.updateDynamic("5XX")(`5XX`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def set1XX(value: Double): Self = StObject.set(x, "1XX", value.asInstanceOf[js.Any])
      
      inline def set2XX(value: Double): Self = StObject.set(x, "2XX", value.asInstanceOf[js.Any])
      
      inline def set3XX(value: Double): Self = StObject.set(x, "3XX", value.asInstanceOf[js.Any])
      
      inline def set4XX(value: Double): Self = StObject.set(x, "4XX", value.asInstanceOf[js.Any])
      
      inline def set5XX(value: Double): Self = StObject.set(x, "5XX", value.asInstanceOf[js.Any])
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: js.Date): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setLatency(value: Histogram): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setMismatches(value: Double): Self = StObject.set(x, "mismatches", value.asInstanceOf[js.Any])
      
      inline def setNon2xx(value: Double): Self = StObject.set(x, "non2xx", value.asInstanceOf[js.Any])
      
      inline def setPipelining(value: Double): Self = StObject.set(x, "pipelining", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: Histogramsentnumber): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setResets(value: Double): Self = StObject.set(x, "resets", value.asInstanceOf[js.Any])
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setThroughput(value: Histogram): Self = StObject.set(x, "throughput", value.asInstanceOf[js.Any])
      
      inline def setTimeouts(value: Double): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackingOptions extends StObject {
    
    /**
      * The stream to output to.
      * @default process.stderr
      */
    var outputStream: js.UndefOr[WritableStream] = js.undefined
    
    /**
      * A `String` defining the format of the progress display output. Must be valid input for the [progress bar module](https://www.npmjs.com/package/progress).
      * @default 'running [:bar] :percent'
      */
    var progressBarString: js.UndefOr[String] = js.undefined
    
    /**
      * A truthy value to enable the rendering of the advanced latency table.
      * @default false
      */
    var renderLatencyTable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A truthy value to enable the rendering of the progress bar.
      * @default true
      */
    var renderProgressBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A truthy value to enable the rendering of the results table.
      * @default true
      */
    var renderResultsTable: js.UndefOr[Boolean] = js.undefined
  }
  object TrackingOptions {
    
    inline def apply(): TrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackingOptions]
    }
    
    extension [Self <: TrackingOptions](x: Self) {
      
      inline def setOutputStream(value: WritableStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      inline def setProgressBarString(value: String): Self = StObject.set(x, "progressBarString", value.asInstanceOf[js.Any])
      
      inline def setProgressBarStringUndefined: Self = StObject.set(x, "progressBarString", js.undefined)
      
      inline def setRenderLatencyTable(value: Boolean): Self = StObject.set(x, "renderLatencyTable", value.asInstanceOf[js.Any])
      
      inline def setRenderLatencyTableUndefined: Self = StObject.set(x, "renderLatencyTable", js.undefined)
      
      inline def setRenderProgressBar(value: Boolean): Self = StObject.set(x, "renderProgressBar", value.asInstanceOf[js.Any])
      
      inline def setRenderProgressBarUndefined: Self = StObject.set(x, "renderProgressBar", js.undefined)
      
      inline def setRenderResultsTable(value: Boolean): Self = StObject.set(x, "renderResultsTable", value.asInstanceOf[js.Any])
      
      inline def setRenderResultsTableUndefined: Self = StObject.set(x, "renderResultsTable", js.undefined)
    }
  }
}
