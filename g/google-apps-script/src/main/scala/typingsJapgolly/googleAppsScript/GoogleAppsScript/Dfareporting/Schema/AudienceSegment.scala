package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegment extends js.Object {
  var allocation: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AudienceSegment {
  @scala.inline
  def apply(allocation: Int | Double = null, id: String = null, name: String = null): AudienceSegment = {
    val __obj = js.Dynamic.literal()
    if (allocation != null) __obj.updateDynamic("allocation")(allocation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudienceSegment]
  }
}

