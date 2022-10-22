package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to move a cursor word by word. */
trait XWordCursor
  extends StObject
     with XTextCursor {
  
  /**
    * moves the cursor to the end of the current word.
    * @returns `TRUE` if the cursor is now at the end of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfWord(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the next word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the next word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextWord(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the previous word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the previous word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousWord(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the current word.
    * @returns `TRUE` if the cursor is now at the start of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfWord(bExpand: Boolean): Boolean
  
  /** determines if the cursor is positioned at the end of a word. */
  def isEndOfWord(): Boolean
  
  /** determines if the cursor is positioned at the start of a word. */
  def isStartOfWord(): Boolean
}
object XWordCursor {
  
  inline def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: Callback,
    collapseToEnd: Callback,
    collapseToStart: Callback,
    getEnd: CallbackTo[XTextRange],
    getStart: CallbackTo[XTextRange],
    getString: CallbackTo[String],
    getText: CallbackTo[XText],
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Callback,
    gotoEndOfWord: Boolean => Boolean,
    gotoNextWord: Boolean => Boolean,
    gotoPreviousWord: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Callback,
    gotoStart: Boolean => Callback,
    gotoStartOfWord: Boolean => Boolean,
    isCollapsed: CallbackTo[Boolean],
    isEndOfWord: CallbackTo[Boolean],
    isStartOfWord: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XWordCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, collapseToEnd = collapseToEnd.toJsFn, collapseToStart = collapseToStart.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1((t0: Boolean) => gotoEnd(t0).runNow()), gotoEndOfWord = js.Any.fromFunction1(gotoEndOfWord), gotoNextWord = js.Any.fromFunction1(gotoNextWord), gotoPreviousWord = js.Any.fromFunction1(gotoPreviousWord), gotoRange = js.Any.fromFunction2((t0: XTextRange, t1: Boolean) => (gotoRange(t0, t1)).runNow()), gotoStart = js.Any.fromFunction1((t0: Boolean) => gotoStart(t0).runNow()), gotoStartOfWord = js.Any.fromFunction1(gotoStartOfWord), isCollapsed = isCollapsed.toJsFn, isEndOfWord = isEndOfWord.toJsFn, isStartOfWord = isStartOfWord.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XWordCursor]
  }
  
  extension [Self <: XWordCursor](x: Self) {
    
    inline def setGotoEndOfWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfWord", js.Any.fromFunction1(value))
    
    inline def setGotoNextWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextWord", js.Any.fromFunction1(value))
    
    inline def setGotoPreviousWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousWord", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfWord(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfWord", js.Any.fromFunction1(value))
    
    inline def setIsEndOfWord(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEndOfWord", value.toJsFn)
    
    inline def setIsStartOfWord(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStartOfWord", value.toJsFn)
  }
}
