package typingsJapgolly.cassandraDriver.policiesMod.policies.reconnection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectionPolicy extends js.Object {
  def getOptions(): Map[String, js.Object]
  def newSchedule(): js.Iterator[Double]
}

object ReconnectionPolicy {
  @scala.inline
  def apply(getOptions: CallbackTo[Map[String, js.Object]], newSchedule: CallbackTo[js.Iterator[Double]]): ReconnectionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getOptions")(getOptions.toJsFn)
    __obj.updateDynamic("newSchedule")(newSchedule.toJsFn)
    __obj.asInstanceOf[ReconnectionPolicy]
  }
}

