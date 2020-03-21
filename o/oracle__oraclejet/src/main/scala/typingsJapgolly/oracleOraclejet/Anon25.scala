package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon25[K1, K2, K3, D1, D2, D3] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, K3, D1, D2, D3]): AnonInsert | AnonPreventDefault
}

object Anon25 {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](renderer: TooltipContext[K1, K2, K3, D1, D2, D3] => CallbackTo[AnonInsert | AnonPreventDefault]): Anon25[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext[K1, K2, K3, D1, D2, D3]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon25[K1, K2, K3, D1, D2, D3]]
  }
}

