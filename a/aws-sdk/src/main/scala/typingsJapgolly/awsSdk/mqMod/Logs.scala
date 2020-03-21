package typingsJapgolly.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logs extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.native
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.native
}

object Logs {
  @scala.inline
  def apply(Audit: js.UndefOr[Boolean] = js.undefined, General: js.UndefOr[Boolean] = js.undefined): Logs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Audit)) __obj.updateDynamic("Audit")(Audit.asInstanceOf[js.Any])
    if (!js.isUndefined(General)) __obj.updateDynamic("General")(General.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logs]
  }
}

