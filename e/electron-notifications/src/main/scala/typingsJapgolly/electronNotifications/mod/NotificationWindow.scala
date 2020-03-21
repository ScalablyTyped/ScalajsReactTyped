package typingsJapgolly.electronNotifications.mod

import typingsJapgolly.electron.mod.BrowserWindow
import typingsJapgolly.electronNotifications.electronNotificationsStrings.buttonClicked
import typingsJapgolly.electronNotifications.electronNotificationsStrings.clicked
import typingsJapgolly.electronNotifications.electronNotificationsStrings.swipedRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notifications", "NotificationWindow")
@js.native
class NotificationWindow () extends BrowserWindow {
  /** When any one of the buttons are clicked, it will trigger a buttonClicked event, and pass the text that was clicked to the handler. */
  @JSName("on")
  def on_buttonClicked(event: buttonClicked, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  /** When the notification was clicked, but not dragged. This usually does the default action, or closes the notification. */
  @JSName("on")
  def on_clicked(event: clicked, listener: js.Function): this.type = js.native
  /** When the notification has been swiped to the right. This usually indiciated the user wants to dismiss the notification. */
  @JSName("on")
  def on_swipedRight(event: swipedRight, listener: js.Function): this.type = js.native
}

