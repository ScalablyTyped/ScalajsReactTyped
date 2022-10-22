package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPickerClosingOperation extends StObject {
  
  var deadline: js.Date
  
  def getDeferral(): PickerClosingDeferral
}
object IPickerClosingOperation {
  
  inline def apply(deadline: js.Date, getDeferral: CallbackTo[PickerClosingDeferral]): IPickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[IPickerClosingOperation]
  }
  
  extension [Self <: IPickerClosingOperation](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[PickerClosingDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
