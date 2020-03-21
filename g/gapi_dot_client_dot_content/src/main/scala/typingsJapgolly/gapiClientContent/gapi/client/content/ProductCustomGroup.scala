package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCustomGroup extends js.Object {
  /** The sub-attributes. */
  var attributes: js.UndefOr[js.Array[ProductCustomAttribute]] = js.undefined
  /** The name of the group. Underscores will be replaced by spaces upon insertion. */
  var name: js.UndefOr[String] = js.undefined
}

object ProductCustomGroup {
  @scala.inline
  def apply(attributes: js.Array[ProductCustomAttribute] = null, name: String = null): ProductCustomGroup = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCustomGroup]
  }
}

