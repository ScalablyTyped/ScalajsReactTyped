package typingsJapgolly.openfin.externalWindowMod

import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.windowMod.WindowBeginBoundsChangingEvent
import typingsJapgolly.openfin.windowMod.WindowBoundsChange
import typingsJapgolly.openfin.windowMod.WindowEndBoundsChangingEvent
import typingsJapgolly.openfin.windowMod.WindowGroupChanged
import typingsJapgolly.openfin.windowMod.WindowHiddenEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/externalWindow.ExternalWindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/externalWindow.ExternalWindowEventMapping<'external-window', Type>[Type]} */
trait ExternalWindowEvents extends js.Object {
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String]
  var blurred: WindowEvent[String, String]
  var `bounds-changed`: WindowBoundsChange[String, String]
  var `bounds-changing`: WindowBoundsChange[String, String]
  var closed: WindowEvent[String, String]
  var closing: WindowEvent[String, String]
  var `disabled-movement-bounds-changed`: WindowBoundsChange[String, String]
  var `disabled-movement-bounds-changing`: WindowBoundsChange[String, String]
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String]
  var focused: WindowEvent[String, String]
  var `group-changed`: WindowGroupChanged[String, String]
  var hidden: WindowHiddenEvent[String, String]
  var listenerRemoved: String
  var maximized: WindowEvent[String, String]
  var minimized: WindowEvent[String, String]
  var newListener: String
  var restored: WindowEvent[String, String]
  var shown: WindowEvent[String, String]
  var `user-movement-disabled`: WindowEvent[String, String]
  var `user-movement-enabled`: WindowEvent[String, String]
}

object ExternalWindowEvents {
  @scala.inline
  def apply(
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String],
    blurred: WindowEvent[String, String],
    `bounds-changed`: WindowBoundsChange[String, String],
    `bounds-changing`: WindowBoundsChange[String, String],
    closed: WindowEvent[String, String],
    closing: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[String, String],
    `disabled-movement-bounds-changing`: WindowBoundsChange[String, String],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String],
    focused: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[String, String],
    hidden: WindowHiddenEvent[String, String],
    listenerRemoved: String,
    maximized: WindowEvent[String, String],
    minimized: WindowEvent[String, String],
    newListener: String,
    restored: WindowEvent[String, String],
    shown: WindowEvent[String, String],
    `user-movement-disabled`: WindowEvent[String, String],
    `user-movement-enabled`: WindowEvent[String, String]
  ): ExternalWindowEvents = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowEvents]
  }
}

