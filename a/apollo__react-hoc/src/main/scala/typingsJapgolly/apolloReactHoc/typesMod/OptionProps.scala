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

/* Inlined parent std.Partial<@apollo/react-hoc.@apollo/react-hoc/lib/types.DataProps<TData, TGraphQLVariables>> */
/* Inlined parent std.Partial<@apollo/react-hoc.@apollo/react-hoc/lib/types.MutateProps<TData, TGraphQLVariables>> */
trait OptionProps[TProps, TData, TGraphQLVariables] extends js.Object {
  var data: js.UndefOr[DataValue[TData, TGraphQLVariables]] = js.undefined
  var mutate: js.UndefOr[MutationFunction[TData, TGraphQLVariables]] = js.undefined
  var ownProps: TProps
  var result: js.UndefOr[MutationResult[TData]] = js.undefined
}

object OptionProps {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables](
    ownProps: TProps,
    data: DataValue[TData, TGraphQLVariables] = null,
    mutate: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => CallbackTo[
      js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
    ] = null,
    result: MutationResult[TData] = null
  ): OptionProps[TProps, TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(ownProps = ownProps.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mutate != null) __obj.updateDynamic("mutate")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[
  typingsJapgolly.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TGraphQLVariables]]) => mutate(t0).runNow()))
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps[TProps, TData, TGraphQLVariables]]
  }
}

