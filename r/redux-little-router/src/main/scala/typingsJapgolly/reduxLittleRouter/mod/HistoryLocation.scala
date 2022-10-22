package typingsJapgolly.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryLocation extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var pathname: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[ObjectLiteral[Any]] = js.undefined
}
object HistoryLocation {
  
  inline def apply(): HistoryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryLocation]
  }
  
  extension [Self <: HistoryLocation](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setState(value: ObjectLiteral[Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
