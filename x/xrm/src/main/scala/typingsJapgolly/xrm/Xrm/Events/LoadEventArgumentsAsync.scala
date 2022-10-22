package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.FormDataLoadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadEventArgumentsAsync
  extends StObject
     with LoadEventArguments {
  
  /**
    * @summary Call to prevent default 10 second timeout in async OnLoad event handlers.
    * @description When using an async load the handler will wait for the promise to be fulfilled.
    * To ensure that a load completes in a timely manner the handler throws a timeout exception after
    * 10 seconds to let you know to tune the async OnLoad event for better performance. When the
    * disableAsyncTimeout is set, the timeout for that handler will not be applied. It will continue
    * to wait for that handler's promise to be fulfilled.
    * This should be used with caution as it might affect the performance of the form load.
    * @see {@link https://learn.microsoft.com/power-apps/developer/model-driven-apps/clientapi/reference/events/form-onload#async-onload-timeouts Async onLoad timeouts}
    */
  def disableAsyncTimeout(): Unit
}
object LoadEventArgumentsAsync {
  
  inline def apply(disableAsyncTimeout: Callback, getDataLoadState: CallbackTo[FormDataLoadState]): LoadEventArgumentsAsync = {
    val __obj = js.Dynamic.literal(disableAsyncTimeout = disableAsyncTimeout.toJsFn, getDataLoadState = getDataLoadState.toJsFn)
    __obj.asInstanceOf[LoadEventArgumentsAsync]
  }
  
  extension [Self <: LoadEventArgumentsAsync](x: Self) {
    
    inline def setDisableAsyncTimeout(value: Callback): Self = StObject.set(x, "disableAsyncTimeout", value.toJsFn)
  }
}
