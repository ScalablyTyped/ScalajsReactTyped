package typingsJapgolly.apolloCache.typesCacheMod.Cache

import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFragmentOptions[TData, TVariables]
  extends typingsJapgolly.apolloCache.dataProxyMod.DataProxy.Fragment[TVariables] {
  var data: TData
}

object WriteFragmentOptions {
  @scala.inline
  def apply[TData, TVariables](
    data: TData,
    fragment: DocumentNode,
    id: String,
    fragmentName: String = null,
    variables: TVariables = null
  ): WriteFragmentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (fragmentName != null) __obj.updateDynamic("fragmentName")(fragmentName.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFragmentOptions[TData, TVariables]]
  }
}

