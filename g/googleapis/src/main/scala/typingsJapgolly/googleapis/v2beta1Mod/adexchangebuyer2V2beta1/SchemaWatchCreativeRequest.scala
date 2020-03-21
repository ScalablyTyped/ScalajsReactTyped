package typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for watching changes to creative Status.
  */
@js.native
trait SchemaWatchCreativeRequest extends js.Object {
  /**
    * The Pub/Sub topic to publish notifications to. This topic must already
    * exist and must give permission to ad-exchange-buyside-reports@google.com
    * to write to the topic. This should be the full resource name in
    * &quot;projects/{project_id}/topics/{topic_id}&quot; format.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaWatchCreativeRequest {
  @scala.inline
  def apply(topic: String = null): SchemaWatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWatchCreativeRequest]
  }
}

