package typingsJapgolly.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borderless extends StObject {
  
  var activeOpacity: Double
  
  var borderless: Boolean
  
  var enabled: Boolean
}
object Borderless {
  
  inline def apply(activeOpacity: Double, borderless: Boolean, enabled: Boolean): Borderless = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], borderless = borderless.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
  
  extension [Self <: Borderless](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
