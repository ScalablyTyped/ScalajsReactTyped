package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.ComponentRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularRouter.mod.ActivatedRoute
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.ionicAngular.directivesNavigationStackUtilsMod.RouteView
import typingsJapgolly.ionicAngular.directivesNavigationStackUtilsMod.StackEvent
import typingsJapgolly.ionicAngular.providersNavControllerMod.NavController
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterOutletElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationStackControllerMod {
  
  @JSImport("@ionic/angular/directives/navigation/stack-controller", "StackController")
  @js.native
  open class StackController protected () extends StObject {
    def this(
      tabsPrefix: String,
      containerEl: HTMLIonRouterOutletElement,
      router: Router,
      navCtrl: NavController,
      zone: NgZone,
      location: Location
    ) = this()
    def this(
      tabsPrefix: Unit,
      containerEl: HTMLIonRouterOutletElement,
      router: Router,
      navCtrl: NavController,
      zone: NgZone,
      location: Location
    ) = this()
    
    /* private */ var activeView: Any = js.native
    
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    
    /* private */ var containerEl: Any = js.native
    
    def createView(ref: ComponentRef[Any], activatedRoute: ActivatedRoute): RouteView = js.native
    
    def destroy(): Unit = js.native
    
    def endBackTransition(shouldComplete: Boolean): Unit = js.native
    
    def getActiveStackId(): js.UndefOr[String] = js.native
    
    def getExistingView(activatedRoute: ActivatedRoute): js.UndefOr[RouteView] = js.native
    
    def getLastUrl(): js.UndefOr[RouteView] = js.native
    def getLastUrl(stackId: String): js.UndefOr[RouteView] = js.native
    
    /**
      * @internal
      */
    def getRootUrl(): js.UndefOr[RouteView] = js.native
    def getRootUrl(stackId: String): js.UndefOr[RouteView] = js.native
    
    /* private */ var getStack: Any = js.native
    
    def hasRunningTask(): Boolean = js.native
    
    /* private */ var insertView: Any = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var navCtrl: Any = js.native
    
    /* private */ var nextId: Any = js.native
    
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
    
    /* private */ var router: Any = js.native
    
    /* private */ var runningTask: Any = js.native
    
    def setActive(enteringView: RouteView): js.Promise[StackEvent] = js.native
    
    /* private */ var skipTransition: Any = js.native
    
    def startBackTransition(): js.Promise[Boolean | Unit] = js.native
    
    /* private */ var tabsPrefix: Any = js.native
    
    /* private */ var transition: Any = js.native
    
    /* private */ var views: Any = js.native
    
    /* private */ @JSName("wait")
    var wait_FStackController: Any = js.native
    
    /* private */ var zone: Any = js.native
  }
}
