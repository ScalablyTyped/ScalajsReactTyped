package typingsJapgolly.pulumiAws.inputMod.mq

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerLogs extends js.Object {
  /**
    * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
    */
  var audit: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables general logging via CloudWatch. Defaults to `false`.
    */
  var general: js.UndefOr[Input[Boolean]] = js.native
}

object BrokerLogs {
  @scala.inline
  def apply(audit: Input[Boolean] = null, general: Input[Boolean] = null): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (audit != null) __obj.updateDynamic("audit")(audit.asInstanceOf[js.Any])
    if (general != null) __obj.updateDynamic("general")(general.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerLogs]
  }
}

