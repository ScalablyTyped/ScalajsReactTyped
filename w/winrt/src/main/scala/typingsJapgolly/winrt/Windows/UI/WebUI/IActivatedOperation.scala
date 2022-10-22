package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActivatedOperation extends StObject {
  
  def getDeferral(): ActivatedDeferral
}
object IActivatedOperation {
  
  inline def apply(getDeferral: CallbackTo[ActivatedDeferral]): IActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[IActivatedOperation]
  }
  
  extension [Self <: IActivatedOperation](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[ActivatedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
