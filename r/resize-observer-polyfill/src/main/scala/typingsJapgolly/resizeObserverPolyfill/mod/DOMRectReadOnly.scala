package typingsJapgolly.resizeObserverPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  val bottom: Double
  val height: Double
  val left: Double
  val right: Double
  val top: Double
  val width: Double
  val x: Double
  val y: Double
}

object DOMRectReadOnly {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMRectReadOnly]
  }
}

