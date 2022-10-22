package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the base class for events that can be canceled.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311009(v=vs.100).aspx}
  */
trait CancelEventArgs
  extends StObject
     with EventArgs {
  
  /*
    * true to request that the event be canceled; otherwise, false. The default is false.
    * @return if the event is to be canceled; otherwise, false.
    */
  def get_cancel(): Boolean
  
  //#endregion
  //#region Properties
  /**
    * true to request that the event be canceled; otherwise, false. The default is false.
    */
  def set_cancel(value: Boolean): Unit
}
object CancelEventArgs {
  
  inline def apply(Empty: EventArgs, get_cancel: CallbackTo[Boolean], set_cancel: Boolean => Callback): CancelEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_cancel = get_cancel.toJsFn, set_cancel = js.Any.fromFunction1((t0: Boolean) => set_cancel(t0).runNow()))
    __obj.asInstanceOf[CancelEventArgs]
  }
  
  extension [Self <: CancelEventArgs](x: Self) {
    
    inline def setGet_cancel(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_cancel", value.toJsFn)
    
    inline def setSet_cancel(value: Boolean => Callback): Self = StObject.set(x, "set_cancel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
