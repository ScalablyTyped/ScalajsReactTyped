package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * multiple choices per row from a sequence of checkboxes. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new checkgox grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addCheckboxGridItem();
  *     item.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  */
trait CheckboxGridItem extends StObject {
  
  def clearValidation(): CheckboxGridItem
  
  def createResponse(responses: js.Array[js.Array[String]]): ItemResponse
  
  def duplicate(): CheckboxGridItem
  
  def getColumns(): js.Array[String]
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getRows(): js.Array[String]
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def isRequired(): Boolean
  
  def setColumns(columns: js.Array[String]): CheckboxGridItem
  
  def setHelpText(text: String): CheckboxGridItem
  
  def setRequired(enabled: Boolean): CheckboxGridItem
  
  def setRows(rows: js.Array[String]): CheckboxGridItem
  
  def setTitle(title: String): CheckboxGridItem
  
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem
}
object CheckboxGridItem {
  
  inline def apply(
    clearValidation: CallbackTo[CheckboxGridItem],
    createResponse: js.Array[js.Array[String]] => ItemResponse,
    duplicate: CallbackTo[CheckboxGridItem],
    getColumns: CallbackTo[js.Array[String]],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getRows: CallbackTo[js.Array[String]],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    isRequired: CallbackTo[Boolean],
    setColumns: js.Array[String] => CheckboxGridItem,
    setHelpText: String => CheckboxGridItem,
    setRequired: Boolean => CheckboxGridItem,
    setRows: js.Array[String] => CheckboxGridItem,
    setTitle: String => CheckboxGridItem,
    setValidation: CheckboxGridValidation => CheckboxGridItem
  ): CheckboxGridItem = {
    val __obj = js.Dynamic.literal(clearValidation = clearValidation.toJsFn, createResponse = js.Any.fromFunction1(createResponse), duplicate = duplicate.toJsFn, getColumns = getColumns.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getRows = getRows.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, isRequired = isRequired.toJsFn, setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[CheckboxGridItem]
  }
  
  extension [Self <: CheckboxGridItem](x: Self) {
    
    inline def setClearValidation(value: CallbackTo[CheckboxGridItem]): Self = StObject.set(x, "clearValidation", value.toJsFn)
    
    inline def setCreateResponse(value: js.Array[js.Array[String]] => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    inline def setDuplicate(value: CallbackTo[CheckboxGridItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetColumns(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetRows(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getRows", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setSetColumns(value: js.Array[String] => CheckboxGridItem): Self = StObject.set(x, "setColumns", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => CheckboxGridItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetRequired(value: Boolean => CheckboxGridItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetRows(value: js.Array[String] => CheckboxGridItem): Self = StObject.set(x, "setRows", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => CheckboxGridItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetValidation(value: CheckboxGridValidation => CheckboxGridItem): Self = StObject.set(x, "setValidation", js.Any.fromFunction1(value))
  }
}
