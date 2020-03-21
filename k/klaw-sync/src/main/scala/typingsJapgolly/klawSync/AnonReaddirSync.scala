package typingsJapgolly.klawSync

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReaddirSync extends js.Object {
  def readdirSync(path: String): js.Array[String]
  def statSync(path: String): Stats
}

object AnonReaddirSync {
  @scala.inline
  def apply(readdirSync: String => CallbackTo[js.Array[String]], statSync: String => CallbackTo[Stats]): AnonReaddirSync = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readdirSync")(js.Any.fromFunction1((t0: java.lang.String) => readdirSync(t0).runNow()))
    __obj.updateDynamic("statSync")(js.Any.fromFunction1((t0: java.lang.String) => statSync(t0).runNow()))
    __obj.asInstanceOf[AnonReaddirSync]
  }
}

