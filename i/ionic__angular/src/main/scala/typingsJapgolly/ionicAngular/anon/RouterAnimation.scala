package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
import typingsJapgolly.ionicAngular.ionicAngularStrings.routerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterAnimation extends StObject {
  
  var routerAnimation: typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
  
  var routerDirection: typingsJapgolly.ionicAngular.ionicAngularStrings.routerDirection
}
object RouterAnimation {
  
  inline def apply(): RouterAnimation = {
    val __obj = js.Dynamic.literal(routerAnimation = "routerAnimation", routerDirection = "routerDirection")
    __obj.asInstanceOf[RouterAnimation]
  }
  
  extension [Self <: RouterAnimation](x: Self) {
    
    inline def setRouterAnimation(value: routerAnimation): Self = StObject.set(x, "routerAnimation", value.asInstanceOf[js.Any])
    
    inline def setRouterDirection(value: routerDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
  }
}
