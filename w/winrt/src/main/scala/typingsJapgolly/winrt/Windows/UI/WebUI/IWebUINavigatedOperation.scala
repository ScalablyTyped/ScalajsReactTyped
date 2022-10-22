package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebUINavigatedOperation extends StObject {
  
  def getDeferral(): WebUINavigatedDeferral
}
object IWebUINavigatedOperation {
  
  inline def apply(getDeferral: CallbackTo[WebUINavigatedDeferral]): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
  
  extension [Self <: IWebUINavigatedOperation](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[WebUINavigatedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
