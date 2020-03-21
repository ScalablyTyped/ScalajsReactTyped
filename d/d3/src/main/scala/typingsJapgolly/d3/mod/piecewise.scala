package typingsJapgolly.d3.mod

import typingsJapgolly.d3Interpolate.mod.ZoomInterpolator
import typingsJapgolly.d3Interpolate.mod.ZoomView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "piecewise")
@js.native
object piecewise extends js.Object {
  def apply(
    interpolate: js.Function2[/* a */ ZoomView, /* b */ ZoomView, ZoomInterpolator],
    values: js.Array[ZoomView]
  ): ZoomInterpolator = js.native
}

