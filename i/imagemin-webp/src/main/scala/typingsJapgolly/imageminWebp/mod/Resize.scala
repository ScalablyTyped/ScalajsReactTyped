package typingsJapgolly.imageminWebp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resize extends js.Object {
  var height: Double
  var width: Double
}

object Resize {
  @scala.inline
  def apply(height: Double, width: Double): Resize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resize]
  }
}

