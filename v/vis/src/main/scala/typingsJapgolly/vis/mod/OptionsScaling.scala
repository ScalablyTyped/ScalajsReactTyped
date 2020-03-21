package typingsJapgolly.vis.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vis.AnonDrawThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsScaling extends js.Object {
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* total */ js.UndefOr[Double], 
      /* value */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  var label: js.UndefOr[Boolean | AnonDrawThreshold] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object OptionsScaling {
  @scala.inline
  def apply(
    customScalingFunction: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* total */ js.UndefOr[Double], /* value */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    label: Boolean | AnonDrawThreshold = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): OptionsScaling = {
    val __obj = js.Dynamic.literal()
    if (customScalingFunction != null) __obj.updateDynamic("customScalingFunction")(js.Any.fromFunction4((t0: /* min */ js.UndefOr[scala.Double], t1: /* max */ js.UndefOr[scala.Double], t2: /* total */ js.UndefOr[scala.Double], t3: /* value */ js.UndefOr[scala.Double]) => customScalingFunction(t0, t1, t2, t3).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsScaling]
  }
}

