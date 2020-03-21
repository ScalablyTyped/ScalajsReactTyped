package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyspaceableQueryBuilder extends js.Object {
  def withDurableWrites(durableWrites: Boolean): this.type
  def withNetworkTopologyStrategy(strategy: MappedDict[Double]): this.type
  def withSimpleStrategy(replicas: Double): this.type
}

object KeyspaceableQueryBuilder {
  @scala.inline
  def apply(
    withDurableWrites: Boolean => CallbackTo[KeyspaceableQueryBuilder],
    withNetworkTopologyStrategy: MappedDict[Double] => CallbackTo[KeyspaceableQueryBuilder],
    withSimpleStrategy: Double => CallbackTo[KeyspaceableQueryBuilder]
  ): KeyspaceableQueryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withDurableWrites")(js.Any.fromFunction1((t0: scala.Boolean) => withDurableWrites(t0).runNow()))
    __obj.updateDynamic("withNetworkTopologyStrategy")(js.Any.fromFunction1((t0: typingsJapgolly.cassanknex.mod.MappedDict[scala.Double]) => withNetworkTopologyStrategy(t0).runNow()))
    __obj.updateDynamic("withSimpleStrategy")(js.Any.fromFunction1((t0: scala.Double) => withSimpleStrategy(t0).runNow()))
    __obj.asInstanceOf[KeyspaceableQueryBuilder]
  }
}

