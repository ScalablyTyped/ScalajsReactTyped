package typingsJapgolly.extjs.Ext.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumericAxis
  extends StObject
     with typingsJapgolly.extjs.Ext.chart.axis.IAxis {
  
  /** [Config Option] (Boolean) */
  var adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.undefined
}
object INumericAxis {
  
  inline def apply(): INumericAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumericAxis]
  }
  
  extension [Self <: INumericAxis](x: Self) {
    
    inline def setAdjustMaximumByMajorUnit(value: Boolean): Self = StObject.set(x, "adjustMaximumByMajorUnit", value.asInstanceOf[js.Any])
    
    inline def setAdjustMaximumByMajorUnitUndefined: Self = StObject.set(x, "adjustMaximumByMajorUnit", js.undefined)
    
    inline def setAdjustMinimumByMajorUnit(value: Boolean): Self = StObject.set(x, "adjustMinimumByMajorUnit", value.asInstanceOf[js.Any])
    
    inline def setAdjustMinimumByMajorUnitUndefined: Self = StObject.set(x, "adjustMinimumByMajorUnit", js.undefined)
    
    inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
