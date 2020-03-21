package typingsJapgolly.apolloClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloCache.dataProxyMod.DataProxy
import typingsJapgolly.apolloClient.storeMod.QueryWithUpdater
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var result: ExecutionResult[ExecutionResultDataDefault]
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object AnonResult {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    result: ExecutionResult[ExecutionResultDataDefault],
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Callback = null
  ): AnonResult = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* proxy */ typingsJapgolly.apolloCache.dataProxyMod.DataProxy, t1: /* mutationResult */ js.Object) => update(t0, t1).runNow()))
    __obj.asInstanceOf[AnonResult]
  }
}

