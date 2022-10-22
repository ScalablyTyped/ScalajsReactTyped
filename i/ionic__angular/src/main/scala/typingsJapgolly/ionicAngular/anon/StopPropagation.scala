package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.stopPropagation
import typingsJapgolly.ionicAngular.ionicAngularStrings.tappable
import typingsJapgolly.ionicAngular.ionicAngularStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPropagation extends StObject {
  
  var stopPropagation: typingsJapgolly.ionicAngular.ionicAngularStrings.stopPropagation
  
  var tappable: typingsJapgolly.ionicAngular.ionicAngularStrings.tappable
  
  var visible: typingsJapgolly.ionicAngular.ionicAngularStrings.visible
}
object StopPropagation {
  
  inline def apply(): StopPropagation = {
    val __obj = js.Dynamic.literal(stopPropagation = "stopPropagation", tappable = "tappable", visible = "visible")
    __obj.asInstanceOf[StopPropagation]
  }
  
  extension [Self <: StopPropagation](x: Self) {
    
    inline def setStopPropagation(value: stopPropagation): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTappable(value: tappable): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: visible): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
