package typingsJapgolly.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_TimePickerMixin.html
  *
  * A mixin for time picker widget.
  *
  */
@JSGlobal("dojox.mobile._TimePickerMixin")
@js.native
class TimePickerMixin () extends js.Object {
  /**
    * A Date object corresponding to the current values of the picker.
    *
    */
  var date: js.Date = js.native
  /**
    * Goes to now. Resets the hour and minutes to the current time.
    *
    */
  def reset(): Unit = js.native
}

