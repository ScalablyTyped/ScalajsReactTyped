package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransform extends js.Object {
  def transform(value: js.Any, args: js.Any*): js.Any
}

object PipeTransform {
  @scala.inline
  def apply(transform: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any]): PipeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => transform(t0, t1).runNow()))
    __obj.asInstanceOf[PipeTransform]
  }
}

