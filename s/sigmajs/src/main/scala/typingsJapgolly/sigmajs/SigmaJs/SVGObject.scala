package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGObject[T] extends js.Object {
  def create(`object`: T, a: js.Any*): Element
  def update(`object`: T, a: js.Any*): Unit
}

object SVGObject {
  @scala.inline
  def apply[T](
    create: (T, /* repeated */ js.Any) => CallbackTo[Element],
    update: (T, /* repeated */ js.Any) => Callback
  ): SVGObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: T, t1: /* repeated */ js.Any) => create(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: T, t1: /* repeated */ js.Any) => update(t0, t1).runNow()))
    __obj.asInstanceOf[SVGObject[T]]
  }
}

