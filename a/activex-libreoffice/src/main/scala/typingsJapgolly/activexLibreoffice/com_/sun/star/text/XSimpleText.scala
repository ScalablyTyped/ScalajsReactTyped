package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the main interface for a distinct text unit, i.e. the main text of a document, the text for headers and footers or for single cells of a table.
  * @see XText
  */
trait XSimpleText
  extends StObject
     with XTextRange {
  
  /**
    * @returns a new instance of a {@link TextCursor} service which can be used to travel in the given text context.
    * @see com.sun.star.text.TextCursor
    */
  def createTextCursor(): XTextCursor
  
  /**
    * @param aTextPosition specifies the start position for the new {@link TextCursor} .
    * @returns a new instance of a {@link TextCursor} which is located at the specified {@link TextRange} to travel in the given text context.  The initial posi
    * @see com.sun.star.text.TextCursor
    */
  def createTextCursorByRange(aTextPosition: XTextRange): XTextCursor
  
  /**
    * inserts a control character (like a paragraph break or a hard space) into the text.
    * @see com.sun.star.text.ControlCharacter
    */
  def insertControlCharacter(xRange: XTextRange, nControlCharacter: Double, bAbsorb: Boolean): Unit
  
  /**
    * inserts a string of characters into the text.
    *
    * The string may contain the following white spaces:
    *
    * blanktabcr (which will insert a paragraph break)lf (which will insert a line break)
    * @param xRange specifies the position of insertion. For example, {@link XSimpleText.createTextCursor()} can be used to get an {@link XTextRange} for this
    * @param aString specifies the string to insert.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **aString
    */
  def insertString(xRange: XTextRange, aString: String, bAbsorb: Boolean): Unit
}
object XSimpleText {
  
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
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XSimpleText = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, createTextCursor = createTextCursor.toJsFn, createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, insertControlCharacter = js.Any.fromFunction3((t0: XTextRange, t1: Double, t2: Boolean) => (insertControlCharacter(t0, t1, t2)).runNow()), insertString = js.Any.fromFunction3((t0: XTextRange, t1: String, t2: Boolean) => (insertString(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XSimpleText]
  }
  
  extension [Self <: XSimpleText](x: Self) {
    
    inline def setCreateTextCursor(value: CallbackTo[XTextCursor]): Self = StObject.set(x, "createTextCursor", value.toJsFn)
    
    inline def setCreateTextCursorByRange(value: XTextRange => XTextCursor): Self = StObject.set(x, "createTextCursorByRange", js.Any.fromFunction1(value))
    
    inline def setInsertControlCharacter(value: (XTextRange, Double, Boolean) => Callback): Self = StObject.set(x, "insertControlCharacter", js.Any.fromFunction3((t0: XTextRange, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setInsertString(value: (XTextRange, String, Boolean) => Callback): Self = StObject.set(x, "insertString", js.Any.fromFunction3((t0: XTextRange, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
