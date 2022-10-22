package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterRouterMod {
  
  @JSImport("@ionic/core/dist/types/components/router/router", "Router")
  @js.native
  open class Router ()
    extends StObject
       with ComponentInterface {
    
    /** Go back to previous page in the window.history. */
    def back(): js.Promise[Unit] = js.native
    
    /* private */ var busy: Any = js.native
    
    /** @internal */
    def canTransition(): js.Promise[String | Boolean] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MRouter(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRouter(): js.Promise[Unit] = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var getSegments: Any = js.native
    
    /* private */ var historyDirection: Any = js.native
    
    /**
      * Emitted when the route had changed
      */
    var ionRouteDidChange: EventEmitter[RouterEventDetail] = js.native
    
    /**
      * Event emitted when the route is about to change
      */
    var ionRouteWillChange: EventEmitter[RouterEventDetail] = js.native
    
    /* private */ var lastState: Any = js.native
    
    /* private */ var lock: Any = js.native
    
    /** @internal */
    def navChanged(direction: RouterDirection): js.Promise[Boolean] = js.native
    
    /* protected */ def onBackButton(ev: CustomEvent): Unit = js.native
    
    /* protected */ def onPopState(): js.Promise[Boolean] = js.native
    
    /** This handler gets called when a `ion-route-redirect` component is added to the DOM or if the from or to property of such node changes. */
    /* private */ var onRedirectChanged: Any = js.native
    
    /** This handler gets called when a `ion-route` component is added to the DOM or if the from or to property of such node changes. */
    /* private */ var onRoutesChanged: Any = js.native
    
    /* private */ var previousPath: Any = js.native
    
    /** @internal */
    def printDebug(): js.Promise[Unit] = js.native
    
    /**
      * Navigate to the specified path.
      *
      * @param path The path to navigate to.
      * @param direction The direction of the animation. Defaults to `"forward"`.
      */
    def push(path: String): js.Promise[Boolean] = js.native
    def push(path: String, direction: Unit, animation: AnimationBuilder): js.Promise[Boolean] = js.native
    def push(path: String, direction: RouterDirection): js.Promise[Boolean] = js.native
    def push(path: String, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
    
    /**
      * The root path to use when matching URLs. By default, this is set to "/", but you can specify
      * an alternate prefix for all URL paths.
      */
    var root: String = js.native
    
    /* private */ var routeChangeEvent: Any = js.native
    
    /**
      * Executes the beforeLeave hook of the source route and the beforeEnter hook of the target route if they exist.
      *
      * When the beforeLeave hook does not return true (to allow navigating) then that value is returned early and the beforeEnter is executed.
      * Otherwise the beforeEnterHook hook of the target route is executed.
      */
    /* private */ var runGuards: Any = js.native
    
    /* private */ var safeWriteNavState: Any = js.native
    
    /* private */ var setSegments: Any = js.native
    
    /* private */ var state: Any = js.native
    
    /**
      * The router can work in two "modes":
      * - With hash: `/index.html#/path/to/page`
      * - Without hash: `/path/to/page`
      *
      * Using one or another might depend in the requirements of your app and/or where it's deployed.
      *
      * Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might
      * requires additional server-side configuration in order to properly work.
      *
      * On the other side hash-navigation is much easier to deploy, it even works over the file protocol.
      *
      * By default, this property is `true`, change to `false` to allow hash-less URLs.
      */
    var useHash: Boolean = js.native
    
    /* private */ var waitPromise: Any = js.native
    
    /* private */ var writeNavState: Any = js.native
    
    /* private */ var writeNavStateRoot: Any = js.native
  }
}
