package typingsJapgolly.graphqlQueryComplexity.queryComplexityMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryComplexityOptions extends js.Object {
  var createError: js.UndefOr[js.Function2[/* max */ Double, /* actual */ Double, GraphQLError]] = js.undefined
  var estimators: js.UndefOr[js.Array[ComplexityEstimator]] = js.undefined
  var maximumComplexity: Double
  var onComplete: js.UndefOr[js.Function1[/* complexity */ Double, Unit]] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object QueryComplexityOptions {
  @scala.inline
  def apply(
    maximumComplexity: Double,
    createError: (/* max */ Double, /* actual */ Double) => CallbackTo[GraphQLError] = null,
    estimators: js.Array[ComplexityEstimator] = null,
    onComplete: /* complexity */ Double => Callback = null,
    variables: js.Object = null
  ): QueryComplexityOptions = {
    val __obj = js.Dynamic.literal(maximumComplexity = maximumComplexity.asInstanceOf[js.Any])
    if (createError != null) __obj.updateDynamic("createError")(js.Any.fromFunction2((t0: /* max */ scala.Double, t1: /* actual */ scala.Double) => createError(t0, t1).runNow()))
    if (estimators != null) __obj.updateDynamic("estimators")(estimators.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* complexity */ scala.Double) => onComplete(t0).runNow()))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComplexityOptions]
  }
}

