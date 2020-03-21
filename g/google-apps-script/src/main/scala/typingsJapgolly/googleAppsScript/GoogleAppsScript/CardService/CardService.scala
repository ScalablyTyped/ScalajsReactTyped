package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CardService provides the ability to create generic cards used across different Google
  * extensibility products, such as Gmail add-ons.
  *
  * Currently you can only use this service to construct Gmail add-ons.
  *
  *     return CardService.newCardBuilder()
  *              .setHeader(CardService.newCardHeader().setTitle("CardTitle"))
  *              .build();
  *
  * Or you can return multiple Cards like so:
  *
  *     return [
  *       CardService.newCardBuilder().build(),
  *       CardService.newCardBuilder().build(),
  *       CardService.newCardBuilder().build()
  *     ]
  *
  * The following shows how you could define a card with a header, text, an image and a menu item:
  *
  *     function createWidgetDemoCard() {
  *       return CardService
  *          .newCardBuilder()
  *          .setHeader(
  *              CardService.newCardHeader()
  *                  .setTitle('Widget demonstration')
  *                  .setSubtitle('Check out these widgets')
  *                  .setImageStyle(CardService.ImageStyle.SQUARE)
  *                  .setImageUrl(
  *                      'https://www.example.com/images/headerImage.png'))
  *          .addSection(
  *               CardService.newCardSection()
  *                   .setHeader('Simple widgets')  // optional
  *                   .addWidget(CardService.newTextParagraph().setText(
  *                       'These widgets are display-only. ' +
  *                       'A text paragraph can have multiple lines and ' +
  *                       'formatting.'))
  *                   .addWidget(CardService.newImage().setImageUrl(
  *                       'https://www.example.com/images/mapsImage.png')))
  *          .addCardAction(CardService.newCardAction().setText('Gmail').setOpenLink(
  *              CardService.newOpenLink().setUrl('https://mail.google.com/mail')))
  *          .build();
  *     }
  */
trait CardService extends js.Object {
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any
  def newAction(): Action
  def newActionResponseBuilder(): ActionResponseBuilder
  def newAuthorizationAction(): AuthorizationAction
  def newAuthorizationException(): AuthorizationException
  def newButtonSet(): ButtonSet
  def newCardAction(): CardAction
  def newCardBuilder(): CardBuilder
  def newCardHeader(): CardHeader
  def newCardSection(): CardSection
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder
  def newImage(): Image
  def newImageButton(): ImageButton
  def newKeyValue(): KeyValue
  def newNavigation(): Navigation
  def newNotification(): Notification
  def newOpenLink(): OpenLink
  def newSelectionInput(): SelectionInput
  def newSuggestions(): Suggestions
  def newSuggestionsResponseBuilder(): SuggestionsResponseBuilder
  def newSwitch(): Switch
  def newTextButton(): TextButton
  def newTextInput(): TextInput
  def newTextParagraph(): TextParagraph
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction
}

object CardService {
  @scala.inline
  def apply(
    ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any,
    ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any,
    Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any,
    ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any,
    LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any,
    OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any,
    OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any,
    SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any,
    TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any,
    UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any,
    newAction: CallbackTo[Action],
    newActionResponseBuilder: CallbackTo[ActionResponseBuilder],
    newAuthorizationAction: CallbackTo[AuthorizationAction],
    newAuthorizationException: CallbackTo[AuthorizationException],
    newButtonSet: CallbackTo[ButtonSet],
    newCardAction: CallbackTo[CardAction],
    newCardBuilder: CallbackTo[CardBuilder],
    newCardHeader: CallbackTo[CardHeader],
    newCardSection: CallbackTo[CardSection],
    newComposeActionResponseBuilder: CallbackTo[ComposeActionResponseBuilder],
    newImage: CallbackTo[Image],
    newImageButton: CallbackTo[ImageButton],
    newKeyValue: CallbackTo[KeyValue],
    newNavigation: CallbackTo[Navigation],
    newNotification: CallbackTo[Notification],
    newOpenLink: CallbackTo[OpenLink],
    newSelectionInput: CallbackTo[SelectionInput],
    newSuggestions: CallbackTo[Suggestions],
    newSuggestionsResponseBuilder: CallbackTo[SuggestionsResponseBuilder],
    newSwitch: CallbackTo[Switch],
    newTextButton: CallbackTo[TextButton],
    newTextInput: CallbackTo[TextInput],
    newTextParagraph: CallbackTo[TextParagraph],
    newUniversalActionResponseBuilder: CallbackTo[UniversalActionResponseBuilder],
    newUpdateDraftActionResponseBuilder: CallbackTo[UpdateDraftActionResponseBuilder],
    newUpdateDraftBodyAction: CallbackTo[UpdateDraftBodyAction]
  ): CardService = {
    val __obj = js.Dynamic.literal(ComposedEmailType = ComposedEmailType.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ImageStyle = ImageStyle.asInstanceOf[js.Any], LoadIndicator = LoadIndicator.asInstanceOf[js.Any], OnClose = OnClose.asInstanceOf[js.Any], OpenAs = OpenAs.asInstanceOf[js.Any], SelectionInputType = SelectionInputType.asInstanceOf[js.Any], TextButtonStyle = TextButtonStyle.asInstanceOf[js.Any], UpdateDraftBodyType = UpdateDraftBodyType.asInstanceOf[js.Any])
    __obj.updateDynamic("newAction")(newAction.toJsFn)
    __obj.updateDynamic("newActionResponseBuilder")(newActionResponseBuilder.toJsFn)
    __obj.updateDynamic("newAuthorizationAction")(newAuthorizationAction.toJsFn)
    __obj.updateDynamic("newAuthorizationException")(newAuthorizationException.toJsFn)
    __obj.updateDynamic("newButtonSet")(newButtonSet.toJsFn)
    __obj.updateDynamic("newCardAction")(newCardAction.toJsFn)
    __obj.updateDynamic("newCardBuilder")(newCardBuilder.toJsFn)
    __obj.updateDynamic("newCardHeader")(newCardHeader.toJsFn)
    __obj.updateDynamic("newCardSection")(newCardSection.toJsFn)
    __obj.updateDynamic("newComposeActionResponseBuilder")(newComposeActionResponseBuilder.toJsFn)
    __obj.updateDynamic("newImage")(newImage.toJsFn)
    __obj.updateDynamic("newImageButton")(newImageButton.toJsFn)
    __obj.updateDynamic("newKeyValue")(newKeyValue.toJsFn)
    __obj.updateDynamic("newNavigation")(newNavigation.toJsFn)
    __obj.updateDynamic("newNotification")(newNotification.toJsFn)
    __obj.updateDynamic("newOpenLink")(newOpenLink.toJsFn)
    __obj.updateDynamic("newSelectionInput")(newSelectionInput.toJsFn)
    __obj.updateDynamic("newSuggestions")(newSuggestions.toJsFn)
    __obj.updateDynamic("newSuggestionsResponseBuilder")(newSuggestionsResponseBuilder.toJsFn)
    __obj.updateDynamic("newSwitch")(newSwitch.toJsFn)
    __obj.updateDynamic("newTextButton")(newTextButton.toJsFn)
    __obj.updateDynamic("newTextInput")(newTextInput.toJsFn)
    __obj.updateDynamic("newTextParagraph")(newTextParagraph.toJsFn)
    __obj.updateDynamic("newUniversalActionResponseBuilder")(newUniversalActionResponseBuilder.toJsFn)
    __obj.updateDynamic("newUpdateDraftActionResponseBuilder")(newUpdateDraftActionResponseBuilder.toJsFn)
    __obj.updateDynamic("newUpdateDraftBodyAction")(newUpdateDraftBodyAction.toJsFn)
    __obj.asInstanceOf[CardService]
  }
}

