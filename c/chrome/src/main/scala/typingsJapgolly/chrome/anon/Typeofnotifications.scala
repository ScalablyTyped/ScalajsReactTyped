package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.notifications.NotificationButtonClickedEvent
import typingsJapgolly.chrome.chrome.notifications.NotificationClickedEvent
import typingsJapgolly.chrome.chrome.notifications.NotificationClosedEvent
import typingsJapgolly.chrome.chrome.notifications.NotificationOptions
import typingsJapgolly.chrome.chrome.notifications.NotificationPermissionLevelChangedEvent
import typingsJapgolly.chrome.chrome.notifications.NotificationShowSettingsEvent
import typingsJapgolly.chrome.chromeBooleans.`false`
import typingsJapgolly.chrome.chromeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofnotifications extends StObject {
  
  def clear(notificationId: String): Unit = js.native
  def clear(notificationId: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  @JSName("create")
  def create_true(notificationId: String, options: NotificationOptions[`true`]): Unit = js.native
  @JSName("create")
  def create_true(
    notificationId: String,
    options: NotificationOptions[`true`],
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  @JSName("create")
  def create_true(options: NotificationOptions[`true`]): Unit = js.native
  @JSName("create")
  def create_true(options: NotificationOptions[`true`], callback: js.Function1[/* notificationId */ String, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* notifications */ js.Object, Unit]): Unit = js.native
  
  def getPermissionLevel(callback: js.Function1[/* level */ String, Unit]): Unit = js.native
  
  var onButtonClicked: NotificationButtonClickedEvent = js.native
  
  var onClicked: NotificationClickedEvent = js.native
  
  var onClosed: NotificationClosedEvent = js.native
  
  var onPermissionLevelChanged: NotificationPermissionLevelChangedEvent = js.native
  
  var onShowSettings: NotificationShowSettingsEvent = js.native
  
  @JSName("update")
  def update_false(notificationId: String, options: NotificationOptions[`false`]): Unit = js.native
  @JSName("update")
  def update_false(
    notificationId: String,
    options: NotificationOptions[`false`],
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}
