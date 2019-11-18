package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashInterpolate.d3DashInterpolateMod.ZoomInterpolator
import typingsJapgolly.d3DashInterpolate.d3DashInterpolateMod.ZoomView
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

