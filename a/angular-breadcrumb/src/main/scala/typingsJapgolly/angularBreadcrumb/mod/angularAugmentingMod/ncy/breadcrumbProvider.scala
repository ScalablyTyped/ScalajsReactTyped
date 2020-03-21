package typingsJapgolly.angularBreadcrumb.mod.angularAugmentingMod.ncy

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait breadcrumbProvider extends js.Object {
  /**
    * Setter for options defined in a module.config block
    **/
  def setOptions(options: breadcrumbProviderOptions): Unit
}

object breadcrumbProvider {
  @scala.inline
  def apply(setOptions: breadcrumbProviderOptions => Callback): breadcrumbProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.angularBreadcrumb.mod.angularAugmentingMod.ncy.breadcrumbProviderOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[breadcrumbProvider]
  }
}

