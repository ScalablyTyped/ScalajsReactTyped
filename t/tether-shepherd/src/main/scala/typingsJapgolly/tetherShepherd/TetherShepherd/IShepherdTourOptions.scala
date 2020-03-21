package typingsJapgolly.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShepherdTourOptions extends js.Object {
  var defaults: js.UndefOr[IShepherdTourStepOptions] = js.undefined
  var steps: js.UndefOr[js.Array[IShepherdTourStep]] = js.undefined
}

object IShepherdTourOptions {
  @scala.inline
  def apply(defaults: IShepherdTourStepOptions = null, steps: js.Array[IShepherdTourStep] = null): IShepherdTourOptions = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShepherdTourOptions]
  }
}

