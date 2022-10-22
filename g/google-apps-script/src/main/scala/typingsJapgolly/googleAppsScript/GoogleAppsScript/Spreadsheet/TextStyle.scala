package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rendered style of text in a cell.
  *
  * Text styles can have a corresponding RichTextValue. If the RichTextValue spans multiple text runs that have different values for a given text style read
  * method, the method returns null. To avoid this, query for text styles using the Rich Text
  * values returned by the RichTextValue.getRuns() method.
  */
trait TextStyle extends StObject {
  
  def copy(): TextStyleBuilder
  
  def getFontFamily(): String | Null
  
  def getFontSize(): Integer | Null
  
  def getForegroundColor(): String | Null
  
  def getForegroundColorObject(): Color | Null
  
  def isBold(): Boolean | Null
  
  def isItalic(): Boolean | Null
  
  def isStrikethrough(): Boolean | Null
  
  def isUnderline(): Boolean | Null
}
object TextStyle {
  
  inline def apply(
    copy: CallbackTo[TextStyleBuilder],
    getFontFamily: CallbackTo[String | Null],
    getFontSize: CallbackTo[Integer | Null],
    getForegroundColor: CallbackTo[String | Null],
    getForegroundColorObject: CallbackTo[Color | Null],
    isBold: CallbackTo[Boolean | Null],
    isItalic: CallbackTo[Boolean | Null],
    isStrikethrough: CallbackTo[Boolean | Null],
    isUnderline: CallbackTo[Boolean | Null]
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, getFontFamily = getFontFamily.toJsFn, getFontSize = getFontSize.toJsFn, getForegroundColor = getForegroundColor.toJsFn, getForegroundColorObject = getForegroundColorObject.toJsFn, isBold = isBold.toJsFn, isItalic = isItalic.toJsFn, isStrikethrough = isStrikethrough.toJsFn, isUnderline = isUnderline.toJsFn)
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setCopy(value: CallbackTo[TextStyleBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetFontFamily(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFontFamily", value.toJsFn)
    
    inline def setGetFontSize(value: CallbackTo[Integer | Null]): Self = StObject.set(x, "getFontSize", value.toJsFn)
    
    inline def setGetForegroundColor(value: CallbackTo[String | Null]): Self = StObject.set(x, "getForegroundColor", value.toJsFn)
    
    inline def setGetForegroundColorObject(value: CallbackTo[Color | Null]): Self = StObject.set(x, "getForegroundColorObject", value.toJsFn)
    
    inline def setIsBold(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "isBold", value.toJsFn)
    
    inline def setIsItalic(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "isItalic", value.toJsFn)
    
    inline def setIsStrikethrough(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "isStrikethrough", value.toJsFn)
    
    inline def setIsUnderline(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "isUnderline", value.toJsFn)
  }
}
