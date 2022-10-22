package typingsJapgolly.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsWithSearch
  extends StObject
     with BaseOptions
     with Options {
  
  var search: String
}
object OptionsWithSearch {
  
  inline def apply(search: String): OptionsWithSearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithSearch]
  }
  
  extension [Self <: OptionsWithSearch](x: Self) {
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
