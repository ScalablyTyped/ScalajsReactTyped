package typingsJapgolly.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitterTapsTypes extends js.Object {
  var splitter: Null | Double
  var timeoutId: Null | js.Object
}

object splitterTapsTypes {
  @scala.inline
  def apply(splitter: Int | Double = null, timeoutId: js.Object = null): splitterTapsTypes = {
    val __obj = js.Dynamic.literal()
    if (splitter != null) __obj.updateDynamic("splitter")(splitter.asInstanceOf[js.Any])
    if (timeoutId != null) __obj.updateDynamic("timeoutId")(timeoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitterTapsTypes]
  }
}

