package typingsJapgolly.vegaTypings.signalMod

import typingsJapgolly.vegaTypings.bindMod.Binding
import typingsJapgolly.vegaTypings.exprMod.Expr
import typingsJapgolly.vegaTypings.onEventsMod.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewSignal
  extends BaseSignal
     with Signal {
  var bind: js.UndefOr[Binding] = js.undefined
  var react: js.UndefOr[Boolean] = js.undefined
  var update: js.UndefOr[Expr] = js.undefined
  var value: js.UndefOr[SignalValue] = js.undefined
}

object NewSignal {
  @scala.inline
  def apply(
    name: String,
    bind: Binding = null,
    description: String = null,
    on: js.Array[OnEvent] = null,
    react: js.UndefOr[Boolean] = js.undefined,
    update: Expr = null,
    value: SignalValue = null
  ): NewSignal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (!js.isUndefined(react)) __obj.updateDynamic("react")(react.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewSignal]
  }
}

