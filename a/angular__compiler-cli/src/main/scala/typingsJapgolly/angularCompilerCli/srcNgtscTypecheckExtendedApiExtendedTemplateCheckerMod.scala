package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typingsJapgolly.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod {
  
  trait ExtendedTemplateChecker extends StObject {
    
    /**
      * Run `TemplateCheck`s for a component and return the generated `ts.Diagnostic`s.
      */
    def getDiagnosticsForComponent(component: ClassDeclaration): js.Array[TemplateDiagnostic]
  }
  object ExtendedTemplateChecker {
    
    inline def apply(getDiagnosticsForComponent: ClassDeclaration => js.Array[TemplateDiagnostic]): ExtendedTemplateChecker = {
      val __obj = js.Dynamic.literal(getDiagnosticsForComponent = js.Any.fromFunction1(getDiagnosticsForComponent))
      __obj.asInstanceOf[ExtendedTemplateChecker]
    }
    
    extension [Self <: ExtendedTemplateChecker](x: Self) {
      
      inline def setGetDiagnosticsForComponent(value: ClassDeclaration => js.Array[TemplateDiagnostic]): Self = StObject.set(x, "getDiagnosticsForComponent", js.Any.fromFunction1(value))
    }
  }
}
