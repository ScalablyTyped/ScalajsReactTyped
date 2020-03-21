package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "NavController")
@js.native
class NavController protected ()
  extends typingsJapgolly.ionicAngular.distMod.NavController {
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

