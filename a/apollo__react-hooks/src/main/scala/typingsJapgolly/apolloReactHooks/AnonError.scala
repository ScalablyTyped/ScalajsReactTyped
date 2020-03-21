package typingsJapgolly.apolloReactHooks

import typingsJapgolly.apolloClient.mod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[TVariables, TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
  var variables: js.UndefOr[TVariables] = js.undefined
}

object AnonError {
  @scala.inline
  def apply[TVariables, TData](loading: Boolean, data: TData = null, error: ApolloError = null, variables: TVariables = null): AnonError[TVariables, TData] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError[TVariables, TData]]
  }
}

