package typingsJapgolly.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object uirouterCoreLibRouterAugmentingMod {
  
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typingsJapgolly.uirouterAngularjs.libStateProviderMod.StateProvider
    
    /** @hidden */
    var urlRouterProvider: typingsJapgolly.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider
  }
  object UIRouter {
    
    inline def apply(
      stateProvider: typingsJapgolly.uirouterAngularjs.libStateProviderMod.StateProvider,
      urlRouterProvider: typingsJapgolly.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider
    ): typingsJapgolly.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    extension [Self <: typingsJapgolly.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter](x: Self) {
      
      inline def setStateProvider(value: typingsJapgolly.uirouterAngularjs.libStateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      inline def setUrlRouterProvider(value: typingsJapgolly.uirouterAngularjs.libUrlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
