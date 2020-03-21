package typingsJapgolly.ssri

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPickAlgorithm extends js.Object {
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonPickAlgorithm {
  @scala.inline
  def apply(
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => CallbackTo[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonPickAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2((t0: /* algo1 */ java.lang.String, t1: /* algo2 */ java.lang.String) => pickAlgorithm(t0, t1).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPickAlgorithm]
  }
}

