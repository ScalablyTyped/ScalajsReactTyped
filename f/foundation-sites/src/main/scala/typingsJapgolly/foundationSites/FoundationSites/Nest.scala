package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nest extends js.Object {
  def Burn(menu: js.Any, `type`: js.Any): Unit
  def Feather(menu: js.Any, `type`: js.Any): Unit
}

object Nest {
  @scala.inline
  def apply(Burn: (js.Any, js.Any) => Callback, Feather: (js.Any, js.Any) => Callback): Nest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Burn")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => Burn(t0, t1).runNow()))
    __obj.updateDynamic("Feather")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => Feather(t0, t1).runNow()))
    __obj.asInstanceOf[Nest]
  }
}

