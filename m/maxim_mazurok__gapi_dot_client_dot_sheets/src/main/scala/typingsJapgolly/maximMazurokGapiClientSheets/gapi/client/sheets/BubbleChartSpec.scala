package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleChartSpec extends StObject {
  
  /** The bubble border color. Deprecated: Use bubble_border_color_style. */
  var bubbleBorderColor: js.UndefOr[Color] = js.undefined
  
  /** The bubble border color. If bubble_border_color is also set, this field takes precedence. */
  var bubbleBorderColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** The data containing the bubble labels. These do not need to be unique. */
  var bubbleLabels: js.UndefOr[ChartData] = js.undefined
  
  /** The max radius size of the bubbles, in pixels. If specified, the field must be a positive value. */
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.undefined
  
  /** The minimum radius size of the bubbles, in pixels. If specific, the field must be a positive value. */
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.undefined
  
  /** The opacity of the bubbles between 0 and 1.0. 0 is fully transparent and 1 is fully opaque. */
  var bubbleOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The data containing the bubble sizes. Bubble sizes are used to draw the bubbles at different sizes relative to each other. If specified, group_ids must also be specified. This field
    * is optional.
    */
  var bubbleSizes: js.UndefOr[ChartData] = js.undefined
  
  /** The format of the text inside the bubbles. Strikethrough, underline, and link are not supported. */
  var bubbleTextStyle: js.UndefOr[TextFormat] = js.undefined
  
  /** The data containing the bubble x-values. These values locate the bubbles in the chart horizontally. */
  var domain: js.UndefOr[ChartData] = js.undefined
  
  /**
    * The data containing the bubble group IDs. All bubbles with the same group ID are drawn in the same color. If bubble_sizes is specified then this field must also be specified but may
    * contain blank values. This field is optional.
    */
  var groupIds: js.UndefOr[ChartData] = js.undefined
  
  /** Where the legend of the chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.undefined
  
  /** The data containing the bubble y-values. These values locate the bubbles in the chart vertically. */
  var series: js.UndefOr[ChartData] = js.undefined
}
object BubbleChartSpec {
  
  inline def apply(): BubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleChartSpec]
  }
  
  extension [Self <: BubbleChartSpec](x: Self) {
    
    inline def setBubbleBorderColor(value: Color): Self = StObject.set(x, "bubbleBorderColor", value.asInstanceOf[js.Any])
    
    inline def setBubbleBorderColorStyle(value: ColorStyle): Self = StObject.set(x, "bubbleBorderColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBubbleBorderColorStyleUndefined: Self = StObject.set(x, "bubbleBorderColorStyle", js.undefined)
    
    inline def setBubbleBorderColorUndefined: Self = StObject.set(x, "bubbleBorderColor", js.undefined)
    
    inline def setBubbleLabels(value: ChartData): Self = StObject.set(x, "bubbleLabels", value.asInstanceOf[js.Any])
    
    inline def setBubbleLabelsUndefined: Self = StObject.set(x, "bubbleLabels", js.undefined)
    
    inline def setBubbleMaxRadiusSize(value: Double): Self = StObject.set(x, "bubbleMaxRadiusSize", value.asInstanceOf[js.Any])
    
    inline def setBubbleMaxRadiusSizeUndefined: Self = StObject.set(x, "bubbleMaxRadiusSize", js.undefined)
    
    inline def setBubbleMinRadiusSize(value: Double): Self = StObject.set(x, "bubbleMinRadiusSize", value.asInstanceOf[js.Any])
    
    inline def setBubbleMinRadiusSizeUndefined: Self = StObject.set(x, "bubbleMinRadiusSize", js.undefined)
    
    inline def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
    
    inline def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
    
    inline def setBubbleSizes(value: ChartData): Self = StObject.set(x, "bubbleSizes", value.asInstanceOf[js.Any])
    
    inline def setBubbleSizesUndefined: Self = StObject.set(x, "bubbleSizes", js.undefined)
    
    inline def setBubbleTextStyle(value: TextFormat): Self = StObject.set(x, "bubbleTextStyle", value.asInstanceOf[js.Any])
    
    inline def setBubbleTextStyleUndefined: Self = StObject.set(x, "bubbleTextStyle", js.undefined)
    
    inline def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setGroupIds(value: ChartData): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
    
    inline def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
