package typingsJapgolly.zapierPlatformCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(): js.Promise[String]
  def set(cursor: String): js.Promise[Null]
}

object AnonGet {
  @scala.inline
  def apply(get: CallbackTo[js.Promise[String]], set: String => CallbackTo[js.Promise[Null]]): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[AnonGet]
  }
}

