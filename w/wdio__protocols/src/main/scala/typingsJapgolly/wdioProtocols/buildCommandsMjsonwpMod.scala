package typingsJapgolly.wdioProtocols

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wdioProtocols.buildTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsMjsonwpMod {
  
  trait MjsonwpCommands extends StObject {
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
      *
      */
    def getContext(): Context
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
      *
      */
    def getContexts(): js.Array[Context]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
      *
      */
    def getNetworkConnection(): Double
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#mobile-json-wire-protocol-endpoints
      *
      */
    def getPageIndex(): String
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#touch-gestures
      *
      */
    def multiTouchPerform(actions: js.Array[js.Object], elementId: js.Array[js.Object]): Unit
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#mobile-json-wire-protocol-endpoints
      *
      */
    def receiveAsyncResponse(status: String, value: String): Unit
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
      *
      */
    def setNetworkConnection(`type`: Double): Unit
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
      *
      */
    def switchContext(name: String): Unit
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#touch-gestures
      *
      */
    def touchPerform(actions: js.Array[js.Object]): Unit
  }
  object MjsonwpCommands {
    
    inline def apply(
      getContext: CallbackTo[Context],
      getContexts: CallbackTo[js.Array[Context]],
      getNetworkConnection: CallbackTo[Double],
      getPageIndex: CallbackTo[String],
      multiTouchPerform: (js.Array[js.Object], js.Array[js.Object]) => Callback,
      receiveAsyncResponse: (String, String) => Callback,
      setNetworkConnection: Double => Callback,
      switchContext: String => Callback,
      touchPerform: js.Array[js.Object] => Callback
    ): MjsonwpCommands = {
      val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getContexts = getContexts.toJsFn, getNetworkConnection = getNetworkConnection.toJsFn, getPageIndex = getPageIndex.toJsFn, multiTouchPerform = js.Any.fromFunction2((t0: js.Array[js.Object], t1: js.Array[js.Object]) => (multiTouchPerform(t0, t1)).runNow()), receiveAsyncResponse = js.Any.fromFunction2((t0: String, t1: String) => (receiveAsyncResponse(t0, t1)).runNow()), setNetworkConnection = js.Any.fromFunction1((t0: Double) => setNetworkConnection(t0).runNow()), switchContext = js.Any.fromFunction1((t0: String) => switchContext(t0).runNow()), touchPerform = js.Any.fromFunction1((t0: js.Array[js.Object]) => touchPerform(t0).runNow()))
      __obj.asInstanceOf[MjsonwpCommands]
    }
    
    extension [Self <: MjsonwpCommands](x: Self) {
      
      inline def setGetContext(value: CallbackTo[Context]): Self = StObject.set(x, "getContext", value.toJsFn)
      
      inline def setGetContexts(value: CallbackTo[js.Array[Context]]): Self = StObject.set(x, "getContexts", value.toJsFn)
      
      inline def setGetNetworkConnection(value: CallbackTo[Double]): Self = StObject.set(x, "getNetworkConnection", value.toJsFn)
      
      inline def setGetPageIndex(value: CallbackTo[String]): Self = StObject.set(x, "getPageIndex", value.toJsFn)
      
      inline def setMultiTouchPerform(value: (js.Array[js.Object], js.Array[js.Object]) => Callback): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction2((t0: js.Array[js.Object], t1: js.Array[js.Object]) => (value(t0, t1)).runNow()))
      
      inline def setReceiveAsyncResponse(value: (String, String) => Callback): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetNetworkConnection(value: Double => Callback): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSwitchContext(value: String => Callback): Self = StObject.set(x, "switchContext", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setTouchPerform(value: js.Array[js.Object] => Callback): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1((t0: js.Array[js.Object]) => value(t0).runNow()))
    }
  }
}
