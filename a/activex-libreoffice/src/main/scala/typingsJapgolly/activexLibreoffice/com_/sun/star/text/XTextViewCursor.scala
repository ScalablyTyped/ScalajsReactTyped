package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a cursor in a text document's view. */
trait XTextViewCursor
  extends StObject
     with XTextCursor {
  
  /** @returns the cursor's coordinates relative to the top left position of the first page of the document. */
  val Position: Point
  
  /** @returns the cursor's coordinates relative to the top left position of the first page of the document. */
  def getPosition(): Point
  
  /** @returns `TRUE` if this cursor is visible for the user. */
  def isVisible(): Boolean
  
  /** shows or hides this cursor for the user. */
  def setVisible(bVisible: Boolean): Unit
}
object XTextViewCursor {
  
  inline def apply(
    End: XTextRange,
    Position: Point,
    Start: XTextRange,
    String: String,
    acquire: Callback,
    collapseToEnd: Callback,
    collapseToStart: Callback,
    getEnd: CallbackTo[XTextRange],
    getPosition: CallbackTo[Point],
    getStart: CallbackTo[XTextRange],
    getString: CallbackTo[String],
    getText: CallbackTo[XText],
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Callback,
    gotoRange: (XTextRange, Boolean) => Callback,
    gotoStart: Boolean => Callback,
    isCollapsed: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback,
    setVisible: Boolean => Callback
  ): XTextViewCursor = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, collapseToEnd = collapseToEnd.toJsFn, collapseToStart = collapseToStart.toJsFn, getEnd = getEnd.toJsFn, getPosition = getPosition.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1((t0: Boolean) => gotoEnd(t0).runNow()), gotoRange = js.Any.fromFunction2((t0: XTextRange, t1: Boolean) => (gotoRange(t0, t1)).runNow()), gotoStart = js.Any.fromFunction1((t0: Boolean) => gotoStart(t0).runNow()), isCollapsed = isCollapsed.toJsFn, isVisible = isVisible.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[XTextViewCursor]
  }
  
  extension [Self <: XTextViewCursor](x: Self) {
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
