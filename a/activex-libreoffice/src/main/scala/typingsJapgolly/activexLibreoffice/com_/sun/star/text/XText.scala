package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends a {@link XSimpleText} by the capability of inserting XTextContents. */
trait XText
  extends StObject
     with XSimpleText {
  
  /**
    * inserts a content, such as a text table, text frame or text field.
    *
    * Which contents are accepted is implementation-specific. Some implementations may only accept contents which were created by the factory that supplied
    * the same text or the document which contains the text.
    * @param xRange specifies the position of insertion.
    * @param xContent the text content to be inserted.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **xConten
    */
  def insertTextContent(xRange: XTextRange, xContent: XTextContent, bAbsorb: Boolean): Unit
  
  /**
    * removes the specified content from the text object.
    * @param xContent the content that is to be removed.
    */
  def removeTextContent(xContent: XTextContent): Unit
}
object XText {
  
  inline def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: Callback,
    createTextCursor: CallbackTo[XTextCursor],
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: CallbackTo[XTextRange],
    getStart: CallbackTo[XTextRange],
    getString: CallbackTo[String],
    getText: CallbackTo[XText],
    insertControlCharacter: (XTextRange, Double, Boolean) => Callback,
    insertString: (XTextRange, String, Boolean) => Callback,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeTextContent: XTextContent => Callback,
    setString: String => Callback
  ): XText = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, createTextCursor = createTextCursor.toJsFn, createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, insertControlCharacter = js.Any.fromFunction3((t0: XTextRange, t1: Double, t2: Boolean) => (insertControlCharacter(t0, t1, t2)).runNow()), insertString = js.Any.fromFunction3((t0: XTextRange, t1: String, t2: Boolean) => (insertString(t0, t1, t2)).runNow()), insertTextContent = js.Any.fromFunction3((t0: XTextRange, t1: XTextContent, t2: Boolean) => (insertTextContent(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTextContent = js.Any.fromFunction1((t0: XTextContent) => removeTextContent(t0).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XText]
  }
  
  extension [Self <: XText](x: Self) {
    
    inline def setInsertTextContent(value: (XTextRange, XTextContent, Boolean) => Callback): Self = StObject.set(x, "insertTextContent", js.Any.fromFunction3((t0: XTextRange, t1: XTextContent, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveTextContent(value: XTextContent => Callback): Self = StObject.set(x, "removeTextContent", js.Any.fromFunction1((t0: XTextContent) => value(t0).runNow()))
  }
}
