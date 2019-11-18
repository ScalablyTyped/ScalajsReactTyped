package typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  unit  :string,   step  :number} & @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoints> */
trait BreakpointsOptions extends js.Object {
  var between: js.UndefOr[js.Function2[/* start */ Breakpoint, /* end */ Breakpoint, String]] = js.undefined
  var down: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.undefined
  var keys: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var only: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var up: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.undefined
  var values: js.UndefOr[BreakpointValues] = js.undefined
  var width: js.UndefOr[js.Function1[/* key */ Breakpoint, Double]] = js.undefined
}

object BreakpointsOptions {
  @scala.inline
  def apply(
    between: (/* start */ Breakpoint, /* end */ Breakpoint) => CallbackTo[String] = null,
    down: /* key */ Breakpoint | Double => CallbackTo[String] = null,
    keys: js.Array[Breakpoint] = null,
    only: /* key */ Breakpoint => CallbackTo[String] = null,
    step: Int | Double = null,
    unit: String = null,
    up: /* key */ Breakpoint | Double => CallbackTo[String] = null,
    values: BreakpointValues = null,
    width: /* key */ Breakpoint => CallbackTo[Double] = null
  ): BreakpointsOptions = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(js.Any.fromFunction2((t0: /* start */ typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint, t1: /* end */ typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint) => between(t0, t1).runNow()))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint | scala.Double) => down(t0).runNow()))
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint) => only(t0).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint | scala.Double) => up(t0).runNow()))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint) => width(t0).runNow()))
    __obj.asInstanceOf[BreakpointsOptions]
  }
}

