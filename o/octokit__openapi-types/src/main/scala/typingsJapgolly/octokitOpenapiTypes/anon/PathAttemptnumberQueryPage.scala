package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberQueryPage extends StObject {
  
  var path: Attemptnumber
  
  var query: Page
}
object PathAttemptnumberQueryPage {
  
  inline def apply(path: Attemptnumber, query: Page): PathAttemptnumberQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberQueryPage]
  }
  
  extension [Self <: PathAttemptnumberQueryPage](x: Self) {
    
    inline def setPath(value: Attemptnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
