package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.util.IGrouper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Method] Checks whether this operation should cause writing to occur
  		* @returns Boolean Whether the operation should cause a write to occur.
  		*/
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of addRecords
  		* @returns Boolean
  		*/
  var getAddRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of batch
  		* @returns Ext.data.Batch
  		*/
  var getBatch: js.UndefOr[js.Function0[IBatch]] = js.undefined
  /** [Method] Returns the value of callback
  		* @returns Function
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the error string or object that was set using setException
  		* @returns String/Object The error object.
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filters
  		* @returns Ext.util.Filter[]
  		*/
  var getFilters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of grouper
  		* @returns Ext.util.Grouper
  		*/
  var getGrouper: js.UndefOr[js.Function0[IGrouper]] = js.undefined
  /** [Method] Returns the value of limit
  		* @returns Number
  		*/
  var getLimit: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns Ext.data.Model
  		*/
  var getModel: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns the value of node
  		* @returns Object
  		*/
  var getNode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of page
  		* @returns Object
  		*/
  var getPage: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of request
  		* @returns Ext.data.Request
  		*/
  var getRequest: js.UndefOr[js.Function0[IRequest]] = js.undefined
  /** [Method] Returns the value of response
  		* @returns Object
  		*/
  var getResponse: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of resultSet
  		* @returns Ext.data.ResultSet
  		*/
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sorters
  		* @returns Ext.util.Sorter[]
  		*/
  var getSorters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of start
  		* @returns Number
  		*/
  var getStart: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of synchronous
  		* @returns Boolean
  		*/
  var getSynchronous: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns Object
  		*/
  var getUrl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var group: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.util.Grouper) */
  var grouper: js.UndefOr[IGrouper] = js.undefined
  /** [Method] Returns true if this Operation encountered an exception see also getError
  		* @returns Boolean true if there was an exception.
  		*/
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been completed
  		* @returns Boolean true if the Operation is complete
  		*/
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started but has not yet completed
  		* @returns Boolean true if the Operation is currently running
  		*/
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started
  		* @returns Boolean true if the Operation has started
  		*/
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var model: js.UndefOr[IModel] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var records: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.data.Request) */
  var request: js.UndefOr[IRequest] = js.undefined
  /** [Config Option] (Object) */
  var response: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.ResultSet) */
  var resultSet: js.UndefOr[IResultSet] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of addRecords
  		* @param addRecords Boolean The new value.
  		*/
  var setAddRecords: js.UndefOr[js.Function1[/* addRecords */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of batch
  		* @param batch Ext.data.Batch The new value.
  		*/
  var setBatch: js.UndefOr[js.Function1[/* batch */ js.UndefOr[IBatch], Unit]] = js.undefined
  /** [Method] Sets the value of callback
  		* @param callback Function The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the Operation as having experienced an exception
  		* @param error String/Object error string/object
  		*/
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Ext.util.Filter[] The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of grouper
  		* @param grouper Ext.util.Grouper The new value.
  		*/
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[IGrouper], Unit]] = js.undefined
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model Ext.data.Model The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Sets the value of node
  		* @param node Object The new value.
  		*/
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of page
  		* @param page Object The new value.
  		*/
  var setPage: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Array The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of request
  		* @param request Ext.data.Request The new value.
  		*/
  var setRequest: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], Unit]] = js.undefined
  /** [Method] Sets the value of response
  		* @param response Object The new value.
  		*/
  var setResponse: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of resultSet
  		* @param resultSet Ext.data.ResultSet The new value.
  		*/
  var setResultSet: js.UndefOr[js.Function1[/* resultSet */ js.UndefOr[IResultSet], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Ext.util.Sorter[] The new value.
  		*/
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of start
  		* @param start Number The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of synchronous
  		* @param synchronous Boolean The new value.
  		*/
  var setSynchronous: js.UndefOr[js.Function1[/* synchronous */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url Object The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if the Operation has completed and was successful
  		* @returns Boolean true if successful
  		*/
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object IOperation {
  @scala.inline
  def apply(
    action: String = null,
    alias: Array = null,
    allowWrite: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    alternateClassName: js.Any = null,
    batch: IBatch = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callback: js.Any = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    filters: Array = null,
    getAction: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAddRecords: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBatch: js.UndefOr[CallbackTo[IBatch]] = js.undefined,
    getCallback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getError: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFilters: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getGrouper: js.UndefOr[CallbackTo[IGrouper]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLimit: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getModel: js.UndefOr[CallbackTo[IModel]] = js.undefined,
    getNode: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPage: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRequest: js.UndefOr[CallbackTo[IRequest]] = js.undefined,
    getResponse: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getResultSet: js.UndefOr[CallbackTo[IResultSet]] = js.undefined,
    getScope: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSorters: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getStart: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSynchronous: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUrl: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getWithCredentials: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    group: js.UndefOr[Boolean] = js.undefined,
    grouper: IGrouper = null,
    hasException: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isComplete: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isRunning: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isStarted: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    limit: Int | Double = null,
    mixins: js.Any = null,
    model: IModel = null,
    params: js.Any = null,
    platformConfig: js.Any = null,
    records: Array = null,
    request: IRequest = null,
    response: js.Any = null,
    resultSet: IResultSet = null,
    scope: js.Any = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[String] => Callback = null,
    setAddRecords: /* addRecords */ js.UndefOr[Boolean] => Callback = null,
    setBatch: /* batch */ js.UndefOr[IBatch] => Callback = null,
    setCallback: /* callback */ js.UndefOr[js.Any] => Callback = null,
    setCompleted: js.UndefOr[Callback] = js.undefined,
    setException: /* error */ js.UndefOr[js.Any] => Callback = null,
    setFilters: /* filters */ js.UndefOr[Array] => Callback = null,
    setGrouper: /* grouper */ js.UndefOr[IGrouper] => Callback = null,
    setLimit: /* limit */ js.UndefOr[Double] => Callback = null,
    setModel: /* model */ js.UndefOr[IModel] => Callback = null,
    setNode: /* node */ js.UndefOr[js.Any] => Callback = null,
    setPage: /* page */ js.UndefOr[js.Any] => Callback = null,
    setParams: /* params */ js.UndefOr[js.Any] => Callback = null,
    setRecords: /* records */ js.UndefOr[Array] => Callback = null,
    setRequest: /* request */ js.UndefOr[IRequest] => Callback = null,
    setResponse: /* response */ js.UndefOr[js.Any] => Callback = null,
    setResultSet: /* resultSet */ js.UndefOr[IResultSet] => Callback = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Callback = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Callback = null,
    setStart: /* start */ js.UndefOr[Double] => Callback = null,
    setStarted: js.UndefOr[Callback] = js.undefined,
    setSuccessful: js.UndefOr[Callback] = js.undefined,
    setSynchronous: /* synchronous */ js.UndefOr[Boolean] => Callback = null,
    setUrl: /* url */ js.UndefOr[js.Any] => Callback = null,
    setWithCredentials: /* withCredentials */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    start: Int | Double = null,
    statics: js.Any = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null,
    wasSuccessful: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    allowWrite.foreach(p => __obj.updateDynamic("allowWrite")(p.toJsFn))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    getAction.foreach(p => __obj.updateDynamic("getAction")(p.toJsFn))
    getAddRecords.foreach(p => __obj.updateDynamic("getAddRecords")(p.toJsFn))
    getBatch.foreach(p => __obj.updateDynamic("getBatch")(p.toJsFn))
    getCallback.foreach(p => __obj.updateDynamic("getCallback")(p.toJsFn))
    getError.foreach(p => __obj.updateDynamic("getError")(p.toJsFn))
    getFilters.foreach(p => __obj.updateDynamic("getFilters")(p.toJsFn))
    getGrouper.foreach(p => __obj.updateDynamic("getGrouper")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLimit.foreach(p => __obj.updateDynamic("getLimit")(p.toJsFn))
    getModel.foreach(p => __obj.updateDynamic("getModel")(p.toJsFn))
    getNode.foreach(p => __obj.updateDynamic("getNode")(p.toJsFn))
    getPage.foreach(p => __obj.updateDynamic("getPage")(p.toJsFn))
    getParams.foreach(p => __obj.updateDynamic("getParams")(p.toJsFn))
    getRequest.foreach(p => __obj.updateDynamic("getRequest")(p.toJsFn))
    getResponse.foreach(p => __obj.updateDynamic("getResponse")(p.toJsFn))
    getResultSet.foreach(p => __obj.updateDynamic("getResultSet")(p.toJsFn))
    getScope.foreach(p => __obj.updateDynamic("getScope")(p.toJsFn))
    getSorters.foreach(p => __obj.updateDynamic("getSorters")(p.toJsFn))
    getStart.foreach(p => __obj.updateDynamic("getStart")(p.toJsFn))
    getSynchronous.foreach(p => __obj.updateDynamic("getSynchronous")(p.toJsFn))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    getWithCredentials.foreach(p => __obj.updateDynamic("getWithCredentials")(p.toJsFn))
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (grouper != null) __obj.updateDynamic("grouper")(grouper.asInstanceOf[js.Any])
    hasException.foreach(p => __obj.updateDynamic("hasException")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isComplete.foreach(p => __obj.updateDynamic("isComplete")(p.toJsFn))
    isRunning.foreach(p => __obj.updateDynamic("isRunning")(p.toJsFn))
    isStarted.foreach(p => __obj.updateDynamic("isStarted")(p.toJsFn))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (resultSet != null) __obj.updateDynamic("resultSet")(resultSet.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1((t0: /* action */ js.UndefOr[java.lang.String]) => setAction(t0).runNow()))
    if (setAddRecords != null) __obj.updateDynamic("setAddRecords")(js.Any.fromFunction1((t0: /* addRecords */ js.UndefOr[scala.Boolean]) => setAddRecords(t0).runNow()))
    if (setBatch != null) __obj.updateDynamic("setBatch")(js.Any.fromFunction1((t0: /* batch */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IBatch]) => setBatch(t0).runNow()))
    if (setCallback != null) __obj.updateDynamic("setCallback")(js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Any]) => setCallback(t0).runNow()))
    setCompleted.foreach(p => __obj.updateDynamic("setCompleted")(p.toJsFn))
    if (setException != null) __obj.updateDynamic("setException")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => setException(t0).runNow()))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1((t0: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFilters(t0).runNow()))
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(js.Any.fromFunction1((t0: /* grouper */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IGrouper]) => setGrouper(t0).runNow()))
    if (setLimit != null) __obj.updateDynamic("setLimit")(js.Any.fromFunction1((t0: /* limit */ js.UndefOr[scala.Double]) => setLimit(t0).runNow()))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => setModel(t0).runNow()))
    if (setNode != null) __obj.updateDynamic("setNode")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[js.Any]) => setNode(t0).runNow()))
    if (setPage != null) __obj.updateDynamic("setPage")(js.Any.fromFunction1((t0: /* page */ js.UndefOr[js.Any]) => setPage(t0).runNow()))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => setParams(t0).runNow()))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1((t0: /* records */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setRecords(t0).runNow()))
    if (setRequest != null) __obj.updateDynamic("setRequest")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest]) => setRequest(t0).runNow()))
    if (setResponse != null) __obj.updateDynamic("setResponse")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[js.Any]) => setResponse(t0).runNow()))
    if (setResultSet != null) __obj.updateDynamic("setResultSet")(js.Any.fromFunction1((t0: /* resultSet */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IResultSet]) => setResultSet(t0).runNow()))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1((t0: /* scope */ js.UndefOr[js.Any]) => setScope(t0).runNow()))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setSorters(t0).runNow()))
    if (setStart != null) __obj.updateDynamic("setStart")(js.Any.fromFunction1((t0: /* start */ js.UndefOr[scala.Double]) => setStart(t0).runNow()))
    setStarted.foreach(p => __obj.updateDynamic("setStarted")(p.toJsFn))
    setSuccessful.foreach(p => __obj.updateDynamic("setSuccessful")(p.toJsFn))
    if (setSynchronous != null) __obj.updateDynamic("setSynchronous")(js.Any.fromFunction1((t0: /* synchronous */ js.UndefOr[scala.Boolean]) => setSynchronous(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[js.Any]) => setUrl(t0).runNow()))
    if (setWithCredentials != null) __obj.updateDynamic("setWithCredentials")(js.Any.fromFunction1((t0: /* withCredentials */ js.UndefOr[scala.Boolean]) => setWithCredentials(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    wasSuccessful.foreach(p => __obj.updateDynamic("wasSuccessful")(p.toJsFn))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperation]
  }
}

