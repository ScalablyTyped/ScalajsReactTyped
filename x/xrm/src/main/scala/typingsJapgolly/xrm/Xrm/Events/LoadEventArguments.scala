package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.FormDataLoadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return value of {@link LoadEventContext.getEventArgs()}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/executioncontext/geteventargs#return-value getEventArgs (Client API reference)}
  */
trait LoadEventArguments extends StObject {
  
  def getDataLoadState(): FormDataLoadState
}
object LoadEventArguments {
  
  inline def apply(getDataLoadState: CallbackTo[FormDataLoadState]): LoadEventArguments = {
    val __obj = js.Dynamic.literal(getDataLoadState = getDataLoadState.toJsFn)
    __obj.asInstanceOf[LoadEventArguments]
  }
  
  extension [Self <: LoadEventArguments](x: Self) {
    
    inline def setGetDataLoadState(value: CallbackTo[FormDataLoadState]): Self = StObject.set(x, "getDataLoadState", value.toJsFn)
  }
}
