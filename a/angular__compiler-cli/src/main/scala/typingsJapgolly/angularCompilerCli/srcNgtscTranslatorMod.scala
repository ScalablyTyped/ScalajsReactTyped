package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.Expression
import typingsJapgolly.angularCompiler.mod.Type
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.LeadingComment
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcTranslatorMod.TranslatorOptions
import typingsJapgolly.typescript.mod.Statement
import typingsJapgolly.typescript.mod.TemplateMiddle
import typingsJapgolly.typescript.mod.TemplateTail
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "Context")
  @js.native
  open class Context protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcContextMod.Context {
    def this(isStatement: Boolean) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "ExpressionTranslatorVisitor")
  @js.native
  open class ExpressionTranslatorVisitor[TStatement, TExpression] protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcTranslatorMod.ExpressionTranslatorVisitor[TStatement, TExpression] {
    def this(
      factory: AstFactory[TStatement, TExpression],
      imports: ImportGenerator[TExpression],
      options: TranslatorOptions[TExpression]
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "ImportManager")
  @js.native
  open class ImportManager ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.ImportManager {
    def this(rewriter: ImportRewriter) = this()
    def this(rewriter: Unit, prefix: String) = this()
    def this(rewriter: ImportRewriter, prefix: String) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "TypeScriptAstFactory")
  @js.native
  open class TypeScriptAstFactory protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcTypescriptAstFactoryMod.TypeScriptAstFactory {
    def this(annotateForClosureCompiler: Boolean) = this()
  }
  
  inline def attachComments(statement: Statement, leadingComments: js.Array[LeadingComment]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(statement.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTemplateMiddle(cooked: String, raw: String): TemplateMiddle = (^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateMiddle")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateMiddle]
  
  inline def createTemplateTail(cooked: String, raw: String): TemplateTail = (^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateTail")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateTail]
  
  inline def translateExpression(expression: Expression, imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression]): typingsJapgolly.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.Expression]
  inline def translateExpression(
    expression: Expression,
    imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression],
    options: TranslatorOptions[typingsJapgolly.typescript.mod.Expression]
  ): typingsJapgolly.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescript.mod.Expression]
  
  inline def translateStatement(
    statement: typingsJapgolly.angularCompiler.mod.Statement,
    imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression]
  ): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[Statement]
  inline def translateStatement(
    statement: typingsJapgolly.angularCompiler.mod.Statement,
    imports: ImportGenerator[typingsJapgolly.typescript.mod.Expression],
    options: TranslatorOptions[typingsJapgolly.typescript.mod.Expression]
  ): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Statement]
  
  inline def translateType(
    `type`: Type,
    imports: typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.ImportManager
  ): TypeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("translateType")(`type`.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[TypeNode]
}
