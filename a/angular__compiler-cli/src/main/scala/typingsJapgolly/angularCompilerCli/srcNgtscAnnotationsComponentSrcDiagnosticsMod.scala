package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscCyclesMod.Cycle
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.typescript.mod.DiagnosticRelatedInformation
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsComponentSrcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkCustomElementSelectorForErrors(selector: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCustomElementSelectorForErrors")(selector.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def makeCyclicImportInfo(ref: Reference[Node], `type`: String, cycle: Cycle): DiagnosticRelatedInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCyclicImportInfo")(ref.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cycle.asInstanceOf[js.Any])).asInstanceOf[DiagnosticRelatedInformation]
}
