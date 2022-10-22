package typingsJapgolly.phoenix

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phoenix.anon.Diff
import typingsJapgolly.phoenix.anon.Joins
import typingsJapgolly.phoenix.anon.PartialSocketConnectOptio
import typingsJapgolly.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phoenix", "Ajax")
  @js.native
  open class Ajax () extends StObject
  /* static members */
  object Ajax {
    
    @JSImport("phoenix", "Ajax")
    @js.native
    val ^ : js.Any = js.native
    
    inline def appendParams(url: String, params: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendParams")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parseJSON(resp: String): JSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(resp.asInstanceOf[js.Any]).asInstanceOf[JSON]
    
    inline def request(method: String, endPoint: String, accept: String, body: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(method: String, endPoint: String, accept: String, body: Any, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(method: String, endPoint: String, accept: String, body: Any, timeout: Double, ontimeout: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Double,
      ontimeout: Any,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Double,
      ontimeout: Unit,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(method: String, endPoint: String, accept: String, body: Any, timeout: Unit, ontimeout: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Unit,
      ontimeout: Any,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Unit,
      ontimeout: Unit,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def serialize(obj: Any, parentKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("phoenix", "Ajax.states")
    @js.native
    def states: StringDictionary[Double] = js.native
    inline def states_=(x: StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("states")(x.asInstanceOf[js.Any])
    
    inline def xdomainRequest(req: Any, method: String, endPoint: String, body: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(req: Any, method: String, endPoint: String, body: Any, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(req: Any, method: String, endPoint: String, body: Any, timeout: Double, ontimeout: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(
      req: Any,
      method: String,
      endPoint: String,
      body: Any,
      timeout: Double,
      ontimeout: Any,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(
      req: Any,
      method: String,
      endPoint: String,
      body: Any,
      timeout: Double,
      ontimeout: Unit,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(req: Any, method: String, endPoint: String, body: Any, timeout: Unit, ontimeout: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(
      req: Any,
      method: String,
      endPoint: String,
      body: Any,
      timeout: Unit,
      ontimeout: Any,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xdomainRequest(
      req: Any,
      method: String,
      endPoint: String,
      body: Any,
      timeout: Unit,
      ontimeout: Unit,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xdomainRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def xhrRequest(req: Any, method: String, endPoint: String, accept: String, body: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(req: Any, method: String, endPoint: String, accept: String, body: Any, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(
      req: Any,
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Double,
      ontimeout: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(
      req: Any,
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Double,
      ontimeout: Any,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(
      req: Any,
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Double,
      ontimeout: Unit,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(
      req: Any,
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Unit,
      ontimeout: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(
      req: Any,
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Unit,
      ontimeout: Any,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def xhrRequest(
      req: Any,
      method: String,
      endPoint: String,
      accept: String,
      body: Any,
      timeout: Unit,
      ontimeout: Unit,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("xhrRequest")(req.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endPoint.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], body.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], ontimeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("phoenix", "Channel")
  @js.native
  open class Channel protected () extends StObject {
    def this(topic: String) = this()
    def this(topic: String, params: js.Function0[js.Object]) = this()
    def this(topic: String, params: js.Object) = this()
    def this(topic: String, params: js.Function0[js.Object], socket: Socket) = this()
    def this(topic: String, params: js.Object, socket: Socket) = this()
    def this(topic: String, params: Unit, socket: Socket) = this()
    
    def join(): Push = js.native
    def join(timeout: Double): Push = js.native
    
    def leave(): Push = js.native
    def leave(timeout: Double): Push = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, ref: Double): Unit = js.native
    
    def on(event: String, callback: js.Function1[/* response */ js.UndefOr[Any], Unit]): Double = js.native
    
    def onClose(callback: js.Function3[/* payload */ Any, /* ref */ Any, /* joinRef */ Any, Unit]): Unit = js.native
    
    def onError(callback: js.Function1[/* reason */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def onMessage(event: String, payload: Any, ref: Any): Any = js.native
    
    def push(event: String, payload: js.Object): Push = js.native
    def push(event: String, payload: js.Object, timeout: Double): Push = js.native
    
    var state: ChannelState = js.native
  }
  
  @JSImport("phoenix", "LongPoll")
  @js.native
  open class LongPoll protected () extends StObject {
    def this(endPoint: String) = this()
    
    def close(): Unit = js.native
    def close(code: Any): Unit = js.native
    def close(code: Any, reason: Any): Unit = js.native
    def close(code: Unit, reason: Any): Unit = js.native
    
    def closeAndRetry(): Unit = js.native
    
    def endpointURL(): String = js.native
    
    def normalizeEndpoint(endPoint: String): String = js.native
    
    def ontimeout(): Unit = js.native
    
    def poll(): Unit = js.native
    
    def send(body: Any): Unit = js.native
  }
  
  @JSImport("phoenix", "Presence")
  @js.native
  open class Presence protected () extends StObject {
    def this(channel: Channel) = this()
    def this(channel: Channel, opts: PresenceOpts) = this()
    
    def inPendingSyncState(): Boolean = js.native
    
    def list[T](): js.Array[T] = js.native
    def list[T](chooser: js.Function2[/* key */ String, /* presence */ Any, T]): js.Array[T] = js.native
    
    def onJoin(callback: PresenceOnJoinCallback): Unit = js.native
    
    def onLeave(callback: PresenceOnLeaveCallback): Unit = js.native
    
    def onSync(callback: js.Function0[Unit]): Unit = js.native
  }
  /* static members */
  object Presence {
    
    @JSImport("phoenix", "Presence")
    @js.native
    val ^ : js.Any = js.native
    
    inline def list[T](presences: js.Object): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(presences.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def list[T](presences: js.Object, chooser: js.Function2[/* key */ String, /* presence */ Any, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(presences.asInstanceOf[js.Any], chooser.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def syncDiff(currentState: js.Object, diff: Joins): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDiff")(currentState.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def syncDiff(currentState: js.Object, diff: Joins, onJoin: Unit, onLeave: PresenceOnLeaveCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDiff")(currentState.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], onJoin.asInstanceOf[js.Any], onLeave.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def syncDiff(currentState: js.Object, diff: Joins, onJoin: PresenceOnJoinCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDiff")(currentState.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], onJoin.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def syncDiff(
      currentState: js.Object,
      diff: Joins,
      onJoin: PresenceOnJoinCallback,
      onLeave: PresenceOnLeaveCallback
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDiff")(currentState.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], onJoin.asInstanceOf[js.Any], onLeave.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def syncState(currentState: js.Object, newState: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncState")(currentState.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def syncState(currentState: js.Object, newState: js.Object, onJoin: Unit, onLeave: PresenceOnLeaveCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncState")(currentState.asInstanceOf[js.Any], newState.asInstanceOf[js.Any], onJoin.asInstanceOf[js.Any], onLeave.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def syncState(currentState: js.Object, newState: js.Object, onJoin: PresenceOnJoinCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncState")(currentState.asInstanceOf[js.Any], newState.asInstanceOf[js.Any], onJoin.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def syncState(
      currentState: js.Object,
      newState: js.Object,
      onJoin: PresenceOnJoinCallback,
      onLeave: PresenceOnLeaveCallback
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("syncState")(currentState.asInstanceOf[js.Any], newState.asInstanceOf[js.Any], onJoin.asInstanceOf[js.Any], onLeave.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("phoenix", "Push")
  @js.native
  open class Push protected () extends StObject {
    def this(channel: Channel, event: String, payload: js.Object, timeout: Double) = this()
    
    def receive(status: PushStatus, callback: js.Function1[/* response */ js.UndefOr[Any], Any]): this.type = js.native
    
    def resend(timeout: Double): Unit = js.native
    
    def send(): Unit = js.native
  }
  
  @JSImport("phoenix", "Socket")
  @js.native
  open class Socket protected () extends StObject {
    def this(endPoint: String) = this()
    def this(endPoint: String, opts: PartialSocketConnectOptio) = this()
    
    def channel(topic: String): Channel = js.native
    def channel(topic: String, chanParams: js.Object): Channel = js.native
    
    def connect(): Unit = js.native
    def connect(params: Any): Unit = js.native
    
    def connectionState(): ConnectionState = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    def disconnect(callback: js.Function0[Unit], code: Double): Unit = js.native
    def disconnect(callback: js.Function0[Unit], code: Double, reason: String): Unit = js.native
    def disconnect(callback: js.Function0[Unit], code: Unit, reason: String): Unit = js.native
    def disconnect(callback: Unit, code: Double): Unit = js.native
    def disconnect(callback: Unit, code: Double, reason: String): Unit = js.native
    def disconnect(callback: Unit, code: Unit, reason: String): Unit = js.native
    
    def endPointURL(): String = js.native
    
    def hasLogger(): Boolean = js.native
    
    def isConnected(): Boolean = js.native
    
    def log(kind: String, message: String, data: Any): Unit = js.native
    
    def makeRef(): MessageRef = js.native
    
    def off(refs: js.Array[MessageRef]): Unit = js.native
    
    def onClose(callback: js.Function1[/* cb */ Any, Unit]): MessageRef = js.native
    
    def onError(callback: js.Function1[/* cb */ Any, Unit]): MessageRef = js.native
    
    def onMessage(callback: js.Function1[/* cb */ Any, Unit]): MessageRef = js.native
    
    def onOpen(callback: js.Function1[/* cb */ Any, Unit]): MessageRef = js.native
    
    def protocol(): String = js.native
    
    def push(data: js.Object): Unit = js.native
    
    def remove(channel: Channel): Unit = js.native
  }
  
  @JSImport("phoenix", "Timer")
  @js.native
  open class Timer protected () extends StObject {
    def this(callback: js.Function0[Unit], timerCalc: js.Function1[/* tries */ Double, Double]) = this()
    
    def reset(): Unit = js.native
    
    def scheduleTimeout(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phoenix.phoenixStrings.arraybuffer
    - typingsJapgolly.phoenix.phoenixStrings.blob
  */
  trait BinaryType extends StObject
  object BinaryType {
    
    inline def arraybuffer: typingsJapgolly.phoenix.phoenixStrings.arraybuffer = "arraybuffer".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.arraybuffer]
    
    inline def blob: typingsJapgolly.phoenix.phoenixStrings.blob = "blob".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.blob]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phoenix.phoenixStrings.closed
    - typingsJapgolly.phoenix.phoenixStrings.errored
    - typingsJapgolly.phoenix.phoenixStrings.joined
    - typingsJapgolly.phoenix.phoenixStrings.joining
    - typingsJapgolly.phoenix.phoenixStrings.leaving
  */
  trait ChannelState extends StObject
  object ChannelState {
    
    inline def closed: typingsJapgolly.phoenix.phoenixStrings.closed = "closed".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.closed]
    
    inline def errored: typingsJapgolly.phoenix.phoenixStrings.errored = "errored".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.errored]
    
    inline def joined: typingsJapgolly.phoenix.phoenixStrings.joined = "joined".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.joined]
    
    inline def joining: typingsJapgolly.phoenix.phoenixStrings.joining = "joining".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.joining]
    
    inline def leaving: typingsJapgolly.phoenix.phoenixStrings.leaving = "leaving".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.leaving]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phoenix.phoenixStrings.connecting
    - typingsJapgolly.phoenix.phoenixStrings.open
    - typingsJapgolly.phoenix.phoenixStrings.closing
    - typingsJapgolly.phoenix.phoenixStrings.closed
  */
  trait ConnectionState extends StObject
  object ConnectionState {
    
    inline def closed: typingsJapgolly.phoenix.phoenixStrings.closed = "closed".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.closed]
    
    inline def closing: typingsJapgolly.phoenix.phoenixStrings.closing = "closing".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.closing]
    
    inline def connecting: typingsJapgolly.phoenix.phoenixStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.connecting]
    
    inline def open: typingsJapgolly.phoenix.phoenixStrings.open = "open".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.open]
  }
  
  type MessageRef = String
  
  type PresenceOnJoinCallback = js.Function3[
    /* key */ js.UndefOr[String], 
    /* currentPresence */ js.UndefOr[Any], 
    /* newPresence */ js.UndefOr[Any], 
    Unit
  ]
  
  type PresenceOnLeaveCallback = js.Function3[
    /* key */ js.UndefOr[String], 
    /* currentPresence */ js.UndefOr[Any], 
    /* newPresence */ js.UndefOr[Any], 
    Unit
  ]
  
  trait PresenceOpts extends StObject {
    
    var events: js.UndefOr[Diff] = js.undefined
  }
  object PresenceOpts {
    
    inline def apply(): PresenceOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PresenceOpts]
    }
    
    extension [Self <: PresenceOpts](x: Self) {
      
      inline def setEvents(value: Diff): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phoenix.phoenixStrings.ok
    - typingsJapgolly.phoenix.phoenixStrings.error
    - typingsJapgolly.phoenix.phoenixStrings.timeout
  */
  trait PushStatus extends StObject
  object PushStatus {
    
    inline def error: typingsJapgolly.phoenix.phoenixStrings.error = "error".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.error]
    
    inline def ok: typingsJapgolly.phoenix.phoenixStrings.ok = "ok".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.ok]
    
    inline def timeout: typingsJapgolly.phoenix.phoenixStrings.timeout = "timeout".asInstanceOf[typingsJapgolly.phoenix.phoenixStrings.timeout]
  }
  
  trait SocketConnectOption extends StObject {
    
    var binaryType: BinaryType
    
    def decode(payload: String, callback: js.Function1[/* decoded */ Any, Unit]): Unit
    
    def encode(payload: js.Object, callback: js.Function1[/* encoded */ Any, Unit]): Unit
    
    var heartbeatIntervalMs: Double
    
    def logger(kind: String, message: String, data: Any): Unit
    
    var longpollerTimeout: Double
    
    var params: js.Object | js.Function0[js.Object]
    
    def reconnectAfterMs(tries: Double): Double
    
    def rejoinAfterMs(tries: Double): Double
    
    var timeout: Double
    
    var transport: Instantiable1[/* endpoint */ String, js.Object]
    
    var vsn: String
  }
  object SocketConnectOption {
    
    inline def apply(
      binaryType: BinaryType,
      decode: (String, js.Function1[/* decoded */ Any, Unit]) => Callback,
      encode: (js.Object, js.Function1[/* encoded */ Any, Unit]) => Callback,
      heartbeatIntervalMs: Double,
      logger: (String, String, Any) => Callback,
      longpollerTimeout: Double,
      params: js.Object | js.Function0[js.Object],
      reconnectAfterMs: Double => Double,
      rejoinAfterMs: Double => Double,
      timeout: Double,
      transport: Instantiable1[/* endpoint */ String, js.Object],
      vsn: String
    ): SocketConnectOption = {
      val __obj = js.Dynamic.literal(binaryType = binaryType.asInstanceOf[js.Any], decode = js.Any.fromFunction2((t0: String, t1: js.Function1[/* decoded */ Any, Unit]) => (decode(t0, t1)).runNow()), encode = js.Any.fromFunction2((t0: js.Object, t1: js.Function1[/* encoded */ Any, Unit]) => (encode(t0, t1)).runNow()), heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], logger = js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (logger(t0, t1, t2)).runNow()), longpollerTimeout = longpollerTimeout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reconnectAfterMs = js.Any.fromFunction1(reconnectAfterMs), rejoinAfterMs = js.Any.fromFunction1(rejoinAfterMs), timeout = timeout.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], vsn = vsn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketConnectOption]
    }
    
    extension [Self <: SocketConnectOption](x: Self) {
      
      inline def setBinaryType(value: BinaryType): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
      
      inline def setDecode(value: (String, js.Function1[/* decoded */ Any, Unit]) => Callback): Self = StObject.set(x, "decode", js.Any.fromFunction2((t0: String, t1: js.Function1[/* decoded */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setEncode(value: (js.Object, js.Function1[/* encoded */ Any, Unit]) => Callback): Self = StObject.set(x, "encode", js.Any.fromFunction2((t0: js.Object, t1: js.Function1[/* encoded */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: (String, String, Any) => Callback): Self = StObject.set(x, "logger", js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setLongpollerTimeout(value: Double): Self = StObject.set(x, "longpollerTimeout", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsCallbackTo(value: CallbackTo[js.Object]): Self = StObject.set(x, "params", value.toJsFn)
      
      inline def setReconnectAfterMs(value: Double => Double): Self = StObject.set(x, "reconnectAfterMs", js.Any.fromFunction1(value))
      
      inline def setRejoinAfterMs(value: Double => Double): Self = StObject.set(x, "rejoinAfterMs", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: Instantiable1[/* endpoint */ String, js.Object]): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setVsn(value: String): Self = StObject.set(x, "vsn", value.asInstanceOf[js.Any])
    }
  }
}
