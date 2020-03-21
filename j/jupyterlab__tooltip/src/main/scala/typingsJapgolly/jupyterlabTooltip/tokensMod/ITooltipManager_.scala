package typingsJapgolly.jupyterlabTooltip.tokensMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabTooltip.tokensMod.ITooltipManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipManager_ extends js.Object {
  /**
    * Invoke a tooltip.
    */
  def invoke(options: IOptions): Unit
}

object ITooltipManager_ {
  @scala.inline
  def apply(invoke: IOptions => Callback): ITooltipManager_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invoke")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabTooltip.tokensMod.ITooltipManager.IOptions) => invoke(t0).runNow()))
    __obj.asInstanceOf[ITooltipManager_]
  }
}

