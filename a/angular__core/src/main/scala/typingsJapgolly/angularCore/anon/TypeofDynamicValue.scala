package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.angularCompilerCli.privateMigrationsMod.DynamicValue
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.FunctionDefinition
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDynamicValue
  extends StObject
     with Instantiable0[DynamicValue[js.Object]] {
  
  def fromComplexFunctionCall(node: Node, fn: FunctionDefinition): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[FunctionDefinition] = js.native
  
  def fromDynamicInput(
    node: Node,
    input: typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]
  ): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[
    typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]
  ] = js.native
  
  def fromDynamicString(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = js.native
  
  def fromDynamicType(node: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = js.native
  
  def fromExternalReference(node: Node, ref: Reference[Declaration]): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Reference[Declaration]] = js.native
  
  def fromInvalidExpressionType(node: Node, value: Any): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = js.native
  
  def fromSyntheticInput(node: Node, value: SyntheticValue[Any]): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[SyntheticValue[Any]] = js.native
  
  def fromUnknown(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = js.native
  
  def fromUnknownIdentifier(node: typingsJapgolly.typescript.mod.Identifier): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = js.native
  
  def fromUnsupportedSyntax(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = js.native
}
