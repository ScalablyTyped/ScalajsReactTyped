package typingsJapgolly.postcssModulesScope.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var generateScopedName: js.UndefOr[
    js.Function3[/* exportedName */ String, /* path */ String, /* css */ String, String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    generateScopedName: (/* exportedName */ String, /* path */ String, /* css */ String) => CallbackTo[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (generateScopedName != null) __obj.updateDynamic("generateScopedName")(js.Any.fromFunction3((t0: /* exportedName */ java.lang.String, t1: /* path */ java.lang.String, t2: /* css */ java.lang.String) => generateScopedName(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

