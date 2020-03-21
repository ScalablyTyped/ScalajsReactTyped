package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  def renderer(context: CenterContext): AnonInsert | AnonPreventDefault
}

object Anon10 {
  @scala.inline
  def apply(renderer: CenterContext => CallbackTo[AnonInsert | AnonPreventDefault]): Anon10 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon10]
  }
}

