package typingsJapgolly.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterConfigResponse extends js.Object {
  var update: js.UndefOr[Update] = js.native
}

object UpdateClusterConfigResponse {
  @scala.inline
  def apply(update: Update = null): UpdateClusterConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigResponse]
  }
}

