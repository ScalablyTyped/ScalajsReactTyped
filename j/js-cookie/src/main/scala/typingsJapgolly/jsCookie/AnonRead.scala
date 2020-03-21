package typingsJapgolly.jsCookie

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsCookie.mod.CookieReadConverter
import typingsJapgolly.jsCookie.mod.CookieWriteConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRead[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[CookieReadConverter] = js.undefined
  var write: js.UndefOr[CookieWriteConverter[TConv]] = js.undefined
}

object AnonRead {
  @scala.inline
  def apply[TConv /* <: js.Object */](
    read: (/* value */ String, /* name */ String) => CallbackTo[String] = null,
    write: (/* value */ String | TConv, /* name */ String) => CallbackTo[String] = null
  ): AnonRead[TConv] = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* name */ java.lang.String) => read(t0, t1).runNow()))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2((t0: /* value */ java.lang.String | TConv, t1: /* name */ java.lang.String) => write(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRead[TConv]]
  }
}

