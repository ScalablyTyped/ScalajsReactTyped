package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to find the used area of the entire sheet.
  *
  * The used area is the smallest cell range that contains all cells of the spreadsheet with any contents (values, text, formulas) or visible formatting
  * (borders and background color).
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XUsedAreaCursor
  extends StObject
     with XInterface {
  
  /**
    * points the cursor to the end of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoEndOfUsedArea(bExpand: Boolean): Unit
  
  /**
    * points the cursor to the start of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoStartOfUsedArea(bExpand: Boolean): Unit
}
object XUsedAreaCursor {
  
  inline def apply(
    acquire: Callback,
    gotoEndOfUsedArea: Boolean => Callback,
    gotoStartOfUsedArea: Boolean => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XUsedAreaCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, gotoEndOfUsedArea = js.Any.fromFunction1((t0: Boolean) => gotoEndOfUsedArea(t0).runNow()), gotoStartOfUsedArea = js.Any.fromFunction1((t0: Boolean) => gotoStartOfUsedArea(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUsedAreaCursor]
  }
  
  extension [Self <: XUsedAreaCursor](x: Self) {
    
    inline def setGotoEndOfUsedArea(value: Boolean => Callback): Self = StObject.set(x, "gotoEndOfUsedArea", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGotoStartOfUsedArea(value: Boolean => Callback): Self = StObject.set(x, "gotoStartOfUsedArea", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
