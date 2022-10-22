package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows inserting and appending formatted text portions. */
trait XTextPortionAppend
  extends StObject
     with XInterface {
  
  /**
    * appends a new text portion to the paragraph at the end of the text. <p> The sequence can contain all the properties defined by the service
    * TextPortion.
    * @param Text contains the text to be appended.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def appendTextPortion(Text: String, CharacterAndParagraphProperties: PropertyValues): XTextRange
  
  /**
    * inserts a new text portion to the paragraph at a given position. <p> The sequence can contain all the properties defined by the service TextPortion.
    * @param Text contains the text to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insert.
    * @since LibreOffice 4.0
    */
  def insertTextPortion(Text: String, CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange
}
object XTextPortionAppend {
  
  inline def apply(
    acquire: Callback,
    appendTextPortion: (String, PropertyValues) => XTextRange,
    insertTextPortion: (String, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => Any,
    release: Callback
  ): XTextPortionAppend = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, appendTextPortion = js.Any.fromFunction2(appendTextPortion), insertTextPortion = js.Any.fromFunction3(insertTextPortion), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextPortionAppend]
  }
  
  extension [Self <: XTextPortionAppend](x: Self) {
    
    inline def setAppendTextPortion(value: (String, PropertyValues) => XTextRange): Self = StObject.set(x, "appendTextPortion", js.Any.fromFunction2(value))
    
    inline def setInsertTextPortion(value: (String, PropertyValues, XTextRange) => XTextRange): Self = StObject.set(x, "insertTextPortion", js.Any.fromFunction3(value))
  }
}
