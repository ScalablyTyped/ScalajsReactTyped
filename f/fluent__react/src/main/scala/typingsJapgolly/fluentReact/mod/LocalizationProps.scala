package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProps extends js.Object {
  var getString: GetString
}

object LocalizationProps {
  @scala.inline
  def apply(
    getString: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => CallbackTo[String]
  ): LocalizationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getString")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* args */ js.UndefOr[js.Object], t2: /* fallback */ js.UndefOr[java.lang.String]) => getString(t0, t1, t2).runNow()))
    __obj.asInstanceOf[LocalizationProps]
  }
}

