package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ChartTrendlineType
import typingsJapgolly.officeJs.officeJsStrings.Exponential
import typingsJapgolly.officeJs.officeJsStrings.Linear
import typingsJapgolly.officeJs.officeJsStrings.Logarithmic
import typingsJapgolly.officeJs.officeJsStrings.MovingAverage
import typingsJapgolly.officeJs.officeJsStrings.Polynomial
import typingsJapgolly.officeJs.officeJsStrings.Power
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartTrendline object, for use in `chartTrendline.set({ ... })`. */
trait ChartTrendlineUpdateData extends StObject {
  
  /**
    * Represents the number of periods that the trendline extends backward.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the formatting of a chart trendline.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatUpdateData] = js.undefined
  
  /**
    * Represents the number of periods that the trendline extends forward.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[Any] = js.undefined
  
  /**
    * Represents the label of a chart trendline.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelUpdateData] = js.undefined
  
  /**
    * Represents the period of a chart trendline. Only applicable to trendlines with the type `MovingAverage`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the name of the trendline. Can be set to a string value, a `null` value represents automatic values. The returned value is always a string
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the order of a chart trendline. Only applicable to trendlines with the type `Polynomial`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Double] = js.undefined
  
  /**
    * True if the equation for the trendline is displayed on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the r-squared value for the trendline is displayed on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the type of a chart trendline.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
  ] = js.undefined
}
object ChartTrendlineUpdateData {
  
  inline def apply(): ChartTrendlineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineUpdateData]
  }
  
  extension [Self <: ChartTrendlineUpdateData](x: Self) {
    
    inline def setBackwardPeriod(value: Double): Self = StObject.set(x, "backwardPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackwardPeriodUndefined: Self = StObject.set(x, "backwardPeriod", js.undefined)
    
    inline def setFormat(value: ChartTrendlineFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setForwardPeriod(value: Double): Self = StObject.set(x, "forwardPeriod", value.asInstanceOf[js.Any])
    
    inline def setForwardPeriodUndefined: Self = StObject.set(x, "forwardPeriod", js.undefined)
    
    inline def setIntercept(value: Any): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
    
    inline def setLabel(value: ChartTrendlineLabelUpdateData): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMovingAveragePeriod(value: Double): Self = StObject.set(x, "movingAveragePeriod", value.asInstanceOf[js.Any])
    
    inline def setMovingAveragePeriodUndefined: Self = StObject.set(x, "movingAveragePeriod", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolynomialOrder(value: Double): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
    
    inline def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
    
    inline def setShowEquation(value: Boolean): Self = StObject.set(x, "showEquation", value.asInstanceOf[js.Any])
    
    inline def setShowEquationUndefined: Self = StObject.set(x, "showEquation", js.undefined)
    
    inline def setShowRSquared(value: Boolean): Self = StObject.set(x, "showRSquared", value.asInstanceOf[js.Any])
    
    inline def setShowRSquaredUndefined: Self = StObject.set(x, "showRSquared", js.undefined)
    
    inline def setType(
      value: ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
