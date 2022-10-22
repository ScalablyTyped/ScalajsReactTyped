package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendingOperation
  extends StObject
     with ISuspendingOperation
object SuspendingOperation {
  
  inline def apply(deadline: js.Date, getDeferral: CallbackTo[SuspendingDeferral]): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[SuspendingOperation]
  }
}
