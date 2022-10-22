package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.FunctionDeclaration
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.MethodDeclaration
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcInterfaceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/interface", "PartialEvaluator")
  @js.native
  open class PartialEvaluator protected () extends StObject {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
    
    /* private */ var checker: Any = js.native
    
    /* private */ var dependencyTracker: Any = js.native
    
    def evaluate(expr: Expression): ResolvedValue = js.native
    def evaluate(expr: Expression, foreignFunctionResolver: ForeignFunctionResolver): ResolvedValue = js.native
    
    /* private */ var host: Any = js.native
  }
  
  @js.native
  trait ForeignFunctionResolver extends StObject {
    
    def apply(
      fn: Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression],
      callExpr: CallExpression,
      resolve: js.Function1[/* expr */ Expression, ResolvedValue],
      unresolvable: DynamicValue[Any]
    ): ResolvedValue = js.native
  }
}
