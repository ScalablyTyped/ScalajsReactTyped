package typingsJapgolly.pulumiAws.notificationMod

import typingsJapgolly.pulumiAws.notificationTypeMod.NotificationType
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationState extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here][1]
    */
  val notifications: js.UndefOr[Input[js.Array[Input[NotificationType]]]] = js.native
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: js.UndefOr[Input[String]] = js.native
}

object NotificationState {
  @scala.inline
  def apply(
    groupNames: Input[js.Array[Input[String]]] = null,
    notifications: Input[js.Array[Input[NotificationType]]] = null,
    topicArn: Input[String] = null
  ): NotificationState = {
    val __obj = js.Dynamic.literal()
    if (groupNames != null) __obj.updateDynamic("groupNames")(groupNames.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationState]
  }
}

