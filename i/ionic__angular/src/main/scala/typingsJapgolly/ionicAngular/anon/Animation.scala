package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.animated
import typingsJapgolly.ionicAngular.ionicAngularStrings.animation
import typingsJapgolly.ionicAngular.ionicAngularStrings.root
import typingsJapgolly.ionicAngular.ionicAngularStrings.rootParams
import typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animated: typingsJapgolly.ionicAngular.ionicAngularStrings.animated
  
  var animation: typingsJapgolly.ionicAngular.ionicAngularStrings.animation
  
  var root: typingsJapgolly.ionicAngular.ionicAngularStrings.root
  
  var rootParams: typingsJapgolly.ionicAngular.ionicAngularStrings.rootParams
  
  var swipeGesture: typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
}
object Animation {
  
  inline def apply(): Animation = {
    val __obj = js.Dynamic.literal(animated = "animated", animation = "animation", root = "root", rootParams = "rootParams", swipeGesture = "swipeGesture")
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimated(value: animated): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: root): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootParams(value: rootParams): Self = StObject.set(x, "rootParams", value.asInstanceOf[js.Any])
    
    inline def setSwipeGesture(value: swipeGesture): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
  }
}
