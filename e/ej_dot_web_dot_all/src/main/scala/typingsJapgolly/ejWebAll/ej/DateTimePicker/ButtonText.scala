package typingsJapgolly.ejWebAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** Sets the text for the Done button inside the datetime popup.
    */
  var done: js.UndefOr[String] = js.undefined
  /** Sets the text for the Now button inside the datetime popup.
    */
  var timeNow: js.UndefOr[String] = js.undefined
  /** Sets the header text for the Time dropdown.
    */
  var timeTitle: js.UndefOr[String] = js.undefined
  /** Sets the text for the Today button inside the datetime popup.
    */
  var today: js.UndefOr[String] = js.undefined
}

object ButtonText {
  @scala.inline
  def apply(done: String = null, timeNow: String = null, timeTitle: String = null, today: String = null): ButtonText = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (timeNow != null) __obj.updateDynamic("timeNow")(timeNow.asInstanceOf[js.Any])
    if (timeTitle != null) __obj.updateDynamic("timeTitle")(timeTitle.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
}

