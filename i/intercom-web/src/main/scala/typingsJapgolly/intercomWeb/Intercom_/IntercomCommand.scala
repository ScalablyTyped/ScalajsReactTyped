package typingsJapgolly.intercomWeb.Intercom_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.intercomWeb.intercomWebStrings.boot
  - typingsJapgolly.intercomWeb.intercomWebStrings.shutdown
  - typingsJapgolly.intercomWeb.intercomWebStrings.update
  - typingsJapgolly.intercomWeb.intercomWebStrings.hide
  - typingsJapgolly.intercomWeb.intercomWebStrings.show
  - typingsJapgolly.intercomWeb.intercomWebStrings.showMessages
  - typingsJapgolly.intercomWeb.intercomWebStrings.showNewMessage
  - typingsJapgolly.intercomWeb.intercomWebStrings.onHide
  - typingsJapgolly.intercomWeb.intercomWebStrings.onShow
  - typingsJapgolly.intercomWeb.intercomWebStrings.onUnreadCountChange
  - typingsJapgolly.intercomWeb.intercomWebStrings.onActivatorClick
  - typingsJapgolly.intercomWeb.intercomWebStrings.trackEvent
  - typingsJapgolly.intercomWeb.intercomWebStrings.getVisitorId
*/
trait IntercomCommand extends js.Object

object IntercomCommand {
  @scala.inline
  def boot: typingsJapgolly.intercomWeb.intercomWebStrings.boot = this.cast("boot")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def getVisitorId: typingsJapgolly.intercomWeb.intercomWebStrings.getVisitorId = this.cast("getVisitorId")
  @scala.inline
  def hide: typingsJapgolly.intercomWeb.intercomWebStrings.hide = this.cast("hide")
  @scala.inline
  def onActivatorClick: typingsJapgolly.intercomWeb.intercomWebStrings.onActivatorClick = this.cast("onActivatorClick")
  @scala.inline
  def onHide: typingsJapgolly.intercomWeb.intercomWebStrings.onHide = this.cast("onHide")
  @scala.inline
  def onShow: typingsJapgolly.intercomWeb.intercomWebStrings.onShow = this.cast("onShow")
  @scala.inline
  def onUnreadCountChange: typingsJapgolly.intercomWeb.intercomWebStrings.onUnreadCountChange = this.cast("onUnreadCountChange")
  @scala.inline
  def show: typingsJapgolly.intercomWeb.intercomWebStrings.show = this.cast("show")
  @scala.inline
  def showMessages: typingsJapgolly.intercomWeb.intercomWebStrings.showMessages = this.cast("showMessages")
  @scala.inline
  def showNewMessage: typingsJapgolly.intercomWeb.intercomWebStrings.showNewMessage = this.cast("showNewMessage")
  @scala.inline
  def shutdown: typingsJapgolly.intercomWeb.intercomWebStrings.shutdown = this.cast("shutdown")
  @scala.inline
  def trackEvent: typingsJapgolly.intercomWeb.intercomWebStrings.trackEvent = this.cast("trackEvent")
  @scala.inline
  def update: typingsJapgolly.intercomWeb.intercomWebStrings.update = this.cast("update")
}

