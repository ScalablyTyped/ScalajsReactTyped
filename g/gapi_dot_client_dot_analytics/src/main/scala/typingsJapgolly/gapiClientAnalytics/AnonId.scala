package typingsJapgolly.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(id: String = null, label: String = null, `type`: String = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

