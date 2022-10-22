package typingsJapgolly.broadcastChannel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MessageEvent
import typingsJapgolly.broadcastChannel.anon.FallbackInterval
import typingsJapgolly.broadcastChannel.anon.MaxParallelWrites
import typingsJapgolly.broadcastChannel.broadcastChannelBooleans.`false`
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBroadcastChannelMod {
  
  @JSImport("broadcast-channel/types/broadcast-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("broadcast-channel/types/broadcast-channel", "BroadcastChannel")
  @js.native
  open class BroadcastChannel[T] protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, opts: BroadcastChannelOptions) = this()
    
    // not defined in the offical standard
    def addEventListener(`type`: EventContext, handler: OnMessageHandler[T]): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    val id: Double = js.native
    
    val isClosed: Boolean = js.native
    
    val name: String = js.native
    
    var onmessage: OnMessageHandler[T] = js.native
    
    val options: BroadcastChannelOptions = js.native
    
    def postMessage(msg: T): js.Promise[Unit] = js.native
    
    def removeEventListener(`type`: EventContext, handler: OnMessageHandler[T]): Unit = js.native
    
    val `type`: MethodType = js.native
  }
  
  @JSImport("broadcast-channel/types/broadcast-channel", "OPEN_BROADCAST_CHANNELS")
  @js.native
  val OPEN_BROADCAST_CHANNELS: Set[BroadcastChannel[Any]] = js.native
  
  inline def clearNodeFolder(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")().asInstanceOf[js.Promise[Boolean]]
  inline def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def enforceOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")().asInstanceOf[Unit]
  inline def enforceOptions(opts: BroadcastChannelOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enforceOptions_false(opts: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BroadcastChannelEventMap extends StObject {
    
    var message: MessageEvent
    
    var messageerror: MessageEvent
  }
  object BroadcastChannelEventMap {
    
    inline def apply(message: MessageEvent, messageerror: MessageEvent): BroadcastChannelEventMap = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastChannelEventMap]
    }
    
    extension [Self <: BroadcastChannelEventMap](x: Self) {
      
      inline def setMessage(value: MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageerror(value: MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    }
  }
  
  trait BroadcastChannelOptions extends StObject {
    
    var idb: js.UndefOr[FallbackInterval] = js.undefined
    
    var methods: js.UndefOr[js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]] = js.undefined
    
    var node: js.UndefOr[MaxParallelWrites] = js.undefined
    
    var prepareDelay: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[MethodType] = js.undefined
    
    var webWorkerSupport: js.UndefOr[Boolean] = js.undefined
  }
  object BroadcastChannelOptions {
    
    inline def apply(): BroadcastChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastChannelOptions]
    }
    
    extension [Self <: BroadcastChannelOptions](x: Self) {
      
      inline def setIdb(value: FallbackInterval): Self = StObject.set(x, "idb", value.asInstanceOf[js.Any])
      
      inline def setIdbUndefined: Self = StObject.set(x, "idb", js.undefined)
      
      inline def setMethods(value: js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: BroadcastMethod[js.Object]*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setNode(value: MaxParallelWrites): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPrepareDelay(value: Double): Self = StObject.set(x, "prepareDelay", value.asInstanceOf[js.Any])
      
      inline def setPrepareDelayUndefined: Self = StObject.set(x, "prepareDelay", js.undefined)
      
      inline def setType(value: MethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWebWorkerSupport(value: Boolean): Self = StObject.set(x, "webWorkerSupport", value.asInstanceOf[js.Any])
      
      inline def setWebWorkerSupportUndefined: Self = StObject.set(x, "webWorkerSupport", js.undefined)
    }
  }
  
  trait BroadcastMethod[State] extends StObject {
    
    def averageResponseTime(): Double
    
    def canBeUsed(): Boolean
    
    def close(channelState: State): Unit
    
    def create(channelName: String, options: BroadcastChannelOptions): js.Promise[State] | State
    
    def microSeconds(): Double
    
    def onMessage(channelState: State, callback: js.Function1[/* args */ Any, Unit]): Unit
    
    def postMessage(channelState: State, message: Any): js.Promise[Any]
    
    var `type`: String
  }
  object BroadcastMethod {
    
    inline def apply[State](
      averageResponseTime: CallbackTo[Double],
      canBeUsed: CallbackTo[Boolean],
      close: State => Callback,
      create: (String, BroadcastChannelOptions) => js.Promise[State] | State,
      microSeconds: CallbackTo[Double],
      onMessage: (State, js.Function1[/* args */ Any, Unit]) => Callback,
      postMessage: (State, Any) => js.Promise[Any],
      `type`: String
    ): BroadcastMethod[State] = {
      val __obj = js.Dynamic.literal(averageResponseTime = averageResponseTime.toJsFn, canBeUsed = canBeUsed.toJsFn, close = js.Any.fromFunction1((t0: State) => close(t0).runNow()), create = js.Any.fromFunction2(create), microSeconds = microSeconds.toJsFn, onMessage = js.Any.fromFunction2((t0: State, t1: js.Function1[/* args */ Any, Unit]) => (onMessage(t0, t1)).runNow()), postMessage = js.Any.fromFunction2(postMessage))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastMethod[State]]
    }
    
    extension [Self <: BroadcastMethod[?], State](x: Self & BroadcastMethod[State]) {
      
      inline def setAverageResponseTime(value: CallbackTo[Double]): Self = StObject.set(x, "averageResponseTime", value.toJsFn)
      
      inline def setCanBeUsed(value: CallbackTo[Boolean]): Self = StObject.set(x, "canBeUsed", value.toJsFn)
      
      inline def setClose(value: State => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: State) => value(t0).runNow()))
      
      inline def setCreate(value: (String, BroadcastChannelOptions) => js.Promise[State] | State): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setMicroSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "microSeconds", value.toJsFn)
      
      inline def setOnMessage(value: (State, js.Function1[/* args */ Any, Unit]) => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction2((t0: State, t1: js.Function1[/* args */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPostMessage(value: (State, Any) => js.Promise[Any]): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.message
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.internal
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.leader
  */
  trait EventContext extends StObject
  object EventContext {
    
    inline def internal: typingsJapgolly.broadcastChannel.broadcastChannelStrings.internal = "internal".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.internal]
    
    inline def leader: typingsJapgolly.broadcastChannel.broadcastChannelStrings.leader = "leader".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.leader]
    
    inline def message: typingsJapgolly.broadcastChannel.broadcastChannelStrings.message = "message".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.message]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.node
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.idb
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.native
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.localstorage
    - typingsJapgolly.broadcastChannel.broadcastChannelStrings.simulate
  */
  trait MethodType extends StObject
  object MethodType {
    
    inline def idb: typingsJapgolly.broadcastChannel.broadcastChannelStrings.idb = "idb".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.idb]
    
    inline def localstorage: typingsJapgolly.broadcastChannel.broadcastChannelStrings.localstorage = "localstorage".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.localstorage]
    
    inline def native: typingsJapgolly.broadcastChannel.broadcastChannelStrings.native = "native".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.native]
    
    inline def node: typingsJapgolly.broadcastChannel.broadcastChannelStrings.node = "node".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.node]
    
    inline def simulate: typingsJapgolly.broadcastChannel.broadcastChannelStrings.simulate = "simulate".asInstanceOf[typingsJapgolly.broadcastChannel.broadcastChannelStrings.simulate]
  }
  
  type OnMessageHandler[T] = (js.ThisFunction1[/* this */ BroadcastChannel[Any], /* ev */ T, Any]) | Null
}
