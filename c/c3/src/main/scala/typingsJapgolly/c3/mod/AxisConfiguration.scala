package typingsJapgolly.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisConfiguration extends StObject {
  
  /**
    * Show the axis inside of the chart.
    */
  var inner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set max value of the axis.
    */
  var max: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Set min value of the axis.
    */
  var min: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Set padding for axis.
    * If this option is set, the range of axis will increase/decrease according to the values. If no padding is needed in the range of axis, `0` should be set. On category axis, this option
    * will be ignored.
    */
  var padding: js.UndefOr[Padding] = js.undefined
  
  /**
    * Show or hide the axis.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}
object AxisConfiguration {
  
  inline def apply(): AxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisConfiguration]
  }
  
  extension [Self <: AxisConfiguration](x: Self) {
    
    inline def setInner(value: Boolean): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
    
    inline def setMax(value: String | Double | js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String | Double | js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
