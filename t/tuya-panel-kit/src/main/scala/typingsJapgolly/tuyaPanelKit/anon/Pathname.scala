package typingsJapgolly.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pathname extends StObject {
  
  var pathname: String
  
  var search: String
}
object Pathname {
  
  inline def apply(pathname: String, search: String): Pathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
  
  extension [Self <: Pathname](x: Self) {
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
