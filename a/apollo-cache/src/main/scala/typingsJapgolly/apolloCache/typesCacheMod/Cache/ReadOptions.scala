package typingsJapgolly.apolloCache.typesCacheMod.Cache

import typingsJapgolly.apolloCache.dataProxyMod.DataProxy.Query
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions[TVariables] extends Query[TVariables] {
  var optimistic: Boolean
  var previousResult: js.UndefOr[js.Any] = js.undefined
  var rootId: js.UndefOr[String] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply[TVariables](
    optimistic: Boolean,
    query: DocumentNode,
    previousResult: js.Any = null,
    rootId: String = null,
    variables: TVariables = null
  ): ReadOptions[TVariables] = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (previousResult != null) __obj.updateDynamic("previousResult")(previousResult.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions[TVariables]]
  }
}

