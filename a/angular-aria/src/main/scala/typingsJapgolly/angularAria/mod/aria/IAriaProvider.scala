package typingsJapgolly.angularAria.mod.aria

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
  */
trait IAriaProvider extends js.Object {
  def config(config: IAriaProviderOptions): Unit
}

object IAriaProvider {
  @scala.inline
  def apply(config: IAriaProviderOptions => Callback): IAriaProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.angularAria.mod.aria.IAriaProviderOptions) => config(t0).runNow()))
    __obj.asInstanceOf[IAriaProvider]
  }
}

