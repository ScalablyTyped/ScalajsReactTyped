package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a range of cells that can possibly be merged or unmerged. */
trait XMergeableCellRange
  extends StObject
     with XInterface {
  
  /** @returns `TRUE` if all cells from this range can be merged to one or `FALSE` otherwise. */
  def isMergeable(): Boolean
  
  /**
    * merges the area specified by this range.
    * @throws com::sun::star::lang::NoSupportException if a merge is not possible for this range. You can use {@link isMergeable()} to check if a merge is possible.
    */
  def merge(): Unit
  
  /**
    * splits the cells in this range. This will be done by inserting rows and columns if needed or unmerging cells that are already split.
    * @param Columns this is the number of columns that will be added to each cell. Zero means no new columns
    * @param Rows this is the number of rows that will be added to each cell. Zero means no new rows
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the parameters is less than zero.
    * @throws com::sun::star::lang::NoSupportException if a split is not possible for this range.
    */
  def split(Columns: Double, Rows: Double): Unit
}
object XMergeableCellRange {
  
  inline def apply(
    acquire: Callback,
    isMergeable: CallbackTo[Boolean],
    merge: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    split: (Double, Double) => Callback
  ): XMergeableCellRange = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, isMergeable = isMergeable.toJsFn, merge = merge.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, split = js.Any.fromFunction2((t0: Double, t1: Double) => (split(t0, t1)).runNow()))
    __obj.asInstanceOf[XMergeableCellRange]
  }
  
  extension [Self <: XMergeableCellRange](x: Self) {
    
    inline def setIsMergeable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMergeable", value.toJsFn)
    
    inline def setMerge(value: Callback): Self = StObject.set(x, "merge", value.toJsFn)
    
    inline def setSplit(value: (Double, Double) => Callback): Self = StObject.set(x, "split", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
