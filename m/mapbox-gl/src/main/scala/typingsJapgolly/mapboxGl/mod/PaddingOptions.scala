package typingsJapgolly.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingOptions extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object PaddingOptions {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): PaddingOptions = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaddingOptions]
  }
}

