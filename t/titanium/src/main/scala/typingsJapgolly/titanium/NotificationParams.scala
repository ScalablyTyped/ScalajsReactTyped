package typingsJapgolly.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to create a notification using
  * <Titanium.App.iOS.scheduleLocalNotification>.
  */
trait NotificationParams extends js.Object {
  /**
  	 * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
  	 * to display.
  	 */
  var alertAction: js.UndefOr[String] = js.undefined
  /**
  	 * Alert message to display.
  	 */
  var alertBody: js.UndefOr[String] = js.undefined
  /**
  	 * Image to display instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[String] = js.undefined
  /**
  	 * Alert subtitle to display.
  	 */
  var alertSubtitle: js.UndefOr[String] = js.undefined
  /**
  	 * Alert title to display.
  	 */
  var alertTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Notification attachments to display.
  	 */
  var attachments: js.UndefOr[js.Array[UserNotificationAttachment]] = js.undefined
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[Double] = js.undefined
  /**
  	 * String identifier of category of actions to be displayed for an interactive notification.
  	 */
  var category: js.UndefOr[String] = js.undefined
  /**
  	 * Date and time for the notification to occur.
  	 */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
  	 * The notification identifier.
  	 */
  var identifier: String
  /**
  	 * Region the notification will be triggered in. Allowed parameter are:
  	 * - `latitude`: Latitude of the location center, in decimal degrees (required).
  	 * - `longitude`: Longitude of the location center, in decimal degrees (required).
  	 * - `triggersOnce`: Whether or not the notification will only fire once (optional, default: true).
  	 */
  var region: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Interval to repeat the notification. One of `weekly`, `daily`, `yearly,` `monthly`.
  	 */
  var repeat: js.UndefOr[String] = js.undefined
  /**
  	 * Path to the sound file to play when notification occurs, relative to the `Resources` folder.
  	 */
  var sound: js.UndefOr[String] = js.undefined
  /**
  	 * The string the notification adds to the category's summary format string.
  	 */
  var summaryArgument: js.UndefOr[String] = js.undefined
  /**
  	 * The number of items the notification adds to the category's summary format string.
  	 */
  var summaryArgumentCount: js.UndefOr[String] = js.undefined
  /**
  	 * Timezone of the date configured for the notification. If not set, the system timezone is used.
  	 */
  var timezone: js.UndefOr[String] = js.undefined
  /**
  	 * Data to pass to the application with the notification event.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.undefined
}

object NotificationParams {
  @scala.inline
  def apply(
    identifier: String,
    alertAction: String = null,
    alertBody: String = null,
    alertLaunchImage: String = null,
    alertSubtitle: String = null,
    alertTitle: String = null,
    attachments: js.Array[UserNotificationAttachment] = null,
    badge: Int | Double = null,
    category: String = null,
    date: js.Date = null,
    region: js.Any = null,
    repeat: String = null,
    sound: String = null,
    summaryArgument: String = null,
    summaryArgumentCount: String = null,
    timezone: String = null,
    userInfo: js.Any = null
  ): NotificationParams = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (alertAction != null) __obj.updateDynamic("alertAction")(alertAction.asInstanceOf[js.Any])
    if (alertBody != null) __obj.updateDynamic("alertBody")(alertBody.asInstanceOf[js.Any])
    if (alertLaunchImage != null) __obj.updateDynamic("alertLaunchImage")(alertLaunchImage.asInstanceOf[js.Any])
    if (alertSubtitle != null) __obj.updateDynamic("alertSubtitle")(alertSubtitle.asInstanceOf[js.Any])
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (summaryArgument != null) __obj.updateDynamic("summaryArgument")(summaryArgument.asInstanceOf[js.Any])
    if (summaryArgumentCount != null) __obj.updateDynamic("summaryArgumentCount")(summaryArgumentCount.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationParams]
  }
}

