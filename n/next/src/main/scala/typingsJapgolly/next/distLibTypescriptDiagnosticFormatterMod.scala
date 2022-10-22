package typingsJapgolly.next

import typingsJapgolly.next.anon.TypeofimportedTypescript
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypescriptDiagnosticFormatterMod {
  
  @JSImport("next/dist/lib/typescript/diagnosticFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DiagnosticCategory extends StObject
  @JSImport("next/dist/lib/typescript/diagnosticFormatter", "DiagnosticCategory")
  @js.native
  object DiagnosticCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DiagnosticCategory & Double] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with DiagnosticCategory
    /* 1 */ val Error: typingsJapgolly.next.distLibTypescriptDiagnosticFormatterMod.DiagnosticCategory.Error & Double = js.native
    
    @js.native
    sealed trait Message
      extends StObject
         with DiagnosticCategory
    /* 3 */ val Message: typingsJapgolly.next.distLibTypescriptDiagnosticFormatterMod.DiagnosticCategory.Message & Double = js.native
    
    @js.native
    sealed trait Suggestion
      extends StObject
         with DiagnosticCategory
    /* 2 */ val Suggestion: typingsJapgolly.next.distLibTypescriptDiagnosticFormatterMod.DiagnosticCategory.Suggestion & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with DiagnosticCategory
    /* 0 */ val Warning: typingsJapgolly.next.distLibTypescriptDiagnosticFormatterMod.DiagnosticCategory.Warning & Double = js.native
  }
  
  inline def getFormattedDiagnostic(ts: TypeofimportedTypescript, baseDir: String, diagnostic: Diagnostic): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedDiagnostic")(ts.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], diagnostic.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
