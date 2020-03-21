package typingsJapgolly.ionicAngular

import org.scalajs.dom.raw.UIEvent
import typingsJapgolly.angularCommon.mod.LocationStrategy
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.RouterLink
import typingsJapgolly.ionicAngular.navControllerMod.NavController
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/router-link-delegate", JSImport.Namespace)
@js.native
object routerLinkDelegateMod extends js.Object {
  @js.native
  class RouterLinkDelegate protected () extends js.Object {
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[_],
      router: Router
    ) = this()
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[_],
      router: Router,
      routerLink: RouterLink
    ) = this()
    var elementRef: js.Any = js.native
    var locationStrategy: js.Any = js.native
    var navCtrl: js.Any = js.native
    var router: js.Any = js.native
    var routerDirection: RouterDirection = js.native
    var routerLink: js.UndefOr[js.Any] = js.native
    var subscription: js.UndefOr[js.Any] = js.native
    var updateTargetUrlAndHref: js.Any = js.native
    def ngOnChanges(): js.Any = js.native
    def ngOnDestroy(): js.Any = js.native
    def ngOnInit(): Unit = js.native
    /**
      * @internal
      */
    def onClick(ev: UIEvent): Unit = js.native
  }
  
}

