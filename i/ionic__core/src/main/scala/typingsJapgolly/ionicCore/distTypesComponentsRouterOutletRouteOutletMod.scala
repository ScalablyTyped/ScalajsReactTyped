package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.RouterOutletOptions
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.SwipeGestureHandler
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.NavOutlet
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterOutletRouteOutletMod {
  
  @JSImport("@ionic/core/dist/types/components/router-outlet/route-outlet", "RouterOutlet")
  @js.native
  open class RouterOutlet ()
    extends StObject
       with ComponentInterface
       with NavOutlet {
    
    /* private */ var activeComponent: Any = js.native
    
    /* private */ var activeEl: Any = js.native
    
    /* private */ var activeParams: Any = js.native
    
    /* private */ var ani: Any = js.native
    
    /**
      * If `true`, the router-outlet should animate the transition of components.
      */
    var animated: Boolean = js.native
    
    /** This property allows to create custom transition using AnimationBuilder functions. */
    var animation: js.UndefOr[AnimationBuilder] = js.native
    
    /** @internal */
    def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: Unit, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRouterOutlet(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRouterOutlet(): js.Promise[Unit] = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRouterOutlet(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var gestureOrAnimationInProgress: Any = js.native
    
    /** @internal */
    var ionNavDidChange: EventEmitter[Unit] = js.native
    
    /** @internal */
    var ionNavWillChange: EventEmitter[Unit] = js.native
    
    /** @internal */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    
    /* private */ var lock: Any = js.native
    
    /**
      * The mode determines which platform styles to use.
      */
    var mode: Mode = js.native
    
    @JSName("render")
    def render_MRouterOutlet(): Any = js.native
    
    /* private */ var setRoot: Any = js.native
    
    /** @internal */
    var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
    
    def swipeHandlerChanged(): Unit = js.native
    
    /* private */ var transition: Any = js.native
    
    /* private */ var waitPromise: Any = js.native
  }
}
