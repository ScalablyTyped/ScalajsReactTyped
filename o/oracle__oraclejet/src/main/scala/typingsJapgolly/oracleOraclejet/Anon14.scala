package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], AnonInsert | AnonPreventDefault]) | Null
}

object Anon14 {
  @scala.inline
  def apply[K](renderer: /* context */ TooltipContext[K] => CallbackTo[AnonInsert | AnonPreventDefault] = null): Anon14[K] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext[K]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon14[K]]
  }
}

