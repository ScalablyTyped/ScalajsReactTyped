package typingsJapgolly.semanticUiApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.jquery.JQuery_.Deferred
import typingsJapgolly.jquery.JQuery_.jqXHR
import typingsJapgolly.semanticUiApi.SemanticUI.Api
import typingsJapgolly.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.ErrorSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.MetadataSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.RegExpSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.SelectorSettings
import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`false`
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`true`
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
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.action
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.auto
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.beforeSend
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.beforeXHR
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.cache
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.className
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.data
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.dataType
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.debug
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.defaultData
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.delete
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.destroy
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.encodeParameters
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.error
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.errorDuration
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.get
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.head
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.hideError
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.html
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.interruptRequests
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.json
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.jsonp
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.loadingDuration
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.local
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.metadata
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.method
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.mockResponse
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.mockResponseAsync
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.name
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.namespace
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.on
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onAbort
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onComplete
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onError
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onFailure
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onRequest
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onResponse
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.onSuccess
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.options
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.patch
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.performance
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.post
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.put
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.query
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.regExp
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.reset
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.response
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.responseAsync
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.script
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.selector
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.serializeForm
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.setting
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.silent
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.stateContext
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.successTest
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.text
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.throttle
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.throttleFirstRequest
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.url
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.urlData
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.verbose
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("api")
  var api_Original: Api = js.native
  def api(): JQuery = js.native
  def api(behavior: setting, name: action): String | `false` = js.native
  def api(behavior: setting, name: action, value: String): JQuery = js.native
  def api(behavior: setting, name: action, value: `false`): JQuery = js.native
  def api(behavior: setting, name: typingsJapgolly.semanticUiApi.semanticUiApiStrings.api): StringDictionary[String] = js.native
  def api(
    behavior: setting,
    name: typingsJapgolly.semanticUiApi.semanticUiApiStrings.api,
    value: StringDictionary[String]
  ): JQuery = js.native
  def api(behavior: setting, name: beforeSend): js.Function1[/* settings */ ApiSettings, _] = js.native
  def api(behavior: setting, name: beforeSend, value: js.Function1[/* settings */ ApiSettings, _]): JQuery = js.native
  def api(behavior: setting, name: beforeXHR): js.Function1[/* xhrObject */ jqXHR[_], _] = js.native
  def api(behavior: setting, name: beforeXHR, value: js.Function1[/* xhrObject */ jqXHR[_], _]): JQuery = js.native
  def api(behavior: setting, name: cache): local | Boolean = js.native
  def api(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: cache, value: local): JQuery = js.native
  def api(behavior: setting, name: className): ClassNameSettings = js.native
  def api(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def api(behavior: setting, name: data): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any = js.native
  def api(behavior: setting, name: dataType): xml | json | jsonp | script | html | text = js.native
  def api(behavior: setting, name: dataType, value: html): JQuery = js.native
  def api(behavior: setting, name: dataType, value: json): JQuery = js.native
  def api(behavior: setting, name: dataType, value: jsonp): JQuery = js.native
  def api(behavior: setting, name: dataType, value: script): JQuery = js.native
  def api(behavior: setting, name: dataType, value: text): JQuery = js.native
  def api(behavior: setting, name: dataType, value: xml): JQuery = js.native
  def api(
    behavior: setting,
    name: data,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any
  ): JQuery = js.native
  def api(behavior: setting, name: debug): Boolean = js.native
  def api(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: defaultData): Boolean = js.native
  def api(behavior: setting, name: defaultData, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: encodeParameters): Boolean = js.native
  def api(behavior: setting, name: encodeParameters, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: error): ErrorSettings = js.native
  def api(behavior: setting, name: errorDuration): `true` | Double = js.native
  def api(behavior: setting, name: errorDuration, value: Double): JQuery = js.native
  def api(behavior: setting, name: errorDuration, value: `true`): JQuery = js.native
  def api(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def api(behavior: setting, name: hideError): auto | Boolean = js.native
  def api(behavior: setting, name: hideError, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: hideError, value: auto): JQuery = js.native
  def api(behavior: setting, name: interruptRequests): Boolean = js.native
  def api(behavior: setting, name: interruptRequests, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: loadingDuration): Double = js.native
  def api(behavior: setting, name: loadingDuration, value: Double): JQuery = js.native
  def api(behavior: setting, name: metadata): MetadataSettings = js.native
  def api(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def api(behavior: setting, name: method): post | get | put | delete | head | options | patch = js.native
  def api(behavior: setting, name: method, value: delete): JQuery = js.native
  def api(behavior: setting, name: method, value: get): JQuery = js.native
  def api(behavior: setting, name: method, value: head): JQuery = js.native
  def api(behavior: setting, name: method, value: options): JQuery = js.native
  def api(behavior: setting, name: method, value: patch): JQuery = js.native
  def api(behavior: setting, name: method, value: post): JQuery = js.native
  def api(behavior: setting, name: method, value: put): JQuery = js.native
  def api(behavior: setting, name: mockResponse): js.Any | `false` = js.native
  def api(behavior: setting, name: mockResponseAsync): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  def api(
    behavior: setting,
    name: mockResponseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery = js.native
  def api(behavior: setting, name: mockResponseAsync, value: `false`): JQuery = js.native
  def api(behavior: setting, name: mockResponse, value: js.Any): JQuery = js.native
  def api(behavior: setting, name: mockResponse, value: `false`): JQuery = js.native
  def api(behavior: setting, name: name): String = js.native
  def api(behavior: setting, name: namespace): String = js.native
  def api(behavior: setting, name: namespace, value: String): JQuery = js.native
  def api(behavior: setting, name: name, value: String): JQuery = js.native
  def api(behavior: setting, name: on): String = js.native
  def api(behavior: setting, name: onAbort): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onAbort,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onComplete): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onComplete,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onError): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onError,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onFailure): js.Function2[/* response */ js.Any, /* element */ JQuery, Unit] = js.native
  def api(
    behavior: setting,
    name: onFailure,
    value: js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onRequest): js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onRequest,
    value: js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onResponse): js.Function1[/* response */ js.Any, Unit] = js.native
  def api(behavior: setting, name: onResponse, value: js.Function1[/* response */ js.Any, Unit]): JQuery = js.native
  def api(behavior: setting, name: onSuccess): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onSuccess,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: on, value: String): JQuery = js.native
  def api(behavior: setting, name: performance): Boolean = js.native
  def api(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: regExp): RegExpSettings = js.native
  def api(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def api(behavior: setting, name: response): js.Any | `false` = js.native
  def api(behavior: setting, name: responseAsync): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  def api(
    behavior: setting,
    name: responseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery = js.native
  def api(behavior: setting, name: responseAsync, value: `false`): JQuery = js.native
  def api(behavior: setting, name: response, value: js.Any): JQuery = js.native
  def api(behavior: setting, name: response, value: `false`): JQuery = js.native
  def api(behavior: setting, name: selector): SelectorSettings = js.native
  def api(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def api(behavior: setting, name: serializeForm): Boolean = js.native
  def api(behavior: setting, name: serializeForm, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: silent): Boolean = js.native
  def api(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: stateContext): String | JQuery = js.native
  def api(behavior: setting, name: stateContext, value: String): JQuery = js.native
  def api(behavior: setting, name: stateContext, value: JQuery): JQuery = js.native
  def api(behavior: setting, name: successTest): js.Function1[/* response */ js.Any, Boolean] = js.native
  def api(behavior: setting, name: successTest, value: js.Function1[/* response */ js.Any, Boolean]): JQuery = js.native
  def api(behavior: setting, name: throttle): Double = js.native
  def api(behavior: setting, name: throttleFirstRequest): Boolean = js.native
  def api(behavior: setting, name: throttleFirstRequest, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def api(behavior: setting, name: url): String | `false` = js.native
  def api(behavior: setting, name: urlData): js.Any | `false` = js.native
  def api(behavior: setting, name: urlData, value: js.Any): JQuery = js.native
  def api(behavior: setting, name: urlData, value: `false`): JQuery = js.native
  def api(behavior: setting, name: url, value: String): JQuery = js.native
  def api(behavior: setting, name: url, value: `false`): JQuery = js.native
  def api(behavior: setting, name: verbose): Boolean = js.native
  def api(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def api(settings: ApiSettings): JQuery = js.native
  /**
    * Aborts current API request
    */
  @JSName("api")
  def api_abort(behavior: abort): JQuery = js.native
  /**
    * Adds data to existing templated url and returns full url string
    */
  @JSName("api")
  def api_addurldata(behavior: `add url data`, url: String, data: js.Any): String = js.native
  /**
    * Creates new cache, removing all locally cached URLs
    */
  @JSName("api")
  def api_createcache(behavior: `create cache`): JQuery = js.native
  /**
    * Removes API settings from the page and all events
    */
  @JSName("api")
  def api_destroy(behavior: destroy): JQuery = js.native
  /**
    * Gets event that API request will occur on
    */
  @JSName("api")
  def api_getevent(behavior: `get event`): String = js.native
  /**
    * Gets promise for current API request
    */
  @JSName("api")
  def api_getrequest(behavior: `get request`): JQueryDeferred[_] | `false` = js.native
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  @JSName("api")
  def api_geturlencodedvalue(behavior: `get url encoded value`, value: js.Any): String = js.native
  /**
    * Returns whether element is disabled
    */
  @JSName("api")
  def api_isdisabled(behavior: `is disabled`): Boolean = js.native
  /**
    * Returns whether element is loading
    */
  @JSName("api")
  def api_isloading(behavior: `is loading`): Boolean = js.native
  /**
    * Returns whether element response is mocked
    */
  @JSName("api")
  def api_ismocked(behavior: `is mocked`): Boolean = js.native
  /**
    * Execute query using existing API settings
    */
  @JSName("api")
  def api_query(behavior: query): JQuery = js.native
  /**
    * Reads a locally cached response for a URL
    */
  @JSName("api")
  def api_readcachedresponse(behavior: `read cached response`, url: String): js.Any = js.native
  /**
    * Removes error state to element
    */
  @JSName("api")
  def api_removeerror(behavior: `remove error`): JQuery = js.native
  /**
    * Removes loading state to element
    */
  @JSName("api")
  def api_removeloading(behavior: `remove loading`): JQuery = js.native
  /**
    * Removes loading and error state from element
    */
  @JSName("api")
  def api_reset(behavior: reset): JQuery = js.native
  /**
    * Sets error state to element
    */
  @JSName("api")
  def api_seterror(behavior: `set error`): JQuery = js.native
  /**
    * Sets loading state to element
    */
  @JSName("api")
  def api_setloading(behavior: `set loading`): JQuery = js.native
  @JSName("api")
  def api_setting(behavior: setting, value: ApiSettings): JQuery = js.native
  /**
    * Returns whether last request was cancelled
    */
  @JSName("api")
  def api_wascancelled(behavior: `was cancelled`): Boolean = js.native
  /**
    * Returns whether last request was completed
    */
  @JSName("api")
  def api_wascomplete(behavior: `was complete`): Boolean = js.native
  /**
    * Returns whether last request was failure
    */
  @JSName("api")
  def api_wasfailure(behavior: `was failure`): Boolean = js.native
  /**
    * Returns whether last request was successful
    */
  @JSName("api")
  def api_wassuccessful(behavior: `was successful`): Boolean = js.native
  /**
    * Writes a cached response for a URL
    */
  @JSName("api")
  def api_writecachedresponse(behavior: `write cached response`, url: String, response: js.Any): JQuery = js.native
}

