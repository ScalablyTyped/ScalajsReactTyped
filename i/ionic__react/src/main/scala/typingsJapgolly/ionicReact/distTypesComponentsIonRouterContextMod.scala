package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesModelsRouteActionMod.RouteAction
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesModelsRouterDirectionMod.RouterDirection
import typingsJapgolly.ionicReact.distTypesModelsRouterOptionsMod.RouterOptions
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonRouterContextMod {
  
  @JSImport("@ionic/react/dist/types/components/IonRouterContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/react/dist/types/components/IonRouterContext", "IonRouterContext")
  @js.native
  val IonRouterContext: Context[IonRouterContextState] = js.native
  
  inline def useIonRouter(): UseIonRouterResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonRouter")().asInstanceOf[UseIonRouterResult]
  
  @js.native
  trait IonRouterContextState extends StObject {
    
    def back(): Unit = js.native
    def back(
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def nativeBack(): Unit = js.native
    
    def push(pathname: String): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: Unit,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: Unit, routeAction: Unit, routerOptions: RouterOptions): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: Unit,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: Unit, routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: RouteAction,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: Unit, routeAction: RouteAction, routerOptions: RouterOptions): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: Unit,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: Unit,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: Unit,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection, routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    var routeInfo: RouteInfo[Any] = js.native
  }
  
  @js.native
  trait UseIonRouterResult extends StObject {
    
    /**
      * @deprecated - Use goBack instead
      * @param animationBuilder - Optional - A custom transition animation to use
      */
    def back(): Unit = js.native
    def back(
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    /**
      * Determines if there are any additional routes in the the Router's history. However, routing is not prevented if the browser's history has more entries. Returns true if more entries exist, false if not.
      */
    def canGoBack(): Boolean = js.native
    
    /**
      * Navigates backwards in history, using the IonRouter to determine history
      * @param animationBuilder - Optional - A custom transition animation to use
      */
    def goBack(): Unit = js.native
    def goBack(
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    /**
      * Navigates to a new pathname
      * @param pathname - The path to navigate to
      * @param routerDirection - Optional - The RouterDirection to use for transition purposes, defaults to 'forward'
      * @param routeAction - Optional - The RouteAction to use for history purposes, defaults to 'push'
      * @param routerOptions - Optional - Any additional parameters to pass to the router
      * @param animationBuilder - Optional - A custom transition animation to use
      */
    def push(pathname: String): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: Unit,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: Unit, routeAction: Unit, routerOptions: RouterOptions): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: Unit,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: Unit, routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: RouteAction,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: Unit, routeAction: RouteAction, routerOptions: RouterOptions): Unit = js.native
    def push(
      pathname: String,
      routerDirection: Unit,
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: Unit,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: Unit,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: Unit,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection, routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: Unit,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ): Unit = js.native
    
    var routeInfo: RouteInfo[Any] = js.native
  }
}
