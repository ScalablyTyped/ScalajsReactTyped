package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.TemplateTypeChecker
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedApiApiMod.TemplateCheckFactory
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended", "ALL_DIAGNOSTIC_FACTORIES")
  @js.native
  val ALL_DIAGNOSTIC_FACTORIES: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended", "ExtendedTemplateCheckerImpl")
  @js.native
  open class ExtendedTemplateCheckerImpl protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedSrcExtendedTemplateCheckerMod.ExtendedTemplateCheckerImpl {
    def this(
      templateTypeChecker: TemplateTypeChecker,
      typeChecker: TypeChecker,
      templateCheckFactories: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]],
      options: NgCompilerOptions
    ) = this()
  }
}
