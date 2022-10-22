package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncTypeaheadProps[T /* <: TypeaheadModel */]
  extends StObject
     with TypeaheadProps[T] {
  
  /* Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[Double] = js.undefined
  
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: Boolean
  
  /* Callback to perform when the search is executed. */
  def onSearch(query: String): Unit
  
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[Node] = js.undefined
  
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[Node] = js.undefined
  
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[Boolean] = js.undefined
}
object AsyncTypeaheadProps {
  
  inline def apply[T /* <: TypeaheadModel */](isLoading: Boolean, onSearch: String => Callback, options: js.Array[T]): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], onSearch = js.Any.fromFunction1((t0: String) => onSearch(t0).runNow()), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
  
  extension [Self <: AsyncTypeaheadProps[?], T /* <: TypeaheadModel */](x: Self & AsyncTypeaheadProps[T]) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setOnSearch(value: String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPromptText(value: VdomNode): Self = StObject.set(x, "promptText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPromptTextNull: Self = StObject.set(x, "promptText", null)
    
    inline def setPromptTextUndefined: Self = StObject.set(x, "promptText", js.undefined)
    
    inline def setPromptTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "promptText", js.Array(value*))
    
    inline def setPromptTextVdomElement(value: VdomElement): Self = StObject.set(x, "promptText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSearchText(value: VdomNode): Self = StObject.set(x, "searchText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSearchTextNull: Self = StObject.set(x, "searchText", null)
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setSearchTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "searchText", js.Array(value*))
    
    inline def setSearchTextVdomElement(value: VdomElement): Self = StObject.set(x, "searchText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    
    inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
  }
}
