package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link TextTableCursor} provide methods to navigate through the table structure, to merge and split cells
  * @see com.sun.star.text.TextTable
  * @see com.sun.star.text.TextTableCursor
  * @see com.sun.star.text.Cell
  * @see com.sun.star.text.XTextTable
  */
trait XTextTableCursor
  extends StObject
     with XInterface {
  
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  val RangeName: String
  
  /**
    * @returns the name of the cell range that is selected by this cursor. The name is the cell name of the top left table cell of the range concatenated by ":"
    * @see com.sun:star.text.CellRange
    */
  def getRangeName(): String
  
  /**
    * moves the cursor to the bottom neighbor cell.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goDown(nCount: Double, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the left neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goLeft(nCount: Double, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the right neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goRight(nCount: Double, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the top neighbor.
    * @param nCount the number of cells to move.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def goUp(nCount: Double, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the cell with the specified name.
    * @param aCellName specifies the name of the cell to go to.
    * @param bExpand determines whether the selection is to be expanded.
    * @see com.sun.star.text.Cell
    */
  def gotoCellByName(aCellName: String, bExpand: Boolean): Boolean
  
  /**
    * moves the cursor to the bottom right cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoEnd(bExpand: Boolean): Unit
  
  /**
    * moves the cursor to the top left cell of the table.
    * @param bExpand determines whether the selection is to be expanded.
    */
  def gotoStart(bExpand: Boolean): Unit
  
  /**
    * merges the selected range of cells.
    * @see com.sun.star.CellRange
    */
  def mergeRange(): Boolean
  
  /**
    * splits the range of cells.
    * @param nCount specifies the number of new cells that will be created for each cell contained in the range.
    * @param bHorizontal `TRUE` if the range should be split vertically. Otherwise it will be split horizontally.
    * @see com.sun.star.Cell
    * @see com.sun.star.CellRange
    */
  def splitRange(nCount: Double, bHorizontal: Boolean): Boolean
}
object XTextTableCursor {
  
  inline def apply(
    RangeName: String,
    acquire: Callback,
    getRangeName: CallbackTo[String],
    goDown: (Double, Boolean) => Boolean,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    goUp: (Double, Boolean) => Boolean,
    gotoCellByName: (String, Boolean) => Boolean,
    gotoEnd: Boolean => Callback,
    gotoStart: Boolean => Callback,
    mergeRange: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    splitRange: (Double, Boolean) => Boolean
  ): XTextTableCursor = {
    val __obj = js.Dynamic.literal(RangeName = RangeName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getRangeName = getRangeName.toJsFn, goDown = js.Any.fromFunction2(goDown), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), goUp = js.Any.fromFunction2(goUp), gotoCellByName = js.Any.fromFunction2(gotoCellByName), gotoEnd = js.Any.fromFunction1((t0: Boolean) => gotoEnd(t0).runNow()), gotoStart = js.Any.fromFunction1((t0: Boolean) => gotoStart(t0).runNow()), mergeRange = mergeRange.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, splitRange = js.Any.fromFunction2(splitRange))
    __obj.asInstanceOf[XTextTableCursor]
  }
  
  extension [Self <: XTextTableCursor](x: Self) {
    
    inline def setGetRangeName(value: CallbackTo[String]): Self = StObject.set(x, "getRangeName", value.toJsFn)
    
    inline def setGoDown(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goDown", js.Any.fromFunction2(value))
    
    inline def setGoLeft(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goLeft", js.Any.fromFunction2(value))
    
    inline def setGoRight(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goRight", js.Any.fromFunction2(value))
    
    inline def setGoUp(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "goUp", js.Any.fromFunction2(value))
    
    inline def setGotoCellByName(value: (String, Boolean) => Boolean): Self = StObject.set(x, "gotoCellByName", js.Any.fromFunction2(value))
    
    inline def setGotoEnd(value: Boolean => Callback): Self = StObject.set(x, "gotoEnd", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGotoStart(value: Boolean => Callback): Self = StObject.set(x, "gotoStart", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setMergeRange(value: CallbackTo[Boolean]): Self = StObject.set(x, "mergeRange", value.toJsFn)
    
    inline def setRangeName(value: String): Self = StObject.set(x, "RangeName", value.asInstanceOf[js.Any])
    
    inline def setSplitRange(value: (Double, Boolean) => Boolean): Self = StObject.set(x, "splitRange", js.Any.fromFunction2(value))
  }
}
