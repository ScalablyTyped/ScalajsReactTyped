package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path615Query250 extends StObject {
  
  var path: `615`
  
  var query: `250`
}
object Path615Query250 {
  
  inline def apply(path: `615`, query: `250`): Path615Query250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path615Query250]
  }
  
  extension [Self <: Path615Query250](x: Self) {
    
    inline def setPath(value: `615`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
