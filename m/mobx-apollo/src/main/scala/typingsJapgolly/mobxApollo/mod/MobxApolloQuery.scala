package typingsJapgolly.mobxApollo.mod

import typingsJapgolly.apolloClient.mod.ApolloError
import typingsJapgolly.apolloClient.mod.ObservableQuery
import typingsJapgolly.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobxApolloQuery[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
  var ref: ObservableQuery[T, OperationVariables]
}

object MobxApolloQuery {
  @scala.inline
  def apply[T](
    loading: Boolean,
    ref: ObservableQuery[T, OperationVariables],
    data: T = null,
    error: ApolloError = null
  ): MobxApolloQuery[T] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobxApolloQuery[T]]
  }
}

