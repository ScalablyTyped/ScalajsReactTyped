package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XSimpleText
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XText
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XTextCursor
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XTextRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a cell annotation object attached to a spreadsheet cell.
  * @see com.sun.star.sheet.SheetCell
  */
trait CellAnnotation
  extends StObject
     with XSheetAnnotation
     with XChild
     with XSimpleText
     with XSheetAnnotationShapeSupplier
object CellAnnotation {
  
  inline def apply(
    AnnotationShape: XShape,
    Author: String,
    Date: String,
    End: XTextRange,
    IsVisible: Boolean,
    Parent: XInterface,
    Position: CellAddress,
    Start: XTextRange,
    String: String,
    acquire: Callback,
    createTextCursor: CallbackTo[XTextCursor],
    createTextCursorByRange: XTextRange => XTextCursor,
    getAnnotationShape: CallbackTo[XShape],
    getAuthor: CallbackTo[String],
    getDate: CallbackTo[String],
    getEnd: CallbackTo[XTextRange],
    getIsVisible: CallbackTo[Boolean],
    getParent: CallbackTo[XInterface],
    getPosition: CallbackTo[CellAddress],
    getStart: CallbackTo[XTextRange],
    getString: CallbackTo[String],
    getText: CallbackTo[XText],
    insertControlCharacter: (XTextRange, Double, Boolean) => Callback,
    insertString: (XTextRange, String, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setIsVisible: Boolean => Callback,
    setParent: XInterface => Callback,
    setString: String => Callback
  ): CellAnnotation = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, createTextCursor = createTextCursor.toJsFn, createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getAnnotationShape = getAnnotationShape.toJsFn, getAuthor = getAuthor.toJsFn, getDate = getDate.toJsFn, getEnd = getEnd.toJsFn, getIsVisible = getIsVisible.toJsFn, getParent = getParent.toJsFn, getPosition = getPosition.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, insertControlCharacter = js.Any.fromFunction3((t0: XTextRange, t1: Double, t2: Boolean) => (insertControlCharacter(t0, t1, t2)).runNow()), insertString = js.Any.fromFunction3((t0: XTextRange, t1: String, t2: Boolean) => (insertString(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setIsVisible = js.Any.fromFunction1((t0: Boolean) => setIsVisible(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[CellAnnotation]
  }
}
