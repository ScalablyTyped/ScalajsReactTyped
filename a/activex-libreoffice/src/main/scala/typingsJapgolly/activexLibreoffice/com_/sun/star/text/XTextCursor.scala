package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends a text range by method to modify its position. */
trait XTextCursor
  extends StObject
     with XTextRange {
  
  /** sets the start of the position to the end. */
  def collapseToEnd(): Unit
  
  /** sets the end of the position to the start. */
  def collapseToStart(): Unit
  
  /**
    * moves the cursor the specified number of characters to the left.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor the specified number of characters to the right.
    * @param nCount the number of characters to move.
    * @param bExpand specifies if the current selection of the cursor should be expanded or not.
    * @returns `TRUE` if the command was successfully completed. `FALSE` otherwise.  Note: Even if the command was not completed successfully it may be complete
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean
  
  /** moves the cursor to the end of the text. */
  def gotoEnd(bExpand: Boolean): Unit
  
  /** moves or expands the cursor to a specified {@link TextRange} . */
  def gotoRange(xRange: XTextRange, bExpand: Boolean): Unit
  
  /** moves the cursor to the start of the text. */
  def gotoStart(bExpand: Boolean): Unit
  
  /** determines if the start and end positions are the same. */
  def isCollapsed(): Boolean
}
object XTextCursor {
  
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
    gotoRange: (XTextRange, Boolean) => Callback,
    gotoStart: Boolean => Callback,
    isCollapsed: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XTextCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, collapseToEnd = collapseToEnd.toJsFn, collapseToStart = collapseToStart.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1((t0: Boolean) => gotoEnd(t0).runNow()), gotoRange = js.Any.fromFunction2((t0: XTextRange, t1: Boolean) => (gotoRange(t0, t1)).runNow()), gotoStart = js.Any.fromFunction1((t0: Boolean) => gotoStart(t0).runNow()), isCollapsed = isCollapsed.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XTextCursor]
  }
  
  extension [Self <: XTextCursor](x: Self) {
    
    inline def setCollapseToEnd(value: Callback): Self = StObject.set(x, "collapseToEnd", value.toJsFn)
    
    inline def setCollapseToStart(value: Callback): Self = StObject.set(x, "collapseToStart", value.toJsFn)
    
    inline def setGoLeft(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goLeft", js.Any.fromFunction2(value))
    
    inline def setGoRight(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goRight", js.Any.fromFunction2(value))
    
    inline def setGotoEnd(value: Boolean => Callback): Self = StObject.set(x, "gotoEnd", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGotoRange(value: (XTextRange, Boolean) => Callback): Self = StObject.set(x, "gotoRange", js.Any.fromFunction2((t0: XTextRange, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setGotoStart(value: Boolean => Callback): Self = StObject.set(x, "gotoStart", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsCollapsed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCollapsed", value.toJsFn)
  }
}
