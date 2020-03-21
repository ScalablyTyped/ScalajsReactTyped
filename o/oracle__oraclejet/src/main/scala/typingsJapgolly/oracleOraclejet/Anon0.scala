package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext, AnonInsert | AnonPreventDefault]) | Null
}

object Anon0 {
  @scala.inline
  def apply(renderer: /* context */ TooltipContext => CallbackTo[AnonInsert | AnonPreventDefault] = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart.TooltipContext) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon0]
  }
}

