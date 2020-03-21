package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Credit
import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.GoogleEarthEnterpriseMetadata
import typingsJapgolly.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var metadata: GoogleEarthEnterpriseMetadata
  var url: Resource | String
}

object AnonUrl {
  @scala.inline
  def apply(
    metadata: GoogleEarthEnterpriseMetadata,
    url: Resource | String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null
  ): AnonUrl = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

