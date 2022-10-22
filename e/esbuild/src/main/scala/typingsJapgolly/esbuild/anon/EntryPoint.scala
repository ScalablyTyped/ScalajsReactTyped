package typingsJapgolly.esbuild.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPoint extends StObject {
  
  var bytes: Double
  
  var entryPoint: js.UndefOr[String] = js.undefined
  
  var exports: js.Array[String]
  
  var imports: js.Array[Kind]
  
  var inputs: StringDictionary[BytesInOutput]
}
object EntryPoint {
  
  inline def apply(
    bytes: Double,
    exports: js.Array[String],
    imports: js.Array[Kind],
    inputs: StringDictionary[BytesInOutput]
  ): EntryPoint = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPoint]
  }
  
  extension [Self <: EntryPoint](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setImports(value: js.Array[Kind]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Kind*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInputs(value: StringDictionary[BytesInOutput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
