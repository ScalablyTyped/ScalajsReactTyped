package typingsJapgolly.reactInstantsearchCore.anon

import typingsJapgolly.reactInstantsearchCore.mod.AlgoliaError
import typingsJapgolly.reactInstantsearchCore.mod.AllSearchResults
import typingsJapgolly.reactInstantsearchCore.mod.SearchResults
import typingsJapgolly.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StateResultsProvided<any>> */
trait PartialStateResultsProvid extends StObject {
  
  var allSearchResults: js.UndefOr[AllSearchResults[Any]] = js.undefined
  
  var error: js.UndefOr[AlgoliaError] = js.undefined
  
  var isSearchStalled: js.UndefOr[Any] = js.undefined
  
  var searchResults: js.UndefOr[SearchResults[Any]] = js.undefined
  
  var searchState: js.UndefOr[SearchState] = js.undefined
  
  var searching: js.UndefOr[Boolean] = js.undefined
  
  var searchingForFacetValues: js.UndefOr[Any] = js.undefined
}
object PartialStateResultsProvid {
  
  inline def apply(): PartialStateResultsProvid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateResultsProvid]
  }
  
  extension [Self <: PartialStateResultsProvid](x: Self) {
    
    inline def setAllSearchResults(value: AllSearchResults[Any]): Self = StObject.set(x, "allSearchResults", value.asInstanceOf[js.Any])
    
    inline def setAllSearchResultsUndefined: Self = StObject.set(x, "allSearchResults", js.undefined)
    
    inline def setError(value: AlgoliaError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsSearchStalled(value: Any): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    inline def setIsSearchStalledUndefined: Self = StObject.set(x, "isSearchStalled", js.undefined)
    
    inline def setSearchResults(value: SearchResults[Any]): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
    
    inline def setSearchResultsUndefined: Self = StObject.set(x, "searchResults", js.undefined)
    
    inline def setSearchState(value: SearchState): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
    
    inline def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
    
    inline def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    inline def setSearchingForFacetValues(value: Any): Self = StObject.set(x, "searchingForFacetValues", value.asInstanceOf[js.Any])
    
    inline def setSearchingForFacetValuesUndefined: Self = StObject.set(x, "searchingForFacetValues", js.undefined)
    
    inline def setSearchingUndefined: Self = StObject.set(x, "searching", js.undefined)
  }
}
