package typingsJapgolly.pleaseUpgradeNode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exitCode: Double
  def message(version: String): String
}

object Options {
  @scala.inline
  def apply(exitCode: Double, message: String => CallbackTo[String]): Options = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(js.Any.fromFunction1((t0: java.lang.String) => message(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

