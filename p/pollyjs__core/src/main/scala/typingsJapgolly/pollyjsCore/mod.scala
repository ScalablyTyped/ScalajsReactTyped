package typingsJapgolly.pollyjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pollyjsAdapter.mod.default
import typingsJapgolly.pollyjsCore.anon.Body
import typingsJapgolly.pollyjsCore.anon.Dictkey
import typingsJapgolly.pollyjsCore.anon.DisableSortingHarEntries
import typingsJapgolly.pollyjsCore.anon.TypeofAdapter
import typingsJapgolly.pollyjsCore.anon.TypeofPersister
import typingsJapgolly.pollyjsCore.pollyjsCoreStrings.abort
import typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error
import typingsJapgolly.pollyjsCore.pollyjsCoreStrings.request
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/core", "Polly")
  @js.native
  open class Polly protected () extends StObject {
    def this(recordingName: String) = this()
    def this(recordingName: String, options: PollyConfig) = this()
    
    var adapters: Map[String, default] = js.native
    
    var config: PollyConfig = js.native
    
    def configure(config: PollyConfig): Unit = js.native
    
    def connectTo(name: String): Unit = js.native
    def connectTo(name: TypeofAdapter): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def disconnectFrom(name: String): Unit = js.native
    def disconnectFrom(name: TypeofAdapter): Unit = js.native
    
    def flush(): js.Promise[Unit] = js.native
    
    var mode: MODE = js.native
    
    def passthrough(): Unit = js.native
    
    def pause(): Unit = js.native
    
    var persister: typingsJapgolly.pollyjsPersister.mod.default | Null = js.native
    
    def play(): Unit = js.native
    
    def record(): Unit = js.native
    
    var recordingId: String = js.native
    
    var recordingName: String = js.native
    
    def replay(): Unit = js.native
    
    var server: PollyServer = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  /* static members */
  object Polly {
    
    @JSImport("@pollyjs/core", "Polly")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pollyjs/core", "Polly.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    inline def off(event: PollyEvent, listener: PollyEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(event: PollyEvent, listener: PollyEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def once(event: PollyEvent, listener: PollyEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def register(Factory: TypeofAdapter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(Factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def register(Factory: TypeofPersister): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(Factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unregister(Factory: TypeofAdapter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(Factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unregister(Factory: TypeofPersister): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(Factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@pollyjs/core", "PollyServer")
  @js.native
  open class PollyServer () extends StObject {
    
    def any(): RouteHandler = js.native
    def any(routes: String): RouteHandler = js.native
    def any(routes: js.Array[String]): RouteHandler = js.native
    
    def delete(): RouteHandler = js.native
    def delete(routes: String): RouteHandler = js.native
    def delete(routes: js.Array[String]): RouteHandler = js.native
    
    def get(): RouteHandler = js.native
    def get(routes: String): RouteHandler = js.native
    def get(routes: js.Array[String]): RouteHandler = js.native
    
    def head(): RouteHandler = js.native
    def head(routes: String): RouteHandler = js.native
    def head(routes: js.Array[String]): RouteHandler = js.native
    
    def host(host: String, callback: js.Function0[Unit]): Unit = js.native
    
    def merge(): RouteHandler = js.native
    def merge(routes: String): RouteHandler = js.native
    def merge(routes: js.Array[String]): RouteHandler = js.native
    
    def namespace(path: String, callback: js.Function0[Unit]): Unit = js.native
    
    def options(): RouteHandler = js.native
    def options(routes: String): RouteHandler = js.native
    def options(routes: js.Array[String]): RouteHandler = js.native
    
    def patch(): RouteHandler = js.native
    def patch(routes: String): RouteHandler = js.native
    def patch(routes: js.Array[String]): RouteHandler = js.native
    
    def post(): RouteHandler = js.native
    def post(routes: String): RouteHandler = js.native
    def post(routes: js.Array[String]): RouteHandler = js.native
    
    def put(): RouteHandler = js.native
    def put(routes: String): RouteHandler = js.native
    def put(routes: js.Array[String]): RouteHandler = js.native
    
    def timeout(ms: Double): js.Promise[Unit] = js.native
  }
  
  @JSImport("@pollyjs/core", "RouteHandler")
  @js.native
  open class RouteHandler () extends StObject {
    
    def configure(config: PollyConfig): RouteHandler = js.native
    
    def filter(callback: js.Function1[/* req */ Request, Boolean]): RouteHandler = js.native
    
    def intercept(fn: InterceptHandler): RouteHandler = js.native
    
    def off(event: AbortRouteEvent): RouteHandler = js.native
    def off(event: AbortRouteEvent, listener: AbortEventListener): RouteHandler = js.native
    def off(event: ErrorRouteEvent): RouteHandler = js.native
    def off(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
    def off(event: RecordingRouteEvent): RouteHandler = js.native
    def off(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
    def off(event: RequestRouteEvent): RouteHandler = js.native
    def off(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
    def off(event: ResponseRouteEvent): RouteHandler = js.native
    def off(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
    
    def on(event: AbortRouteEvent, listener: AbortEventListener): RouteHandler = js.native
    def on(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
    def on(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
    def on(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
    def on(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
    
    def once(event: AbortRouteEvent, listener: AbortEventListener): RouteHandler = js.native
    def once(event: ErrorRouteEvent, listener: ErrorEventListener): RouteHandler = js.native
    def once(event: RecordingRouteEvent, listener: RecordingEventListener): RouteHandler = js.native
    def once(event: RequestRouteEvent, listener: RequestEventListener): RouteHandler = js.native
    def once(event: ResponseRouteEvent, listener: ResponseEventListener): RouteHandler = js.native
    
    def passthrough(): RouteHandler = js.native
    def passthrough(value: Boolean): RouteHandler = js.native
    
    def recordingName(): RouteHandler = js.native
    def recordingName(recordingName: String): RouteHandler = js.native
    
    def times(): RouteHandler = js.native
    def times(n: Double): RouteHandler = js.native
  }
  
  object Timing {
    
    @JSImport("@pollyjs/core", "Timing")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fixed(ms: Double): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
    
    inline def relative(ratio: Double): js.Function1[/* ms */ Double, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("relative")(ratio.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ms */ Double, js.Promise[Unit]]]
  }
  
  object setupMocha {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(config: Unit, context: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(config: PollyConfig): Unit = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(config: PollyConfig, context: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@pollyjs/core", "setupMocha")
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")().asInstanceOf[Unit]
    inline def afterEach(context: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")().asInstanceOf[Unit]
    inline def beforeEach(config: Unit, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeEach(config: PollyConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeEach(config: PollyConfig, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object setupQunit {
    
    inline def apply(hooks: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(hooks: Any, config: PollyConfig): Unit = (^.asInstanceOf[js.Dynamic].apply(hooks.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@pollyjs/core", "setupQunit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterEach(hooks: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeEach(hooks: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeEach(hooks: Any, config: PollyConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(hooks.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.intercept
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough
  */
  trait ACTION extends StObject
  object ACTION {
    
    inline def intercept: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.intercept = "intercept".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.intercept]
    
    inline def passthrough: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough = "passthrough".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough]
    
    inline def record: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record = "record".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record]
    
    inline def replay: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay = "replay".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay]
  }
  
  type AbortEventListener = js.Function2[/* req */ Request, /* event */ ListenerEvent, Unit | js.Promise[Unit]]
  
  type AbortRouteEvent = abort
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.warn
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error
  */
  trait EXPIRY_STRATEGY extends StObject
  object EXPIRY_STRATEGY {
    
    inline def error: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error = "error".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error]
    
    inline def record: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record = "record".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record]
    
    inline def warn: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.warn = "warn".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.warn]
  }
  
  type ErrorEventListener = js.Function3[/* req */ Request, /* error */ Any, /* event */ ListenerEvent, Unit | js.Promise[Unit]]
  
  type ErrorRouteEvent = error
  
  @js.native
  trait HTTPBase extends StObject {
    
    var body: Any = js.native
    
    def getHeader(name: String): String | js.Array[String] | Null = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    var headers: Headers = js.native
    
    def json(body: Any): this.type = js.native
    
    def jsonBody(): Any = js.native
    
    def removeHeader(name: String): this.type = js.native
    
    def removeHeaders(headers: js.Array[String]): this.type = js.native
    
    def send(body: Any): this.type = js.native
    
    def setHeader(name: String): this.type = js.native
    def setHeader(name: String, value: String): this.type = js.native
    def setHeader(name: String, value: js.Array[String]): this.type = js.native
    
    def setHeaders(headers: Headers): this.type = js.native
    
    def `type`(contentType: String): this.type = js.native
  }
  
  type Headers = Record[String, String | js.Array[String]]
  
  type InterceptHandler = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* interceptor */ Interceptor, 
    Unit | js.Promise[Unit]
  ]
  
  trait Interceptor extends StObject {
    
    def abort(): Unit
    
    def passthrough(): Unit
    
    def stopPropagation(): Unit
  }
  object Interceptor {
    
    inline def apply(abort: Callback, passthrough: Callback, stopPropagation: Callback): Interceptor = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, passthrough = passthrough.toJsFn, stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[Interceptor]
    }
    
    extension [Self <: Interceptor](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setPassthrough(value: Callback): Self = StObject.set(x, "passthrough", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    }
  }
  
  trait ListenerEvent extends StObject {
    
    def stopPropagation(): Unit
    
    val `type`: String
  }
  object ListenerEvent {
    
    inline def apply(stopPropagation: Callback, `type`: String): ListenerEvent = {
      val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.toJsFn)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerEvent]
    }
    
    extension [Self <: ListenerEvent](x: Self) {
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stopped
  */
  trait MODE extends StObject
  object MODE {
    
    inline def passthrough: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough = "passthrough".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.passthrough]
    
    inline def record: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record = "record".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record]
    
    inline def replay: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay = "replay".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.replay]
    
    inline def stopped: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stopped = "stopped".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stopped]
  }
  
  type MatchBy[T, R] = js.Function2[/* input */ T, /* req */ Request, R]
  
  trait PollyConfig extends StObject {
    
    var adapterOptions: js.UndefOr[Dictkey] = js.undefined
    
    var adapters: js.UndefOr[js.Array[String | TypeofAdapter]] = js.undefined
    
    var expiresIn: js.UndefOr[String | Null] = js.undefined
    
    var expiryStrategy: js.UndefOr[EXPIRY_STRATEGY] = js.undefined
    
    var flushRequestsOnStop: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var matchRequestsBy: js.UndefOr[Body] = js.undefined
    
    var mode: js.UndefOr[MODE] = js.undefined
    
    var persister: js.UndefOr[String | TypeofPersister] = js.undefined
    
    var persisterOptions: js.UndefOr[DisableSortingHarEntries] = js.undefined
    
    var recordFailedRequests: js.UndefOr[Boolean] = js.undefined
    
    var recordIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var timing: js.UndefOr[
        (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
      ] = js.undefined
  }
  object PollyConfig {
    
    inline def apply(): PollyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollyConfig]
    }
    
    extension [Self <: PollyConfig](x: Self) {
      
      inline def setAdapterOptions(value: Dictkey): Self = StObject.set(x, "adapterOptions", value.asInstanceOf[js.Any])
      
      inline def setAdapterOptionsUndefined: Self = StObject.set(x, "adapterOptions", js.undefined)
      
      inline def setAdapters(value: js.Array[String | TypeofAdapter]): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
      
      inline def setAdaptersUndefined: Self = StObject.set(x, "adapters", js.undefined)
      
      inline def setAdaptersVarargs(value: (String | TypeofAdapter)*): Self = StObject.set(x, "adapters", js.Array(value*))
      
      inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setExpiryStrategy(value: EXPIRY_STRATEGY): Self = StObject.set(x, "expiryStrategy", value.asInstanceOf[js.Any])
      
      inline def setExpiryStrategyUndefined: Self = StObject.set(x, "expiryStrategy", js.undefined)
      
      inline def setFlushRequestsOnStop(value: Boolean): Self = StObject.set(x, "flushRequestsOnStop", value.asInstanceOf[js.Any])
      
      inline def setFlushRequestsOnStopUndefined: Self = StObject.set(x, "flushRequestsOnStop", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setMatchRequestsBy(value: Body): Self = StObject.set(x, "matchRequestsBy", value.asInstanceOf[js.Any])
      
      inline def setMatchRequestsByUndefined: Self = StObject.set(x, "matchRequestsBy", js.undefined)
      
      inline def setMode(value: MODE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPersister(value: String | TypeofPersister): Self = StObject.set(x, "persister", value.asInstanceOf[js.Any])
      
      inline def setPersisterOptions(value: DisableSortingHarEntries): Self = StObject.set(x, "persisterOptions", value.asInstanceOf[js.Any])
      
      inline def setPersisterOptionsUndefined: Self = StObject.set(x, "persisterOptions", js.undefined)
      
      inline def setPersisterUndefined: Self = StObject.set(x, "persister", js.undefined)
      
      inline def setRecordFailedRequests(value: Boolean): Self = StObject.set(x, "recordFailedRequests", value.asInstanceOf[js.Any])
      
      inline def setRecordFailedRequestsUndefined: Self = StObject.set(x, "recordFailedRequests", js.undefined)
      
      inline def setRecordIfMissing(value: Boolean): Self = StObject.set(x, "recordIfMissing", value.asInstanceOf[js.Any])
      
      inline def setRecordIfMissingUndefined: Self = StObject.set(x, "recordIfMissing", js.undefined)
      
      inline def setTiming(value: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingCallbackTo(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "timing", value.toJsFn)
      
      inline def setTimingFunction1(value: /* ms */ Double => js.Promise[Unit]): Self = StObject.set(x, "timing", js.Any.fromFunction1(value))
      
      inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.create
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stop
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.register
  */
  trait PollyEvent extends StObject
  object PollyEvent {
    
    inline def create: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.create = "create".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.create]
    
    inline def register: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.register = "register".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.register]
    
    inline def stop: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stop = "stop".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stop]
  }
  
  type PollyEventListener = js.Function1[/* poll */ Polly, Unit]
  
  type RecordingEventListener = js.Function3[
    /* req */ Request, 
    /* recording */ Any, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeReplay
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforePersist
  */
  trait RecordingRouteEvent extends StObject
  object RecordingRouteEvent {
    
    inline def beforePersist: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforePersist = "beforePersist".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforePersist]
    
    inline def beforeReplay: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeReplay = "beforeReplay".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeReplay]
  }
  
  @js.native
  trait Request
    extends StObject
       with HTTPBase {
    
    val absoluteUrl: String = js.native
    
    var action: ACTION | Null = js.native
    
    var didRespond: Boolean = js.native
    
    var hash: String = js.native
    
    val hostname: String = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var method: String = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    val params: StringDictionary[String] = js.native
    
    val pathname: String = js.native
    
    val port: String = js.native
    
    val protocol: String = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    var recordingName: String = js.native
    
    var responseTime: js.UndefOr[Double] = js.native
    
    var timestamp: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  
  type RequestEventListener = js.Function2[/* req */ Request, /* event */ ListenerEvent, Unit | js.Promise[Unit]]
  
  type RequestRouteEvent = request
  
  @js.native
  trait Response
    extends StObject
       with HTTPBase {
    
    def end(): this.type = js.native
    
    var isBinary: Boolean = js.native
    
    val ok: Boolean = js.native
    
    def sendStatus(status: Double): this.type = js.native
    
    def status(status: Double): this.type = js.native
    
    var statusCode: Double = js.native
    
    val statusText: String = js.native
  }
  
  type ResponseEventListener = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* event */ ListenerEvent, 
    Unit | js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeResponse
    - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.response
  */
  trait ResponseRouteEvent extends StObject
  object ResponseRouteEvent {
    
    inline def beforeResponse: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeResponse = "beforeResponse".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.beforeResponse]
    
    inline def response: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.response = "response".asInstanceOf[typingsJapgolly.pollyjsCore.pollyjsCoreStrings.response]
  }
}
