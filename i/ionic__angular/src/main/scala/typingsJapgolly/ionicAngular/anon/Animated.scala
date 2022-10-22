package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.animated
import typingsJapgolly.ionicAngular.ionicAngularStrings.animation
import typingsJapgolly.ionicAngular.ionicAngularStrings.environmentInjector
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  var animated: typingsJapgolly.ionicAngular.ionicAngularStrings.animated
  
  var animation: typingsJapgolly.ionicAngular.ionicAngularStrings.animation
  
  var environmentInjector: typingsJapgolly.ionicAngular.ionicAngularStrings.environmentInjector
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var swipeGesture: typingsJapgolly.ionicAngular.ionicAngularStrings.swipeGesture
}
object Animated {
  
  inline def apply(): Animated = {
    val __obj = js.Dynamic.literal(animated = "animated", animation = "animation", environmentInjector = "environmentInjector", mode = "mode", swipeGesture = "swipeGesture")
    __obj.asInstanceOf[Animated]
  }
  
  extension [Self <: Animated](x: Self) {
    
    inline def setAnimated(value: animated): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentInjector(value: environmentInjector): Self = StObject.set(x, "environmentInjector", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSwipeGesture(value: swipeGesture): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
  }
}
