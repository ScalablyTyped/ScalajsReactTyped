package typingsJapgolly.requireHacker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Path extends StObject {
    
    /**
      * The absolute path of the path argument passed to this `require` function (which could be relative).
      */
    var path: String
    
    /** Valid CommonJS JavaScript module source code. */
    var source: String
  }
  object Path {
    
    inline def apply(path: String, source: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
