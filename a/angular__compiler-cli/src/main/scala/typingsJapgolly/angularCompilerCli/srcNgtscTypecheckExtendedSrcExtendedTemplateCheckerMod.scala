package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.TemplateTypeChecker
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedApiApiMod.TemplateCheckFactory
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod.ExtendedTemplateChecker
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedSrcExtendedTemplateCheckerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/src/extended_template_checker", "ExtendedTemplateCheckerImpl")
  @js.native
  open class ExtendedTemplateCheckerImpl protected ()
    extends StObject
       with ExtendedTemplateChecker {
    def this(
      templateTypeChecker: TemplateTypeChecker,
      typeChecker: TypeChecker,
      templateCheckFactories: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]],
      options: NgCompilerOptions
    ) = this()
    
    /**
      * Run `TemplateCheck`s for a component and return the generated `ts.Diagnostic`s.
      */
    /* CompleteClass */
    override def getDiagnosticsForComponent(component: ClassDeclaration): js.Array[TemplateDiagnostic] = js.native
    
    /* private */ val partialCtx: Any = js.native
    
    /* private */ val templateChecks: Any = js.native
  }
}
