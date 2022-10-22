package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckingConfig
import typingsJapgolly.typescript.mod.AsExpression
import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcExpressionMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/expression", "NULL_AS_ANY")
  @js.native
  val NULL_AS_ANY: AsExpression = js.native
  
  inline def astToTypescript(ast: AST, maybeResolve: js.Function1[/* ast */ AST, Expression | Null], config: TypeCheckingConfig): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("astToTypescript")(ast.asInstanceOf[js.Any], maybeResolve.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Expression]
}
