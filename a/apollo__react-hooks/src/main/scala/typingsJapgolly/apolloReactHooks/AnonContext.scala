package typingsJapgolly.apolloReactHooks

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsJapgolly.apolloReactCommon.typesMod.MutationResult
import typingsJapgolly.apolloReactHooks.typesMod.MutationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var options: MutationOptions[TData, TVariables]
  var result: MutationResult[TData]
  def setResult(result: MutationResult[TData]): js.Any
}

object AnonContext {
  @scala.inline
  def apply[TData, TVariables](
    context: ApolloContextValue,
    options: MutationOptions[TData, TVariables],
    result: MutationResult[TData],
    setResult: MutationResult[TData] => CallbackTo[js.Any]
  ): AnonContext[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("setResult")(js.Any.fromFunction1((t0: typingsJapgolly.apolloReactCommon.typesMod.MutationResult[TData]) => setResult(t0).runNow()))
    __obj.asInstanceOf[AnonContext[TData, TVariables]]
  }
}

