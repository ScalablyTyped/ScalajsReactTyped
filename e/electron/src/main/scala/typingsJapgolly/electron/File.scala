package typingsJapgolly.electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /**
    * The real path to the file on the users filesystem
    */
  var path: String
}
object File {
  
  inline def apply(path: String): File = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
