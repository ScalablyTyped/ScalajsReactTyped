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
import typingsJapgolly.angularRouter.mod.ActivatedRoute
import typingsJapgolly.angularRouter.mod.ChildrenOutletContexts
import typingsJapgolly.angularRouter.mod.OutletContext
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.ionicAngular.configMod.Config
import typingsJapgolly.ionicAngular.navControllerMod.NavController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-router-outlet", JSImport.Namespace)
@js.native
object ionRouterOutletMod extends js.Object {
  @js.native
  class IonRouterOutlet protected ()
    extends OnDestroy
       with OnInit {
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      resolver: ComponentFactoryResolver,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
      commonLocation: Location,
      elementRef: ElementRef[_],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute
    ) = this()
    def this(
      parentContexts: ChildrenOutletContexts,
      location: ViewContainerRef,
      resolver: ComponentFactoryResolver,
      name: String,
      tabs: String,
      config: Config,
      navCtrl: NavController,
      commonLocation: Location,
      elementRef: ElementRef[_],
      router: Router,
      zone: NgZone,
      activatedRoute: ActivatedRoute,
      parentOutlet: IonRouterOutlet
    ) = this()
    var _activatedRoute: js.Any = js.native
    var _swipeGesture: js.UndefOr[js.Any] = js.native
    var activateEvents: EventEmitter[_] = js.native
    var activated: js.Any = js.native
    val activatedRoute: ActivatedRoute = js.native
    val activatedRouteData: js.Any = js.native
    var activatedView: js.Any = js.native
    var animated: Boolean = js.native
    val component: js.Object = js.native
    var config: js.Any = js.native
    /**
      * Since the activated route can change over the life time of a component in an ion router outlet, we create
      * a proxy so that we can update the values over time as a user navigates back to components already in the stack.
      */
    var createActivatedRouteProxy: js.Any = js.native
    @JSName("currentActivatedRoute$")
    var currentActivatedRoute$: js.Any = js.native
    var deactivateEvents: EventEmitter[_] = js.native
    val isActivated: Boolean = js.native
    var location: js.Any = js.native
    var name: js.Any = js.native
    var nativeEl: js.Any = js.native
    var navCtrl: js.Any = js.native
    var parentContexts: js.Any = js.native
    val parentOutlet: js.UndefOr[IonRouterOutlet] = js.native
    var proxyMap: js.Any = js.native
    /**
      * Create a wrapped observable that will switch to the latest activated route matched by the given component
      */
    var proxyObservable: js.Any = js.native
    var resolver: js.Any = js.native
    var stackCtrl: js.Any = js.native
    var stackEvents: EventEmitter[_] = js.native
    var swipeGesture: Boolean = js.native
    var tabsPrefix: js.UndefOr[String] = js.native
    /**
      * Updates the activated route proxy for the given component to the new incoming router state
      */
    var updateActivatedRouteProxy: js.Any = js.native
    def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
    def activateWith(activatedRoute: ActivatedRoute, resolver: ComponentFactoryResolver): Unit = js.native
    /**
      * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
      */
    def attach(_ref: ComponentRef[_], _activatedRoute: ActivatedRoute): Unit = js.native
    /**
      * Returns `true` if there are pages in the stack to go back.
      */
    def canGoBack(): Boolean = js.native
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    def deactivate(): Unit = js.native
    /**
      * Called when the `RouteReuseStrategy` instructs to detach the subtree
      */
    def detach(): ComponentRef[_] = js.native
    /**
      * Returns the active stack ID. In the context of ion-tabs, it means the active tab.
      */
    def getActiveStackId(): js.UndefOr[String] = js.native
    def getContext(): OutletContext | Null = js.native
    /**
      * Returns the URL of the active page of each stack.
      */
    def getLastUrl(): js.UndefOr[String] = js.native
    def getLastUrl(stackId: String): js.UndefOr[String] = js.native
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * after a directive, pipe, or service instance is destroyed.
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
    /**
      * Resolves to `true` if it the outlet was able to sucessfully pop the last N pages.
      */
    def pop(): js.Promise[Boolean] = js.native
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
  }
  
}

