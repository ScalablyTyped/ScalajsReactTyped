package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInflate extends js.Object {
  var inflate: js.UndefOr[js.Function2[/* src */ js.Object, /* dest */ js.UndefOr[js.Object], Unit]] = js.undefined
  var proto: js.UndefOr[js.Any] = js.undefined
}

object AnonInflate {
  @scala.inline
  def apply(
    inflate: (/* src */ js.Object, /* dest */ js.UndefOr[js.Object]) => Callback = null,
    proto: js.Any = null
  ): AnonInflate = {
    val __obj = js.Dynamic.literal()
    if (inflate != null) __obj.updateDynamic("inflate")(js.Any.fromFunction2((t0: /* src */ js.Object, t1: /* dest */ js.UndefOr[js.Object]) => inflate(t0, t1).runNow()))
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInflate]
  }
}

