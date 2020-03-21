package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon26[K, D] extends js.Object {
  def renderer(context: NodeContentContext[K, D]): AnonInsert
}

object Anon26 {
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => CallbackTo[AnonInsert]): Anon26[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext[K, D]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon26[K, D]]
  }
}

