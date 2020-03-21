package typingsJapgolly.nodeZendesk.mod.Requests

import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequesterAnonymous extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var locale_id: js.UndefOr[ZendeskID] = js.undefined
  var name: String
}

object RequesterAnonymous {
  @scala.inline
  def apply(name: String, email: String = null, locale_id: Int | Double = null): RequesterAnonymous = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (locale_id != null) __obj.updateDynamic("locale_id")(locale_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAnonymous]
  }
}

