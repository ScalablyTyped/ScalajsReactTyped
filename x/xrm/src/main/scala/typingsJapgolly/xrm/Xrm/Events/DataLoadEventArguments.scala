package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.FormDataLoadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return value of {@link DataLoadEventContext.getEventArgs()}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/executioncontext/geteventargs#return-value getEventArgs (Client API reference)}
  */
trait DataLoadEventArguments extends StObject {
  
  def getDataLoadState(): FormDataLoadState
}
object DataLoadEventArguments {
  
  inline def apply(getDataLoadState: CallbackTo[FormDataLoadState]): DataLoadEventArguments = {
    val __obj = js.Dynamic.literal(getDataLoadState = getDataLoadState.toJsFn)
    __obj.asInstanceOf[DataLoadEventArguments]
  }
  
  extension [Self <: DataLoadEventArguments](x: Self) {
    
    inline def setGetDataLoadState(value: CallbackTo[FormDataLoadState]): Self = StObject.set(x, "getDataLoadState", value.toJsFn)
  }
}
