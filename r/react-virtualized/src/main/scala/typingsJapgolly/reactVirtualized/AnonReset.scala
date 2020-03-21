package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactVirtualized.esMasonryMod.resetParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  def reset(params: resetParams): Unit
}

object AnonReset {
  @scala.inline
  def apply(reset: resetParams => Callback): AnonReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esMasonryMod.resetParams) => reset(t0).runNow()))
    __obj.asInstanceOf[AnonReset]
  }
}

