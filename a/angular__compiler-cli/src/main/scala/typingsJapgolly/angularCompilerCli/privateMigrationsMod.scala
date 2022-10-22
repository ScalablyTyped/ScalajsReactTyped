package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcReferencesMod.OwningModule
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.FunctionDefinition
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateMigrationsMod {
  
  @JSImport("@angular/compiler-cli/private/migrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/private/migrations", "DynamicValue")
  @js.native
  /* private */ open class DynamicValue[R] ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.DynamicValue[R]
  /* static members */
  object DynamicValue {
    
    @JSImport("@angular/compiler-cli/private/migrations", "DynamicValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromComplexFunctionCall(node: Node, fn: FunctionDefinition): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[FunctionDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromComplexFunctionCall")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[FunctionDefinition]]
    
    inline def fromDynamicInput(
      node: Node,
      input: typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]
    ): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[
        typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicInput")(node.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[
        typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]
      ]]
    
    inline def fromDynamicString(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicString")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromDynamicType(node: TypeNode): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicType")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromExternalReference(node: Node, ref: typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference[Declaration]): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExternalReference")(node.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference[Declaration]]]
    
    inline def fromInvalidExpressionType(node: Node, value: Any): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInvalidExpressionType")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromSyntheticInput(node: Node, value: SyntheticValue[Any]): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[SyntheticValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSyntheticInput")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[SyntheticValue[Any]]]
    
    inline def fromUnknown(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknown")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromUnknownIdentifier(node: Identifier): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknownIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromUnsupportedSyntax(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnsupportedSyntax")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "PartialEvaluator")
  @js.native
  open class PartialEvaluator protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "Reference")
  @js.native
  open class Reference[T /* <: Node */] protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference[T] {
    def this(node: T) = this()
    def this(node: T, bestGuessOwningModule: OwningModule) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "StaticInterpreter")
  @js.native
  open class StaticInterpreter protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.StaticInterpreter {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "TypeScriptReflectionHost")
  @js.native
  open class TypeScriptReflectionHost protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscReflectionMod.TypeScriptReflectionHost {
    def this(checker: TypeChecker) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "forwardRefResolver")
  @js.native
  val forwardRefResolver: ForeignFunctionResolver = js.native
  
  inline def reflectObjectLiteral(node: ObjectLiteralExpression): Map[String, Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectObjectLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Map[String, Expression]]
}
