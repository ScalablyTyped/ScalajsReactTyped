package typingsJapgolly.svgjsDraggable.svgjs.draggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDelta extends js.Object {
  var x: Double
  var y: Double
  var zoom: Double
}

object DragDelta {
  @scala.inline
  def apply(x: Double, y: Double, zoom: Double): DragDelta = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DragDelta]
  }
}

