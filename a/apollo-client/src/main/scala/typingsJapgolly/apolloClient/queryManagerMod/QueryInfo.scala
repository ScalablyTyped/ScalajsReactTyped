package typingsJapgolly.apolloClient.queryManagerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apolloCache.typesCacheMod.Cache.DiffResult
import typingsJapgolly.apolloClient.observableMod.Subscription
import typingsJapgolly.apolloClient.observableQueryMod.ObservableQuery
import typingsJapgolly.apolloClient.typesMod.OperationVariables
import typingsJapgolly.apolloClient.typesMod.QueryListener
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var document: DocumentNode | Null
  var invalidated: Boolean
  var lastRequestId: Double
  var listeners: Set[QueryListener]
  var newData: DiffResult[_] | Null
  var observableQuery: (ObservableQuery[_, OperationVariables]) | Null
  var subscriptions: Set[Subscription]
}

object QueryInfo {
  @scala.inline
  def apply(
    invalidated: Boolean,
    lastRequestId: Double,
    listeners: Set[QueryListener],
    subscriptions: Set[Subscription],
    cancel: js.UndefOr[Callback] = js.undefined,
    document: DocumentNode = null,
    newData: DiffResult[_] = null,
    observableQuery: ObservableQuery[_, OperationVariables] = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(invalidated = invalidated.asInstanceOf[js.Any], lastRequestId = lastRequestId.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (observableQuery != null) __obj.updateDynamic("observableQuery")(observableQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

