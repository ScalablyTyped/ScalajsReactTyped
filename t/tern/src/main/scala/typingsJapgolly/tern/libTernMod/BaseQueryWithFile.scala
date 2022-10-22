package typingsJapgolly.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseQueryWithFile
  extends StObject
     with BaseQuery {
  
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: String
}
object BaseQueryWithFile {
  
  inline def apply(file: String, `type`: String): BaseQueryWithFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQueryWithFile]
  }
  
  extension [Self <: BaseQueryWithFile](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
