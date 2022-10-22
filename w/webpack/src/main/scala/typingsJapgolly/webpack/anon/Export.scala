package typingsJapgolly.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Export extends StObject {
  
  var `export`: js.UndefOr[js.Array[String]] = js.undefined
  
  var module: typingsJapgolly.webpack.mod.Module
}
object Export {
  
  inline def apply(module: typingsJapgolly.webpack.mod.Module): Export = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export]
  }
  
  extension [Self <: Export](x: Self) {
    
    inline def setExport(value: js.Array[String]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setModule(value: typingsJapgolly.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
