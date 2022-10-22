package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CardService extends StObject {
  
  var BorderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderType */ Any
  
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ Any
  
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any
  
  var DisplayStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayStyle */ Any
  
  var GridItemLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridItemLayout */ Any
  
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any
  
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any
  
  var ImageCropType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageCropType */ Any
  
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ Any
  
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ Any
  
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ Any
  
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ Any
  
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ Any
  
  var SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ Any
  
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ Any
  
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ Any
  
  def newAction(): Action
  
  def newActionResponseBuilder(): ActionResponseBuilder
  
  def newAttachment(): Attachment
  
  def newAuthorizationAction(): AuthorizationAction
  
  def newAuthorizationException(): AuthorizationException
  
  /**
    * Creates a new BorderStyle.
    */
  def newBorderStyle(): BorderStyle
  
  def newButtonSet(): ButtonSet
  
  def newCalendarEventActionResponseBuilder(): CalendarEventActionResponseBuilder
  
  def newCardAction(): CardAction
  
  def newCardBuilder(): CardBuilder
  
  def newCardHeader(): CardHeader
  
  def newCardSection(): CardSection
  
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder
  
  def newDatePicker(): DatePicker
  
  def newDateTimePicker(): DateTimePicker
  
  def newDecoratedText(): DecoratedText
  
  def newDivider(): Divider
  
  def newDriveItemsSelectedActionResponseBuilder(): DriveItemsSelectedActionResponseBuilder
  
  /**
    * Creates a new EditorFileScopeActionResponseBuilder.
    */
  def newEditorFileScopeActionResponseBuilder(): EditorFileScopeActionResponseBuilder
  
  def newFixedFooter(): FixedFooter
  
  /**
    * Creates a new Grid
    */
  def newGrid(): Grid
  
  /**
    * Creates a new GridItem.
    */
  def newGridItem(): GridItem
  
  def newIconImage(): IconImage
  
  def newImage(): Image
  
  def newImageButton(): ImageButton
  
  /**
    * Creates a new ImageComponent.
    */
  def newImageComponent(): ImageComponent
  
  /**
    * Creates a new ImageCropStyle.
    */
  def newImageCropStyle(): ImageCropStyle
  
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
  
  def newTimePicker(): TimePicker
  
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder
  
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder
  
  def newUpdateDraftBccRecipientsAction(): UpdateDraftBccRecipientsAction
  
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction
  
  def newUpdateDraftCcRecipientsAction(): UpdateDraftCcRecipientsAction
  
  def newUpdateDraftSubjectAction(): UpdateDraftSubjectAction
  
  def newUpdateDraftToRecipientsAction(): UpdateDraftToRecipientsAction
}
object CardService {
  
  inline def apply(
    BorderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderType */ Any,
    ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ Any,
    ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any,
    DisplayStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayStyle */ Any,
    GridItemLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridItemLayout */ Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any,
    Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any,
    ImageCropType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageCropType */ Any,
    ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ Any,
    LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ Any,
    OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ Any,
    OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ Any,
    SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ Any,
    SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ Any,
    TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ Any,
    UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ Any,
    newAction: CallbackTo[Action],
    newActionResponseBuilder: CallbackTo[ActionResponseBuilder],
    newAttachment: CallbackTo[Attachment],
    newAuthorizationAction: CallbackTo[AuthorizationAction],
    newAuthorizationException: CallbackTo[AuthorizationException],
    newBorderStyle: CallbackTo[BorderStyle],
    newButtonSet: CallbackTo[ButtonSet],
    newCalendarEventActionResponseBuilder: CallbackTo[CalendarEventActionResponseBuilder],
    newCardAction: CallbackTo[CardAction],
    newCardBuilder: CallbackTo[CardBuilder],
    newCardHeader: CallbackTo[CardHeader],
    newCardSection: CallbackTo[CardSection],
    newComposeActionResponseBuilder: CallbackTo[ComposeActionResponseBuilder],
    newDatePicker: CallbackTo[DatePicker],
    newDateTimePicker: CallbackTo[DateTimePicker],
    newDecoratedText: CallbackTo[DecoratedText],
    newDivider: CallbackTo[Divider],
    newDriveItemsSelectedActionResponseBuilder: CallbackTo[DriveItemsSelectedActionResponseBuilder],
    newEditorFileScopeActionResponseBuilder: CallbackTo[EditorFileScopeActionResponseBuilder],
    newFixedFooter: CallbackTo[FixedFooter],
    newGrid: CallbackTo[Grid],
    newGridItem: CallbackTo[GridItem],
    newIconImage: CallbackTo[IconImage],
    newImage: CallbackTo[Image],
    newImageButton: CallbackTo[ImageButton],
    newImageComponent: CallbackTo[ImageComponent],
    newImageCropStyle: CallbackTo[ImageCropStyle],
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
    newTimePicker: CallbackTo[TimePicker],
    newUniversalActionResponseBuilder: CallbackTo[UniversalActionResponseBuilder],
    newUpdateDraftActionResponseBuilder: CallbackTo[UpdateDraftActionResponseBuilder],
    newUpdateDraftBccRecipientsAction: CallbackTo[UpdateDraftBccRecipientsAction],
    newUpdateDraftBodyAction: CallbackTo[UpdateDraftBodyAction],
    newUpdateDraftCcRecipientsAction: CallbackTo[UpdateDraftCcRecipientsAction],
    newUpdateDraftSubjectAction: CallbackTo[UpdateDraftSubjectAction],
    newUpdateDraftToRecipientsAction: CallbackTo[UpdateDraftToRecipientsAction]
  ): typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.CardService = {
    val __obj = js.Dynamic.literal(BorderType = BorderType.asInstanceOf[js.Any], ComposedEmailType = ComposedEmailType.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], GridItemLayout = GridItemLayout.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ImageCropType = ImageCropType.asInstanceOf[js.Any], ImageStyle = ImageStyle.asInstanceOf[js.Any], LoadIndicator = LoadIndicator.asInstanceOf[js.Any], OnClose = OnClose.asInstanceOf[js.Any], OpenAs = OpenAs.asInstanceOf[js.Any], SelectionInputType = SelectionInputType.asInstanceOf[js.Any], SwitchControlType = SwitchControlType.asInstanceOf[js.Any], TextButtonStyle = TextButtonStyle.asInstanceOf[js.Any], UpdateDraftBodyType = UpdateDraftBodyType.asInstanceOf[js.Any], newAction = newAction.toJsFn, newActionResponseBuilder = newActionResponseBuilder.toJsFn, newAttachment = newAttachment.toJsFn, newAuthorizationAction = newAuthorizationAction.toJsFn, newAuthorizationException = newAuthorizationException.toJsFn, newBorderStyle = newBorderStyle.toJsFn, newButtonSet = newButtonSet.toJsFn, newCalendarEventActionResponseBuilder = newCalendarEventActionResponseBuilder.toJsFn, newCardAction = newCardAction.toJsFn, newCardBuilder = newCardBuilder.toJsFn, newCardHeader = newCardHeader.toJsFn, newCardSection = newCardSection.toJsFn, newComposeActionResponseBuilder = newComposeActionResponseBuilder.toJsFn, newDatePicker = newDatePicker.toJsFn, newDateTimePicker = newDateTimePicker.toJsFn, newDecoratedText = newDecoratedText.toJsFn, newDivider = newDivider.toJsFn, newDriveItemsSelectedActionResponseBuilder = newDriveItemsSelectedActionResponseBuilder.toJsFn, newEditorFileScopeActionResponseBuilder = newEditorFileScopeActionResponseBuilder.toJsFn, newFixedFooter = newFixedFooter.toJsFn, newGrid = newGrid.toJsFn, newGridItem = newGridItem.toJsFn, newIconImage = newIconImage.toJsFn, newImage = newImage.toJsFn, newImageButton = newImageButton.toJsFn, newImageComponent = newImageComponent.toJsFn, newImageCropStyle = newImageCropStyle.toJsFn, newKeyValue = newKeyValue.toJsFn, newNavigation = newNavigation.toJsFn, newNotification = newNotification.toJsFn, newOpenLink = newOpenLink.toJsFn, newSelectionInput = newSelectionInput.toJsFn, newSuggestions = newSuggestions.toJsFn, newSuggestionsResponseBuilder = newSuggestionsResponseBuilder.toJsFn, newSwitch = newSwitch.toJsFn, newTextButton = newTextButton.toJsFn, newTextInput = newTextInput.toJsFn, newTextParagraph = newTextParagraph.toJsFn, newTimePicker = newTimePicker.toJsFn, newUniversalActionResponseBuilder = newUniversalActionResponseBuilder.toJsFn, newUpdateDraftActionResponseBuilder = newUpdateDraftActionResponseBuilder.toJsFn, newUpdateDraftBccRecipientsAction = newUpdateDraftBccRecipientsAction.toJsFn, newUpdateDraftBodyAction = newUpdateDraftBodyAction.toJsFn, newUpdateDraftCcRecipientsAction = newUpdateDraftCcRecipientsAction.toJsFn, newUpdateDraftSubjectAction = newUpdateDraftSubjectAction.toJsFn, newUpdateDraftToRecipientsAction = newUpdateDraftToRecipientsAction.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.CardService]
  }
  
  extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.CardService](x: Self) {
    
    inline def setBorderType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderType */ Any): Self = StObject.set(x, "BorderType", value.asInstanceOf[js.Any])
    
    inline def setComposedEmailType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ Any
    ): Self = StObject.set(x, "ComposedEmailType", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayStyle */ Any): Self = StObject.set(x, "DisplayStyle", value.asInstanceOf[js.Any])
    
    inline def setGridItemLayout(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridItemLayout */ Any): Self = StObject.set(x, "GridItemLayout", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any
    ): Self = StObject.set(x, "HorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setImageCropType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageCropType */ Any): Self = StObject.set(x, "ImageCropType", value.asInstanceOf[js.Any])
    
    inline def setImageStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ Any): Self = StObject.set(x, "ImageStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicator(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ Any): Self = StObject.set(x, "LoadIndicator", value.asInstanceOf[js.Any])
    
    inline def setNewAction(value: CallbackTo[Action]): Self = StObject.set(x, "newAction", value.toJsFn)
    
    inline def setNewActionResponseBuilder(value: CallbackTo[ActionResponseBuilder]): Self = StObject.set(x, "newActionResponseBuilder", value.toJsFn)
    
    inline def setNewAttachment(value: CallbackTo[Attachment]): Self = StObject.set(x, "newAttachment", value.toJsFn)
    
    inline def setNewAuthorizationAction(value: CallbackTo[AuthorizationAction]): Self = StObject.set(x, "newAuthorizationAction", value.toJsFn)
    
    inline def setNewAuthorizationException(value: CallbackTo[AuthorizationException]): Self = StObject.set(x, "newAuthorizationException", value.toJsFn)
    
    inline def setNewBorderStyle(value: CallbackTo[BorderStyle]): Self = StObject.set(x, "newBorderStyle", value.toJsFn)
    
    inline def setNewButtonSet(value: CallbackTo[ButtonSet]): Self = StObject.set(x, "newButtonSet", value.toJsFn)
    
    inline def setNewCalendarEventActionResponseBuilder(value: CallbackTo[CalendarEventActionResponseBuilder]): Self = StObject.set(x, "newCalendarEventActionResponseBuilder", value.toJsFn)
    
    inline def setNewCardAction(value: CallbackTo[CardAction]): Self = StObject.set(x, "newCardAction", value.toJsFn)
    
    inline def setNewCardBuilder(value: CallbackTo[CardBuilder]): Self = StObject.set(x, "newCardBuilder", value.toJsFn)
    
    inline def setNewCardHeader(value: CallbackTo[CardHeader]): Self = StObject.set(x, "newCardHeader", value.toJsFn)
    
    inline def setNewCardSection(value: CallbackTo[CardSection]): Self = StObject.set(x, "newCardSection", value.toJsFn)
    
    inline def setNewComposeActionResponseBuilder(value: CallbackTo[ComposeActionResponseBuilder]): Self = StObject.set(x, "newComposeActionResponseBuilder", value.toJsFn)
    
    inline def setNewDatePicker(value: CallbackTo[DatePicker]): Self = StObject.set(x, "newDatePicker", value.toJsFn)
    
    inline def setNewDateTimePicker(value: CallbackTo[DateTimePicker]): Self = StObject.set(x, "newDateTimePicker", value.toJsFn)
    
    inline def setNewDecoratedText(value: CallbackTo[DecoratedText]): Self = StObject.set(x, "newDecoratedText", value.toJsFn)
    
    inline def setNewDivider(value: CallbackTo[Divider]): Self = StObject.set(x, "newDivider", value.toJsFn)
    
    inline def setNewDriveItemsSelectedActionResponseBuilder(value: CallbackTo[DriveItemsSelectedActionResponseBuilder]): Self = StObject.set(x, "newDriveItemsSelectedActionResponseBuilder", value.toJsFn)
    
    inline def setNewEditorFileScopeActionResponseBuilder(value: CallbackTo[EditorFileScopeActionResponseBuilder]): Self = StObject.set(x, "newEditorFileScopeActionResponseBuilder", value.toJsFn)
    
    inline def setNewFixedFooter(value: CallbackTo[FixedFooter]): Self = StObject.set(x, "newFixedFooter", value.toJsFn)
    
    inline def setNewGrid(value: CallbackTo[Grid]): Self = StObject.set(x, "newGrid", value.toJsFn)
    
    inline def setNewGridItem(value: CallbackTo[GridItem]): Self = StObject.set(x, "newGridItem", value.toJsFn)
    
    inline def setNewIconImage(value: CallbackTo[IconImage]): Self = StObject.set(x, "newIconImage", value.toJsFn)
    
    inline def setNewImage(value: CallbackTo[Image]): Self = StObject.set(x, "newImage", value.toJsFn)
    
    inline def setNewImageButton(value: CallbackTo[ImageButton]): Self = StObject.set(x, "newImageButton", value.toJsFn)
    
    inline def setNewImageComponent(value: CallbackTo[ImageComponent]): Self = StObject.set(x, "newImageComponent", value.toJsFn)
    
    inline def setNewImageCropStyle(value: CallbackTo[ImageCropStyle]): Self = StObject.set(x, "newImageCropStyle", value.toJsFn)
    
    inline def setNewKeyValue(value: CallbackTo[KeyValue]): Self = StObject.set(x, "newKeyValue", value.toJsFn)
    
    inline def setNewNavigation(value: CallbackTo[Navigation]): Self = StObject.set(x, "newNavigation", value.toJsFn)
    
    inline def setNewNotification(value: CallbackTo[Notification]): Self = StObject.set(x, "newNotification", value.toJsFn)
    
    inline def setNewOpenLink(value: CallbackTo[OpenLink]): Self = StObject.set(x, "newOpenLink", value.toJsFn)
    
    inline def setNewSelectionInput(value: CallbackTo[SelectionInput]): Self = StObject.set(x, "newSelectionInput", value.toJsFn)
    
    inline def setNewSuggestions(value: CallbackTo[Suggestions]): Self = StObject.set(x, "newSuggestions", value.toJsFn)
    
    inline def setNewSuggestionsResponseBuilder(value: CallbackTo[SuggestionsResponseBuilder]): Self = StObject.set(x, "newSuggestionsResponseBuilder", value.toJsFn)
    
    inline def setNewSwitch(value: CallbackTo[Switch]): Self = StObject.set(x, "newSwitch", value.toJsFn)
    
    inline def setNewTextButton(value: CallbackTo[TextButton]): Self = StObject.set(x, "newTextButton", value.toJsFn)
    
    inline def setNewTextInput(value: CallbackTo[TextInput]): Self = StObject.set(x, "newTextInput", value.toJsFn)
    
    inline def setNewTextParagraph(value: CallbackTo[TextParagraph]): Self = StObject.set(x, "newTextParagraph", value.toJsFn)
    
    inline def setNewTimePicker(value: CallbackTo[TimePicker]): Self = StObject.set(x, "newTimePicker", value.toJsFn)
    
    inline def setNewUniversalActionResponseBuilder(value: CallbackTo[UniversalActionResponseBuilder]): Self = StObject.set(x, "newUniversalActionResponseBuilder", value.toJsFn)
    
    inline def setNewUpdateDraftActionResponseBuilder(value: CallbackTo[UpdateDraftActionResponseBuilder]): Self = StObject.set(x, "newUpdateDraftActionResponseBuilder", value.toJsFn)
    
    inline def setNewUpdateDraftBccRecipientsAction(value: CallbackTo[UpdateDraftBccRecipientsAction]): Self = StObject.set(x, "newUpdateDraftBccRecipientsAction", value.toJsFn)
    
    inline def setNewUpdateDraftBodyAction(value: CallbackTo[UpdateDraftBodyAction]): Self = StObject.set(x, "newUpdateDraftBodyAction", value.toJsFn)
    
    inline def setNewUpdateDraftCcRecipientsAction(value: CallbackTo[UpdateDraftCcRecipientsAction]): Self = StObject.set(x, "newUpdateDraftCcRecipientsAction", value.toJsFn)
    
    inline def setNewUpdateDraftSubjectAction(value: CallbackTo[UpdateDraftSubjectAction]): Self = StObject.set(x, "newUpdateDraftSubjectAction", value.toJsFn)
    
    inline def setNewUpdateDraftToRecipientsAction(value: CallbackTo[UpdateDraftToRecipientsAction]): Self = StObject.set(x, "newUpdateDraftToRecipientsAction", value.toJsFn)
    
    inline def setOnClose(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ Any): Self = StObject.set(x, "OnClose", value.asInstanceOf[js.Any])
    
    inline def setOpenAs(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ Any): Self = StObject.set(x, "OpenAs", value.asInstanceOf[js.Any])
    
    inline def setSelectionInputType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ Any
    ): Self = StObject.set(x, "SelectionInputType", value.asInstanceOf[js.Any])
    
    inline def setSwitchControlType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ Any
    ): Self = StObject.set(x, "SwitchControlType", value.asInstanceOf[js.Any])
    
    inline def setTextButtonStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ Any
    ): Self = StObject.set(x, "TextButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDraftBodyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ Any
    ): Self = StObject.set(x, "UpdateDraftBodyType", value.asInstanceOf[js.Any])
  }
}
