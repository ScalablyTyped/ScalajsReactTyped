package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var diagnostics: js.Array[Message]
  
  var file: String
}
object Count {
  
  inline def apply(count: Double, diagnostics: js.Array[Message], file: String): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Message]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Message*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
