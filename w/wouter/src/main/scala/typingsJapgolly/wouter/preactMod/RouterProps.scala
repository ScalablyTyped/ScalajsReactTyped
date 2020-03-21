package typingsJapgolly.wouter.preactMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var base: Path
  var hook: LocationHook
  var matcher: MatcherFn
}

object RouterProps {
  @scala.inline
  def apply(
    base: Path,
    hook: /* options */ js.UndefOr[LocationHookOptions] => CallbackTo[LocationTuple],
    matcher: (/* pattern */ Path, /* path */ Path) => CallbackTo[Match[DefaultParams]]
  ): RouterProps = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("hook")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.wouter.preactMod.LocationHookOptions]) => hook(t0).runNow()))
    __obj.updateDynamic("matcher")(js.Any.fromFunction2((t0: /* pattern */ typingsJapgolly.wouter.preactMod.Path, t1: /* path */ typingsJapgolly.wouter.preactMod.Path) => matcher(t0, t1).runNow()))
    __obj.asInstanceOf[RouterProps]
  }
}

