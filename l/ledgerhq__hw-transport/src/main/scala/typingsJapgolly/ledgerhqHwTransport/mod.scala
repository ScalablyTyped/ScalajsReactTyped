package typingsJapgolly.ledgerhqHwTransport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ledgerhqHwTransport.ledgerhqHwTransportStrings.add
import typingsJapgolly.ledgerhqHwTransport.ledgerhqHwTransportStrings.remove
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ledgerhq/hw-transport", JSImport.Default)
  @js.native
  open class default[TDescriptor /* <: Descriptor */] ()
    extends StObject
       with Transport[TDescriptor]
  object default {
    
    @JSImport("@ledgerhq/hw-transport", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(): js.Promise[Transport[Descriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[Transport[Descriptor]]]
    inline def create(openTimeout: Double): js.Promise[Transport[Descriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(openTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Transport[Descriptor]]]
    inline def create(openTimeout: Double, listenTimeout: Double): js.Promise[Transport[Descriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(openTimeout.asInstanceOf[js.Any], listenTimeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Transport[Descriptor]]]
    inline def create(openTimeout: Unit, listenTimeout: Double): js.Promise[Transport[Descriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(openTimeout.asInstanceOf[js.Any], listenTimeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Transport[Descriptor]]]
    
    /* static member */
    inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
    
    /* static member */
    inline def list(): js.Promise[js.Array[Descriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[Descriptor]]]
    
    /* static member */
    inline def listen(observer: Observer[DescriptorEvent[Descriptor]]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(observer.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    
    /* static member */
    inline def open(descriptor: Descriptor): js.Promise[
        Transport[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        Transport[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ Any
        ]
      ]]
    inline def open(descriptor: Descriptor, timeout: Double): js.Promise[
        Transport[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(descriptor.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        Transport[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ Any
        ]
      ]]
  }
  
  inline def getAltStatusMessage(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltStatusMessage")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Descriptor = String
  
  trait DescriptorEvent[Descriptor] extends StObject {
    
    var descriptor: Descriptor
    
    var device: js.UndefOr[Device] = js.undefined
    
    var `type`: add | remove
  }
  object DescriptorEvent {
    
    inline def apply[Descriptor](descriptor: Descriptor, `type`: add | remove): DescriptorEvent[Descriptor] = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptorEvent[Descriptor]]
    }
    
    extension [Self <: DescriptorEvent[?], Descriptor](x: Self & DescriptorEvent[Descriptor]) {
      
      inline def setDescriptor(value: Descriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setType(value: add | remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Device = Any
  
  trait Observer[Ev] extends StObject {
    
    def complete(): Any
    
    def error(e: Any): Any
    
    def next(event: Ev): Any
  }
  object Observer {
    
    inline def apply[Ev](complete: CallbackTo[Any], error: Any => Any, next: Ev => Any): Observer[Ev] = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[Ev]]
    }
    
    extension [Self <: Observer[?], Ev](x: Self & Observer[Ev]) {
      
      inline def setComplete(value: CallbackTo[Any]): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setError(value: Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: Ev => Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: Callback): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  @js.native
  trait Transport[TDescriptor /* <: Descriptor */] extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def decorateAppAPIMethods(self: Any, methods: js.Array[String], scrambleKey: String): Unit = js.native
    
    def exchange(apdu: Buffer): js.Promise[Buffer] = js.native
    
    def off(eventName: String, cb: Any): Unit = js.native
    
    def on(eventName: String, cb: Any): Unit = js.native
    
    /**
      * A wrapper around exchange to simplify work of the implementation.
      * @param data The data to be sent. Defaults to a zero-length Buffer.
      * @param statusList A list of accepted status code (shorts). [0x9000] by default.
      * @return A Promise of the response Buffer
      */
    def send(cla: Double, ins: Double, p1: Double, p2: Double): js.Promise[Buffer] = js.native
    def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Unit, statusList: js.Array[Double]): js.Promise[Buffer] = js.native
    def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer): js.Promise[Buffer] = js.native
    def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer, statusList: js.Array[Double]): js.Promise[Buffer] = js.native
    
    def setDebugMode(debug: js.Function1[/* log */ String, Unit]): Unit = js.native
    def setDebugMode(debug: Boolean): Unit = js.native
    
    def setExchangeTimeout(exchangeTimeout: Double): Unit = js.native
    
    def setScrambleKey(key: String): Unit = js.native
  }
}
