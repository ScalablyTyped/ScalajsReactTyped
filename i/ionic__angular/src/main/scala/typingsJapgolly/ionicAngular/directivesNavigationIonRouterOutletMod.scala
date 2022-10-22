package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ComponentRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.OnInit
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularRouter.mod.ActivatedRoute
import typingsJapgolly.angularRouter.mod.ChildrenOutletContexts
import typingsJapgolly.angularRouter.mod.OutletContext
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.ionicAngular.anon.ActivateEvents
import typingsJapgolly.ionicAngular.anon.Animated
import typingsJapgolly.ionicAngular.anon.Attribute
import typingsJapgolly.ionicAngular.anon.AttributeOptional
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.anon.SkipSelf
import typingsJapgolly.ionicAngular.diR3InjectorMod.EnvironmentInjector
import typingsJapgolly.ionicAngular.directivesNavigationStackUtilsMod.RouteView
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-router-outlet`
import typingsJapgolly.ionicAngular.ionicAngularStrings.outlet
import typingsJapgolly.ionicAngular.providersConfigMod.Config
import typingsJapgolly.ionicAngular.providersNavControllerMod.NavController
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterOutletElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationIonRouterOutletMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-router-outlet", "IonRouterOutlet")
  @js.native
  open class IonRouterOutlet protected ()
    extends StObject
       with OnDestroy
       with OnInit {
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
      componentFactoryResolver: ComponentFactoryResolver,
      commonLocation: Location,
      elementRef: ElementRef[Any],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute
    ) = this()
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
      componentFactoryResolver: ComponentFactoryResolver,
      commonLocation: Location,
      elementRef: ElementRef[Any],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute,
      parentOutlet: IonRouterOutlet
    ) = this()
    
    /* private */ var _activatedRoute: Any = js.native
    
    /* private */ var _swipeGesture: Any = js.native
    
    var activateEvents: EventEmitter[Any] = js.native
    
    def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
    def activateWith(activatedRoute: ActivatedRoute, resolverOrInjector: ComponentFactoryResolver): Unit = js.native
    def activateWith(activatedRoute: ActivatedRoute, resolverOrInjector: EnvironmentInjector): Unit = js.native
    
    /* private */ var activated: Any = js.native
    
    def activatedRoute: ActivatedRoute = js.native
    
    def activatedRouteData: Any = js.native
    
    var activatedView: RouteView | Null = js.native
    
    def animated_=(animated: Boolean): Unit = js.native
    
    def animation_=(animation: AnimationBuilder): Unit = js.native
    
    /**
      * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
      */
    def attach(_ref: ComponentRef[Any], _activatedRoute: ActivatedRoute): Unit = js.native
    
    /**
      * Returns `true` if there are pages in the stack to go back.
      */
    def canGoBack(): Boolean = js.native
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    def canGoBack(deep: Unit, stackId: String): Boolean = js.native
    
    def component: Record[String, Any] = js.native
    
    /* private */ var componentFactoryResolver: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /**
      * Since the activated route can change over the life time of a component in an ion router outlet, we create
      * a proxy so that we can update the values over time as a user navigates back to components already in the stack.
      */
    /* private */ var createActivatedRouteProxy: Any = js.native
    
    /* private */ @JSName("currentActivatedRoute$")
    var currentActivatedRoute$: Any = js.native
    
    def deactivate(): Unit = js.native
    
    var deactivateEvents: EventEmitter[Any] = js.native
    
    /**
      * Called when the `RouteReuseStrategy` instructs to detach the subtree
      */
    def detach(): ComponentRef[Any] = js.native
    
    /**
      * @experimental
      *
      * The `EnvironmentInjector` provider instance from the parent component.
      * Required for using standalone components with `ion-router-outlet`.
      *
      * Will be deprecated and removed when Angular 13 support is dropped.
      */
    var environmentInjector: EnvironmentInjector = js.native
    
    /**
      * Returns the active stack ID. In the context of ion-tabs, it means the active tab.
      */
    def getActiveStackId(): js.UndefOr[String] = js.native
    
    def getContext(): OutletContext | Null = js.native
    
    /**
      * Returns the RouteView of the active page of each stack.
      * @internal
      */
    def getLastRouteView(): js.UndefOr[RouteView] = js.native
    def getLastRouteView(stackId: String): js.UndefOr[RouteView] = js.native
    
    /**
      * Returns the URL of the active page of each stack.
      */
    def getLastUrl(): js.UndefOr[String] = js.native
    def getLastUrl(stackId: String): js.UndefOr[String] = js.native
    
    /**
      * Returns the root view in the tab stack.
      * @internal
      */
    def getRootView(): js.UndefOr[RouteView] = js.native
    def getRootView(stackId: String): js.UndefOr[RouteView] = js.native
    
    def isActivated: Boolean = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var name: Any = js.native
    
    var nativeEl: HTMLIonRouterOutletElement = js.native
    
    /* private */ var navCtrl: Any = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
    
    /* private */ var parentContexts: Any = js.native
    
    val parentOutlet: js.UndefOr[IonRouterOutlet] = js.native
    
    /**
      * Resolves to `true` if it the outlet was able to sucessfully pop the last N pages.
      */
    def pop(): js.Promise[Boolean] = js.native
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
    def pop(deep: Unit, stackId: String): js.Promise[Boolean] = js.native
    
    /* private */ var proxyMap: Any = js.native
    
    /**
      * Create a wrapped observable that will switch to the latest activated route matched by the given component
      */
    /* private */ var proxyObservable: Any = js.native
    
    /* private */ var stackCtrl: Any = js.native
    
    var stackEvents: EventEmitter[Any] = js.native
    
    def swipeGesture_=(swipe: Boolean): Unit = js.native
    
    var tabsPrefix: js.UndefOr[String] = js.native
    
    /**
      * Updates the activated route proxy for the given component to the new incoming router state
      */
    /* private */ var updateActivatedRouteProxy: Any = js.native
  }
  /* static members */
  object IonRouterOutlet {
    
    @JSImport("@ionic/angular/directives/navigation/ion-router-outlet", "IonRouterOutlet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/navigation/ion-router-outlet", "IonRouterOutlet.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        IonRouterOutlet, 
        `ion-router-outlet`, 
        js.Array[outlet], 
        Animated, 
        ActivateEvents, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          IonRouterOutlet, 
          `ion-router-outlet`, 
          js.Array[outlet], 
          Animated, 
          ActivateEvents, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/navigation/ion-router-outlet", "IonRouterOutlet.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[
        IonRouterOutlet, 
        js.Tuple13[Null, Null, Attribute, AttributeOptional, Null, Null, Optional, Null, Null, Null, Null, Null, SkipSelf]
      ] = js.native
    inline def ɵfac_=(
      x: ɵɵFactoryDeclaration[
          IonRouterOutlet, 
          js.Tuple13[Null, Null, Attribute, AttributeOptional, Null, Null, Optional, Null, Null, Null, Null, Null, SkipSelf]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
