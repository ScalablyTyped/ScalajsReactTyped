package typingsJapgolly.findConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    var cwd: String
    
    var dir: String
    
    var path: String
  }
  object Cwd {
    
    inline def apply(cwd: String, dir: String, path: String): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    extension [Self <: Cwd](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
