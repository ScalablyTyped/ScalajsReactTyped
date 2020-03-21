package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon17[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): AnonInsert | AnonPreventDefault
}

object Anon17 {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => CallbackTo[AnonInsert | AnonPreventDefault]): Anon17[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext[K, D]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon17[K, D]]
  }
}

