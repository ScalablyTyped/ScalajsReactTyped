package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.std.Date
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeUpdater extends js.Object {
  def clear(): Unit = js.native
  def startPeriodicUpdate(badgeContent: Uri, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def startPeriodicUpdate(badgeContent: Uri, startTime: Date, requestedInterval: PeriodicUpdateRecurrence): Unit = js.native
  def stopPeriodicUpdate(): Unit = js.native
  def update(notification: BadgeNotification): Unit = js.native
}

