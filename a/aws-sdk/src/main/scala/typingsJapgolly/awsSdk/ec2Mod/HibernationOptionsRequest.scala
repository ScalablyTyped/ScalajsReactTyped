package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HibernationOptionsRequest extends js.Object {
  /**
    * If you set this parameter to true, your instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object HibernationOptionsRequest {
  @scala.inline
  def apply(Configured: js.UndefOr[scala.Boolean] = js.undefined): HibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Configured)) __obj.updateDynamic("Configured")(Configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[HibernationOptionsRequest]
  }
}

