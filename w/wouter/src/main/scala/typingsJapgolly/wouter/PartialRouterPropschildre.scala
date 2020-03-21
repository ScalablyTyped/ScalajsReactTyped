package typingsJapgolly.wouter

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wouter.mod.DefaultParams
import typingsJapgolly.wouter.mod.LocationHook
import typingsJapgolly.wouter.mod.LocationHookOptions
import typingsJapgolly.wouter.mod.LocationTuple
import typingsJapgolly.wouter.mod.Match
import typingsJapgolly.wouter.mod.MatcherFn
import typingsJapgolly.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wouter.wouter.RouterProps> & {  children  :react.react.ReactNode} */
trait PartialRouterPropschildre extends js.Object {
  var base: js.UndefOr[Path] = js.undefined
  var children: Node
  var hook: js.UndefOr[LocationHook] = js.undefined
  var matcher: js.UndefOr[MatcherFn] = js.undefined
}

object PartialRouterPropschildre {
  @scala.inline
  def apply(
    base: Path = null,
    children: VdomNode = null,
    hook: /* options */ js.UndefOr[LocationHookOptions] => CallbackTo[LocationTuple] = null,
    matcher: (/* pattern */ Path, /* path */ Path) => CallbackTo[Match[DefaultParams]] = null
  ): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.wouter.mod.LocationHookOptions]) => hook(t0).runNow()))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2((t0: /* pattern */ typingsJapgolly.wouter.mod.Path, t1: /* path */ typingsJapgolly.wouter.mod.Path) => matcher(t0, t1).runNow()))
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
}

