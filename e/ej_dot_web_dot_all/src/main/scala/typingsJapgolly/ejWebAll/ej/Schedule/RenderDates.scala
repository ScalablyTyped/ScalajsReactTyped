package typingsJapgolly.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDates extends js.Object {
  /** Sets the end limit of the custom date range.
    * @Default {null}
    */
  var end: js.UndefOr[js.Any] = js.undefined
  /** Sets the start of custom date range to be rendered in the Schedule.
    * @Default {null}
    */
  var start: js.UndefOr[js.Any] = js.undefined
}

object RenderDates {
  @scala.inline
  def apply(end: js.Any = null, start: js.Any = null): RenderDates = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDates]
  }
}

