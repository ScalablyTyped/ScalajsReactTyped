package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashSelection.d3DashSelectionMod.BaseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "customEvent")
@js.native
object customEvent extends js.Object {
  def apply[Context, Result](
    event: BaseEvent,
    listener: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, Result],
    that: Context,
    args: js.Any*
  ): Result = js.native
}

