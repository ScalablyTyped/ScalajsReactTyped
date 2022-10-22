package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to move paragraph by paragraph. */
trait XParagraphCursor
  extends StObject
     with XTextCursor {
  
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: Boolean): Boolean
  
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): Boolean
  
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): Boolean
}
object XParagraphCursor {
  
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
    gotoEndOfParagraph: Boolean => Boolean,
    gotoNextParagraph: Boolean => Boolean,
    gotoPreviousParagraph: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Callback,
    gotoStart: Boolean => Callback,
    gotoStartOfParagraph: Boolean => Boolean,
    isCollapsed: CallbackTo[Boolean],
    isEndOfParagraph: CallbackTo[Boolean],
    isStartOfParagraph: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XParagraphCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, collapseToEnd = collapseToEnd.toJsFn, collapseToStart = collapseToStart.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1((t0: Boolean) => gotoEnd(t0).runNow()), gotoEndOfParagraph = js.Any.fromFunction1(gotoEndOfParagraph), gotoNextParagraph = js.Any.fromFunction1(gotoNextParagraph), gotoPreviousParagraph = js.Any.fromFunction1(gotoPreviousParagraph), gotoRange = js.Any.fromFunction2((t0: XTextRange, t1: Boolean) => (gotoRange(t0, t1)).runNow()), gotoStart = js.Any.fromFunction1((t0: Boolean) => gotoStart(t0).runNow()), gotoStartOfParagraph = js.Any.fromFunction1(gotoStartOfParagraph), isCollapsed = isCollapsed.toJsFn, isEndOfParagraph = isEndOfParagraph.toJsFn, isStartOfParagraph = isStartOfParagraph.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XParagraphCursor]
  }
  
  extension [Self <: XParagraphCursor](x: Self) {
    
    inline def setGotoEndOfParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoEndOfParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoNextParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoNextParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoPreviousParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoPreviousParagraph", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfParagraph(value: Boolean => Boolean): Self = StObject.set(x, "gotoStartOfParagraph", js.Any.fromFunction1(value))
    
    inline def setIsEndOfParagraph(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEndOfParagraph", value.toJsFn)
    
    inline def setIsStartOfParagraph(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStartOfParagraph", value.toJsFn)
  }
}
