package typingsJapgolly.nodeForge.mod.random

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Random extends js.Object {
  def seedFile(needed: Double, cb: CB): Unit
  def seedFileSync(needed: Double): String
}

object Random {
  @scala.inline
  def apply(seedFile: (Double, CB) => Callback, seedFileSync: Double => CallbackTo[String]): Random = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("seedFile")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeForge.mod.random.CB) => seedFile(t0, t1).runNow()))
    __obj.updateDynamic("seedFileSync")(js.Any.fromFunction1((t0: scala.Double) => seedFileSync(t0).runNow()))
    __obj.asInstanceOf[Random]
  }
}

