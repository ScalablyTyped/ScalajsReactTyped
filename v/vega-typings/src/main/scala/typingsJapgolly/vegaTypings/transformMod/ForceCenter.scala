package typingsJapgolly.vegaTypings.transformMod

import typingsJapgolly.vegaTypings.signalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceCenter extends Force {
  var force: center
  var x: js.UndefOr[Double | SignalRef] = js.undefined
  var y: js.UndefOr[Double | SignalRef] = js.undefined
}

object ForceCenter {
  @scala.inline
  def apply(force: center, x: Double | SignalRef = null, y: Double | SignalRef = null): ForceCenter = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceCenter]
  }
}

