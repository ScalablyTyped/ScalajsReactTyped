package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables a {@link SpreadsheetView} to split the view.
  * @deprecated Deprecated
  */
trait XViewSplitable
  extends StObject
     with XInterface {
  
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  val IsWindowSplit: Boolean
  
  /** returns the column before which the view is split. */
  val SplitColumn: Double
  
  /** returns the horizontal position in pixels where the view is split. */
  val SplitHorizontal: Double
  
  /** returns the row before which the view is split. */
  val SplitRow: Double
  
  /** returns the vertical position in pixels where the view is split. */
  val SplitVertical: Double
  
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def getIsWindowSplit(): Boolean
  
  /** returns the column before which the view is split. */
  def getSplitColumn(): Double
  
  /** returns the horizontal position in pixels where the view is split. */
  def getSplitHorizontal(): Double
  
  /** returns the row before which the view is split. */
  def getSplitRow(): Double
  
  /** returns the vertical position in pixels where the view is split. */
  def getSplitVertical(): Double
  
  /**
    * splits the view at the specified position.
    *
    * To split only horizontally, specify **nPixelY** as 0. To split only vertically, specify **nPixelX** as 0.
    */
  def splitAtPosition(nPixelX: Double, nPixelY: Double): Unit
}
object XViewSplitable {
  
  inline def apply(
    IsWindowSplit: Boolean,
    SplitColumn: Double,
    SplitHorizontal: Double,
    SplitRow: Double,
    SplitVertical: Double,
    acquire: Callback,
    getIsWindowSplit: CallbackTo[Boolean],
    getSplitColumn: CallbackTo[Double],
    getSplitHorizontal: CallbackTo[Double],
    getSplitRow: CallbackTo[Double],
    getSplitVertical: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    splitAtPosition: (Double, Double) => Callback
  ): XViewSplitable = {
    val __obj = js.Dynamic.literal(IsWindowSplit = IsWindowSplit.asInstanceOf[js.Any], SplitColumn = SplitColumn.asInstanceOf[js.Any], SplitHorizontal = SplitHorizontal.asInstanceOf[js.Any], SplitRow = SplitRow.asInstanceOf[js.Any], SplitVertical = SplitVertical.asInstanceOf[js.Any], acquire = acquire.toJsFn, getIsWindowSplit = getIsWindowSplit.toJsFn, getSplitColumn = getSplitColumn.toJsFn, getSplitHorizontal = getSplitHorizontal.toJsFn, getSplitRow = getSplitRow.toJsFn, getSplitVertical = getSplitVertical.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, splitAtPosition = js.Any.fromFunction2((t0: Double, t1: Double) => (splitAtPosition(t0, t1)).runNow()))
    __obj.asInstanceOf[XViewSplitable]
  }
  
  extension [Self <: XViewSplitable](x: Self) {
    
    inline def setGetIsWindowSplit(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsWindowSplit", value.toJsFn)
    
    inline def setGetSplitColumn(value: CallbackTo[Double]): Self = StObject.set(x, "getSplitColumn", value.toJsFn)
    
    inline def setGetSplitHorizontal(value: CallbackTo[Double]): Self = StObject.set(x, "getSplitHorizontal", value.toJsFn)
    
    inline def setGetSplitRow(value: CallbackTo[Double]): Self = StObject.set(x, "getSplitRow", value.toJsFn)
    
    inline def setGetSplitVertical(value: CallbackTo[Double]): Self = StObject.set(x, "getSplitVertical", value.toJsFn)
    
    inline def setIsWindowSplit(value: Boolean): Self = StObject.set(x, "IsWindowSplit", value.asInstanceOf[js.Any])
    
    inline def setSplitAtPosition(value: (Double, Double) => Callback): Self = StObject.set(x, "splitAtPosition", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSplitColumn(value: Double): Self = StObject.set(x, "SplitColumn", value.asInstanceOf[js.Any])
    
    inline def setSplitHorizontal(value: Double): Self = StObject.set(x, "SplitHorizontal", value.asInstanceOf[js.Any])
    
    inline def setSplitRow(value: Double): Self = StObject.set(x, "SplitRow", value.asInstanceOf[js.Any])
    
    inline def setSplitVertical(value: Double): Self = StObject.set(x, "SplitVertical", value.asInstanceOf[js.Any])
  }
}
