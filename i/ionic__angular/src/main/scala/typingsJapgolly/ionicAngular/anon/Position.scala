package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.position
import typingsJapgolly.ionicAngular.ionicAngularStrings.threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var position: typingsJapgolly.ionicAngular.ionicAngularStrings.position
  
  var threshold: typingsJapgolly.ionicAngular.ionicAngularStrings.threshold
}
object Position {
  
  inline def apply(): Position = {
    val __obj = js.Dynamic.literal(disabled = "disabled", position = "position", threshold = "threshold")
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: threshold): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
