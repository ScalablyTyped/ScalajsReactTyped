package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an independent piece of text which consists of a series of one or more paragraphs.
  *
  * This service is used, for example, for the text of a {@link TextDocument} or the text in a cell or {@link TextFrame} .
  * @see com.sun.star.text.TextDocument
  * @see com.sun.star.text.TextFrame
  * @see com.sun.star.table.Cell
  */
trait Text
  extends StObject
     with XEnumerationAccess
     with XText
     with XTextRangeCompare
     with XTextRangeMover
     with XRelativeTextContentInsert {
  
  /**
    * contains the properties of a redline at the start of the document. The sequence contains the following properties
    *
    * string RedlineAuthor
    *
    *
    *
    * {@link com.sun.star.util.DateTime} RedlineDate_Time
    *
    *
    *
    * string RedlineComment
    *
    *
    *
    * string RedlineType
    *
    *
    *
    * string RedlineIdentifier
    *
    *
    *
    * boolean IsCollapsed
    *
    *
    *
    * boolean IsStart
    *
    *
    *
    * boolean MergeLastPara
    *
    *
    *
    * [maybevoid] {@link com.sun.star.text.XText} RedlineText (maybevoid)
    *
    *
    *
    * {@link com.sun.star.beans.PropertyValues} RedlineSuccessorData (contains the same properties except for the RedlineSuccessorData)
    * @see StartRedline
    */
  var EndRedline: PropertyValues
  
  /**
    * contains the properties of a redline at the start of the document. ;  The sequence contains the following properties
    *
    * string RedlineAuthor
    *
    *
    *
    * {@link com.sun.star.util.DateTime} RedlineDate_Time
    *
    *
    *
    * string RedlineComment
    *
    *
    *
    * string RedlineType
    *
    *
    *
    * string RedlineIdentifier
    *
    *
    *
    * boolean IsCollapsed
    *
    *
    *
    * boolean IsStart
    *
    *
    *
    * boolean MergeLastPara
    *
    *
    *
    * [maybevoid] {@link com.sun.star.text.XText} RedlineText (maybevoid)
    *
    *
    *
    * {@link com.sun.star.beans.PropertyValues} RedlineSuccessorData (contains the same properties except for the RedlineSuccessorData)
    * @see EndRedline
    */
  var StartRedline: PropertyValues
}
object Text {
  
  inline def apply(
    ElementType: `type`,
    End: XTextRange,
    EndRedline: PropertyValues,
    Start: XTextRange,
    StartRedline: PropertyValues,
    String: String,
    acquire: Callback,
    compareRegionEnds: (XTextRange, XTextRange) => Double,
    compareRegionStarts: (XTextRange, XTextRange) => Double,
    createEnumeration: CallbackTo[XEnumeration],
    createTextCursor: CallbackTo[XTextCursor],
    createTextCursorByRange: XTextRange => XTextCursor,
    getElementType: CallbackTo[`type`],
    getEnd: CallbackTo[XTextRange],
    getStart: CallbackTo[XTextRange],
    getString: CallbackTo[String],
    getText: CallbackTo[XText],
    hasElements: CallbackTo[Boolean],
    insertControlCharacter: (XTextRange, Double, Boolean) => Callback,
    insertString: (XTextRange, String, Boolean) => Callback,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Callback,
    insertTextContentAfter: (XTextContent, XTextContent) => Callback,
    insertTextContentBefore: (XTextContent, XTextContent) => Callback,
    moveTextRange: (XTextRange, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeTextContent: XTextContent => Callback,
    setString: String => Callback
  ): Text = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndRedline = EndRedline.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], StartRedline = StartRedline.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, compareRegionEnds = js.Any.fromFunction2(compareRegionEnds), compareRegionStarts = js.Any.fromFunction2(compareRegionStarts), createEnumeration = createEnumeration.toJsFn, createTextCursor = createTextCursor.toJsFn, createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getElementType = getElementType.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, hasElements = hasElements.toJsFn, insertControlCharacter = js.Any.fromFunction3((t0: XTextRange, t1: Double, t2: Boolean) => (insertControlCharacter(t0, t1, t2)).runNow()), insertString = js.Any.fromFunction3((t0: XTextRange, t1: String, t2: Boolean) => (insertString(t0, t1, t2)).runNow()), insertTextContent = js.Any.fromFunction3((t0: XTextRange, t1: XTextContent, t2: Boolean) => (insertTextContent(t0, t1, t2)).runNow()), insertTextContentAfter = js.Any.fromFunction2((t0: XTextContent, t1: XTextContent) => (insertTextContentAfter(t0, t1)).runNow()), insertTextContentBefore = js.Any.fromFunction2((t0: XTextContent, t1: XTextContent) => (insertTextContentBefore(t0, t1)).runNow()), moveTextRange = js.Any.fromFunction2((t0: XTextRange, t1: Double) => (moveTextRange(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTextContent = js.Any.fromFunction1((t0: XTextContent) => removeTextContent(t0).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setEndRedline(value: PropertyValues): Self = StObject.set(x, "EndRedline", value.asInstanceOf[js.Any])
    
    inline def setEndRedlineVarargs(value: PropertyValue*): Self = StObject.set(x, "EndRedline", js.Array(value*))
    
    inline def setStartRedline(value: PropertyValues): Self = StObject.set(x, "StartRedline", value.asInstanceOf[js.Any])
    
    inline def setStartRedlineVarargs(value: PropertyValue*): Self = StObject.set(x, "StartRedline", js.Array(value*))
  }
}
