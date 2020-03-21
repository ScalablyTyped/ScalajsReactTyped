package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic form item that contains properties common to all items, such as title and help text.
  * Items can be accessed or created from a Form.
  *
  * To operate on type-specific properties, use getType() to check the item's ItemType, then cast the item to the
  * appropriate class using a method like asCheckboxItem().
  *
  *     // Create a new form and add a text item.
  *     var form = FormApp.create('Form Name');
  *     form.addTextItem();
  *
  *     // Access the text item as a generic item.
  *     var items = form.getItems();
  *     var item = items[0];
  *
  *     // Cast the generic item to the text-item class.
  *     if (item.getType() == 'TEXT') {
  *       var textItem = item.asTextItem();
  *       textItem.setRequired(false);
  *     }
  *
  * Implementing classes
  *
  * NameBrief description
  */
trait Item extends js.Object {
  def asCheckboxGridItem(): CheckboxGridItem
  def asCheckboxItem(): CheckboxItem
  def asDateItem(): DateItem
  def asDateTimeItem(): DateTimeItem
  def asDurationItem(): DurationItem
  def asGridItem(): GridItem
  def asImageItem(): ImageItem
  def asListItem(): ListItem
  def asMultipleChoiceItem(): MultipleChoiceItem
  def asPageBreakItem(): PageBreakItem
  def asParagraphTextItem(): ParagraphTextItem
  def asScaleItem(): ScaleItem
  def asSectionHeaderItem(): SectionHeaderItem
  def asTextItem(): TextItem
  def asTimeItem(): TimeItem
  def asVideoItem(): VideoItem
  def duplicate(): Item
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def setHelpText(text: String): Item
  def setTitle(title: String): Item
}

object Item {
  @scala.inline
  def apply(
    asCheckboxGridItem: CallbackTo[CheckboxGridItem],
    asCheckboxItem: CallbackTo[CheckboxItem],
    asDateItem: CallbackTo[DateItem],
    asDateTimeItem: CallbackTo[DateTimeItem],
    asDurationItem: CallbackTo[DurationItem],
    asGridItem: CallbackTo[GridItem],
    asImageItem: CallbackTo[ImageItem],
    asListItem: CallbackTo[ListItem],
    asMultipleChoiceItem: CallbackTo[MultipleChoiceItem],
    asPageBreakItem: CallbackTo[PageBreakItem],
    asParagraphTextItem: CallbackTo[ParagraphTextItem],
    asScaleItem: CallbackTo[ScaleItem],
    asSectionHeaderItem: CallbackTo[SectionHeaderItem],
    asTextItem: CallbackTo[TextItem],
    asTimeItem: CallbackTo[TimeItem],
    asVideoItem: CallbackTo[VideoItem],
    duplicate: CallbackTo[Item],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    setHelpText: String => CallbackTo[Item],
    setTitle: String => CallbackTo[Item]
  ): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCheckboxGridItem")(asCheckboxGridItem.toJsFn)
    __obj.updateDynamic("asCheckboxItem")(asCheckboxItem.toJsFn)
    __obj.updateDynamic("asDateItem")(asDateItem.toJsFn)
    __obj.updateDynamic("asDateTimeItem")(asDateTimeItem.toJsFn)
    __obj.updateDynamic("asDurationItem")(asDurationItem.toJsFn)
    __obj.updateDynamic("asGridItem")(asGridItem.toJsFn)
    __obj.updateDynamic("asImageItem")(asImageItem.toJsFn)
    __obj.updateDynamic("asListItem")(asListItem.toJsFn)
    __obj.updateDynamic("asMultipleChoiceItem")(asMultipleChoiceItem.toJsFn)
    __obj.updateDynamic("asPageBreakItem")(asPageBreakItem.toJsFn)
    __obj.updateDynamic("asParagraphTextItem")(asParagraphTextItem.toJsFn)
    __obj.updateDynamic("asScaleItem")(asScaleItem.toJsFn)
    __obj.updateDynamic("asSectionHeaderItem")(asSectionHeaderItem.toJsFn)
    __obj.updateDynamic("asTextItem")(asTextItem.toJsFn)
    __obj.updateDynamic("asTimeItem")(asTimeItem.toJsFn)
    __obj.updateDynamic("asVideoItem")(asVideoItem.toJsFn)
    __obj.updateDynamic("duplicate")(duplicate.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[Item]
  }
}

