package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBasicCard
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICard
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICarouselSelect
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IImage
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ILinkOutSuggestion
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IListSelect
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IQuickReplies
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISimpleResponses
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISuggestions
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IText
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typingsJapgolly.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Message. */
trait IMessage extends js.Object {
  /** Message basicCard */
  var basicCard: js.UndefOr[IBasicCard | Null] = js.undefined
  /** Message card */
  var card: js.UndefOr[ICard | Null] = js.undefined
  /** Message carouselSelect */
  var carouselSelect: js.UndefOr[ICarouselSelect | Null] = js.undefined
  /** Message image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** Message linkOutSuggestion */
  var linkOutSuggestion: js.UndefOr[ILinkOutSuggestion | Null] = js.undefined
  /** Message listSelect */
  var listSelect: js.UndefOr[IListSelect | Null] = js.undefined
  /** Message payload */
  var payload: js.UndefOr[IStruct | Null] = js.undefined
  /** Message platform */
  var platform: js.UndefOr[Platform | Null] = js.undefined
  /** Message quickReplies */
  var quickReplies: js.UndefOr[IQuickReplies | Null] = js.undefined
  /** Message simpleResponses */
  var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.undefined
  /** Message suggestions */
  var suggestions: js.UndefOr[ISuggestions | Null] = js.undefined
  /** Message text */
  var text: js.UndefOr[IText | Null] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    basicCard: IBasicCard = null,
    card: ICard = null,
    carouselSelect: ICarouselSelect = null,
    image: IImage = null,
    linkOutSuggestion: ILinkOutSuggestion = null,
    listSelect: IListSelect = null,
    payload: IStruct = null,
    platform: Platform = null,
    quickReplies: IQuickReplies = null,
    simpleResponses: ISimpleResponses = null,
    suggestions: ISuggestions = null,
    text: IText = null
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (basicCard != null) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (carouselSelect != null) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (linkOutSuggestion != null) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (listSelect != null) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

