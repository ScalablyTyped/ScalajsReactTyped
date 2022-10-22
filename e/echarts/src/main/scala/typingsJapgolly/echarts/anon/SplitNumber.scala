package typingsJapgolly.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitNumber extends StObject {
  
  /**
    * The length of tick line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.length
    */
  var length: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
  
  /**
    * Whether to show the scale.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The split scale number between split line.
    *
    *
    * @default
    * 5
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.undefined
}
object SplitNumber {
  
  inline def apply(): SplitNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitNumber]
  }
  
  extension [Self <: SplitNumber](x: Self) {
    
    inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSplitNumber(value: Double): Self = StObject.set(x, "splitNumber", value.asInstanceOf[js.Any])
    
    inline def setSplitNumberUndefined: Self = StObject.set(x, "splitNumber", js.undefined)
  }
}
