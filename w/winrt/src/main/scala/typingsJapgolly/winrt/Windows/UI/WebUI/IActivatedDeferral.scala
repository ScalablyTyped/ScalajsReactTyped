package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActivatedDeferral extends StObject {
  
  def complete(): Unit
}
object IActivatedDeferral {
  
  inline def apply(complete: Callback): IActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[IActivatedDeferral]
  }
  
  extension [Self <: IActivatedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
