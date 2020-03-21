package typingsJapgolly.apolloClient.watchQueryOptionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.AnonSubscriptionData
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] extends js.Object {
  var document: DocumentNode
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var updateQuery: js.UndefOr[UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData]] = js.undefined
  var variables: js.UndefOr[TSubscriptionVariables] = js.undefined
}

object SubscribeToMoreOptions {
  @scala.inline
  def apply[TData, TSubscriptionVariables, TSubscriptionData](
    document: DocumentNode,
    onError: /* error */ js.Error => Callback = null,
    updateQuery: (TData, /* options */ AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables]) => CallbackTo[TData] = null,
    variables: TSubscriptionVariables = null
  ): SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (updateQuery != null) __obj.updateDynamic("updateQuery")(js.Any.fromFunction2((t0: TData, t1: /* options */ typingsJapgolly.apolloClient.AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables]) => updateQuery(t0, t1).runNow()))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData]]
  }
}

