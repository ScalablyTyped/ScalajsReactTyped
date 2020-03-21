package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Contact]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ContactsListResponse {
  @scala.inline
  def apply(items: js.Array[Contact] = null, kind: String = null): ContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsListResponse]
  }
}

