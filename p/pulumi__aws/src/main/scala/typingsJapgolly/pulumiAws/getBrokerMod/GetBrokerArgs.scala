package typingsJapgolly.pulumiAws.getBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.mq.GetBrokerLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerArgs extends js.Object {
  /**
    * The unique id of the mq broker.
    */
  val brokerId: js.UndefOr[String] = js.native
  /**
    * The unique name of the mq broker.
    */
  val brokerName: js.UndefOr[String] = js.native
  val logs: js.UndefOr[GetBrokerLogs] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetBrokerArgs {
  @scala.inline
  def apply(
    brokerId: String = null,
    brokerName: String = null,
    logs: GetBrokerLogs = null,
    tags: StringDictionary[js.Any] = null
  ): GetBrokerArgs = {
    val __obj = js.Dynamic.literal()
    if (brokerId != null) __obj.updateDynamic("brokerId")(brokerId.asInstanceOf[js.Any])
    if (brokerName != null) __obj.updateDynamic("brokerName")(brokerName.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrokerArgs]
  }
}

