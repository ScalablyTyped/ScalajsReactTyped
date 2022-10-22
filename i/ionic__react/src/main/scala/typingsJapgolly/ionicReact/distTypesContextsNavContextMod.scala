package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.ionicReactStrings.none
import typingsJapgolly.ionicReact.ionicReactStrings.pop
import typingsJapgolly.ionicReact.ionicReactStrings.push
import typingsJapgolly.ionicReact.ionicReactStrings.replace
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesContextsNavContextMod {
  
  @JSImport("@ionic/react/dist/types/contexts/NavContext", "NavContext")
  @js.native
  val NavContext: Context[NavContextState] = js.native
  
  @js.native
  trait NavContextState extends StObject {
    
    def changeTab(tab: String, path: String): Unit = js.native
    def changeTab(tab: String, path: String, routeOptions: Any): Unit = js.native
    
    def getIonRedirect(): Any = js.native
    
    def getIonRoute(): Any = js.native
    
    def getPageManager(): Any = js.native
    
    def getStackManager(): Any = js.native
    
    def goBack(): Unit = js.native
    def goBack(route: String): Unit = js.native
    def goBack(
      route: String,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def goBack(
      route: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def goBack(route: RouteInfo[Any]): Unit = js.native
    def goBack(
      route: RouteInfo[Any],
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    def hasIonicRouter(): Boolean = js.native
    
    def navigate(path: String): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouterDirection */ Any,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: Unit, ionRouteAction: push | replace | pop): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: Unit, ionRouteAction: Unit, animationBuilder: Unit, options: Any): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: push | replace | pop): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: none,
      ionRouteAction: push | replace | pop,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    @JSName("navigate")
    def navigate_none(path: String, direction: none): Unit = js.native
    @JSName("navigate")
    def navigate_none(
      path: String,
      direction: none,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    @JSName("navigate")
    def navigate_none(
      path: String,
      direction: none,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any
    ): Unit = js.native
    @JSName("navigate")
    def navigate_none(
      path: String,
      direction: none,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Any,
      tab: String
    ): Unit = js.native
    @JSName("navigate")
    def navigate_none(
      path: String,
      direction: none,
      ionRouteAction: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any,
      options: Unit,
      tab: String
    ): Unit = js.native
    @JSName("navigate")
    def navigate_none(path: String, direction: none, ionRouteAction: Unit, animationBuilder: Unit, options: Any): Unit = js.native
    @JSName("navigate")
    def navigate_none(
      path: String,
      direction: none,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Any,
      tab: String
    ): Unit = js.native
    @JSName("navigate")
    def navigate_none(
      path: String,
      direction: none,
      ionRouteAction: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    
    def resetTab(tab: String, originalHref: String): Unit = js.native
    def resetTab(tab: String, originalHref: String, originalRouteOptions: Any): Unit = js.native
    
    var routeInfo: js.UndefOr[RouteInfo[Any]] = js.native
    
    def setCurrentTab(tab: String, routeInfo: RouteInfo[Any]): Unit = js.native
  }
}
