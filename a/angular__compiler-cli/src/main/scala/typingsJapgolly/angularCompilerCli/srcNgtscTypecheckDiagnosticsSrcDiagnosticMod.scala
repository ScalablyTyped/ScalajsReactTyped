package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompilerCli.anon.End
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateSourceMapping
import typingsJapgolly.typescript.mod.Diagnostic
import typingsJapgolly.typescript.mod.DiagnosticCategory
import typingsJapgolly.typescript.mod.DiagnosticMessageChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckDiagnosticsSrcDiagnosticMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/diagnostics/src/diagnostic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTemplateDiagnostic(diagnostic: Diagnostic): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/typecheck/api/api.TemplateDiagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/typecheck/api/api.TemplateDiagnostic */ Boolean]
  
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: String
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: String,
    relatedMessages: js.Array[End]
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedMessages.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: DiagnosticMessageChain
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: DiagnosticMessageChain,
    relatedMessages: js.Array[End]
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedMessages.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
}
