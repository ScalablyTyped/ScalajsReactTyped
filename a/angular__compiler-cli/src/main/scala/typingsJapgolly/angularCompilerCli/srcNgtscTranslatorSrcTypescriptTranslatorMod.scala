package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.Expression
import typingsJapgolly.angularCompiler.mod.Statement
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcTranslatorMod.TranslatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcTypescriptTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/typescript_translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def translateExpression(expression: Expression, imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression]): typingsJapgolly.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.Expression]
  inline def translateExpression(
    expression: Expression,
    imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression],
    options: TranslatorOptions[typingsJapgolly.typescript.mod.Expression]
  ): typingsJapgolly.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.Expression]
  
  inline def translateStatement(statement: Statement, imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression]): typingsJapgolly.typescript.mod.Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.Statement]
  inline def translateStatement(
    statement: Statement,
    imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression],
    options: TranslatorOptions[typingsJapgolly.typescript.mod.Expression]
  ): typingsJapgolly.typescript.mod.Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.Statement]
}
