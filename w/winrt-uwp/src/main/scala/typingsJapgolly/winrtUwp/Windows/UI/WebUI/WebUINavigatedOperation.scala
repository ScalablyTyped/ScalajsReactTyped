package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app navigation operation. */
trait WebUINavigatedOperation extends StObject {
  
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  def getDeferral(): WebUINavigatedDeferral
}
object WebUINavigatedOperation {
  
  inline def apply(getDeferral: CallbackTo[WebUINavigatedDeferral]): WebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[WebUINavigatedOperation]
  }
  
  extension [Self <: WebUINavigatedOperation](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[WebUINavigatedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
