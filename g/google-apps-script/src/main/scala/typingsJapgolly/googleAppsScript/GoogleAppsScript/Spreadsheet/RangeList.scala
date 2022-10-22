package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import typingsJapgolly.googleAppsScript.anon.CommentsOnly
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.bottom
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.center
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.left
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.middle
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.normal
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.right
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of one or more Range instances in the same sheet. You can use this class
  * to apply operations on collections of non-adjacent ranges or cells.
  */
@js.native
trait RangeList extends StObject {
  
  def activate(): RangeList = js.native
  
  def breakApart(): RangeList = js.native
  
  def check(): RangeList = js.native
  
  def clear(): RangeList = js.native
  def clear(options: CommentsOnly): RangeList = js.native
  
  def clearContent(): RangeList = js.native
  
  def clearDataValidations(): RangeList = js.native
  
  def clearFormat(): RangeList = js.native
  
  def clearNote(): RangeList = js.native
  
  def getRanges(): js.Array[Range] = js.native
  
  def insertCheckboxes(): RangeList = js.native
  def insertCheckboxes(checkedValue: Any): RangeList = js.native
  def insertCheckboxes(checkedValue: Any, uncheckedValue: Any): RangeList = js.native
  
  def removeCheckboxes(): RangeList = js.native
  
  def setBackground(): RangeList = js.native
  def setBackground(color: String): RangeList = js.native
  
  def setBackgroundRGB(red: Integer, green: Integer, blue: Integer): RangeList = js.native
  
  def setBorder(
    top: Boolean | Null,
    left: Boolean | Null,
    bottom: Boolean | Null,
    right: Boolean | Null,
    vertical: Boolean | Null,
    horizontal: Boolean | Null
  ): RangeList = js.native
  def setBorder(
    top: Boolean | Null,
    left: Boolean | Null,
    bottom: Boolean | Null,
    right: Boolean | Null,
    vertical: Boolean | Null,
    horizontal: Boolean | Null,
    color: String | Null,
    style: BorderStyle | Null
  ): RangeList = js.native
  
  def setFontColor(): RangeList = js.native
  def setFontColor(color: String): RangeList = js.native
  
  def setFontFamily(): RangeList = js.native
  def setFontFamily(fontFamily: String): RangeList = js.native
  
  def setFontLine(): RangeList = js.native
  def setFontLine(fontLine: FontLine): RangeList = js.native
  
  def setFontSize(size: Integer): RangeList = js.native
  
  def setFontStyle(): RangeList = js.native
  def setFontStyle(fontStyle: FontStyle): RangeList = js.native
  
  def setFontWeight(): RangeList = js.native
  def setFontWeight(fontWeight: FontWeight): RangeList = js.native
  
  def setFormula(formula: String): RangeList = js.native
  
  def setFormulaR1C1(formula: String): RangeList = js.native
  
  def setHorizontalAlignment(): RangeList = js.native
  def setHorizontalAlignment(alignment: left | center | normal | right): RangeList = js.native
  
  def setNote(): RangeList = js.native
  def setNote(note: String): RangeList = js.native
  
  def setNumberFormat(numberFormat: String): RangeList = js.native
  
  def setShowHyperlink(showHyperlink: Boolean): RangeList = js.native
  
  def setTextDirection(): RangeList = js.native
  def setTextDirection(direction: TextDirection): RangeList = js.native
  
  def setTextRotation(degrees: Integer): RangeList = js.native
  
  def setValue(value: Any): RangeList = js.native
  
  def setVerticalAlignment(): RangeList = js.native
  def setVerticalAlignment(alignment: top | middle | bottom): RangeList = js.native
  
  def setVerticalText(isVertical: Boolean): RangeList = js.native
  
  def setWrap(isWrapEnabled: Boolean): RangeList = js.native
  
  def setWrapStrategy(strategy: WrapStrategy): RangeList = js.native
  
  def trimWhitespace(): RangeList = js.native
  
  def uncheck(): RangeList = js.native
}
