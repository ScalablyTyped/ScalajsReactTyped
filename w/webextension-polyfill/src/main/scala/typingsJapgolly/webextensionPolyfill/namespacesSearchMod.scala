package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesSearchMod {
  
  object Search {
    
    /**
      * An object encapsulating a search engine
      */
    trait SearchEngine extends StObject {
      
      /**
        * Optional.
        */
      var alias: js.UndefOr[String] = js.undefined
      
      /**
        * Optional.
        */
      var favIconUrl: js.UndefOr[String] = js.undefined
      
      var isDefault: Boolean
      
      var name: String
    }
    object SearchEngine {
      
      inline def apply(isDefault: Boolean, name: String): SearchEngine = {
        val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchEngine]
      }
      
      extension [Self <: SearchEngine](x: Self) {
        
        inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
        
        inline def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
        
        inline def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
        
        inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait SearchSearchPropertiesType extends StObject {
      
      /**
        * Search engine to use. Uses the default if not specified.
        * Optional.
        */
      var engine: js.UndefOr[String] = js.undefined
      
      /**
        * Terms to search for.
        */
      var query: String
      
      /**
        * The ID of the tab for the search results. If not specified, a new tab is created.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
    }
    object SearchSearchPropertiesType {
      
      inline def apply(query: String): SearchSearchPropertiesType = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchSearchPropertiesType]
      }
      
      extension [Self <: SearchSearchPropertiesType](x: Self) {
        
        inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
        
        inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Gets a list of search engines.
        *
        * @returns A Promise that will be fulfilled with an array of search engine objects.
        */
      def get(): js.Promise[js.Array[SearchEngine]]
      
      /**
        * Perform a search.
        *
        * @param searchProperties
        */
      def search(searchProperties: SearchSearchPropertiesType): Unit
    }
    object Static {
      
      inline def apply(
        get: CallbackTo[js.Promise[js.Array[SearchEngine]]],
        search: SearchSearchPropertiesType => Callback
      ): Static = {
        val __obj = js.Dynamic.literal(get = get.toJsFn, search = js.Any.fromFunction1((t0: SearchSearchPropertiesType) => search(t0).runNow()))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setGet(value: CallbackTo[js.Promise[js.Array[SearchEngine]]]): Self = StObject.set(x, "get", value.toJsFn)
        
        inline def setSearch(value: SearchSearchPropertiesType => Callback): Self = StObject.set(x, "search", js.Any.fromFunction1((t0: SearchSearchPropertiesType) => value(t0).runNow()))
      }
    }
  }
}
