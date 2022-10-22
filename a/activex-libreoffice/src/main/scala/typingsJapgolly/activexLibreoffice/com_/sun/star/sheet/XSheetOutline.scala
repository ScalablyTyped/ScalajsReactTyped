package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableOrientation
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to access the outlines of a sheet. */
trait XSheetOutline
  extends StObject
     with XInterface {
  
  /**
    * creates outline groups from formula references in a range.
    * @param aRange the cell range for which outlines are generated.
    */
  def autoOutline(aRange: CellRangeAddress): Unit
  
  /** removes all outline groups from the sheet. */
  def clearOutline(): Unit
  
  /**
    * creates an outline group.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the new outline (columns or rows).
    */
  def group(aRange: CellRangeAddress, nOrientation: TableOrientation): Unit
  
  /**
    * collapses an outline group.
    * @param aRange the cell range for which the outlines are collapsed.
    */
  def hideDetail(aRange: CellRangeAddress): Unit
  
  /**
    * reopens an outline group.
    * @param aRange the cell range for which the outlines are reopened.
    */
  def showDetail(aRange: CellRangeAddress): Unit
  
  /**
    * shows all outlined groups below a specific level.
    * @param nLevel all outline levels from 1 to this value will be opened and the higher levels will be closed.
    * @param nOrientation the orientation of the outlines (columns or rows).
    */
  def showLevel(nLevel: Double, nOrientation: TableOrientation): Unit
  
  /**
    * removes outline groups.
    *
    * In the specified range, all outline groups on the innermost level are removed.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the outlines to remove (columns or rows).
    */
  def ungroup(aRange: CellRangeAddress, nOrientation: TableOrientation): Unit
}
object XSheetOutline {
  
  inline def apply(
    acquire: Callback,
    autoOutline: CellRangeAddress => Callback,
    clearOutline: Callback,
    group: (CellRangeAddress, TableOrientation) => Callback,
    hideDetail: CellRangeAddress => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    showDetail: CellRangeAddress => Callback,
    showLevel: (Double, TableOrientation) => Callback,
    ungroup: (CellRangeAddress, TableOrientation) => Callback
  ): XSheetOutline = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, autoOutline = js.Any.fromFunction1((t0: CellRangeAddress) => autoOutline(t0).runNow()), clearOutline = clearOutline.toJsFn, group = js.Any.fromFunction2((t0: CellRangeAddress, t1: TableOrientation) => (group(t0, t1)).runNow()), hideDetail = js.Any.fromFunction1((t0: CellRangeAddress) => hideDetail(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, showDetail = js.Any.fromFunction1((t0: CellRangeAddress) => showDetail(t0).runNow()), showLevel = js.Any.fromFunction2((t0: Double, t1: TableOrientation) => (showLevel(t0, t1)).runNow()), ungroup = js.Any.fromFunction2((t0: CellRangeAddress, t1: TableOrientation) => (ungroup(t0, t1)).runNow()))
    __obj.asInstanceOf[XSheetOutline]
  }
  
  extension [Self <: XSheetOutline](x: Self) {
    
    inline def setAutoOutline(value: CellRangeAddress => Callback): Self = StObject.set(x, "autoOutline", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setClearOutline(value: Callback): Self = StObject.set(x, "clearOutline", value.toJsFn)
    
    inline def setGroup(value: (CellRangeAddress, TableOrientation) => Callback): Self = StObject.set(x, "group", js.Any.fromFunction2((t0: CellRangeAddress, t1: TableOrientation) => (value(t0, t1)).runNow()))
    
    inline def setHideDetail(value: CellRangeAddress => Callback): Self = StObject.set(x, "hideDetail", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setShowDetail(value: CellRangeAddress => Callback): Self = StObject.set(x, "showDetail", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setShowLevel(value: (Double, TableOrientation) => Callback): Self = StObject.set(x, "showLevel", js.Any.fromFunction2((t0: Double, t1: TableOrientation) => (value(t0, t1)).runNow()))
    
    inline def setUngroup(value: (CellRangeAddress, TableOrientation) => Callback): Self = StObject.set(x, "ungroup", js.Any.fromFunction2((t0: CellRangeAddress, t1: TableOrientation) => (value(t0, t1)).runNow()))
  }
}
