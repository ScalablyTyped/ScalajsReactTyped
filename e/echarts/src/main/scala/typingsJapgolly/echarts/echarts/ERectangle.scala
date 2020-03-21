package typingsJapgolly.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERectangle extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object ERectangle {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): ERectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ERectangle]
  }
}

