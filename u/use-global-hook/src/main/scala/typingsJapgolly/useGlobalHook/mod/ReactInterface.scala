package typingsJapgolly.useGlobalHook.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactInterface extends js.Object {
  def useEffect(args: js.Any*): js.Any
  def useMemo(args: js.Any*): js.Any
  def useState(args: js.Any*): js.Any
}

object ReactInterface {
  @scala.inline
  def apply(
    useEffect: /* repeated */ js.Any => CallbackTo[js.Any],
    useMemo: /* repeated */ js.Any => CallbackTo[js.Any],
    useState: /* repeated */ js.Any => CallbackTo[js.Any]
  ): ReactInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useEffect")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => useEffect(t0).runNow()))
    __obj.updateDynamic("useMemo")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => useMemo(t0).runNow()))
    __obj.updateDynamic("useState")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => useState(t0).runNow()))
    __obj.asInstanceOf[ReactInterface]
  }
}

