package typingsJapgolly.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEvent extends js.Object {
  /**
    * The Unix timestamp for when the event was triggered.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID string of the event.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The event message.
    */
  var message: js.UndefOr[String] = js.native
}

object ServiceEvent {
  @scala.inline
  def apply(createdAt: js.Date = null, id: String = null, message: String = null): ServiceEvent = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEvent]
  }
}

