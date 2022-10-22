package typingsJapgolly.angularUiRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object uirouterCoreLibRouterAugmentingMod {
  
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typingsJapgolly.angularUiRouter.libStateProviderMod.StateProvider
    
    /** @hidden */
    var urlRouterProvider: typingsJapgolly.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider
  }
  object UIRouter {
    
    inline def apply(
      stateProvider: typingsJapgolly.angularUiRouter.libStateProviderMod.StateProvider,
      urlRouterProvider: typingsJapgolly.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider
    ): typingsJapgolly.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    extension [Self <: typingsJapgolly.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter](x: Self) {
      
      inline def setStateProvider(value: typingsJapgolly.angularUiRouter.libStateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      inline def setUrlRouterProvider(value: typingsJapgolly.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
