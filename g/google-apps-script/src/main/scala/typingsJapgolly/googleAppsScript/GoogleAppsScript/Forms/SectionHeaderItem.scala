package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout item that visually indicates the start of a section. Items can be accessed or created
  * from a Form.
  *
  *     // Open a form by ID and add a new section header.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addSectionHeaderItem();
  *     item.setTitle('Title of new section');
  */
trait SectionHeaderItem extends StObject {
  
  def duplicate(): SectionHeaderItem
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def setHelpText(text: String): SectionHeaderItem
  
  def setTitle(title: String): SectionHeaderItem
}
object SectionHeaderItem {
  
  inline def apply(
    duplicate: CallbackTo[SectionHeaderItem],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    setHelpText: String => SectionHeaderItem,
    setTitle: String => SectionHeaderItem
  ): SectionHeaderItem = {
    val __obj = js.Dynamic.literal(duplicate = duplicate.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[SectionHeaderItem]
  }
  
  extension [Self <: SectionHeaderItem](x: Self) {
    
    inline def setDuplicate(value: CallbackTo[SectionHeaderItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetHelpText(value: String => SectionHeaderItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => SectionHeaderItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
