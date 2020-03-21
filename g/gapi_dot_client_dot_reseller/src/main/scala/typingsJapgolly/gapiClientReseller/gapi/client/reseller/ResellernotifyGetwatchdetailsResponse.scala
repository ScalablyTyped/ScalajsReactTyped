package typingsJapgolly.gapiClientReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyGetwatchdetailsResponse extends js.Object {
  /** List of registered service accounts. */
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.undefined
}

object ResellernotifyGetwatchdetailsResponse {
  @scala.inline
  def apply(serviceAccountEmailAddresses: js.Array[String] = null, topicName: String = null): ResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccountEmailAddresses != null) __obj.updateDynamic("serviceAccountEmailAddresses")(serviceAccountEmailAddresses.asInstanceOf[js.Any])
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
  }
}

