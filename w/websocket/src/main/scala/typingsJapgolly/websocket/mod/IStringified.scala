package typingsJapgolly.websocket.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringified extends js.Object {
  def toString(args: js.Any*): String
}

object IStringified {
  @scala.inline
  def apply(toString: /* repeated */ js.Any => CallbackTo[String]): IStringified = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toString(t0).runNow()))
    __obj.asInstanceOf[IStringified]
  }
}

