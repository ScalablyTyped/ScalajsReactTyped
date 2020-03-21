package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.scaleMod.ScaleInterpolate
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typingsJapgolly.vegaTypings.vegaTypingsStrings.cubehelix
import typingsJapgolly.vegaTypings.vegaTypingsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGamma extends ScaleInterpolate {
  var gamma: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef
}

object AnonGamma {
  @scala.inline
  def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef, gamma: Double | SignalRef = null): AnonGamma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGamma]
  }
}

