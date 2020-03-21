package typingsJapgolly.angularTooltips.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipsConfProvider extends js.Object {
  def configure(options: TooltipsConfProviderOptions): Unit
}

object TooltipsConfProvider {
  @scala.inline
  def apply(configure: TooltipsConfProviderOptions => Callback): TooltipsConfProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.angularTooltips.mod.TooltipsConfProviderOptions) => configure(t0).runNow()))
    __obj.asInstanceOf[TooltipsConfProvider]
  }
}

