package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a text block in a group of an {@link AutoTextContainer} .
  * @see com.sun.star.text.AutoTextContainer
  * @see com.sun.star.text.AutoTextGroup
  */
trait AutoTextEntry
  extends StObject
     with XAutoTextEntry
     with XText
object AutoTextEntry {
  
  inline def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: Callback,
    applyTo: XTextRange => Callback,
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
  ): AutoTextEntry = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, applyTo = js.Any.fromFunction1((t0: XTextRange) => applyTo(t0).runNow()), createTextCursor = createTextCursor.toJsFn, createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, insertControlCharacter = js.Any.fromFunction3((t0: XTextRange, t1: Double, t2: Boolean) => (insertControlCharacter(t0, t1, t2)).runNow()), insertString = js.Any.fromFunction3((t0: XTextRange, t1: String, t2: Boolean) => (insertString(t0, t1, t2)).runNow()), insertTextContent = js.Any.fromFunction3((t0: XTextRange, t1: XTextContent, t2: Boolean) => (insertTextContent(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTextContent = js.Any.fromFunction1((t0: XTextContent) => removeTextContent(t0).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[AutoTextEntry]
  }
}
