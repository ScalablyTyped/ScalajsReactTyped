package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.ApplicationModel.ISuspendingOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendingOperation
  extends StObject
     with ISuspendingOperation
object SuspendingOperation {
  
  inline def apply(
    deadline: js.Date,
    getDeferral: CallbackTo[typingsJapgolly.winrt.Windows.ApplicationModel.SuspendingDeferral]
  ): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[SuspendingOperation]
  }
}
