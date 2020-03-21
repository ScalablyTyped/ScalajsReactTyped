package typingsJapgolly.wouter

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.preact.mod.ComponentChildren
import typingsJapgolly.wouter.preactMod.DefaultParams
import typingsJapgolly.wouter.preactMod.LocationHook
import typingsJapgolly.wouter.preactMod.LocationHookOptions
import typingsJapgolly.wouter.preactMod.LocationTuple
import typingsJapgolly.wouter.preactMod.Match
import typingsJapgolly.wouter.preactMod.MatcherFn
import typingsJapgolly.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wouter.wouter/preact.RouterProps> & {  children  :preact.preact.ComponentChildren} */
trait PartialRouterPropschildreBase extends js.Object {
  var base: js.UndefOr[Path] = js.undefined
  var children: ComponentChildren
  var hook: js.UndefOr[LocationHook] = js.undefined
  var matcher: js.UndefOr[MatcherFn] = js.undefined
}

object PartialRouterPropschildreBase {
  @scala.inline
  def apply(
    base: Path = null,
    children: ComponentChildren = null,
    hook: /* options */ js.UndefOr[LocationHookOptions] => CallbackTo[LocationTuple] = null,
    matcher: (/* pattern */ Path, /* path */ Path) => CallbackTo[Match[DefaultParams]] = null
  ): PartialRouterPropschildreBase = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.wouter.preactMod.LocationHookOptions]) => hook(t0).runNow()))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2((t0: /* pattern */ typingsJapgolly.wouter.preactMod.Path, t1: /* path */ typingsJapgolly.wouter.preactMod.Path) => matcher(t0, t1).runNow()))
    __obj.asInstanceOf[PartialRouterPropschildreBase]
  }
}

