package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUINavigatedOperation
  extends StObject
     with IWebUINavigatedOperation
object WebUINavigatedOperation {
  
  inline def apply(getDeferral: CallbackTo[WebUINavigatedDeferral]): WebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[WebUINavigatedOperation]
  }
}
