package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerProxy
  extends typingsJapgolly.senchaTouch.Ext.data.proxy.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Method] Creates and returns an Ext data Request object based on the options passed by the Store that this Proxy is attached to
  		* @param operation Ext.data.Operation The Operation object to execute
  		* @returns Ext.data.Request The request object
  		*/
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.undefined
  /** [Method] Generates a url based on a given Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns String The url
  		*/
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.undefined
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.undefined
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.undefined
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Ext.data.Operation The Ext.data.Operation object
  		* @param callback Function The callback function to call when the Operation has completed
  		* @param scope Object The scope in which to execute the callback
  		*/
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.undefined
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.undefined
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of api
  		* @returns Object
  		*/
  var getApi: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cacheString
  		* @returns String
  		*/
  var getCacheString: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of directionParam
  		* @returns String
  		*/
  var getDirectionParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of enablePagingParams
  		* @returns Boolean
  		*/
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filterParam
  		* @returns String
  		*/
  var getFilterParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of groupParam
  		* @returns String
  		*/
  var getGroupParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of limitParam
  		* @returns String
  		*/
  var getLimitParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of noCache
  		* @returns Boolean
  		*/
  var getNoCache: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of pageParam
  		* @returns String
  		*/
  var getPageParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of simpleSortMode
  		* @returns Boolean
  		*/
  var getSimpleSortMode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of sortParam
  		* @returns String
  		*/
  var getSortParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of startParam
  		* @returns String
  		*/
  var getStartParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.undefined
  /** [Method] This method handles the processing of the response and is usually overridden by subclasses to do additional processing
  		* @param success Boolean Whether or not this request was successful
  		* @param operation Ext.data.Operation The operation we made this request for
  		* @param request Ext.data.Request The request that was made
  		* @param response Object The response that we got
  		* @param callback Function The callback to be fired onces the response is processed
  		* @param scope Object The scope in which we call the callback
  		*/
  var processResponse: js.UndefOr[
    js.Function6[
      /* success */ js.UndefOr[Boolean], 
      /* operation */ js.UndefOr[IOperation], 
      /* request */ js.UndefOr[IRequest], 
      /* response */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of cacheString
  		* @param cacheString String The new value.
  		*/
  var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of directionParam
  		* @param directionParam String The new value.
  		*/
  var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of enablePagingParams
  		* @param enablePagingParams Boolean The new value.
  		*/
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of filterParam
  		* @param filterParam String The new value.
  		*/
  var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of groupParam
  		* @param groupParam String The new value.
  		*/
  var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of limitParam
  		* @param limitParam String The new value.
  		*/
  var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of noCache
  		* @param noCache Boolean The new value.
  		*/
  var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of pageParam
  		* @param pageParam String The new value.
  		*/
  var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of simpleSortMode
  		* @param simpleSortMode Boolean The new value.
  		*/
  var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of sortParam
  		* @param sortParam String The new value.
  		*/
  var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of startParam
  		* @param startParam String The new value.
  		*/
  var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
}

object IServerProxy {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    afterRequest: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    batch: /* options */ js.UndefOr[js.Any] => CallbackTo[IBatch] = null,
    batchActions: js.UndefOr[Boolean] = js.undefined,
    batchOrder: String = null,
    bubbleEvents: js.Any = null,
    buildRequest: /* operation */ js.UndefOr[IOperation] => CallbackTo[IRequest] = null,
    buildUrl: /* request */ js.UndefOr[IRequest] => CallbackTo[String] = null,
    cacheString: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    create: js.UndefOr[Callback] = js.undefined,
    destroy: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    directionParam: String = null,
    doRequest: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    enablePagingParams: js.UndefOr[Boolean] = js.undefined,
    encodeFilters: /* filters */ js.UndefOr[Array] => CallbackTo[String] = null,
    encodeSorters: /* sorters */ js.UndefOr[Array] => CallbackTo[String] = null,
    extend: String = null,
    extraParams: js.Any = null,
    filterParam: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    getApi: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBatchActions: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBatchOrder: js.UndefOr[CallbackTo[String]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCacheString: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDirectionParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getEnablePagingParams: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getExtraParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFilterParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getGroupParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLimitParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getNoCache: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getPageParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getReader: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSimpleSortMode: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getSortParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getStartParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getTimeout: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getWriter: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    groupParam: String = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    limitParam: String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    pageParam: String = null,
    platformConfig: js.Any = null,
    processResponse: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    read: js.UndefOr[Callback] = js.undefined,
    reader: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setApi: /* api */ js.UndefOr[js.Any] => Callback = null,
    setBatchActions: /* batchActions */ js.UndefOr[Boolean] => Callback = null,
    setBatchOrder: /* batchOrder */ js.UndefOr[String] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setCacheString: /* cacheString */ js.UndefOr[String] => Callback = null,
    setDirectionParam: /* directionParam */ js.UndefOr[String] => Callback = null,
    setEnablePagingParams: /* enablePagingParams */ js.UndefOr[Boolean] => Callback = null,
    setExtraParam: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Callback = null,
    setExtraParams: /* extraParams */ js.UndefOr[js.Any] => Callback = null,
    setFilterParam: /* filterParam */ js.UndefOr[String] => Callback = null,
    setGroupParam: /* groupParam */ js.UndefOr[String] => Callback = null,
    setLimitParam: /* limitParam */ js.UndefOr[String] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setModel: /* model */ js.UndefOr[js.Any] => Callback = null,
    setNoCache: /* noCache */ js.UndefOr[Boolean] => Callback = null,
    setPageParam: /* pageParam */ js.UndefOr[String] => Callback = null,
    setReader: /* reader */ js.UndefOr[js.Any] => Callback = null,
    setSimpleSortMode: /* simpleSortMode */ js.UndefOr[Boolean] => Callback = null,
    setSortParam: /* sortParam */ js.UndefOr[String] => Callback = null,
    setStartParam: /* startParam */ js.UndefOr[String] => Callback = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Callback = null,
    setUrl: /* url */ js.UndefOr[String] => Callback = null,
    setWriter: /* writer */ js.UndefOr[js.Any] => Callback = null,
    simpleSortMode: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortParam: String = null,
    startParam: String = null,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    timeout: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    update: js.UndefOr[Callback] = js.undefined,
    url: String = null,
    uses: Array = null,
    writer: js.Any = null
  ): IServerProxy = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(js.Any.fromFunction2((t0: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest], t1: /* success */ js.UndefOr[scala.Boolean]) => afterRequest(t0, t1).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => batch(t0).runNow()))
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions.asInstanceOf[js.Any])
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(js.Any.fromFunction1((t0: /* operation */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IOperation]) => buildRequest(t0).runNow()))
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest]) => buildUrl(t0).runNow()))
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    create.foreach(p => __obj.updateDynamic("create")(p.toJsFn))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction3((t0: /* operation */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IOperation], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => destroy(t0, t1, t2).runNow()))
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam.asInstanceOf[js.Any])
    if (doRequest != null) __obj.updateDynamic("doRequest")(js.Any.fromFunction3((t0: /* operation */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IOperation], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => doRequest(t0, t1, t2).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (!js.isUndefined(enablePagingParams)) __obj.updateDynamic("enablePagingParams")(enablePagingParams.asInstanceOf[js.Any])
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(js.Any.fromFunction1((t0: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => encodeFilters(t0).runNow()))
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => encodeSorters(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams.asInstanceOf[js.Any])
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    getApi.foreach(p => __obj.updateDynamic("getApi")(p.toJsFn))
    getBatchActions.foreach(p => __obj.updateDynamic("getBatchActions")(p.toJsFn))
    getBatchOrder.foreach(p => __obj.updateDynamic("getBatchOrder")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getCacheString.foreach(p => __obj.updateDynamic("getCacheString")(p.toJsFn))
    getDirectionParam.foreach(p => __obj.updateDynamic("getDirectionParam")(p.toJsFn))
    getEnablePagingParams.foreach(p => __obj.updateDynamic("getEnablePagingParams")(p.toJsFn))
    getExtraParams.foreach(p => __obj.updateDynamic("getExtraParams")(p.toJsFn))
    getFilterParam.foreach(p => __obj.updateDynamic("getFilterParam")(p.toJsFn))
    getGroupParam.foreach(p => __obj.updateDynamic("getGroupParam")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLimitParam.foreach(p => __obj.updateDynamic("getLimitParam")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getModel.foreach(p => __obj.updateDynamic("getModel")(p.toJsFn))
    getNoCache.foreach(p => __obj.updateDynamic("getNoCache")(p.toJsFn))
    getPageParam.foreach(p => __obj.updateDynamic("getPageParam")(p.toJsFn))
    getReader.foreach(p => __obj.updateDynamic("getReader")(p.toJsFn))
    getSimpleSortMode.foreach(p => __obj.updateDynamic("getSimpleSortMode")(p.toJsFn))
    getSortParam.foreach(p => __obj.updateDynamic("getSortParam")(p.toJsFn))
    getStartParam.foreach(p => __obj.updateDynamic("getStartParam")(p.toJsFn))
    getTimeout.foreach(p => __obj.updateDynamic("getTimeout")(p.toJsFn))
    getWriter.foreach(p => __obj.updateDynamic("getWriter")(p.toJsFn))
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (processResponse != null) __obj.updateDynamic("processResponse")(js.Any.fromFunction6((t0: /* success */ js.UndefOr[scala.Boolean], t1: /* operation */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IOperation], t2: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest], t3: /* response */ js.UndefOr[js.Any], t4: /* callback */ js.UndefOr[js.Any], t5: /* scope */ js.UndefOr[js.Any]) => processResponse(t0, t1, t2, t3, t4, t5).runNow()))
    read.foreach(p => __obj.updateDynamic("read")(p.toJsFn))
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setApi != null) __obj.updateDynamic("setApi")(js.Any.fromFunction1((t0: /* api */ js.UndefOr[js.Any]) => setApi(t0).runNow()))
    if (setBatchActions != null) __obj.updateDynamic("setBatchActions")(js.Any.fromFunction1((t0: /* batchActions */ js.UndefOr[scala.Boolean]) => setBatchActions(t0).runNow()))
    if (setBatchOrder != null) __obj.updateDynamic("setBatchOrder")(js.Any.fromFunction1((t0: /* batchOrder */ js.UndefOr[java.lang.String]) => setBatchOrder(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setCacheString != null) __obj.updateDynamic("setCacheString")(js.Any.fromFunction1((t0: /* cacheString */ js.UndefOr[java.lang.String]) => setCacheString(t0).runNow()))
    if (setDirectionParam != null) __obj.updateDynamic("setDirectionParam")(js.Any.fromFunction1((t0: /* directionParam */ js.UndefOr[java.lang.String]) => setDirectionParam(t0).runNow()))
    if (setEnablePagingParams != null) __obj.updateDynamic("setEnablePagingParams")(js.Any.fromFunction1((t0: /* enablePagingParams */ js.UndefOr[scala.Boolean]) => setEnablePagingParams(t0).runNow()))
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any]) => setExtraParam(t0, t1).runNow()))
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(js.Any.fromFunction1((t0: /* extraParams */ js.UndefOr[js.Any]) => setExtraParams(t0).runNow()))
    if (setFilterParam != null) __obj.updateDynamic("setFilterParam")(js.Any.fromFunction1((t0: /* filterParam */ js.UndefOr[java.lang.String]) => setFilterParam(t0).runNow()))
    if (setGroupParam != null) __obj.updateDynamic("setGroupParam")(js.Any.fromFunction1((t0: /* groupParam */ js.UndefOr[java.lang.String]) => setGroupParam(t0).runNow()))
    if (setLimitParam != null) __obj.updateDynamic("setLimitParam")(js.Any.fromFunction1((t0: /* limitParam */ js.UndefOr[java.lang.String]) => setLimitParam(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[js.Any]) => setModel(t0).runNow()))
    if (setNoCache != null) __obj.updateDynamic("setNoCache")(js.Any.fromFunction1((t0: /* noCache */ js.UndefOr[scala.Boolean]) => setNoCache(t0).runNow()))
    if (setPageParam != null) __obj.updateDynamic("setPageParam")(js.Any.fromFunction1((t0: /* pageParam */ js.UndefOr[java.lang.String]) => setPageParam(t0).runNow()))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1((t0: /* reader */ js.UndefOr[js.Any]) => setReader(t0).runNow()))
    if (setSimpleSortMode != null) __obj.updateDynamic("setSimpleSortMode")(js.Any.fromFunction1((t0: /* simpleSortMode */ js.UndefOr[scala.Boolean]) => setSimpleSortMode(t0).runNow()))
    if (setSortParam != null) __obj.updateDynamic("setSortParam")(js.Any.fromFunction1((t0: /* sortParam */ js.UndefOr[java.lang.String]) => setSortParam(t0).runNow()))
    if (setStartParam != null) __obj.updateDynamic("setStartParam")(js.Any.fromFunction1((t0: /* startParam */ js.UndefOr[java.lang.String]) => setStartParam(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[scala.Double]) => setTimeout(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => setUrl(t0).runNow()))
    if (setWriter != null) __obj.updateDynamic("setWriter")(js.Any.fromFunction1((t0: /* writer */ js.UndefOr[js.Any]) => setWriter(t0).runNow()))
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam.asInstanceOf[js.Any])
    if (startParam != null) __obj.updateDynamic("startParam")(startParam.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    update.foreach(p => __obj.updateDynamic("update")(p.toJsFn))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerProxy]
  }
}

