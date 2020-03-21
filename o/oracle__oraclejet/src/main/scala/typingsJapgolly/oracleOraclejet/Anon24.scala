package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon24[K] extends js.Object {
  def renderer(context: TooltipContext[K]): AnonInsert | AnonPreventDefault
}

object Anon24 {
  @scala.inline
  def apply[K](renderer: TooltipContext[K] => CallbackTo[AnonInsert | AnonPreventDefault]): Anon24[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext[K]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon24[K]]
  }
}

