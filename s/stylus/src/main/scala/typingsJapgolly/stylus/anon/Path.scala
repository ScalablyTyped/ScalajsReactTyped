package typingsJapgolly.stylus.anon

import typingsJapgolly.stylus.mod.Stylus.Nodes.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var __type: String
  
  var column: Double
  
  var filename: String
  
  var lineno: Double
  
  var path: Expression
}
object Path {
  
  inline def apply(__type: String, column: Double, filename: String, lineno: Double, path: Expression): Path = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Expression): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
