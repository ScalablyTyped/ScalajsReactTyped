package typingsJapgolly.chrome.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /** The height of the display in pixels. */
  var height: Double
  /**  The x-coordinate of the upper-left corner. */
  var left: Double
  /**  The y-coordinate of the upper-left corner. */
  var top: Double
  /** The width of the display in pixels. */
  var width: Double
}

object Bounds {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds]
  }
}

