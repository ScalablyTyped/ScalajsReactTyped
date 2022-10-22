package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.algoliasearchHelper.mod.SearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedWidget extends StObject {
  
  def createURL(args: Any*): String
  
  def getMetadata(nextWidgetsState: SearchState): Any
  
  def getProvidedProps(props: Any): Any
  
  def getSearchParameters(searchParameters: SearchParameters): SearchState
  
  def refine(args: Any*): Unit
  
  def searchForFacetValues(args: Any*): Unit
  
  def transitionState(prevWidgetsState: SearchState, nextWidgetsState: SearchState): SearchState
}
object ConnectedWidget {
  
  inline def apply(
    createURL: /* repeated */ Any => String,
    getMetadata: SearchState => Any,
    getProvidedProps: Any => Any,
    getSearchParameters: SearchParameters => SearchState,
    refine: /* repeated */ Any => Callback,
    searchForFacetValues: /* repeated */ Any => Callback,
    transitionState: (SearchState, SearchState) => SearchState
  ): ConnectedWidget = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), getMetadata = js.Any.fromFunction1(getMetadata), getProvidedProps = js.Any.fromFunction1(getProvidedProps), getSearchParameters = js.Any.fromFunction1(getSearchParameters), refine = js.Any.fromFunction1((t0: /* repeated */ Any) => refine(t0).runNow()), searchForFacetValues = js.Any.fromFunction1((t0: /* repeated */ Any) => searchForFacetValues(t0).runNow()), transitionState = js.Any.fromFunction2(transitionState))
    __obj.asInstanceOf[ConnectedWidget]
  }
  
  extension [Self <: ConnectedWidget](x: Self) {
    
    inline def setCreateURL(value: /* repeated */ Any => String): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setGetMetadata(value: SearchState => Any): Self = StObject.set(x, "getMetadata", js.Any.fromFunction1(value))
    
    inline def setGetProvidedProps(value: Any => Any): Self = StObject.set(x, "getProvidedProps", js.Any.fromFunction1(value))
    
    inline def setGetSearchParameters(value: SearchParameters => SearchState): Self = StObject.set(x, "getSearchParameters", js.Any.fromFunction1(value))
    
    inline def setRefine(value: /* repeated */ Any => Callback): Self = StObject.set(x, "refine", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSearchForFacetValues(value: /* repeated */ Any => Callback): Self = StObject.set(x, "searchForFacetValues", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setTransitionState(value: (SearchState, SearchState) => SearchState): Self = StObject.set(x, "transitionState", js.Any.fromFunction2(value))
  }
}
