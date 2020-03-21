package typingsJapgolly.reactBigCalendar

import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.DOWN
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.LEFT
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.RIGHT
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.UP
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.move
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection[TEvent /* <: js.Object */] extends js.Object {
  var action: resize | move
  var direction: UP | DOWN | LEFT | RIGHT
  var event: TEvent
}

object AnonDirection {
  @scala.inline
  def apply[TEvent /* <: js.Object */](action: resize | move, direction: UP | DOWN | LEFT | RIGHT, event: TEvent): AnonDirection[TEvent] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirection[TEvent]]
  }
}

