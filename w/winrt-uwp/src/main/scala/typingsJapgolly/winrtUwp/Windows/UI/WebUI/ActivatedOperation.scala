package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app activation operation. */
trait ActivatedOperation extends StObject {
  
  /**
    * Requests that the completion of app activation be delayed.
    * @return The activation deferral object.
    */
  def getDeferral(): ActivatedDeferral
}
object ActivatedOperation {
  
  inline def apply(getDeferral: CallbackTo[ActivatedDeferral]): ActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[ActivatedOperation]
  }
  
  extension [Self <: ActivatedOperation](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[ActivatedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
