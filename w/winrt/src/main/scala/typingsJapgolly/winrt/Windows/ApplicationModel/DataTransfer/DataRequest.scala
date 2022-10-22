package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequest
  extends StObject
     with IDataRequest
object DataRequest {
  
  inline def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Callback,
    getDeferral: CallbackTo[DataRequestDeferral]
  ): DataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1((t0: String) => failWithDisplayText(t0).runNow()), getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[DataRequest]
  }
}
