package typingsJapgolly.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  var buttons: js.UndefOr[Double] = js.undefined
  
  var capture: js.UndefOr[Boolean] = js.undefined
}
object Buttons {
  
  inline def apply(): Buttons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buttons]
  }
  
  extension [Self <: Buttons](x: Self) {
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
  }
}
