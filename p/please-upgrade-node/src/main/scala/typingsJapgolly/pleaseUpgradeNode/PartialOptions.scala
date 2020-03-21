package typingsJapgolly.pleaseUpgradeNode

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<please-upgrade-node.please-upgrade-node.Options> */
trait PartialOptions extends js.Object {
  var exitCode: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[js.Function1[/* version */ String, String]] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(exitCode: Int | Double = null, message: /* version */ String => CallbackTo[String] = null): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction1((t0: /* version */ java.lang.String) => message(t0).runNow()))
    __obj.asInstanceOf[PartialOptions]
  }
}

