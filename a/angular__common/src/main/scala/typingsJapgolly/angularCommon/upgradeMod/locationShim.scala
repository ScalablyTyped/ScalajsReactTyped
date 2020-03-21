package typingsJapgolly.angularCommon.upgradeMod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCommon.mod.LocationStrategy
import typingsJapgolly.angularCommon.mod.PlatformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade", "$locationShim")
@js.native
class locationShim protected ()
  extends typingsJapgolly.angularCommon.upgradeUpgradeMod.locationShim {
  def this(
    $injector: js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typingsJapgolly.angularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ) = this()
}

