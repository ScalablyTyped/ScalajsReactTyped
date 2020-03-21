package typingsJapgolly.apolloClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy
import typingsJapgolly.apolloClient.storeMod.QueryWithUpdater
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMutationId extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var optimisticResponse: js.UndefOr[js.Object | js.Function] = js.undefined
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object AnonMutationId {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    optimisticResponse: js.Object | js.Function = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Callback = null
  ): AnonMutationId = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* proxy */ typingsJapgolly.apolloCache.dataProxyMod.DataProxy, t1: /* mutationResult */ js.Object) => update(t0, t1).runNow()))
    __obj.asInstanceOf[AnonMutationId]
  }
}

