package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Item extends StObject {
  
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
  
  inline def apply(
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
    setHelpText: String => Item,
    setTitle: String => Item
  ): Item = {
    val __obj = js.Dynamic.literal(asCheckboxGridItem = asCheckboxGridItem.toJsFn, asCheckboxItem = asCheckboxItem.toJsFn, asDateItem = asDateItem.toJsFn, asDateTimeItem = asDateTimeItem.toJsFn, asDurationItem = asDurationItem.toJsFn, asGridItem = asGridItem.toJsFn, asImageItem = asImageItem.toJsFn, asListItem = asListItem.toJsFn, asMultipleChoiceItem = asMultipleChoiceItem.toJsFn, asPageBreakItem = asPageBreakItem.toJsFn, asParagraphTextItem = asParagraphTextItem.toJsFn, asScaleItem = asScaleItem.toJsFn, asSectionHeaderItem = asSectionHeaderItem.toJsFn, asTextItem = asTextItem.toJsFn, asTimeItem = asTimeItem.toJsFn, asVideoItem = asVideoItem.toJsFn, duplicate = duplicate.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setAsCheckboxGridItem(value: CallbackTo[CheckboxGridItem]): Self = StObject.set(x, "asCheckboxGridItem", value.toJsFn)
    
    inline def setAsCheckboxItem(value: CallbackTo[CheckboxItem]): Self = StObject.set(x, "asCheckboxItem", value.toJsFn)
    
    inline def setAsDateItem(value: CallbackTo[DateItem]): Self = StObject.set(x, "asDateItem", value.toJsFn)
    
    inline def setAsDateTimeItem(value: CallbackTo[DateTimeItem]): Self = StObject.set(x, "asDateTimeItem", value.toJsFn)
    
    inline def setAsDurationItem(value: CallbackTo[DurationItem]): Self = StObject.set(x, "asDurationItem", value.toJsFn)
    
    inline def setAsGridItem(value: CallbackTo[GridItem]): Self = StObject.set(x, "asGridItem", value.toJsFn)
    
    inline def setAsImageItem(value: CallbackTo[ImageItem]): Self = StObject.set(x, "asImageItem", value.toJsFn)
    
    inline def setAsListItem(value: CallbackTo[ListItem]): Self = StObject.set(x, "asListItem", value.toJsFn)
    
    inline def setAsMultipleChoiceItem(value: CallbackTo[MultipleChoiceItem]): Self = StObject.set(x, "asMultipleChoiceItem", value.toJsFn)
    
    inline def setAsPageBreakItem(value: CallbackTo[PageBreakItem]): Self = StObject.set(x, "asPageBreakItem", value.toJsFn)
    
    inline def setAsParagraphTextItem(value: CallbackTo[ParagraphTextItem]): Self = StObject.set(x, "asParagraphTextItem", value.toJsFn)
    
    inline def setAsScaleItem(value: CallbackTo[ScaleItem]): Self = StObject.set(x, "asScaleItem", value.toJsFn)
    
    inline def setAsSectionHeaderItem(value: CallbackTo[SectionHeaderItem]): Self = StObject.set(x, "asSectionHeaderItem", value.toJsFn)
    
    inline def setAsTextItem(value: CallbackTo[TextItem]): Self = StObject.set(x, "asTextItem", value.toJsFn)
    
    inline def setAsTimeItem(value: CallbackTo[TimeItem]): Self = StObject.set(x, "asTimeItem", value.toJsFn)
    
    inline def setAsVideoItem(value: CallbackTo[VideoItem]): Self = StObject.set(x, "asVideoItem", value.toJsFn)
    
    inline def setDuplicate(value: CallbackTo[Item]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetHelpText(value: String => Item): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Item): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
