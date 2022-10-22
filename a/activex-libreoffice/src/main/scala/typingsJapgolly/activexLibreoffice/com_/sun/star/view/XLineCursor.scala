package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a cursor by lines within laid out text.
  * @see com.sun.star.table.CellCursor
  * @see com.sun.star.text.TextCursor
  * @see com.sun.star.text.XTextViewCursor
  */
trait XLineCursor
  extends StObject
     with XInterface {
  
  /**
    * moves the cursor to the end of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoEndOfLine(bExpand: Boolean): Unit
  
  /**
    * moves the cursor to the start of the current line.
    * @param bExpand determines whether the text range of the cursor is expanded ( `TRUE` ) or the cursor will be just at the new position after the move ( `F
    */
  def gotoStartOfLine(bExpand: Boolean): Unit
  
  /** determines if the cursor is positioned at the end of a line. */
  def isAtEndOfLine(): Boolean
  
  /** determines if the cursor is positioned at the start of a line. */
  def isAtStartOfLine(): Boolean
}
object XLineCursor {
  
  inline def apply(
    acquire: Callback,
    gotoEndOfLine: Boolean => Callback,
    gotoStartOfLine: Boolean => Callback,
    isAtEndOfLine: CallbackTo[Boolean],
    isAtStartOfLine: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XLineCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, gotoEndOfLine = js.Any.fromFunction1((t0: Boolean) => gotoEndOfLine(t0).runNow()), gotoStartOfLine = js.Any.fromFunction1((t0: Boolean) => gotoStartOfLine(t0).runNow()), isAtEndOfLine = isAtEndOfLine.toJsFn, isAtStartOfLine = isAtStartOfLine.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLineCursor]
  }
  
  extension [Self <: XLineCursor](x: Self) {
    
    inline def setGotoEndOfLine(value: Boolean => Callback): Self = StObject.set(x, "gotoEndOfLine", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGotoStartOfLine(value: Boolean => Callback): Self = StObject.set(x, "gotoStartOfLine", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsAtEndOfLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAtEndOfLine", value.toJsFn)
    
    inline def setIsAtStartOfLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAtStartOfLine", value.toJsFn)
  }
}
