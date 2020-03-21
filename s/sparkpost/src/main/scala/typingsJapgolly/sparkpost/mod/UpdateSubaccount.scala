package typingsJapgolly.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.undefined
  /** user-friendly name */
  var name: String
  /** status of the subaccount */
  var status: String
}

object UpdateSubaccount {
  @scala.inline
  def apply(name: String, status: String, ip_pool: String = null): UpdateSubaccount = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (ip_pool != null) __obj.updateDynamic("ip_pool")(ip_pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubaccount]
  }
}

