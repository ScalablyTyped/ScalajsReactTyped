package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.anon.Instantiable
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorsMod {
  
  object unstable {
    
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An unexpected internal error occured while the bridge handled the event.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.BridgeInternalError")
    @js.native
    open class BridgeInternalError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    /**
      * Base Error for when the bride can not handle the event.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.EventNotHandledError")
    @js.native
    open class EventNotHandledError ()
      extends StObject
         with Error {
      def this(message: String) = this()
      
      /* protected */ var internalReason: BridgeErrorReason = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      def reason: BridgeErrorReason = js.native
    }
    
    /**
      * The bridge decides that the event is too old to be sent.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.EventTooOldError")
    @js.native
    open class EventTooOldError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    /**
      * The event is not understood by the bridge.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.EventUnknownError")
    @js.native
    open class EventUnknownError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    /**
      * The foreign network errored and the event couldn't be delivered.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.ForeignNetworkError")
    @js.native
    open class ForeignNetworkError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    inline def wrap[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    inline def wrap[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    /**
      * @deprecated Use {@link wrapError}
      */
    inline def wrap[T /* <: EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T]): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    inline def wrap[T /* <: EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T], message: String): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    
    inline def wrapError[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    inline def wrapError[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    /**
      * Append the old error message to the new one and keep its stack trace.
      * Example:
      *     throw wrapError(e, HighLevelError, "This error is more specific");
      */
    inline def wrapError[T /* <: EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T]): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    inline def wrapError[T /* <: EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T], message: String): EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[EventNotHandledError]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_not_handled
      - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_too_old
      - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotinternal_error
      - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotforeign_network_error
      - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_unknown
    */
    trait BridgeErrorReason extends StObject
    object BridgeErrorReason {
      
      inline def mDotevent_not_handled: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_not_handled = "m.event_not_handled".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_not_handled]
      
      inline def mDotevent_too_old: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_too_old = "m.event_too_old".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_too_old]
      
      inline def mDotevent_unknown: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_unknown = "m.event_unknown".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_unknown]
      
      inline def mDotforeign_network_error: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotforeign_network_error = "m.foreign_network_error".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotforeign_network_error]
      
      inline def mDotinternal_error: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotinternal_error = "m.internal_error".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotinternal_error]
    }
  }
}
