package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.autoHide
import typingsJapgolly.ionicAngular.ionicAngularStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  var autoHide: typingsJapgolly.ionicAngular.ionicAngularStrings.autoHide
  
  var menu: typingsJapgolly.ionicAngular.ionicAngularStrings.menu
}
object Menu {
  
  inline def apply(): Menu = {
    val __obj = js.Dynamic.literal(autoHide = "autoHide", menu = "menu")
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setAutoHide(value: autoHide): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
  }
}
