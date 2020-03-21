package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object Anon8 {
  @scala.inline
  def apply(renderer: TooltipContext => CallbackTo[AnonInsert | AnonPreventDefault]): Anon8 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon8]
  }
}

