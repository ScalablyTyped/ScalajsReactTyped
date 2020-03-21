package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedProps extends js.Object {
  var getString: GetString
}

object InjectedProps {
  @scala.inline
  def apply(getString: (/* id */ String, /* args */ js.UndefOr[js.Object]) => CallbackTo[String]): InjectedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getString")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* args */ js.UndefOr[js.Object]) => getString(t0, t1).runNow()))
    __obj.asInstanceOf[InjectedProps]
  }
}

