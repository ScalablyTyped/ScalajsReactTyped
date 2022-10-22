package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivatedOperation
  extends StObject
     with IActivatedOperation
object ActivatedOperation {
  
  inline def apply(getDeferral: CallbackTo[ActivatedDeferral]): ActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[ActivatedOperation]
  }
}
