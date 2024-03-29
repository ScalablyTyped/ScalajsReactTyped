package typingsJapgolly.qlikVisualizationextensions

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableAPI {
  
  trait IQDimensionCell
    extends StObject
       with IQMeasureCell {
    
    /**
      * Cell value index.
      */
    var qElemNumber: Double
    
    /**
      * Cell state.
      */
    var qState: String
    
    /**
      * Selects the value in this cell.
      */
    def select(): Unit
  }
  object IQDimensionCell {
    
    inline def apply(
      getPercent: CallbackTo[Double],
      getPercentOfMax: CallbackTo[Double],
      qElemNumber: Double,
      qState: String,
      qText: String,
      select: Callback
    ): IQDimensionCell = {
      val __obj = js.Dynamic.literal(getPercent = getPercent.toJsFn, getPercentOfMax = getPercentOfMax.toJsFn, qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = select.toJsFn)
      __obj.asInstanceOf[IQDimensionCell]
    }
    
    extension [Self <: IQDimensionCell](x: Self) {
      
      inline def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
      
      inline def setQState(value: String): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Callback): Self = StObject.set(x, "select", value.toJsFn)
    }
  }
  
  @js.native
  trait IQHeader extends StObject {
    
    /**
      * Column number.
      */
    var col: Double = js.native
    
    /**
      * Optional. Error code for this column.
      * Only if column has an error. Introduced in version 2.2.
      */
    var errorCode: js.UndefOr[Double] = js.native
    
    /**
      * Error message for this column.
      * Only if column has an error. Introduced in version 2.2.
      */
    var errorMessage: Double = js.native
    
    /**
      * Optional. Field object with methods to manipulate the underlying field.
      * Only used for dimensions.
      */
    var field: js.UndefOr[Any] = js.native
    
    /**
      * True indicates if this is the first column for sorting.
      */
    var isOrderedBy: Boolean = js.native
    
    /**
      * Sets this column to be the first in the sort order.
      */
    def orderBy(): Unit = js.native
    
    /**
      * Optional. Number of different values. Only used for dimensions.
      */
    var qCardinal: js.UndefOr[Double] = js.native
    
    /**
      * Column title.
      */
    var qFallbackTitle: String = js.native
    
    /**
      * Optional. Maximum value. Only used for measures.
      */
    var qMax: js.UndefOr[Double] = js.native
    
    /**
      * Optional. Minimum value. Only used for measures.
      */
    var qMin: js.UndefOr[Double] = js.native
    
    /**
      * True indicates if the sort order is reversed for this column.
      */
    var qReverseSort: Boolean = js.native
    
    /**
      * Can be:
      *       # A: ascending
      *       # D: descending
      */
    var qSortIndicator: String = js.native
    
    /**
      * Optional. Object with number of values in different states.
      * Only used for dimensions.
      */
    var qStateCounts: js.UndefOr[Any] = js.native
    
    /**
      * Reverses the sort order for this column.
      */
    def reverseOrder(): Unit = js.native
    
    /**
      * Select a range in this measure.
      * @param min - Sets the minimum value of the range.
      * @param max - Sets the maximum value of the range.
      * @param [inclMin] - Optional. Set to true to include minimum value.
      * @param [inclMax] - Optional. Set to true to include maximum value.
      * @return - A promise.
      */
    def selectRange(min: Double, max: Double): IPromise[Any] = js.native
    def selectRange(min: Double, max: Double, inclMin: Boolean): IPromise[Any] = js.native
    def selectRange(min: Double, max: Double, inclMin: Boolean, inclMax: Boolean): IPromise[Any] = js.native
    def selectRange(min: Double, max: Double, inclMin: Unit, inclMax: Boolean): IPromise[Any] = js.native
  }
  
  trait IQMeasureCell extends StObject {
    
    /**
      * Gets the value of this cell as a percentage of the total.
      * Might be more than 100% if this is an average.
      */
    def getPercent(): Double
    
    /**
      * Gets the value of this cell as a percentage of the maximum.
      */
    def getPercentOfMax(): Double
    
    /**
      * Optional. Cell numeric value, if cell is numeric.
      */
    var qNum: js.UndefOr[Double] = js.undefined
    
    /**
      * Cell value formatted as set up in properties.
      */
    var qText: String
  }
  object IQMeasureCell {
    
    inline def apply(getPercent: CallbackTo[Double], getPercentOfMax: CallbackTo[Double], qText: String): IQMeasureCell = {
      val __obj = js.Dynamic.literal(getPercent = getPercent.toJsFn, getPercentOfMax = getPercentOfMax.toJsFn, qText = qText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQMeasureCell]
    }
    
    extension [Self <: IQMeasureCell](x: Self) {
      
      inline def setGetPercent(value: CallbackTo[Double]): Self = StObject.set(x, "getPercent", value.toJsFn)
      
      inline def setGetPercentOfMax(value: CallbackTo[Double]): Self = StObject.set(x, "getPercentOfMax", value.toJsFn)
      
      inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
      
      inline def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
      
      inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    }
  }
  
  trait IQRow extends StObject {
    
    /**
      * All cells, in the order they are defined in the properties.
      */
    var cells: js.Array[Any]
    
    /**
      * Dimension cells.
      */
    var dimensions: js.Array[IQDimensionCell]
    
    /**
      * Measure cells.
      */
    var measures: js.Array[IQMeasureCell]
  }
  object IQRow {
    
    inline def apply(cells: js.Array[Any], dimensions: js.Array[IQDimensionCell], measures: js.Array[IQMeasureCell]): IQRow = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQRow]
    }
    
    extension [Self <: IQRow](x: Self) {
      
      inline def setCells(value: js.Array[Any]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: Any*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setDimensions(value: js.Array[IQDimensionCell]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsVarargs(value: IQDimensionCell*): Self = StObject.set(x, "dimensions", js.Array(value*))
      
      inline def setMeasures(value: js.Array[IQMeasureCell]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
      
      inline def setMeasuresVarargs(value: IQMeasureCell*): Self = StObject.set(x, "measures", js.Array(value*))
    }
  }
  
  @js.native
  trait IQTable extends StObject {
    
    /**
      * Total number of columns for the qHyperCube.
      */
    var colCount: Double = js.native
    
    /**
      * Exports data of the underlying hypercube in OOXML or CSV format.
      * @param [options] - Optional. Properties:
      * Name | Type | Description
      * format | String | Data format. Can be one of:
      *       # OOXML: open XML, default
      *       # CSV_C: comma separated CSV
      *       # CSV_T: tab separated CSV
      * filename | String | Name of the exported file after download from browser.
      *                     This parameter is optional and only used in desktop.
      * state | String | Can be:
      *       # A: all values
      *       # P: possible values (default)
      * download | Boolean | Automatically start download of file (with window.open).
      * @param [callback] - Optional. Callback function returning the link to the exported file.
      */
    def exportData(): Unit = js.native
    def exportData(options: Any): Unit = js.native
    def exportData(options: Any, callback: Any): Unit = js.native
    def exportData(options: Unit, callback: Any): Unit = js.native
    
    /**
      * Gets the column number for a given field name.
      * @param fld - Field name.
      * @return - Column number, starting with zero. Undefined if no column with that name exists.
      */
    def getColByName(fld: String): Double = js.native
    
    /**
      * Gets more data for your qHyperCube.
      */
    def getMoreData(): Any = js.native
    
    /**
      * Header information.
      */
    var headers: js.Array[IQHeader] = js.native
    
    /**
      * Total number of rows for the qHyperCube, including rows not fetched from the server.
      */
    var rowCount: Double = js.native
    
    /**
      * Data rows.
      */
    var rows: js.Array[IQRow] = js.native
    
    /**
      * Total information for measures.
      */
    var totals: js.Array[IQMeasureCell] = js.native
  }
}
