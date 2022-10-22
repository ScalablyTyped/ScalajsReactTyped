package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.AbsoluteSourceSpan
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TemplateSourceResolver
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.FunctionDeclaration
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addParseSpanInfo(node: Node, span: AbsoluteSourceSpan): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParseSpanInfo")(node.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addParseSpanInfo(node: Node, span: ParseSourceSpan): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParseSpanInfo")(node.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addTemplateId(tcb: FunctionDeclaration, id: TemplateId): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTemplateId")(tcb.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldReportDiagnostic(diagnostic: Diagnostic): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldReportDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def translateDiagnostic(diagnostic: Diagnostic, resolver: TemplateSourceResolver): TemplateDiagnostic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("translateDiagnostic")(diagnostic.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic | Null]
  
  inline def wrapForDiagnostics(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapForDiagnostics")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def wrapForTypeChecker(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapForTypeChecker")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
}
