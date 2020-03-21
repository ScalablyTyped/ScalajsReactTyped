package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object Anon9 {
  @scala.inline
  def apply(renderer: TooltipContext => CallbackTo[AnonInsert | AnonPreventDefault]): Anon9 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon9]
  }
}

