package typingsJapgolly.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SpotLight")
@js.native
class SpotLight protected ()
  extends typingsJapgolly.three.spotLightMod.SpotLight {
  def this(
    color: js.UndefOr[typingsJapgolly.three.colorMod.Color | Double | String],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    exponent: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}

