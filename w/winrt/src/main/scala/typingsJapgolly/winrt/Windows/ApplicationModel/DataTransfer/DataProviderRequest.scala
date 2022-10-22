package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderRequest
  extends StObject
     with IDataProviderRequest
object DataProviderRequest {
  
  inline def apply(
    deadline: js.Date,
    formatId: String,
    getDeferral: CallbackTo[DataProviderDeferral],
    setData: Any => Callback
  ): DataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, setData = js.Any.fromFunction1((t0: Any) => setData(t0).runNow()))
    __obj.asInstanceOf[DataProviderRequest]
  }
}
