package typingsJapgolly.angularCommon.upgradeMod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCommon.mod.LocationStrategy
import typingsJapgolly.angularCommon.mod.PlatformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade", "$locationShimProvider")
@js.native
class locationShimProvider protected ()
  extends typingsJapgolly.angularCommon.upgradeUpgradeMod.locationShimProvider {
  def this(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typingsJapgolly.angularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ) = this()
}

