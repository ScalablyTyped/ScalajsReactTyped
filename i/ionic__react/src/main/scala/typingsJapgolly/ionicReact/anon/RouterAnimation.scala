package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesModelsRouterDirectionMod.RouterDirection
import typingsJapgolly.ionicReact.distTypesModelsRouterOptionsMod.RouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterAnimation extends StObject {
  
  var routerAnimation: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
  ] = js.undefined
  
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
  
  var routerLink: js.UndefOr[String] = js.undefined
  
  var routerOptions: js.UndefOr[RouterOptions] = js.undefined
}
object RouterAnimation {
  
  inline def apply(): RouterAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterAnimation]
  }
  
  extension [Self <: RouterAnimation](x: Self) {
    
    inline def setRouterAnimation(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Self = StObject.set(x, "routerAnimation", value.asInstanceOf[js.Any])
    
    inline def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    inline def setRouterDirection(value: RouterDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
    
    inline def setRouterDirectionUndefined: Self = StObject.set(x, "routerDirection", js.undefined)
    
    inline def setRouterLink(value: String): Self = StObject.set(x, "routerLink", value.asInstanceOf[js.Any])
    
    inline def setRouterLinkUndefined: Self = StObject.set(x, "routerLink", js.undefined)
    
    inline def setRouterOptions(value: RouterOptions): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
    
    inline def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
  }
}
