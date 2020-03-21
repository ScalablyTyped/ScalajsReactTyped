package typingsJapgolly.elasticElasticsearch.poolMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.elasticElasticsearch.connectionMod.default
import typingsJapgolly.elasticElasticsearch.transportMod.nodeFilterFn
import typingsJapgolly.elasticElasticsearch.transportMod.nodeSelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait getConnectionOptions extends js.Object {
  var filter: js.UndefOr[nodeFilterFn] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[Double] = js.undefined
  var requestId: js.UndefOr[String | Double] = js.undefined
  var selector: js.UndefOr[nodeSelectorFn] = js.undefined
}

object getConnectionOptions {
  @scala.inline
  def apply(
    filter: /* connection */ default => CallbackTo[Boolean] = null,
    name: String = null,
    now: Int | Double = null,
    requestId: String | Double = null,
    selector: /* connections */ js.Array[default] => CallbackTo[default] = null
  ): getConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* connection */ typingsJapgolly.elasticElasticsearch.connectionMod.default) => filter(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(js.Any.fromFunction1((t0: /* connections */ js.Array[typingsJapgolly.elasticElasticsearch.connectionMod.default]) => selector(t0).runNow()))
    __obj.asInstanceOf[getConnectionOptions]
  }
}

