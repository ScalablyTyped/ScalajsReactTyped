package typingsJapgolly.flexmonster

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flexmonster.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrepareDataFunction extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[Slice] = js.undefined
  var `type`: String
}

object AnonPrepareDataFunction {
  @scala.inline
  def apply(
    `type`: String,
    prepareDataFunction: /* rawData */ js.Any => CallbackTo[js.Any] = null,
    slice: Slice = null
  ): AnonPrepareDataFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1((t0: /* rawData */ js.Any) => prepareDataFunction(t0).runNow()))
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrepareDataFunction]
  }
}

