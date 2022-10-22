package typingsJapgolly.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowColor extends StObject {
  
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example
    * `'rgb(128, 128, 128)'`.
    * RGBA can be used when you need alpha channel,
    * for example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for
    * example `'#ccc'`.
    * Gradient color and texture are also supported
    * besides single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle.emphasis)
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.color
    */
  var color: js.UndefOr[typingsJapgolly.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Edge curvature, which supports value from
    * 0 to 1.
    * The larger the value, the greater the curvature.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.curveness
    */
  var curveness: js.UndefOr[Double] = js.undefined
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with
    * `shadowColor`,`shadowOffsetX`, `shadowOffsetY`
    * to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle.emphasis)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color.
    * Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.shadowColor
    */
  var shadowColor: js.UndefOr[typingsJapgolly.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Offset distance on the horizontal direction
    * of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance on the vertical direction
    * of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * line type.
    *
    * Options are:
    *
    * + `'solid'`
    * + `'dashed'`
    * + `'dotted'`
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * line width.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis.width
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ShadowColor {
  
  inline def apply(): ShadowColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowColor]
  }
  
  extension [Self <: ShadowColor](x: Self) {
    
    inline def setColor(value: typingsJapgolly.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCurveness(value: Double): Self = StObject.set(x, "curveness", value.asInstanceOf[js.Any])
    
    inline def setCurvenessUndefined: Self = StObject.set(x, "curveness", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: typingsJapgolly.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
