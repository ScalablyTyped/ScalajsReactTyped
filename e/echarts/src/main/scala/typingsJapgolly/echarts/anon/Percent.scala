package typingsJapgolly.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percent extends StObject {
  
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.percent
    */
  var percent: js.UndefOr[Double] = js.undefined
  
  /**
    * x value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.x1
    */
  var x1: js.UndefOr[Double] = js.undefined
  
  /**
    * x value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.x2
    */
  var x2: js.UndefOr[Double] = js.undefined
  
  /**
    * y value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.y1
    */
  var y1: js.UndefOr[Double] = js.undefined
  
  /**
    * y value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.y2
    */
  var y2: js.UndefOr[Double] = js.undefined
}
object Percent {
  
  inline def apply(): Percent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percent]
  }
  
  extension [Self <: Percent](x: Self) {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
