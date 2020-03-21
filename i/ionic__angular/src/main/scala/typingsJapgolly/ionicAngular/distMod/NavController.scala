package typingsJapgolly.ionicAngular.distMod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "NavController")
@js.native
class NavController protected ()
  extends typingsJapgolly.ionicAngular.navControllerMod.NavController {
  def this(
    platform: typingsJapgolly.ionicAngular.platformMod.Platform,
    location: Location,
    serializer: UrlSerializer
  ) = this()
  def this(
    platform: typingsJapgolly.ionicAngular.platformMod.Platform,
    location: Location,
    serializer: UrlSerializer,
    router: Router
  ) = this()
}

