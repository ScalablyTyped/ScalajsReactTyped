package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticsFile extends StObject {
  
  var diagnostics: js.Array[Type]
  
  var file: String
}
object DiagnosticsFile {
  
  inline def apply(diagnostics: js.Array[Type], file: String): DiagnosticsFile = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticsFile]
  }
  
  extension [Self <: DiagnosticsFile](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Type]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Type*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
