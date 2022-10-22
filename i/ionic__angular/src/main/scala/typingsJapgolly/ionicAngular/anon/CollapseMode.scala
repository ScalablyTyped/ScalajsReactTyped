package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.collapse
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.translucent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseMode extends StObject {
  
  var collapse: typingsJapgolly.ionicAngular.ionicAngularStrings.collapse
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var translucent: typingsJapgolly.ionicAngular.ionicAngularStrings.translucent
}
object CollapseMode {
  
  inline def apply(): CollapseMode = {
    val __obj = js.Dynamic.literal(collapse = "collapse", mode = "mode", translucent = "translucent")
    __obj.asInstanceOf[CollapseMode]
  }
  
  extension [Self <: CollapseMode](x: Self) {
    
    inline def setCollapse(value: collapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTranslucent(value: translucent): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
  }
}
