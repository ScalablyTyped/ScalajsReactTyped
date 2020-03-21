package typingsJapgolly.vegaTypings.signalMod

import typingsJapgolly.vegaTypings.bindMod.Binding
import typingsJapgolly.vegaTypings.exprMod.Expr
import typingsJapgolly.vegaTypings.onEventsMod.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSignal
  extends BaseSignal
     with Signal {
  var bind: js.UndefOr[Binding] = js.undefined
  var init: Expr
  var value: js.UndefOr[SignalValue] = js.undefined
}

object InitSignal {
  @scala.inline
  def apply(
    init: Expr,
    name: String,
    bind: Binding = null,
    description: String = null,
    on: js.Array[OnEvent] = null,
    value: SignalValue = null
  ): InitSignal = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSignal]
  }
}

