package typingsJapgolly.semanticUiSearch

import typingsJapgolly.semanticUiSearch.SemanticUI.Search
import typingsJapgolly.semanticUiSearch.SemanticUI.SearchSettings
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`add results`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`cancel query`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`clear cache`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`display message`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`generate results`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`get result`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`get value`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`has minimum characters`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`hide results`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`is empty`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`is focused`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`is visible`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`read cache`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`search local`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`search object`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`search remote`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`set value`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`show results`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.`write cache`
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.destroy
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.query
import typingsJapgolly.semanticUiSearch.semanticUiSearchStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def search(): JQuery
  def search(settings: SearchSettings): JQuery
  @JSName("search")
  var search_Original: Search
  /**
    * Adds HTML to results and displays
    */
  @JSName("search")
  def search_addresults(behavior: `add results`, html: String): JQuery
  /**
    * Cancels current remote search query
    */
  @JSName("search")
  def search_cancelquery(behavior: `cancel query`): JQuery
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  @JSName("search")
  def search_clearcache(behavior: `clear cache`): JQuery
  @JSName("search")
  def search_clearcache(behavior: `clear cache`, query: String): JQuery
  /**
    * Removes all events
    */
  @JSName("search")
  def search_destroy(behavior: destroy): JQuery
  /**
    * Displays message in search results with text, using template matching type
    */
  @JSName("search")
  def search_displaymessage(behavior: `display message`, text: String, `type`: String): JQuery
  /**
    * Generates results using parser specified by settings.template
    */
  @JSName("search")
  def search_generateresults(behavior: `generate results`, response: Any): JQuery
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  @JSName("search")
  def search_getresult(behavior: `get result`, value: Any): Any
  /**
    * Returns current search value
    */
  @JSName("search")
  def search_getvalue(behavior: `get value`): Any
  /**
    * Whether has minimum characters
    */
  @JSName("search")
  def search_hasminimumcharacters(behavior: `has minimum characters`): Boolean
  /**
    * Hides results container
    */
  @JSName("search")
  def search_hideresults(behavior: `hide results`): JQuery
  @JSName("search")
  def search_hideresults(behavior: `hide results`, callback: js.Function0[Unit]): JQuery
  /**
    * Whether search results are empty
    */
  @JSName("search")
  def search_isempty(behavior: `is empty`): Boolean
  /**
    * Whether search is currently focused
    */
  @JSName("search")
  def search_isfocused(behavior: `is focused`): Boolean
  /**
    * Whether search results are visible
    */
  @JSName("search")
  def search_isvisible(behavior: `is visible`): Boolean
  /**
    * Search for value currently set in search input
    */
  @JSName("search")
  def search_query(behavior: query): JQuery
  @JSName("search")
  def search_query(behavior: query, callback: js.Function0[Unit]): JQuery
  /**
    * Reads cached results for query
    */
  @JSName("search")
  def search_readcache(behavior: `read cache`, query: String): JQuery
  /**
    * Search local object for specified query and display results
    */
  @JSName("search")
  def search_searchlocal(behavior: `search local`, query: String): JQuery
  /**
    * Search object for specified query and return results
    */
  @JSName("search")
  def search_searchobject(behavior: `search object`, query: String, `object`: Any, searchFields: js.Array[String]): Any
  /**
    * Search remote endpoint for specified query and display results
    */
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String): JQuery
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery
  @JSName("search")
  def search_setting(behavior: setting, value: SearchSettings): JQuery
  @JSName("search")
  def search_setting[K /* <: /* keyof semantic-ui-search.SemanticUI.SearchSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("search")
  def search_setting[K /* <: /* keyof semantic-ui-search.SemanticUI.SearchSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any
  /**
    * Sets search input to value
    */
  @JSName("search")
  def search_setvalue(behavior: `set value`, value: Any): JQuery
  /**
    * Shows results container
    */
  @JSName("search")
  def search_showresults(behavior: `show results`): JQuery
  @JSName("search")
  def search_showresults(behavior: `show results`, callback: js.Function0[Unit]): JQuery
  /**
    * Writes cached results for query
    */
  @JSName("search")
  def search_writecache(behavior: `write cache`, query: String): JQuery
}
object JQuery {
  
  inline def apply(search: Search): JQuery = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
