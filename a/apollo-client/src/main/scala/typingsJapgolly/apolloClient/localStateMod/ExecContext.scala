package typingsJapgolly.apolloClient.localStateMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloUtilities.getFromASTMod.FragmentMap
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecContext extends js.Object {
  var context: js.Any
  var defaultOperationType: String
  var exportedVariables: Record[String, _]
  var fragmentMap: FragmentMap
  var fragmentMatcher: FragmentMatcher
  var onlyRunForcedResolvers: Boolean
  var variables: VariableMap
}

object ExecContext {
  @scala.inline
  def apply(
    context: js.Any,
    defaultOperationType: String,
    exportedVariables: Record[String, _],
    fragmentMap: FragmentMap,
    fragmentMatcher: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => CallbackTo[Boolean],
    onlyRunForcedResolvers: Boolean,
    variables: VariableMap
  ): ExecContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], defaultOperationType = defaultOperationType.asInstanceOf[js.Any], exportedVariables = exportedVariables.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any], onlyRunForcedResolvers = onlyRunForcedResolvers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("fragmentMatcher")(js.Any.fromFunction3((t0: /* rootValue */ js.Any, t1: /* typeCondition */ java.lang.String, t2: /* context */ js.Any) => fragmentMatcher(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ExecContext]
  }
}

