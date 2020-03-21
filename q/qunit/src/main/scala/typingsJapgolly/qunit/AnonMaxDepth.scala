package typingsJapgolly.qunit

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxDepth extends js.Object {
  var maxDepth: Double
  def parse(data: js.Any): String
}

object AnonMaxDepth {
  @scala.inline
  def apply(maxDepth: Double, parse: js.Any => CallbackTo[String]): AnonMaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: js.Any) => parse(t0).runNow()))
    __obj.asInstanceOf[AnonMaxDepth]
  }
}

