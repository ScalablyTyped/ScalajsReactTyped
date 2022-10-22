package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.jestTransform.mod.TransformedSource
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledOutput
  extends StObject
     with TransformedSource {
  
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
}
object CompiledOutput {
  
  inline def apply(code: String): CompiledOutput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledOutput]
  }
  
  extension [Self <: CompiledOutput](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
  }
}
