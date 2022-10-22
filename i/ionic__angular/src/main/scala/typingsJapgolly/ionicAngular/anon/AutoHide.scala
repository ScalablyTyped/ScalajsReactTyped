package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
import typingsJapgolly.ionicAngular.ionicAngularStrings.autoHide
import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.menu
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHide extends StObject {
  
  var autoHide: typingsJapgolly.ionicAngular.ionicAngularStrings.autoHide
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var menu: typingsJapgolly.ionicAngular.ionicAngularStrings.menu
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var `type`: typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
}
object AutoHide {
  
  inline def apply(): AutoHide = {
    val __obj = js.Dynamic.literal(autoHide = "autoHide", color = "color", disabled = "disabled", menu = "menu", mode = "mode")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[AutoHide]
  }
  
  extension [Self <: AutoHide](x: Self) {
    
    inline def setAutoHide(value: autoHide): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
