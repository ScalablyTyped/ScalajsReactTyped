package typingsJapgolly.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineEra extends js.Object {
  var end_date: ITimelineDate
  var start_date: ITimelineDate
  /*
    * Not required, but recommended.
    */
  var text: js.UndefOr[ITimelineText] = js.undefined
}

object ITimelineEra {
  @scala.inline
  def apply(end_date: ITimelineDate, start_date: ITimelineDate, text: ITimelineText = null): ITimelineEra = {
    val __obj = js.Dynamic.literal(end_date = end_date.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineEra]
  }
}

