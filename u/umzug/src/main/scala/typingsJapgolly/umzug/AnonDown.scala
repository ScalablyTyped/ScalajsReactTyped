package typingsJapgolly.umzug

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDown extends js.Object {
  var down: js.UndefOr[js.Function0[js.Thenable[_]]] = js.undefined
  def up(): js.Thenable[_]
}

object AnonDown {
  @scala.inline
  def apply(
    up: CallbackTo[js.Thenable[js.Any]],
    down: js.UndefOr[CallbackTo[js.Thenable[js.Any]]] = js.undefined
  ): AnonDown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("up")(up.toJsFn)
    down.foreach(p => __obj.updateDynamic("down")(p.toJsFn))
    __obj.asInstanceOf[AnonDown]
  }
}

