package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object of this type is passed to the DataProviderHandler delegate. */
trait DataProviderRequest extends StObject {
  
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: js.Date
  
  /** Specifies the format id. */
  var formatId: String
  
  /**
    * Returns a DataProviderDeferral object.
    * @return An data provider deferral object.
    */
  def getDeferral(): DataProviderDeferral
  
  /**
    * Sets the content of the DataPackage to be shared with a target app.
    * @param value The object associated with a particular format in the DataPackage .
    */
  def setData(value: Any): Unit
}
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
  
  extension [Self <: DataProviderRequest](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[DataProviderDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetData(value: Any => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
