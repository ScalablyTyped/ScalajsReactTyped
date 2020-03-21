package typingsJapgolly.plottable

import typingsJapgolly.plottable.plottableStrings.canvas
import typingsJapgolly.plottable.plottableStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvas extends js.Object {
  var canvas: typingsJapgolly.plottable.plottableStrings.canvas
  var svg: typingsJapgolly.plottable.plottableStrings.svg
}

object AnonCanvas {
  @scala.inline
  def apply(canvas: canvas, svg: svg): AnonCanvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCanvas]
  }
}

