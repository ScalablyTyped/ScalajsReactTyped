package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderer extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object AnonRenderer {
  @scala.inline
  def apply(renderer: TooltipContext => CallbackTo[AnonInsert | AnonPreventDefault]): AnonRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.TooltipContext) => renderer(t0).runNow()))
    __obj.asInstanceOf[AnonRenderer]
  }
}

