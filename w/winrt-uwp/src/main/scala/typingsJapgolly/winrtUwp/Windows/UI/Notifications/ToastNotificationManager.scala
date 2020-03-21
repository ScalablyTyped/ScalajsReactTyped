package typingsJapgolly.winrtUwp.Windows.UI.Notifications

import typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates ToastNotifier objects that you use to raise toast notifications. This class also provides access to the XML content of the system-provided toast templates so that you can customize that content for use in your notifications. */
@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
abstract class ToastNotificationManager () extends js.Object

/* static members */
@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
object ToastNotificationManager extends js.Object {
  /** Gets the ToastNotificationHistory object. */
  var history: ToastNotificationHistory = js.native
  /**
    * Creates and initializes a new instance of the ToastNotification , bound to the calling application, that lets you raise a toast notification to that app.
    * @return The object you will use to send the toast notification to the app.
    */
  def createToastNotifier(): ToastNotifier = js.native
  /**
    * Creates and initializes a new instance of the ToastNotification , bound to a specified app, usually another app in the same package.
    * @param applicationId The unique ID of the app.
    * @return The object you will use to send the toast notification to the tile.
    */
  def createToastNotifier(applicationId: String): ToastNotifier = js.native
  /**
    * Gets the XML content of one of the predefined toast templates so that you can customize it for use in your notification.
    * @param type One of the system-provided toast templates.
    * @return The object that contains the template XML.
    */
  def getTemplateContent(`type`: ToastTemplateType): XmlDocument = js.native
}

