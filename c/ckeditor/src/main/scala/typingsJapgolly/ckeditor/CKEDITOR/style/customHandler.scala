package typingsJapgolly.ckeditor.CKEDITOR.style

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait customHandler extends js.Object {
  var assignedTo: js.UndefOr[Double] = js.undefined
  var setup: js.UndefOr[js.Function1[/* style */ definition, Unit]] = js.undefined
  var `type`: String | Double
}

object customHandler {
  @scala.inline
  def apply(
    `type`: String | Double,
    assignedTo: Int | Double = null,
    setup: /* style */ definition => Callback = null
  ): customHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.ckeditor.CKEDITOR.style.definition) => setup(t0).runNow()))
    __obj.asInstanceOf[customHandler]
  }
}

