package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojtreemapMod.ojTreemap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon27[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): AnonInsert | AnonPreventDefault
}

object Anon27 {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => CallbackTo[AnonInsert | AnonPreventDefault]): Anon27[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojtreemapMod.ojTreemap.TooltipContext[K, D]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon27[K, D]]
  }
}

