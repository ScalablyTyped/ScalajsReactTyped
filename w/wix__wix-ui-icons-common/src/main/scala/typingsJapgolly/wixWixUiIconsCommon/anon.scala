package typingsJapgolly.wixWixUiIconsCommon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DebouncedSearch extends StObject {
    
    def debouncedSearch(query: String): Unit
    
    var filteredIconsMetadata: js.Array[IconMetadata]
  }
  object DebouncedSearch {
    
    inline def apply(debouncedSearch: String => Callback, filteredIconsMetadata: js.Array[IconMetadata]): DebouncedSearch = {
      val __obj = js.Dynamic.literal(debouncedSearch = js.Any.fromFunction1((t0: String) => debouncedSearch(t0).runNow()), filteredIconsMetadata = filteredIconsMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebouncedSearch]
    }
    
    extension [Self <: DebouncedSearch](x: Self) {
      
      inline def setDebouncedSearch(value: String => Callback): Self = StObject.set(x, "debouncedSearch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setFilteredIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "filteredIconsMetadata", value.asInstanceOf[js.Any])
      
      inline def setFilteredIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "filteredIconsMetadata", js.Array(value*))
    }
  }
}
