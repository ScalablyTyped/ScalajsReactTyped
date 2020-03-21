package typingsJapgolly.node.querystringMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var encodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(encodeURIComponent: /* str */ String => CallbackTo[String] = null): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (encodeURIComponent != null) __obj.updateDynamic("encodeURIComponent")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => encodeURIComponent(t0).runNow()))
    __obj.asInstanceOf[StringifyOptions]
  }
}

