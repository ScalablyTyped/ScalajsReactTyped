package typingsJapgolly.iitc

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Text
import org.scalajs.dom.UIEvent
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LatLngTuple
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerGroup_
import typingsJapgolly.spectrum.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSearchMod {
  
  object global {
    
    /**
      * you can implement your own result provider by listing to the search @see hook:
      * addHook('search', function(query: SearchQuery) {});
      */
    @JSGlobal("SearchQuery")
    @js.native
    open class SearchQuery () extends StObject {
      
      /** called to add a result to the query */
      def addResult(result: SearchResult): Unit = js.native
      
      /**
        * indicating if the user has pressed enter after searching. You should not search online or
        * do heavy processing unless the user has confirmed the search term
        */
      var confirmed: Boolean = js.native
      
      /* private */ def hide(): Unit = js.native
      
      /* private */ def init(): Unit = js.native
      
      /* private */ def onResultHoverEnd(result: SearchResult, event: Any): Unit = js.native
      
      /* private */ def onResultHoverStart(result: SearchResult, event: Any): Unit = js.native
      
      /* private */ def onResultSelected(result: SearchResult, event: Any): Unit = js.native
      
      /* private */ def removeHoverResult(): Unit = js.native
      
      /* private */ def removeSelectedResult(): Unit = js.native
      
      /* private */ def resultLayer(result: SearchResult): LayerGroup_[Any] = js.native
      
      /* private */ def show(): Unit = js.native
      
      /** the term for which the user has searched */
      var term: String = js.native
    }
    
    @JSGlobal("Search")
    @js.native
    open class Search_ () extends StObject {
      
      def doSearch(term: String, confirmed: Boolean): Unit = js.native
      
      var lastSearch: SearchQuery | Null = js.native
      
      def setup(): Unit = js.native
    }
    
    @JSGlobal("search")
    @js.native
    def search: Search_ = js.native
    inline def search_=(x: Search_): Unit = js.Dynamic.global.updateDynamic("search")(x.asInstanceOf[js.Any])
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.iitc.coreSearchMod.global.SearchResultPosition
      - typingsJapgolly.iitc.coreSearchMod.global.SearchResultBounds
    */
    trait SearchResult extends StObject
    object SearchResult {
      
      inline def SearchResultBounds(
        bounds: LatLngBoundsExpression,
        description: JQuery | js.Array[Any] | Element | Text | String,
        title: String
      ): typingsJapgolly.iitc.coreSearchMod.global.SearchResultBounds = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.iitc.coreSearchMod.global.SearchResultBounds]
      }
      
      inline def SearchResultPosition(
        description: JQuery | js.Array[Any] | Element | Text | String,
        position: LatLngExpression,
        title: String
      ): typingsJapgolly.iitc.coreSearchMod.global.SearchResultPosition = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.iitc.coreSearchMod.global.SearchResultPosition]
      }
    }
    
    trait SearchResultBase extends StObject {
      
      /** secondary information for this result.Will be interpreted as HTML, so make sure to escape properly. */
      var description: JQuery | js.Array[Any] | Element | Text | String
      
      /** a URL to a icon to display in the result list. Should be 12x12. */
      var icon: js.UndefOr[String] = js.undefined
      
      /** a ILayer to be added to the map when the user selects this search result. Will be generated if not set. Set to `null` to prevent the result from being added to the map. */
      var layer: js.UndefOr[Layer] = js.undefined
      
      /**
        * a handler to be called when the result is removed from the map(because another result has been
        * selected or the search was cancelled by the user).
        */
      var onRemove: js.UndefOr[js.Function1[/* result */ SearchResult, Unit]] = js.undefined
      
      /**
        * a handler to be called when the result is selected. May return `true` to prevent the map from being repositioned.
        * You may reposition the map yourself or do other work.
        */
      var onSelected: js.UndefOr[
            js.Function2[/* result */ SearchResult, /* event */ UIEvent, js.UndefOr[Boolean]]
          ] = js.undefined
      
      /** Will be interpreted as HTML, so make sure to escape properly. */
      var title: String
    }
    object SearchResultBase {
      
      inline def apply(description: JQuery | js.Array[Any] | Element | Text | String, title: String): SearchResultBase = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultBase]
      }
      
      extension [Self <: SearchResultBase](x: Self) {
        
        inline def setDescription(value: JQuery | js.Array[Any] | Element | Text | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionVarargs(value: Any*): Self = StObject.set(x, "description", js.Array(value*))
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
        
        inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
        
        inline def setOnRemove(value: /* result */ SearchResult => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: /* result */ SearchResult) => value(t0).runNow()))
        
        inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
        
        inline def setOnSelected(value: (/* result */ SearchResult, /* event */ UIEvent) => js.UndefOr[Boolean]): Self = StObject.set(x, "onSelected", js.Any.fromFunction2(value))
        
        inline def setOnSelectedUndefined: Self = StObject.set(x, "onSelected", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    trait SearchResultBounds
      extends StObject
         with SearchResultBase
         with SearchResult {
      
      var bounds: LatLngBoundsExpression
    }
    object SearchResultBounds {
      
      inline def apply(
        bounds: LatLngBoundsExpression,
        description: JQuery | js.Array[Any] | Element | Text | String,
        title: String
      ): SearchResultBounds = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultBounds]
      }
      
      extension [Self <: SearchResultBounds](x: Self) {
        
        inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
      }
    }
    
    trait SearchResultPosition
      extends StObject
         with SearchResultBase
         with SearchResult {
      
      var position: LatLngExpression
    }
    object SearchResultPosition {
      
      inline def apply(
        description: JQuery | js.Array[Any] | Element | Text | String,
        position: LatLngExpression,
        title: String
      ): SearchResultPosition = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResultPosition]
      }
      
      extension [Self <: SearchResultPosition](x: Self) {
        
        inline def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      }
    }
  }
}
