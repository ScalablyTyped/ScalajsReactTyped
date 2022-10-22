package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataRequest extends StObject {
  
  var data: DataPackage
  
  var deadline: js.Date
  
  def failWithDisplayText(value: String): Unit
  
  def getDeferral(): DataRequestDeferral
}
object IDataRequest {
  
  inline def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Callback,
    getDeferral: CallbackTo[DataRequestDeferral]
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1((t0: String) => failWithDisplayText(t0).runNow()), getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[IDataRequest]
  }
  
  extension [Self <: IDataRequest](x: Self) {
    
    inline def setData(value: DataPackage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFailWithDisplayText(value: String => Callback): Self = StObject.set(x, "failWithDisplayText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetDeferral(value: CallbackTo[DataRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
