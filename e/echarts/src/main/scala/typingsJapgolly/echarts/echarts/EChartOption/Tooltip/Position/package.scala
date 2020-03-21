package typingsJapgolly.echarts.echarts.EChartOption.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Position {
  type Fn = js.Function5[
    /* point */ js.Array[scala.Double | java.lang.String], 
    /* params */ js.Object | js.Array[js.Object], 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* rect */ js.Object, 
    /* size */ js.Object, 
    (js.Array[scala.Double | java.lang.String]) | typingsJapgolly.echarts.echarts.EChartOption.Tooltip.Position.Obj
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.echarts.echarts.EChartOption.Tooltip.Position.Str
    - typingsJapgolly.echarts.echarts.EChartOption.Tooltip.Position.Obj
    - js.Array[scala.Double | java.lang.String]
    - typingsJapgolly.echarts.echarts.EChartOption.Tooltip.Position.Fn
  */
  type Type = typingsJapgolly.echarts.echarts.EChartOption.Tooltip.Position._Type | (js.Array[scala.Double | java.lang.String]) | typingsJapgolly.echarts.echarts.EChartOption.Tooltip.Position.Fn
}
