package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.defaultHref
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.icon
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
import typingsJapgolly.ionicAngular.ionicAngularStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var defaultHref: typingsJapgolly.ionicAngular.ionicAngularStrings.defaultHref
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var icon: typingsJapgolly.ionicAngular.ionicAngularStrings.icon
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var routerAnimation: typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
  
  var text: typingsJapgolly.ionicAngular.ionicAngularStrings.text
  
  var `type`: typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal(color = "color", defaultHref = "defaultHref", disabled = "disabled", icon = "icon", mode = "mode", routerAnimation = "routerAnimation", text = "text")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDefaultHref(value: defaultHref): Self = StObject.set(x, "defaultHref", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRouterAnimation(value: routerAnimation): Self = StObject.set(x, "routerAnimation", value.asInstanceOf[js.Any])
    
    inline def setText(value: text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
