package typingsJapgolly.dygraphs.dygraphs

import typingsJapgolly.dygraphs.Dygraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendData extends js.Object {
  /**
    * Dygraph object for this graph
    */
  var dygraph: Dygraph
  /**
    * Series data for the highlighted points
    */
  var series: js.Array[SeriesLegendData]
  /**
    * x value of highlighted points
    */
  var x: Double
  /**
    * Generated HTML for x value
    */
  var xHTML: String
}

object LegendData {
  @scala.inline
  def apply(dygraph: Dygraph, series: js.Array[SeriesLegendData], x: Double, xHTML: String): LegendData = {
    val __obj = js.Dynamic.literal(dygraph = dygraph.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHTML = xHTML.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LegendData]
  }
}

