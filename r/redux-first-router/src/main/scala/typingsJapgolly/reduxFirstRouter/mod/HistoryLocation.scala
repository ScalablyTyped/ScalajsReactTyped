package typingsJapgolly.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryLocation extends StObject {
  
  var pathname: String
  
  var search: js.UndefOr[String] = js.undefined
}
object HistoryLocation {
  
  inline def apply(pathname: String): HistoryLocation = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryLocation]
  }
  
  extension [Self <: HistoryLocation](x: Self) {
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
