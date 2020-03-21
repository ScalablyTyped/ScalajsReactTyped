package typingsJapgolly.aureliaDependencyInjection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object AnonGet {
  @scala.inline
  def apply(get: (Container, js.Any) => CallbackTo[js.Any]): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: typingsJapgolly.aureliaDependencyInjection.mod.Container, t1: js.Any) => get(t0, t1).runNow()))
    __obj.asInstanceOf[AnonGet]
  }
}

