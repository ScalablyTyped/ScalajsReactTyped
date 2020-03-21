package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtlableQueryBuilder extends js.Object {
  def usingTTL(ttl: Double): this.type
  def usingTimestamp(timestamp: Double): this.type
}

object TtlableQueryBuilder {
  @scala.inline
  def apply(
    usingTTL: Double => CallbackTo[TtlableQueryBuilder],
    usingTimestamp: Double => CallbackTo[TtlableQueryBuilder]
  ): TtlableQueryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("usingTTL")(js.Any.fromFunction1((t0: scala.Double) => usingTTL(t0).runNow()))
    __obj.updateDynamic("usingTimestamp")(js.Any.fromFunction1((t0: scala.Double) => usingTimestamp(t0).runNow()))
    __obj.asInstanceOf[TtlableQueryBuilder]
  }
}

