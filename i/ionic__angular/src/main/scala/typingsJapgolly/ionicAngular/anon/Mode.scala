package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal(color = "color", mode = "mode")
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
