package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_CONTROL_FLOW_DIRECTIVE
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckExtendedApiApiMod.TemplateCheckFactory
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedChecksMissingControlFlowDirectiveMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/checks/missing_control_flow_directive", "KNOWN_CONTROL_FLOW_DIRECTIVES")
  @js.native
  val KNOWN_CONTROL_FLOW_DIRECTIVES: Map[String, String] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/checks/missing_control_flow_directive", "factory")
  @js.native
  val factory: TemplateCheckFactory[
    MISSING_CONTROL_FLOW_DIRECTIVE, 
    typingsJapgolly.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.MISSING_CONTROL_FLOW_DIRECTIVE
  ] = js.native
}
