package typingsJapgolly.graphqlReact.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOperationStatus[T] extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.undefined
  var loading: Boolean
  def load(): Unit
}

object GraphQLOperationStatus {
  @scala.inline
  def apply[T](
    cacheKey: GraphQLCacheKey,
    load: Callback,
    loading: Boolean,
    cacheValue: GraphQLCacheValue[T] = null
  ): GraphQLOperationStatus[T] = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.updateDynamic("load")(load.toJsFn)
    if (cacheValue != null) __obj.updateDynamic("cacheValue")(cacheValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOperationStatus[T]]
  }
}

