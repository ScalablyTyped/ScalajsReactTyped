package typingsJapgolly.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Baseline extends js.Object {
  var has_baseline: Boolean
  var x0: Double
  var x1: Double
  var y0: Double
  var y1: Double
}

object Baseline {
  @scala.inline
  def apply(has_baseline: Boolean, x0: Double, x1: Double, y0: Double, y1: Double): Baseline = {
    val __obj = js.Dynamic.literal(has_baseline = has_baseline.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Baseline]
  }
}

