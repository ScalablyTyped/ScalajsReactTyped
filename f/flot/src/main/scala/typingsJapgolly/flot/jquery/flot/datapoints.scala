package typingsJapgolly.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait datapoints extends js.Object {
  var format: js.Array[datapointFormat]
  var points: js.Array[Double]
  var pointsize: Double
}

object datapoints {
  @scala.inline
  def apply(format: js.Array[datapointFormat], points: js.Array[Double], pointsize: Double): datapoints = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsize = pointsize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[datapoints]
  }
}

