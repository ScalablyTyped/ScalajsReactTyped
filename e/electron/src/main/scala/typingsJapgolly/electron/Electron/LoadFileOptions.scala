package typingsJapgolly.electron.Electron

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadFileOptions extends StObject {
  
  /**
    * Passed to `url.format()`.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * Passed to `url.format()`.
    */
  var query: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Passed to `url.format()`.
    */
  var search: js.UndefOr[String] = js.undefined
}
object LoadFileOptions {
  
  inline def apply(): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFileOptions]
  }
  
  extension [Self <: LoadFileOptions](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setQuery(value: Record[String, String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
