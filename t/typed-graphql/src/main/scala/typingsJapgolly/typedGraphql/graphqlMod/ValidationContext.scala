package typingsJapgolly.typedGraphql.graphqlMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationContext extends StObject {
  
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
  
  inline def apply(
    getArgument: CallbackTo[GraphQLArgument],
    getDirective: CallbackTo[GraphQLDirective],
    getDocument: CallbackTo[Document],
    getErrors: CallbackTo[js.Array[js.Error]],
    getFieldDef: CallbackTo[GraphQLFieldDefinition],
    getFragment: String => FragmentDefinition,
    getFragmentSpreads: SelectionSet => js.Array[FragmentSpread],
    getInputType: CallbackTo[GraphQLInputType],
    getParentType: CallbackTo[GraphQLCompositeType],
    getRecursiveVariableUsages: OperationDefinition => js.Array[VariableUsage],
    getRecursivelyReferencedFragments: OperationDefinition => js.Array[FragmentDefinition],
    getSchema: CallbackTo[GraphQLSchema],
    getType: CallbackTo[GraphQLOutputType],
    getVariableUsages: HasSelectionSet => js.Array[VariableUsage],
    reportError: js.Error => Callback
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(getArgument = getArgument.toJsFn, getDirective = getDirective.toJsFn, getDocument = getDocument.toJsFn, getErrors = getErrors.toJsFn, getFieldDef = getFieldDef.toJsFn, getFragment = js.Any.fromFunction1(getFragment), getFragmentSpreads = js.Any.fromFunction1(getFragmentSpreads), getInputType = getInputType.toJsFn, getParentType = getParentType.toJsFn, getRecursiveVariableUsages = js.Any.fromFunction1(getRecursiveVariableUsages), getRecursivelyReferencedFragments = js.Any.fromFunction1(getRecursivelyReferencedFragments), getSchema = getSchema.toJsFn, getType = getType.toJsFn, getVariableUsages = js.Any.fromFunction1(getVariableUsages), reportError = js.Any.fromFunction1((t0: js.Error) => reportError(t0).runNow()))
    __obj.asInstanceOf[ValidationContext]
  }
  
  extension [Self <: ValidationContext](x: Self) {
    
    inline def setGetArgument(value: CallbackTo[GraphQLArgument]): Self = StObject.set(x, "getArgument", value.toJsFn)
    
    inline def setGetDirective(value: CallbackTo[GraphQLDirective]): Self = StObject.set(x, "getDirective", value.toJsFn)
    
    inline def setGetDocument(value: CallbackTo[Document]): Self = StObject.set(x, "getDocument", value.toJsFn)
    
    inline def setGetErrors(value: CallbackTo[js.Array[js.Error]]): Self = StObject.set(x, "getErrors", value.toJsFn)
    
    inline def setGetFieldDef(value: CallbackTo[GraphQLFieldDefinition]): Self = StObject.set(x, "getFieldDef", value.toJsFn)
    
    inline def setGetFragment(value: String => FragmentDefinition): Self = StObject.set(x, "getFragment", js.Any.fromFunction1(value))
    
    inline def setGetFragmentSpreads(value: SelectionSet => js.Array[FragmentSpread]): Self = StObject.set(x, "getFragmentSpreads", js.Any.fromFunction1(value))
    
    inline def setGetInputType(value: CallbackTo[GraphQLInputType]): Self = StObject.set(x, "getInputType", value.toJsFn)
    
    inline def setGetParentType(value: CallbackTo[GraphQLCompositeType]): Self = StObject.set(x, "getParentType", value.toJsFn)
    
    inline def setGetRecursiveVariableUsages(value: OperationDefinition => js.Array[VariableUsage]): Self = StObject.set(x, "getRecursiveVariableUsages", js.Any.fromFunction1(value))
    
    inline def setGetRecursivelyReferencedFragments(value: OperationDefinition => js.Array[FragmentDefinition]): Self = StObject.set(x, "getRecursivelyReferencedFragments", js.Any.fromFunction1(value))
    
    inline def setGetSchema(value: CallbackTo[GraphQLSchema]): Self = StObject.set(x, "getSchema", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[GraphQLOutputType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetVariableUsages(value: HasSelectionSet => js.Array[VariableUsage]): Self = StObject.set(x, "getVariableUsages", js.Any.fromFunction1(value))
    
    inline def setReportError(value: js.Error => Callback): Self = StObject.set(x, "reportError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
  }
}
