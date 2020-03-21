package typingsJapgolly.readableStream

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterTransform extends js.Object {
  var needTransform: Boolean
  var transforming: Boolean
  var writecb: (js.Function1[/* err */ js.Any, _]) | Null
  var writechunk: js.Any
   // TODO
  var writeencoding: String | Null
  def afterTransform(er: js.Any, data: js.Any): Unit | Boolean
}

object AnonAfterTransform {
  @scala.inline
  def apply(
    afterTransform: (js.Any, js.Any) => CallbackTo[Unit | Boolean],
    needTransform: Boolean,
    transforming: Boolean,
    writechunk: js.Any,
    writecb: /* err */ js.Any => CallbackTo[js.Any] = null,
    writeencoding: String = null
  ): AnonAfterTransform = {
    val __obj = js.Dynamic.literal(needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any])
    __obj.updateDynamic("afterTransform")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => afterTransform(t0, t1).runNow()))
    if (writecb != null) __obj.updateDynamic("writecb")(js.Any.fromFunction1((t0: /* err */ js.Any) => writecb(t0).runNow()))
    if (writeencoding != null) __obj.updateDynamic("writeencoding")(writeencoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfterTransform]
  }
}

