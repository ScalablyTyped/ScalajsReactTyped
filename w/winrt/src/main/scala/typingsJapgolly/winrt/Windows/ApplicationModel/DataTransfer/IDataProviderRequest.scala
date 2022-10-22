package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataProviderRequest extends StObject {
  
  var deadline: js.Date
  
  var formatId: String
  
  def getDeferral(): DataProviderDeferral
  
  def setData(value: Any): Unit
}
object IDataProviderRequest {
  
  inline def apply(
    deadline: js.Date,
    formatId: String,
    getDeferral: CallbackTo[DataProviderDeferral],
    setData: Any => Callback
  ): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, setData = js.Any.fromFunction1((t0: Any) => setData(t0).runNow()))
    __obj.asInstanceOf[IDataProviderRequest]
  }
  
  extension [Self <: IDataProviderRequest](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[DataProviderDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetData(value: Any => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
