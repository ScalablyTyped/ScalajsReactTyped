package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var count: Double
  
  var diagnostics: js.Array[Type]
  
  var file: String
}
object File {
  
  inline def apply(count: Double, diagnostics: js.Array[Type], file: String): File = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Type]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Type*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
