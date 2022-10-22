package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.defaultHref
import typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultHref extends StObject {
  
  var defaultHref: typingsJapgolly.ionicAngular.ionicAngularStrings.defaultHref
  
  var routerAnimation: typingsJapgolly.ionicAngular.ionicAngularStrings.routerAnimation
}
object DefaultHref {
  
  inline def apply(): DefaultHref = {
    val __obj = js.Dynamic.literal(defaultHref = "defaultHref", routerAnimation = "routerAnimation")
    __obj.asInstanceOf[DefaultHref]
  }
  
  extension [Self <: DefaultHref](x: Self) {
    
    inline def setDefaultHref(value: defaultHref): Self = StObject.set(x, "defaultHref", value.asInstanceOf[js.Any])
    
    inline def setRouterAnimation(value: routerAnimation): Self = StObject.set(x, "routerAnimation", value.asInstanceOf[js.Any])
  }
}
