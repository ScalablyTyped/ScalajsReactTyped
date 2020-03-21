package typingsJapgolly.apolloReactHoc.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloReactCommon.typesMod.MutationFetchResult
import typingsJapgolly.apolloReactCommon.typesMod.MutationFunction
import typingsJapgolly.apolloReactCommon.typesMod.MutationFunctionOptions
import typingsJapgolly.apolloReactCommon.typesMod.MutationResult
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: MutationFunction[TData, TGraphQLVariables]
  var result: MutationResult[TData]
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    mutate: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => CallbackTo[
      js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
    ],
    result: MutationResult[TData]
  ): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("mutate")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[
  typingsJapgolly.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TGraphQLVariables]]) => mutate(t0).runNow()))
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
}

