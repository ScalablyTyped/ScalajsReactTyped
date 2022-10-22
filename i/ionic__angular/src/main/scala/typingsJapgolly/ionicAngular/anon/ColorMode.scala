package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMode extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var position: typingsJapgolly.ionicAngular.ionicAngularStrings.position
}
object ColorMode {
  
  inline def apply(): ColorMode = {
    val __obj = js.Dynamic.literal(color = "color", mode = "mode", position = "position")
    __obj.asInstanceOf[ColorMode]
  }
  
  extension [Self <: ColorMode](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
