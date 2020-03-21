package typingsJapgolly.ionicAngular.distMod

import typingsJapgolly.angularCommon.mod.LocationStrategy
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.RouterLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "RouterLinkDelegate")
@js.native
class RouterLinkDelegate protected ()
  extends typingsJapgolly.ionicAngular.routerLinkDelegateMod.RouterLinkDelegate {
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsJapgolly.ionicAngular.navControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router
  ) = this()
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsJapgolly.ionicAngular.navControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router,
    routerLink: RouterLink
  ) = this()
}

