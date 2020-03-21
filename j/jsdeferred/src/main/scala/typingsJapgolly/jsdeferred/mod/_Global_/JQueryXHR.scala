package typingsJapgolly.jsdeferred.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryXHR extends js.Object {
  def next(fun: js.Function): Deferred
}

object JQueryXHR {
  @scala.inline
  def apply(next: js.Function => CallbackTo[Deferred]): JQueryXHR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: js.Function) => next(t0).runNow()))
    __obj.asInstanceOf[JQueryXHR]
  }
}

