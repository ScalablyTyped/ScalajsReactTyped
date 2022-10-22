package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeLanguageserver.anon.On
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.Feature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDiagnosticMod {
  
  @JSImport("vscode-languageserver/lib/common/diagnostic", "DiagnosticFeature")
  @js.native
  val DiagnosticFeature: Feature[_Languages, DiagnosticFeatureShape] = js.native
  
  trait DiagnosticFeatureShape extends StObject {
    
    var diagnostics: On
  }
  object DiagnosticFeatureShape {
    
    inline def apply(diagnostics: On): DiagnosticFeatureShape = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticFeatureShape]
    }
    
    extension [Self <: DiagnosticFeatureShape](x: Self) {
      
      inline def setDiagnostics(value: On): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    }
  }
}
