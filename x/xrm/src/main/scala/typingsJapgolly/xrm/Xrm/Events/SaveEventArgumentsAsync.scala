package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.SaveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveEventArgumentsAsync
  extends StObject
     with SaveEventArguments {
  
  /**
    * @summary Call to prevent default 10 second timeout in async OnSave event handlers.
    * @description When using an async save the handler will wait for the promise to be fulfilled.
    * To ensure that a save completes in a timely manner the handler throws a timeout exception after
    * 10 seconds to let you know to tune the async OnSave event for better performance. When the
    * disableAsyncTimeout is set, the timeout for that handler will not be applied. It will continue
    * to wait for that handler's promise to be fulfilled.
    * This should be used with caution as it might affect the performance of the form save.
    * @see {@link https://learn.microsoft.com/power-apps/developer/model-driven-apps/clientapi/reference/events/form-onsave#async-onsave-timeouts Async onSave timeouts}
    */
  def disableAsyncTimeout(): Unit
}
object SaveEventArgumentsAsync {
  
  inline def apply(
    disableAsyncTimeout: Callback,
    getSaveMode: CallbackTo[SaveMode],
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: Callback,
    preventDefaultOnError: Callback
  ): SaveEventArgumentsAsync = {
    val __obj = js.Dynamic.literal(disableAsyncTimeout = disableAsyncTimeout.toJsFn, getSaveMode = getSaveMode.toJsFn, isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.toJsFn, preventDefaultOnError = preventDefaultOnError.toJsFn)
    __obj.asInstanceOf[SaveEventArgumentsAsync]
  }
  
  extension [Self <: SaveEventArgumentsAsync](x: Self) {
    
    inline def setDisableAsyncTimeout(value: Callback): Self = StObject.set(x, "disableAsyncTimeout", value.toJsFn)
  }
}
