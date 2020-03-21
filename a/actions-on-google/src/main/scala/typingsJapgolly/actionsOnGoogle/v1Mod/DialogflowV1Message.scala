package typingsJapgolly.actionsOnGoogle.v1Mod

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleNumbers.`0`
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleNumbers.`1`
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleNumbers.`2`
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleNumbers.`3`
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleNumbers.`4`
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.basic_card
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.carousel_card
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.custom_payload
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.google
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.line_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.link_out_chip
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.list_card
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.simple_response
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.suggestion_chips
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.viber_
import typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap
import typingsJapgolly.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageText
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageImage
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageCard
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageQuickReplies
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageCustomPayload
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageSimpleResponse
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageBasicCard
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageList
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageSuggestions
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageCarousel
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageLinkOut
  - typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1MessageGooglePayload
*/
trait DialogflowV1Message extends js.Object

object DialogflowV1Message {
  @scala.inline
  def DialogflowV1MessageQuickReplies(
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    replies: js.Array[String] = null,
    title: String = null,
    `type`: `2` = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageGooglePayload(platform: google, payload: ApiClientObjectMap[_] = null, `type`: custom_payload = null): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageText(
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    speech: String = null,
    `type`: `0` = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (speech != null) __obj.updateDynamic("speech")(speech.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageLinkOut(platform: google, destinationName: String = null, `type`: link_out_chip = null, url: String = null): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageCustomPayload(
    payload: JsonObject = null,
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: `4` = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageSuggestions(
    platform: google,
    suggestions: js.Array[DialogflowV1MessageSuggestion] = null,
    `type`: suggestion_chips = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageList(
    platform: google,
    items: js.Array[DialogflowV1MessageOptionItem] = null,
    title: String = null,
    `type`: list_card = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageImage(
    imageUrl: String = null,
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: `3` = null,
    url: String = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageCard(
    buttons: js.Array[DialogflowV1Button] = null,
    imageUrl: String = null,
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    subtitle: String = null,
    title: String = null,
    `type`: `1` = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageSimpleResponse(
    platform: google,
    displayText: String = null,
    textToSpeech: String = null,
    `type`: simple_response = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageBasicCard(
    platform: google,
    buttons: js.Array[DialogflowV1MessageBasicCardButton] = null,
    formattedText: String = null,
    image: DialogflowV1MessageImage = null,
    subtitle: String = null,
    title: String = null,
    `type`: basic_card = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
  @scala.inline
  def DialogflowV1MessageCarousel(
    platform: google,
    items: js.Array[DialogflowV1MessageOptionItem] = null,
    `type`: carousel_card = null
  ): DialogflowV1Message = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Message]
  }
}

