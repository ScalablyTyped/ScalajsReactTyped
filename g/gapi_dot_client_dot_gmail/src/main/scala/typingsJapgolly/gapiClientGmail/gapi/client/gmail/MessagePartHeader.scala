package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePartHeader extends js.Object {
  /** The name of the header before the : separator. For example, To. */
  var name: js.UndefOr[String] = js.undefined
  /** The value of the header after the : separator. For example, someuser@example.com. */
  var value: js.UndefOr[String] = js.undefined
}

object MessagePartHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): MessagePartHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePartHeader]
  }
}

