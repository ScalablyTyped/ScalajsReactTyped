package typingsJapgolly.flexmonster

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flexmonster.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.undefined
  var slice: js.UndefOr[Slice] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(
    prepareDataFunction: /* rawData */ js.Any => CallbackTo[js.Any] = null,
    slice: Slice = null,
    `type`: String = null
  ): AnonType = {
    val __obj = js.Dynamic.literal()
    if (prepareDataFunction != null) __obj.updateDynamic("prepareDataFunction")(js.Any.fromFunction1((t0: /* rawData */ js.Any) => prepareDataFunction(t0).runNow()))
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

