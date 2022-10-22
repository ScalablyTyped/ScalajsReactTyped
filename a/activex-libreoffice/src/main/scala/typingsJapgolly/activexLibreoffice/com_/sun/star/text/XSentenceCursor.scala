package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to perform cursor movements through sentences. */
trait XSentenceCursor
  extends StObject
     with XTextCursor {
  
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: Boolean): Boolean
  
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): Boolean
  
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): Boolean
}
object XSentenceCursor {
  
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
    gotoEndOfSentence: Boolean => Boolean,
    gotoNextSentence: Boolean => Boolean,
    gotoPreviousSentence: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Callback,
    gotoStart: Boolean => Callback,
    gotoStartOfSentence: Boolean => Boolean,
    isCollapsed: CallbackTo[Boolean],
    isEndOfSentence: CallbackTo[Boolean],
    isStartOfSentence: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XSentenceCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, collapseToEnd = collapseToEnd.toJsFn, collapseToStart = collapseToStart.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1((t0: Boolean) => gotoEnd(t0).runNow()), gotoEndOfSentence = js.Any.fromFunction1(gotoEndOfSentence), gotoNextSentence = js.Any.fromFunction1(gotoNextSentence), gotoPreviousSentence = js.Any.fromFunction1(gotoPreviousSentence), gotoRange = js.Any.fromFunction2((t0: XTextRange, t1: Boolean) => (gotoRange(t0, t1)).runNow()), gotoStart = js.Any.fromFunction1((t0: Boolean) => gotoStart(t0).runNow()), gotoStartOfSentence = js.Any.fromFunction1(gotoStartOfSentence), isCollapsed = isCollapsed.toJsFn, isEndOfSentence = isEndOfSentence.toJsFn, isStartOfSentence = isStartOfSentence.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XSentenceCursor]
  }
  
  extension [Self <: XSentenceCursor](x: Self) {
    
    inline def setGotoEndOfSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfSentence", js.Any.fromFunction1(value))
    
    inline def setGotoNextSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextSentence", js.Any.fromFunction1(value))
    
    inline def setGotoPreviousSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousSentence", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfSentence(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfSentence", js.Any.fromFunction1(value))
    
    inline def setIsEndOfSentence(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEndOfSentence", value.toJsFn)
    
    inline def setIsStartOfSentence(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStartOfSentence", value.toJsFn)
  }
}
