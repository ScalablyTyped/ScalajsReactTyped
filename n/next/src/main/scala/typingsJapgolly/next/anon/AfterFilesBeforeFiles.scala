package typingsJapgolly.next.anon

import typingsJapgolly.next.distLibLoadCustomRoutesMod.Rewrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterFilesBeforeFiles extends StObject {
  
  var afterFiles: js.Array[Rewrite]
  
  var beforeFiles: js.Array[Rewrite]
  
  var fallback: js.Array[Rewrite]
}
object AfterFilesBeforeFiles {
  
  inline def apply(afterFiles: js.Array[Rewrite], beforeFiles: js.Array[Rewrite], fallback: js.Array[Rewrite]): AfterFilesBeforeFiles = {
    val __obj = js.Dynamic.literal(afterFiles = afterFiles.asInstanceOf[js.Any], beforeFiles = beforeFiles.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFilesBeforeFiles]
  }
  
  extension [Self <: AfterFilesBeforeFiles](x: Self) {
    
    inline def setAfterFiles(value: js.Array[Rewrite]): Self = StObject.set(x, "afterFiles", value.asInstanceOf[js.Any])
    
    inline def setAfterFilesVarargs(value: Rewrite*): Self = StObject.set(x, "afterFiles", js.Array(value*))
    
    inline def setBeforeFiles(value: js.Array[Rewrite]): Self = StObject.set(x, "beforeFiles", value.asInstanceOf[js.Any])
    
    inline def setBeforeFilesVarargs(value: Rewrite*): Self = StObject.set(x, "beforeFiles", js.Array(value*))
    
    inline def setFallback(value: js.Array[Rewrite]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackVarargs(value: Rewrite*): Self = StObject.set(x, "fallback", js.Array(value*))
  }
}
