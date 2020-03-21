package typingsJapgolly.carlo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  /**
    * Height in pixels.
    */
  var height: Double
  /**
    * Left offset in pixels.
    */
  var left: Double
  /**
    * Top offset in pixels.
    */
  var top: Double
  /**
    * Width in pixels.
    */
  var width: Double
}

object Bounds {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds]
  }
}

