package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPlotBoxObject extends js.Object {
  var scaleX: Double
  var scaleY: Double
  var translateX: Double
  var translateY: Double
}

object SeriesPlotBoxObject {
  @scala.inline
  def apply(scaleX: Double, scaleY: Double, translateX: Double, translateY: Double): SeriesPlotBoxObject = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeriesPlotBoxObject]
  }
}

