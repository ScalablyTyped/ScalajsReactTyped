package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularRouter.mod.ActivatedRoute
import typingsJapgolly.angularRouter.mod.ChildrenOutletContexts
import typingsJapgolly.angularRouter.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "IonRouterOutlet")
@js.native
class IonRouterOutlet protected ()
  extends typingsJapgolly.ionicAngular.distMod.IonRouterOutlet {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    tabs: String,
    config: typingsJapgolly.ionicAngular.configMod.Config,
    navCtrl: typingsJapgolly.ionicAngular.navControllerMod.NavController,
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
    config: typingsJapgolly.ionicAngular.configMod.Config,
    navCtrl: typingsJapgolly.ionicAngular.navControllerMod.NavController,
    commonLocation: Location,
    elementRef: ElementRef[_],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute,
    parentOutlet: typingsJapgolly.ionicAngular.ionRouterOutletMod.IonRouterOutlet
  ) = this()
}

