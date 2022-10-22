package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.component
import typingsJapgolly.ionicAngular.ionicAngularStrings.componentProps
import typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
import typingsJapgolly.ionicAngular.ionicAngularStrings.routerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: typingsJapgolly.ionicAngular.ionicAngularStrings.component
  
  var componentProps: typingsJapgolly.ionicAngular.ionicAngularStrings.componentProps
  
  var routerAnimation: typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
  
  var routerDirection: typingsJapgolly.ionicAngular.ionicAngularStrings.routerDirection
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal(component = "component", componentProps = "componentProps", routerAnimation = "routerAnimation", routerDirection = "routerDirection")
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentProps(value: componentProps): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setRouterAnimation(value: routerAnimation): Self = StObject.set(x, "routerAnimation", value.asInstanceOf[js.Any])
    
    inline def setRouterDirection(value: routerDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
  }
}
