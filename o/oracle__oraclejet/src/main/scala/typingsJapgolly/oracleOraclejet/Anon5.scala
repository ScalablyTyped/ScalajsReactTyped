package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5[K1, K2, D1, D2] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, D1, D2]): AnonInsert | AnonPreventDefault
}

object Anon5 {
  @scala.inline
  def apply[K1, K2, D1, D2](renderer: TooltipContext[K1, K2, D1, D2] => CallbackTo[AnonInsert | AnonPreventDefault]): Anon5[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext[K1, K2, D1, D2]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon5[K1, K2, D1, D2]]
  }
}

