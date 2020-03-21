package typingsJapgolly.reactToggled.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactToggledProps extends js.Object {
  val children: ChildrenFunction
  val defaultOn: js.UndefOr[Boolean] = js.undefined
  val on: js.UndefOr[Boolean] = js.undefined
  val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.undefined
}

object ReactToggledProps {
  @scala.inline
  def apply(
    children: /* options */ TogglerStateAndHelpers => CallbackTo[Node],
    defaultOn: js.UndefOr[Boolean] = js.undefined,
    on: js.UndefOr[Boolean] = js.undefined,
    onToggle: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Callback = null
  ): ReactToggledProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.reactToggled.mod.TogglerStateAndHelpers) => children(t0).runNow()))
    if (!js.isUndefined(defaultOn)) __obj.updateDynamic("defaultOn")(defaultOn.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2((t0: /* on */ scala.Boolean, t1: /* object */ typingsJapgolly.reactToggled.mod.TogglerStateAndHelpers) => onToggle(t0, t1).runNow()))
    __obj.asInstanceOf[ReactToggledProps]
  }
}

