package typingsJapgolly.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBubbleData extends ISeriesData {
  var radius: js.Array[Double]
}

object IBubbleData {
  @scala.inline
  def apply(labels: js.Array[String], radius: js.Array[Double], source: js.Any, values: js.Array[Double]): IBubbleData = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBubbleData]
  }
}

