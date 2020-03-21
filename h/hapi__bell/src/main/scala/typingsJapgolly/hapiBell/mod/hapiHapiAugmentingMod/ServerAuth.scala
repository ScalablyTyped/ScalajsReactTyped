package typingsJapgolly.hapiBell.mod.hapiHapiAugmentingMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.hapiBell.hapiBellStrings.bell
import typingsJapgolly.hapiBell.mod.BellOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit
}

object ServerAuth {
  @scala.inline
  def apply(strategy: (String, bell, BellOptions) => Callback): ServerAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strategy")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.hapiBell.hapiBellStrings.bell, t2: typingsJapgolly.hapiBell.mod.BellOptions) => strategy(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ServerAuth]
  }
}

