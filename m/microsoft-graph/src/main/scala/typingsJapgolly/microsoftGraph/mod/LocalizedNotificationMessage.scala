package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedNotificationMessage extends Entity {
  /**
    * Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset,
    * set this property to true on another Localized Notification Message.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // The Locale for which this message is destined.
  var locale: js.UndefOr[String] = js.undefined
  // The Message Template content.
  var messageTemplate: js.UndefOr[String] = js.undefined
  // The Message Template Subject.
  var subject: js.UndefOr[String] = js.undefined
}

object LocalizedNotificationMessage {
  @scala.inline
  def apply(
    id: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    locale: String = null,
    messageTemplate: String = null,
    subject: String = null
  ): LocalizedNotificationMessage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedNotificationMessage]
  }
}

