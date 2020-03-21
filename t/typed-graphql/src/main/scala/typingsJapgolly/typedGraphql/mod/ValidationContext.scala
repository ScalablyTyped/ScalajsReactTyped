package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationContext extends js.Object {
  def getArgument(): GraphQLArgument
  def getDirective(): GraphQLDirective
  def getDocument(): Document
  def getErrors(): js.Array[js.Error]
  def getFieldDef(): GraphQLFieldDefinition
  def getFragment(name: String): FragmentDefinition
  def getFragmentSpreads(node: SelectionSet): js.Array[FragmentSpread]
  def getInputType(): GraphQLInputType
  def getParentType(): GraphQLCompositeType
  def getRecursiveVariableUsages(operation: OperationDefinition): js.Array[VariableUsage]
  def getRecursivelyReferencedFragments(operation: OperationDefinition): js.Array[FragmentDefinition]
  def getSchema(): GraphQLSchema
  def getType(): GraphQLOutputType
  def getVariableUsages(node: HasSelectionSet): js.Array[VariableUsage]
  def reportError(error: js.Error): Unit
}

object ValidationContext {
  @scala.inline
  def apply(
    getArgument: CallbackTo[GraphQLArgument],
    getDirective: CallbackTo[GraphQLDirective],
    getDocument: CallbackTo[Document],
    getErrors: CallbackTo[js.Array[js.Error]],
    getFieldDef: CallbackTo[GraphQLFieldDefinition],
    getFragment: String => CallbackTo[FragmentDefinition],
    getFragmentSpreads: SelectionSet => CallbackTo[js.Array[FragmentSpread]],
    getInputType: CallbackTo[GraphQLInputType],
    getParentType: CallbackTo[GraphQLCompositeType],
    getRecursiveVariableUsages: OperationDefinition => CallbackTo[js.Array[VariableUsage]],
    getRecursivelyReferencedFragments: OperationDefinition => CallbackTo[js.Array[FragmentDefinition]],
    getSchema: CallbackTo[GraphQLSchema],
    getType: CallbackTo[GraphQLOutputType],
    getVariableUsages: HasSelectionSet => CallbackTo[js.Array[VariableUsage]],
    reportError: js.Error => Callback
  ): ValidationContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getArgument")(getArgument.toJsFn)
    __obj.updateDynamic("getDirective")(getDirective.toJsFn)
    __obj.updateDynamic("getDocument")(getDocument.toJsFn)
    __obj.updateDynamic("getErrors")(getErrors.toJsFn)
    __obj.updateDynamic("getFieldDef")(getFieldDef.toJsFn)
    __obj.updateDynamic("getFragment")(js.Any.fromFunction1((t0: java.lang.String) => getFragment(t0).runNow()))
    __obj.updateDynamic("getFragmentSpreads")(js.Any.fromFunction1((t0: typingsJapgolly.typedGraphql.mod.SelectionSet) => getFragmentSpreads(t0).runNow()))
    __obj.updateDynamic("getInputType")(getInputType.toJsFn)
    __obj.updateDynamic("getParentType")(getParentType.toJsFn)
    __obj.updateDynamic("getRecursiveVariableUsages")(js.Any.fromFunction1((t0: typingsJapgolly.typedGraphql.mod.OperationDefinition) => getRecursiveVariableUsages(t0).runNow()))
    __obj.updateDynamic("getRecursivelyReferencedFragments")(js.Any.fromFunction1((t0: typingsJapgolly.typedGraphql.mod.OperationDefinition) => getRecursivelyReferencedFragments(t0).runNow()))
    __obj.updateDynamic("getSchema")(getSchema.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getVariableUsages")(js.Any.fromFunction1((t0: typingsJapgolly.typedGraphql.mod.HasSelectionSet) => getVariableUsages(t0).runNow()))
    __obj.updateDynamic("reportError")(js.Any.fromFunction1((t0: js.Error) => reportError(t0).runNow()))
    __obj.asInstanceOf[ValidationContext]
  }
}

