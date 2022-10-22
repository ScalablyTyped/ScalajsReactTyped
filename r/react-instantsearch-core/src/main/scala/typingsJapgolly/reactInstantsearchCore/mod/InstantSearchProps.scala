package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantSearchProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var createURL: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var indexName: String
  
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var resultsState: js.UndefOr[Any] = js.undefined
  
  var searchClient: Any
  
  var searchState: js.UndefOr[Any] = js.undefined
  
  var stalledSearchDelay: js.UndefOr[Double] = js.undefined
  
  var widgetsCollector: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object InstantSearchProps {
  
  inline def apply(indexName: String, searchClient: Any): InstantSearchProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
  
  extension [Self <: InstantSearchProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setOnSearchParameters(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSearchParameters", js.Any.fromFunction1(value))
    
    inline def setOnSearchParametersUndefined: Self = StObject.set(x, "onSearchParameters", js.undefined)
    
    inline def setOnSearchStateChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSearchStateChange", js.Any.fromFunction1(value))
    
    inline def setOnSearchStateChangeUndefined: Self = StObject.set(x, "onSearchStateChange", js.undefined)
    
    inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setResultsState(value: Any): Self = StObject.set(x, "resultsState", value.asInstanceOf[js.Any])
    
    inline def setResultsStateUndefined: Self = StObject.set(x, "resultsState", js.undefined)
    
    inline def setSearchClient(value: Any): Self = StObject.set(x, "searchClient", value.asInstanceOf[js.Any])
    
    inline def setSearchState(value: Any): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
    
    inline def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
    
    inline def setStalledSearchDelay(value: Double): Self = StObject.set(x, "stalledSearchDelay", value.asInstanceOf[js.Any])
    
    inline def setStalledSearchDelayUndefined: Self = StObject.set(x, "stalledSearchDelay", js.undefined)
    
    inline def setWidgetsCollector(value: /* repeated */ Any => Any): Self = StObject.set(x, "widgetsCollector", js.Any.fromFunction1(value))
    
    inline def setWidgetsCollectorUndefined: Self = StObject.set(x, "widgetsCollector", js.undefined)
  }
}
