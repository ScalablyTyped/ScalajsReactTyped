package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to fill out a cell range automatically with values based on a start value, step count and fill mode.
  * @see com.sun.star.sheet.SheetCellRange
  */
trait XCellSeries
  extends StObject
     with XInterface {
  
  /**
    * fills all cells in the range in a way that is specified by the first cell(s) in the range.
    * @param nFillDirection specifies the direction to fill the rows/columns of the range.
    * @param nSourceCount contains the number of cells in each row/column used to constitute the fill algorithm.
    */
  def fillAuto(nFillDirection: FillDirection, nSourceCount: Double): Unit
  
  /**
    * fills all cells in the range based on the specified settings.
    * @param nFillDirection specifies the direction to fill the rows/columns of the range.
    * @param nFillMode specifies the type of the series.
    * @param nFillDateMode specifies the calculation mode for date values.
    * @param fStep contains the value used to increase/decrease the series values.
    * @param fEndValue contains the threshold value on which the calculation of the current series stops.
    */
  def fillSeries(
    nFillDirection: FillDirection,
    nFillMode: FillMode,
    nFillDateMode: FillDateMode,
    fStep: Double,
    fEndValue: Double
  ): Unit
}
object XCellSeries {
  
  inline def apply(
    acquire: Callback,
    fillAuto: (FillDirection, Double) => Callback,
    fillSeries: (FillDirection, FillMode, FillDateMode, Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XCellSeries = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, fillAuto = js.Any.fromFunction2((t0: FillDirection, t1: Double) => (fillAuto(t0, t1)).runNow()), fillSeries = js.Any.fromFunction5((t0: FillDirection, t1: FillMode, t2: FillDateMode, t3: Double, t4: Double) => (fillSeries(t0, t1, t2, t3, t4)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCellSeries]
  }
  
  extension [Self <: XCellSeries](x: Self) {
    
    inline def setFillAuto(value: (FillDirection, Double) => Callback): Self = StObject.set(x, "fillAuto", js.Any.fromFunction2((t0: FillDirection, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setFillSeries(value: (FillDirection, FillMode, FillDateMode, Double, Double) => Callback): Self = StObject.set(x, "fillSeries", js.Any.fromFunction5((t0: FillDirection, t1: FillMode, t2: FillDateMode, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
