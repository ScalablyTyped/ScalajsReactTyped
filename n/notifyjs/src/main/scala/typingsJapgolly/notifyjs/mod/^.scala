package typingsJapgolly.notifyjs.mod

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notifyjs", JSImport.Namespace)
@js.native
class ^ protected () extends Notify {
  def this(title: String) = this()
  def this(title: String, options: INotifyOption) = this()
  /**
    * Close the notification.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Remove all event listener.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def handleEvent(e: Event_): Unit = js.native
  /* CompleteClass */
  override def onClickNotification(): Unit = js.native
  /* CompleteClass */
  override def onCloseNotification(): Unit = js.native
  /* CompleteClass */
  override def onErrorNotification(): Unit = js.native
  /* CompleteClass */
  override def onShowNotification(e: Event_): Unit = js.native
  /**
    * Show the notification.
    */
  /* CompleteClass */
  override def show(): Unit = js.native
}

@JSImport("notifyjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Check is permission is needed for the user to receive notifications.
    * @return true : needs permission, false : does not need
    */
  var needsPermission: Boolean = js.native
  /**
    * shows the user's current permission level (granted, denied or default), returns null if notifications are not supported.
    * @return 'granted' : permission has been given, 'denied' : permission has been denied, 'default' : permission has not yet been set, null : notifications are not supported
    */
  var permissionLevel: String = js.native
  /**
    * return true if the browser supports HTML5 Notification
    * @param true : the browser supports HTML5 Notification, false ; the browser does not supports HTML5 Notification.
    */
  def isSupported(): Boolean = js.native
  /**
    * Asks the user for permission to display notifications
    * @param onPermissionGrantedCallback A callback for permission is granted.
    * @param onPermissionDeniedCallback  A callback for permission is denied.
    */
  def requestPermission(): Unit = js.native
  def requestPermission(onPermissionGrantedCallback: js.Function0[_]): Unit = js.native
  def requestPermission(onPermissionGrantedCallback: js.Function0[_], onPermissionDeniedCallback: js.Function0[_]): Unit = js.native
}

