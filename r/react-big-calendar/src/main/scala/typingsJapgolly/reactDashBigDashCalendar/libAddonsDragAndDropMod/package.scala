package typingsJapgolly.reactDashBigDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAddonsDragAndDropMod {
  import japgolly.scalajs.react.raw.React.Component
  import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.CalendarProps

  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = Component[
    (CalendarProps[TEvent, TResource]) with withDragAndDropProps[TEvent] with js.Object, 
    js.Object
  ]
}
