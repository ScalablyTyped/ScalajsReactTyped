package typingsJapgolly.dmgBuilder.licenseButtonsMod

import typingsJapgolly.appBuilderLib.mod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder/out/licenseButtons", "getLicenseButtonsFile")
@js.native
object getLicenseButtonsFile extends js.Object {
  def apply(packager: PlatformPackager[_]): js.Promise[js.Array[LicenseButtonsFile]] = js.native
}

