package typingsJapgolly.connectLivereload.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var `match`: js.RegExp
  def fn(w: String, s: String): String
}

object Rule {
  @scala.inline
  def apply(fn: (String, String) => CallbackTo[String], `match`: js.RegExp): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => fn(t0, t1).runNow()))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

