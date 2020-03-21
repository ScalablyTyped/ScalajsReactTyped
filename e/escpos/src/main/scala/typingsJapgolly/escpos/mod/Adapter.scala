package typingsJapgolly.escpos.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def open(args: js.Any*): Adapter
  def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter
}

object Adapter {
  @scala.inline
  def apply(
    open: /* repeated */ js.Any => CallbackTo[Adapter],
    write: (Buffer, js.Function1[/* error */ js.UndefOr[js.Any], Unit]) => CallbackTo[Adapter]
  ): Adapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => open(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction2((t0: typingsJapgolly.node.Buffer, t1: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]) => write(t0, t1).runNow()))
    __obj.asInstanceOf[Adapter]
  }
}

