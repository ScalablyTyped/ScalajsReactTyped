package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.translucent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Translucent extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var translucent: typingsJapgolly.ionicAngular.ionicAngularStrings.translucent
}
object Translucent {
  
  inline def apply(): Translucent = {
    val __obj = js.Dynamic.literal(color = "color", mode = "mode", translucent = "translucent")
    __obj.asInstanceOf[Translucent]
  }
  
  extension [Self <: Translucent](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTranslucent(value: translucent): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
  }
}
