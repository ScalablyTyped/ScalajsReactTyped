package typingsJapgolly.amcharts

import typingsJapgolly.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraph extends js.Object {
  var chart: default
  var graph: typingsJapgolly.amcharts.amGraphMod.default
  var index: Double
  var item: typingsJapgolly.amcharts.graphDataItemMod.default
  var `type`: String
}

object AnonGraph {
  @scala.inline
  def apply(
    chart: default,
    graph: typingsJapgolly.amcharts.amGraphMod.default,
    index: Double,
    item: typingsJapgolly.amcharts.graphDataItemMod.default,
    `type`: String
  ): AnonGraph = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraph]
  }
}

