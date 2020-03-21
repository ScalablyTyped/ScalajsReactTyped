package typingsJapgolly.expect

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expect.typesMod.Tester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIterableEquality extends js.Object {
  var iterableEquality: Tester
  var subsetEquality: Tester
}

object AnonIterableEquality {
  @scala.inline
  def apply(
    iterableEquality: (/* a */ js.Any, /* b */ js.Any) => CallbackTo[js.UndefOr[Boolean]],
    subsetEquality: (/* a */ js.Any, /* b */ js.Any) => CallbackTo[js.UndefOr[Boolean]]
  ): AnonIterableEquality = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iterableEquality")(js.Any.fromFunction2((t0: /* a */ js.Any, t1: /* b */ js.Any) => iterableEquality(t0, t1).runNow()))
    __obj.updateDynamic("subsetEquality")(js.Any.fromFunction2((t0: /* a */ js.Any, t1: /* b */ js.Any) => subsetEquality(t0, t1).runNow()))
    __obj.asInstanceOf[AnonIterableEquality]
  }
}

