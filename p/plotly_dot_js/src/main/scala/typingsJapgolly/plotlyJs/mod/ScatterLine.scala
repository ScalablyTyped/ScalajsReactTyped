package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.hv
import typingsJapgolly.plotlyJs.plotlyJsStrings.hvh
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.spline
import typingsJapgolly.plotlyJs.plotlyJsStrings.vh
import typingsJapgolly.plotlyJs.plotlyJsStrings.vhv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterLine extends js.Object {
  var color: Color
  var dash: Dash
  var shape: linear | spline | hv | vh | hvh | vhv
  var simplify: Boolean
  var smoothing: Double
  var width: Double
}

object ScatterLine {
  @scala.inline
  def apply(
    color: Color,
    dash: Dash,
    shape: linear | spline | hv | vh | hvh | vhv,
    simplify: Boolean,
    smoothing: Double,
    width: Double
  ): ScatterLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], simplify = simplify.asInstanceOf[js.Any], smoothing = smoothing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScatterLine]
  }
}

