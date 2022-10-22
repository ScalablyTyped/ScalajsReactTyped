package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerClosingOperation
  extends StObject
     with IPickerClosingOperation
object PickerClosingOperation {
  
  inline def apply(deadline: js.Date, getDeferral: CallbackTo[PickerClosingDeferral]): PickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[PickerClosingOperation]
  }
}
