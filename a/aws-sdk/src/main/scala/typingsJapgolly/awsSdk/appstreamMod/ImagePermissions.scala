package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePermissions extends js.Object {
  /**
    * Indicates whether the image can be used for a fleet.
    */
  var allowFleet: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether the image can be used for an image builder.
    */
  var allowImageBuilder: js.UndefOr[BooleanObject] = js.native
}

object ImagePermissions {
  @scala.inline
  def apply(
    allowFleet: js.UndefOr[scala.Boolean] = js.undefined,
    allowImageBuilder: js.UndefOr[scala.Boolean] = js.undefined
  ): ImagePermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFleet)) __obj.updateDynamic("allowFleet")(allowFleet.asInstanceOf[js.Any])
    if (!js.isUndefined(allowImageBuilder)) __obj.updateDynamic("allowImageBuilder")(allowImageBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePermissions]
  }
}

