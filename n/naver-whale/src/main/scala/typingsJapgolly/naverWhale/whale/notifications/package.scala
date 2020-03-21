package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notifications {
  type NotificationButtonClickedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[/* notificationId */ java.lang.String, /* buttonIndex */ scala.Double, scala.Unit]
  ]
  type NotificationClickedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* notificationId */ java.lang.String, scala.Unit]]
  type NotificationClosedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[/* notificationId */ java.lang.String, /* byUser */ scala.Boolean, scala.Unit]
  ]
  type NotificationPermissionLevelChangedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* level */ java.lang.String, scala.Unit]]
  type NotificationShowSettingsEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
}
