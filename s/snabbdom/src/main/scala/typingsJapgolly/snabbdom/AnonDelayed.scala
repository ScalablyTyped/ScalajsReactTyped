package typingsJapgolly.snabbdom

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelayed extends js.Object {
  var delayed: js.UndefOr[Record[String, String]] = js.undefined
  var remove: js.UndefOr[Record[String, String]] = js.undefined
}

object AnonDelayed {
  @scala.inline
  def apply(delayed: Record[String, String] = null, remove: Record[String, String] = null): AnonDelayed = {
    val __obj = js.Dynamic.literal()
    if (delayed != null) __obj.updateDynamic("delayed")(delayed.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelayed]
  }
}

