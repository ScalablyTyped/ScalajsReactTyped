package typingsJapgolly.semanticUiApi

import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.semanticUiApi.SemanticUI.Api
import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`false`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`add url data`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`create cache`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`get event`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`get request`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`get url encoded value`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`is disabled`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`is loading`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`is mocked`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`read cached response`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`remove error`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`remove loading`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`set error`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`set loading`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was cancelled`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was complete`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was failure`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was successful`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`write cached response`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.abort
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.destroy
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.query
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.reset
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def api(): JQuery
  def api(settings: ApiSettings): JQuery
  @JSName("api")
  var api_Original: Api
  /**
    * Aborts current API request
    */
  @JSName("api")
  def api_abort(behavior: abort): JQuery
  /**
    * Adds data to existing templated url and returns full url string
    */
  @JSName("api")
  def api_addurldata(behavior: `add url data`, url: String, data: Any): String
  /**
    * Creates new cache, removing all locally cached URLs
    */
  @JSName("api")
  def api_createcache(behavior: `create cache`): JQuery
  /**
    * Removes API settings from the page and all events
    */
  @JSName("api")
  def api_destroy(behavior: destroy): JQuery
  /**
    * Gets event that API request will occur on
    */
  @JSName("api")
  def api_getevent(behavior: `get event`): String
  /**
    * Gets promise for current API request
    */
  @JSName("api")
  def api_getrequest(behavior: `get request`): JQueryDeferred[Any] | `false`
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  @JSName("api")
  def api_geturlencodedvalue(behavior: `get url encoded value`, value: Any): String
  /**
    * Returns whether element is disabled
    */
  @JSName("api")
  def api_isdisabled(behavior: `is disabled`): Boolean
  /**
    * Returns whether element is loading
    */
  @JSName("api")
  def api_isloading(behavior: `is loading`): Boolean
  /**
    * Returns whether element response is mocked
    */
  @JSName("api")
  def api_ismocked(behavior: `is mocked`): Boolean
  /**
    * Execute query using existing API settings
    */
  @JSName("api")
  def api_query(behavior: query): JQuery
  /**
    * Reads a locally cached response for a URL
    */
  @JSName("api")
  def api_readcachedresponse(behavior: `read cached response`, url: String): Any
  /**
    * Removes error state to element
    */
  @JSName("api")
  def api_removeerror(behavior: `remove error`): JQuery
  /**
    * Removes loading state to element
    */
  @JSName("api")
  def api_removeloading(behavior: `remove loading`): JQuery
  /**
    * Removes loading and error state from element
    */
  @JSName("api")
  def api_reset(behavior: reset): JQuery
  /**
    * Sets error state to element
    */
  @JSName("api")
  def api_seterror(behavior: `set error`): JQuery
  /**
    * Sets loading state to element
    */
  @JSName("api")
  def api_setloading(behavior: `set loading`): JQuery
  @JSName("api")
  def api_setting(behavior: setting, value: ApiSettings): JQuery
  @JSName("api")
  def api_setting[K /* <: /* keyof semantic-ui-api.SemanticUI.ApiSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("api")
  def api_setting[K /* <: /* keyof semantic-ui-api.SemanticUI.ApiSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
  /**
    * Returns whether last request was cancelled
    */
  @JSName("api")
  def api_wascancelled(behavior: `was cancelled`): Boolean
  /**
    * Returns whether last request was completed
    */
  @JSName("api")
  def api_wascomplete(behavior: `was complete`): Boolean
  /**
    * Returns whether last request was failure
    */
  @JSName("api")
  def api_wasfailure(behavior: `was failure`): Boolean
  /**
    * Returns whether last request was successful
    */
  @JSName("api")
  def api_wassuccessful(behavior: `was successful`): Boolean
  /**
    * Writes a cached response for a URL
    */
  @JSName("api")
  def api_writecachedresponse(behavior: `write cached response`, url: String, response: Any): JQuery
}
object JQuery {
  
  inline def apply(api: Api): JQuery = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
