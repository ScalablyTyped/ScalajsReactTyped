package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows inserting and appending text content. */
trait XTextContentAppend
  extends StObject
     with XInterface {
  
  /**
    * appends a text content at the end of the text. <p> The sequence can contain all the properties defined by the service
    *
    * Paragraph.
    * @param TextContent contains the object to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @returns the anchor text range of the inserted text content.
    */
  def appendTextContent(TextContent: XTextContent, CharacterAndParagraphProperties: PropertyValues): XTextRange
  
  /**
    * inserts a text content at the given position.
    * @param TextContent contains the object to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange insert position
    * @returns the anchor text range of the inserted text content.
    * @since LibreOffice 4.0
    */
  def insertTextContentWithProperties(TextContent: XTextContent, CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange
}
object XTextContentAppend {
  
  inline def apply(
    acquire: Callback,
    appendTextContent: (XTextContent, PropertyValues) => XTextRange,
    insertTextContentWithProperties: (XTextContent, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => Any,
    release: Callback
  ): XTextContentAppend = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, appendTextContent = js.Any.fromFunction2(appendTextContent), insertTextContentWithProperties = js.Any.fromFunction3(insertTextContentWithProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextContentAppend]
  }
  
  extension [Self <: XTextContentAppend](x: Self) {
    
    inline def setAppendTextContent(value: (XTextContent, PropertyValues) => XTextRange): Self = StObject.set(x, "appendTextContent", js.Any.fromFunction2(value))
    
    inline def setInsertTextContentWithProperties(value: (XTextContent, PropertyValues, XTextRange) => XTextRange): Self = StObject.set(x, "insertTextContentWithProperties", js.Any.fromFunction3(value))
  }
}
