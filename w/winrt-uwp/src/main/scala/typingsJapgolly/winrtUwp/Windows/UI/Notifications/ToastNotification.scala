package typingsJapgolly.winrtUwp.Windows.UI.Notifications

import typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.activated
import typingsJapgolly.winrtUwp.winrtUwpStrings.dismissed
import typingsJapgolly.winrtUwp.winrtUwpStrings.failed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the content, associated metadata and events, and expiration time of a toast notification. */
@JSGlobal("Windows.UI.Notifications.ToastNotification")
@js.native
class ToastNotification protected () extends js.Object {
  /**
    * Creates and initializes a new instance of the ToastNotification .
    * @param content The XML content that defines the toast notification.
    */
  def this(content: XmlDocument) = this()
  /** Gets the XML that defines the current toast notification. */
  var content: XmlDocument = js.native
  /** Gets or sets the time after which a toast notification should not be displayed. */
  var expirationTime: js.Date = js.native
  /** Gets or sets the group identifier for the notification. */
  var group: String = js.native
  /** Occurs when user activates a toast notification through a click or touch. Apps that are running subscribe to this event. */
  @JSName("onactivated")
  var onactivated_Original: TypedEventHandler[ToastNotification, _] = js.native
  /** Occurs when a toast notification leaves the screen, either by expiring or being explicitly dismissed by the user. Apps that are running subscribe to this event. */
  @JSName("ondismissed")
  var ondismissed_Original: TypedEventHandler[ToastNotification, ToastDismissedEventArgs] = js.native
  /** Occurs when an error is caused when Windows attempts to raise a toast notification. Apps that are running subscribe to this event. */
  @JSName("onfailed")
  var onfailed_Original: TypedEventHandler[ToastNotification, ToastFailedEventArgs] = js.native
  /** Gets or sets whether a toast's pop-up UI is displayed on the Windows Phone 8.1 screen. */
  var suppressPopup: Boolean = js.native
  /** Gets or sets the unique identifier of this notification within the notification Group . */
  var tag: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activated(`type`: activated, listener: TypedEventHandler[ToastNotification, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[ToastNotification, ToastDismissedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_failed(`type`: failed, listener: TypedEventHandler[ToastNotification, ToastFailedEventArgs]): Unit = js.native
  /** Occurs when user activates a toast notification through a click or touch. Apps that are running subscribe to this event. */
  def onactivated(ev: js.Any with WinRTEvent[ToastNotification]): Unit = js.native
  /** Occurs when a toast notification leaves the screen, either by expiring or being explicitly dismissed by the user. Apps that are running subscribe to this event. */
  def ondismissed(ev: ToastDismissedEventArgs with WinRTEvent[ToastNotification]): Unit = js.native
  /** Occurs when an error is caused when Windows attempts to raise a toast notification. Apps that are running subscribe to this event. */
  def onfailed(ev: ToastFailedEventArgs with WinRTEvent[ToastNotification]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(`type`: activated, listener: TypedEventHandler[ToastNotification, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[ToastNotification, ToastDismissedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_failed(`type`: failed, listener: TypedEventHandler[ToastNotification, ToastFailedEventArgs]): Unit = js.native
}

