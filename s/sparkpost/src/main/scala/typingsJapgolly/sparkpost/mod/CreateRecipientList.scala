package typingsJapgolly.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.undefined
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.undefined
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.undefined
  /** limit the number of recipient errors returned. */
  var num_rcpt_errors: js.UndefOr[Double] = js.undefined
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}

object CreateRecipientList {
  @scala.inline
  def apply(
    recipients: js.Array[Recipient],
    attributes: js.Any = null,
    description: String = null,
    id: String = null,
    name: String = null,
    num_rcpt_errors: Int | Double = null
  ): CreateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (num_rcpt_errors != null) __obj.updateDynamic("num_rcpt_errors")(num_rcpt_errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipientList]
  }
}

