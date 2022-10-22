package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavDirection
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationBuilder extends StObject {
  
  var animation: js.UndefOr[NavDirection] = js.undefined
  
  var animationBuilder: js.UndefOr[
    typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
  ] = js.undefined
  
  var direction: RouterDirection
}
object AnimationBuilder {
  
  inline def apply(direction: RouterDirection): AnimationBuilder = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationBuilder]
  }
  
  extension [Self <: AnimationBuilder](x: Self) {
    
    inline def setAnimation(value: NavDirection): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationBuilder(
      value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
    ): Self = StObject.set(x, "animationBuilder", js.Any.fromFunction2(value))
    
    inline def setAnimationBuilderUndefined: Self = StObject.set(x, "animationBuilder", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDirection(value: RouterDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
