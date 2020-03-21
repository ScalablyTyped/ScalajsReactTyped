package typingsJapgolly.postcssModulesExtractImports.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var createImportedName: js.UndefOr[js.Function2[/* importName */ String, /* importPath */ String, String]] = js.undefined
  var failOnWrongOrder: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    createImportedName: (/* importName */ String, /* importPath */ String) => CallbackTo[String] = null,
    failOnWrongOrder: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (createImportedName != null) __obj.updateDynamic("createImportedName")(js.Any.fromFunction2((t0: /* importName */ java.lang.String, t1: /* importPath */ java.lang.String) => createImportedName(t0, t1).runNow()))
    if (!js.isUndefined(failOnWrongOrder)) __obj.updateDynamic("failOnWrongOrder")(failOnWrongOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

