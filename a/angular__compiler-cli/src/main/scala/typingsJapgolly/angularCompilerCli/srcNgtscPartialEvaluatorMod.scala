package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.FunctionDefinition
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.DiagnosticRelatedInformation
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "DynamicValue")
  @js.native
  /* private */ open class DynamicValue[R] ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[R]
  /* static members */
  object DynamicValue {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "DynamicValue")
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
    
    inline def fromExternalReference(node: Node, ref: Reference[Declaration]): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Reference[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExternalReference")(node.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Reference[Declaration]]]
    
    inline def fromInvalidExpressionType(node: Node, value: Any): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInvalidExpressionType")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromSyntheticInput(
      node: Node,
      value: typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue[Any]
    ): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[
        typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue[Any]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSyntheticInput")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[
        typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue[Any]
      ]]
    
    inline def fromUnknown(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknown")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromUnknownIdentifier(node: Identifier): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknownIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
    
    inline def fromUnsupportedSyntax(node: Node): typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnsupportedSyntax")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "EnumValue")
  @js.native
  open class EnumValue protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.EnumValue {
    def this(enumRef: Reference[Declaration], name: String, resolved: ResolvedValue) = this()
  }
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "KnownFn")
  @js.native
  open class KnownFn ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.KnownFn
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "PartialEvaluator")
  @js.native
  open class PartialEvaluator protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.PartialEvaluator {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "StaticInterpreter")
  @js.native
  open class StaticInterpreter protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterpreterMod.StaticInterpreter {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "SyntheticValue")
  @js.native
  open class SyntheticValue[T] protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue[T] {
    def this(value: T) = this()
  }
  
  inline def describeResolvedType(value: ResolvedValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("describeResolvedType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def describeResolvedType(value: ResolvedValue, maxDepth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("describeResolvedType")(value.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def traceDynamicValue(
    node: Node,
    value: typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[Any]
  ): js.Array[DiagnosticRelatedInformation] = (^.asInstanceOf[js.Dynamic].applyDynamic("traceDynamicValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiagnosticRelatedInformation]]
}
