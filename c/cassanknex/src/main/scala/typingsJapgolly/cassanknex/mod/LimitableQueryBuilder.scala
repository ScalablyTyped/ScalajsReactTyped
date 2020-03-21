package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitableQueryBuilder extends js.Object {
  def limit(limit: Double): this.type
  def limitPerPartition(limit: Double): this.type
}

object LimitableQueryBuilder {
  @scala.inline
  def apply(
    limit: Double => CallbackTo[LimitableQueryBuilder],
    limitPerPartition: Double => CallbackTo[LimitableQueryBuilder]
  ): LimitableQueryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("limit")(js.Any.fromFunction1((t0: scala.Double) => limit(t0).runNow()))
    __obj.updateDynamic("limitPerPartition")(js.Any.fromFunction1((t0: scala.Double) => limitPerPartition(t0).runNow()))
    __obj.asInstanceOf[LimitableQueryBuilder]
  }
}

