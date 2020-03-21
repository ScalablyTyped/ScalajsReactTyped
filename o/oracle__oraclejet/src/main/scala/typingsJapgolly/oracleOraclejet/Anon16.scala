package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon16[K, D] extends js.Object {
  def renderer(context: RootNodeContext[K, D]): AnonInsert
}

object Anon16 {
  @scala.inline
  def apply[K, D](renderer: RootNodeContext[K, D] => CallbackTo[AnonInsert]): Anon16[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext[K, D]) => renderer(t0).runNow()))
    __obj.asInstanceOf[Anon16[K, D]]
  }
}

