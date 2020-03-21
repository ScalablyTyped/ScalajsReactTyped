package typingsJapgolly.intercomWeb.Intercom_

import typingsJapgolly.intercomWeb.intercomWebStrings.boot
import typingsJapgolly.intercomWeb.intercomWebStrings.getVisitorId
import typingsJapgolly.intercomWeb.intercomWebStrings.hide
import typingsJapgolly.intercomWeb.intercomWebStrings.onActivatorClick
import typingsJapgolly.intercomWeb.intercomWebStrings.onHide
import typingsJapgolly.intercomWeb.intercomWebStrings.onShow
import typingsJapgolly.intercomWeb.intercomWebStrings.onUnreadCountChange
import typingsJapgolly.intercomWeb.intercomWebStrings.show
import typingsJapgolly.intercomWeb.intercomWebStrings.showMessages
import typingsJapgolly.intercomWeb.intercomWebStrings.showNewMessage
import typingsJapgolly.intercomWeb.intercomWebStrings.shutdown
import typingsJapgolly.intercomWeb.intercomWebStrings.trackEvent
import typingsJapgolly.intercomWeb.intercomWebStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomStatic extends js.Object {
  var booted: Boolean = js.native
  def apply(command: IntercomCommand): Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any): Unit = js.native
  def apply(command: IntercomCommand, param1: js.Any, param2: js.Any): Unit = js.native
  def apply(command: boot, param: IntercomSettings): Unit = js.native
  def apply(command: getVisitorId): String = js.native
  def apply(command: hide): Unit = js.native
  def apply(command: onActivatorClick): Unit = js.native
  def apply(command: onActivatorClick, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onHide): Unit = js.native
  def apply(command: onHide, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onShow): Unit = js.native
  def apply(command: onShow, param: js.Function0[Unit]): Unit = js.native
  def apply(command: onUnreadCountChange, cb: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
  def apply(command: show): Unit = js.native
  def apply(command: showMessages): Unit = js.native
  def apply(command: showNewMessage): Unit = js.native
  def apply(command: showNewMessage, param: String): Unit = js.native
  def apply(command: shutdown): Unit = js.native
  def apply(command: trackEvent): Unit = js.native
  def apply(command: trackEvent, tag: String): Unit = js.native
  def apply(command: trackEvent, tag: String, metadata: js.Any): Unit = js.native
  def apply(command: update): Unit = js.native
  def apply(command: update, param: IntercomSettings): Unit = js.native
}

