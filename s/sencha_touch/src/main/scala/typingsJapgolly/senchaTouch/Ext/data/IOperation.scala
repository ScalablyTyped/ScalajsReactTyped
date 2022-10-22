package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.util.IGrouper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOperation
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  
  /** [Method] Checks whether this operation should cause writing to occur
    * @returns Boolean Whether the operation should cause a write to occur.
    */
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  
  /** [Config Option] (Function) */
  var callback: js.UndefOr[Any] = js.undefined
  
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
  var getCallback: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the error string or object that was set using setException
    * @returns String/Object The error object.
    */
  var getError: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getNode: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of page
    * @returns Object
    */
  var getPage: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of request
    * @returns Ext.data.Request
    */
  var getRequest: js.UndefOr[js.Function0[IRequest]] = js.undefined
  
  /** [Method] Returns the value of response
    * @returns Object
    */
  var getResponse: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of resultSet
    * @returns Ext.data.ResultSet
    */
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getUrl: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var params: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Array) */
  var records: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Ext.data.Request) */
  var request: js.UndefOr[IRequest] = js.undefined
  
  /** [Config Option] (Object) */
  var response: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.data.ResultSet) */
  var resultSet: js.UndefOr[IResultSet] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[Any] = js.undefined
  
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
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Marks the Operation as having experienced an exception
    * @param error String/Object error string/object
    */
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of page
    * @param page Object The new value.
    */
  var setPage: js.UndefOr[js.Function1[/* page */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of params
    * @param params Object The new value.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setResponse: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of resultSet
    * @param resultSet Ext.data.ResultSet The new value.
    */
  var setResultSet: js.UndefOr[js.Function1[/* resultSet */ js.UndefOr[IResultSet], Unit]] = js.undefined
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  
  inline def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  
  extension [Self <: IOperation](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllowWrite(value: CallbackTo[Boolean]): Self = StObject.set(x, "allowWrite", value.toJsFn)
    
    inline def setAllowWriteUndefined: Self = StObject.set(x, "allowWrite", js.undefined)
    
    inline def setBatch(value: IBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setGetAction(value: CallbackTo[String]): Self = StObject.set(x, "getAction", value.toJsFn)
    
    inline def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
    
    inline def setGetAddRecords(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAddRecords", value.toJsFn)
    
    inline def setGetAddRecordsUndefined: Self = StObject.set(x, "getAddRecords", js.undefined)
    
    inline def setGetBatch(value: CallbackTo[IBatch]): Self = StObject.set(x, "getBatch", value.toJsFn)
    
    inline def setGetBatchUndefined: Self = StObject.set(x, "getBatch", js.undefined)
    
    inline def setGetCallback(value: CallbackTo[Any]): Self = StObject.set(x, "getCallback", value.toJsFn)
    
    inline def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
    
    inline def setGetError(value: CallbackTo[Any]): Self = StObject.set(x, "getError", value.toJsFn)
    
    inline def setGetErrorUndefined: Self = StObject.set(x, "getError", js.undefined)
    
    inline def setGetFilters(value: CallbackTo[Array]): Self = StObject.set(x, "getFilters", value.toJsFn)
    
    inline def setGetFiltersUndefined: Self = StObject.set(x, "getFilters", js.undefined)
    
    inline def setGetGrouper(value: CallbackTo[IGrouper]): Self = StObject.set(x, "getGrouper", value.toJsFn)
    
    inline def setGetGrouperUndefined: Self = StObject.set(x, "getGrouper", js.undefined)
    
    inline def setGetLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getLimit", value.toJsFn)
    
    inline def setGetLimitUndefined: Self = StObject.set(x, "getLimit", js.undefined)
    
    inline def setGetModel(value: CallbackTo[IModel]): Self = StObject.set(x, "getModel", value.toJsFn)
    
    inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    inline def setGetNode(value: CallbackTo[Any]): Self = StObject.set(x, "getNode", value.toJsFn)
    
    inline def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
    
    inline def setGetPage(value: CallbackTo[Any]): Self = StObject.set(x, "getPage", value.toJsFn)
    
    inline def setGetPageUndefined: Self = StObject.set(x, "getPage", js.undefined)
    
    inline def setGetParams(value: CallbackTo[Any]): Self = StObject.set(x, "getParams", value.toJsFn)
    
    inline def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
    
    inline def setGetRequest(value: CallbackTo[IRequest]): Self = StObject.set(x, "getRequest", value.toJsFn)
    
    inline def setGetRequestUndefined: Self = StObject.set(x, "getRequest", js.undefined)
    
    inline def setGetResponse(value: CallbackTo[Any]): Self = StObject.set(x, "getResponse", value.toJsFn)
    
    inline def setGetResponseUndefined: Self = StObject.set(x, "getResponse", js.undefined)
    
    inline def setGetResultSet(value: CallbackTo[IResultSet]): Self = StObject.set(x, "getResultSet", value.toJsFn)
    
    inline def setGetResultSetUndefined: Self = StObject.set(x, "getResultSet", js.undefined)
    
    inline def setGetScope(value: CallbackTo[Any]): Self = StObject.set(x, "getScope", value.toJsFn)
    
    inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    inline def setGetSorters(value: CallbackTo[Array]): Self = StObject.set(x, "getSorters", value.toJsFn)
    
    inline def setGetSortersUndefined: Self = StObject.set(x, "getSorters", js.undefined)
    
    inline def setGetStart(value: CallbackTo[Double]): Self = StObject.set(x, "getStart", value.toJsFn)
    
    inline def setGetStartUndefined: Self = StObject.set(x, "getStart", js.undefined)
    
    inline def setGetSynchronous(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSynchronous", value.toJsFn)
    
    inline def setGetSynchronousUndefined: Self = StObject.set(x, "getSynchronous", js.undefined)
    
    inline def setGetUrl(value: CallbackTo[Any]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    inline def setGetWithCredentials(value: CallbackTo[Boolean]): Self = StObject.set(x, "getWithCredentials", value.toJsFn)
    
    inline def setGetWithCredentialsUndefined: Self = StObject.set(x, "getWithCredentials", js.undefined)
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGrouper(value: IGrouper): Self = StObject.set(x, "grouper", value.asInstanceOf[js.Any])
    
    inline def setGrouperUndefined: Self = StObject.set(x, "grouper", js.undefined)
    
    inline def setHasException(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasException", value.toJsFn)
    
    inline def setHasExceptionUndefined: Self = StObject.set(x, "hasException", js.undefined)
    
    inline def setIsComplete(value: CallbackTo[Boolean]): Self = StObject.set(x, "isComplete", value.toJsFn)
    
    inline def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    inline def setIsRunning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRunning", value.toJsFn)
    
    inline def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    
    inline def setIsStarted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStarted", value.toJsFn)
    
    inline def setIsStartedUndefined: Self = StObject.set(x, "isStarted", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRecords(value: Array): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setRequest(value: IRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResultSet(value: IResultSet): Self = StObject.set(x, "resultSet", value.asInstanceOf[js.Any])
    
    inline def setResultSetUndefined: Self = StObject.set(x, "resultSet", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSetAction(value: /* action */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAction", js.Any.fromFunction1((t0: /* action */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
    
    inline def setSetAddRecords(value: /* addRecords */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAddRecords", js.Any.fromFunction1((t0: /* addRecords */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAddRecordsUndefined: Self = StObject.set(x, "setAddRecords", js.undefined)
    
    inline def setSetBatch(value: /* batch */ js.UndefOr[IBatch] => Callback): Self = StObject.set(x, "setBatch", js.Any.fromFunction1((t0: /* batch */ js.UndefOr[IBatch]) => value(t0).runNow()))
    
    inline def setSetBatchUndefined: Self = StObject.set(x, "setBatch", js.undefined)
    
    inline def setSetCallback(value: /* callback */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setCallback", js.Any.fromFunction1((t0: /* callback */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
    
    inline def setSetCompleted(value: Callback): Self = StObject.set(x, "setCompleted", value.toJsFn)
    
    inline def setSetCompletedUndefined: Self = StObject.set(x, "setCompleted", js.undefined)
    
    inline def setSetException(value: /* error */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setException", js.Any.fromFunction1((t0: /* error */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetExceptionUndefined: Self = StObject.set(x, "setException", js.undefined)
    
    inline def setSetFilters(value: /* filters */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setFilters", js.Any.fromFunction1((t0: /* filters */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    
    inline def setSetGrouper(value: /* grouper */ js.UndefOr[IGrouper] => Callback): Self = StObject.set(x, "setGrouper", js.Any.fromFunction1((t0: /* grouper */ js.UndefOr[IGrouper]) => value(t0).runNow()))
    
    inline def setSetGrouperUndefined: Self = StObject.set(x, "setGrouper", js.undefined)
    
    inline def setSetLimit(value: /* limit */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setLimit", js.Any.fromFunction1((t0: /* limit */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetLimitUndefined: Self = StObject.set(x, "setLimit", js.undefined)
    
    inline def setSetModel(value: /* model */ js.UndefOr[IModel] => Callback): Self = StObject.set(x, "setModel", js.Any.fromFunction1((t0: /* model */ js.UndefOr[IModel]) => value(t0).runNow()))
    
    inline def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    inline def setSetNode(value: /* node */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setNode", js.Any.fromFunction1((t0: /* node */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetNodeUndefined: Self = StObject.set(x, "setNode", js.undefined)
    
    inline def setSetPage(value: /* page */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setPage", js.Any.fromFunction1((t0: /* page */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetPageUndefined: Self = StObject.set(x, "setPage", js.undefined)
    
    inline def setSetParams(value: /* params */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setParams", js.Any.fromFunction1((t0: /* params */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    inline def setSetRecords(value: /* records */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setRecords", js.Any.fromFunction1((t0: /* records */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetRecordsUndefined: Self = StObject.set(x, "setRecords", js.undefined)
    
    inline def setSetRequest(value: /* request */ js.UndefOr[IRequest] => Callback): Self = StObject.set(x, "setRequest", js.Any.fromFunction1((t0: /* request */ js.UndefOr[IRequest]) => value(t0).runNow()))
    
    inline def setSetRequestUndefined: Self = StObject.set(x, "setRequest", js.undefined)
    
    inline def setSetResponse(value: /* response */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setResponse", js.Any.fromFunction1((t0: /* response */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetResponseUndefined: Self = StObject.set(x, "setResponse", js.undefined)
    
    inline def setSetResultSet(value: /* resultSet */ js.UndefOr[IResultSet] => Callback): Self = StObject.set(x, "setResultSet", js.Any.fromFunction1((t0: /* resultSet */ js.UndefOr[IResultSet]) => value(t0).runNow()))
    
    inline def setSetResultSetUndefined: Self = StObject.set(x, "setResultSet", js.undefined)
    
    inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setScope", js.Any.fromFunction1((t0: /* scope */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    
    inline def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setSorters", js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetSortersUndefined: Self = StObject.set(x, "setSorters", js.undefined)
    
    inline def setSetStart(value: /* start */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction1((t0: /* start */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetStartUndefined: Self = StObject.set(x, "setStart", js.undefined)
    
    inline def setSetStarted(value: Callback): Self = StObject.set(x, "setStarted", value.toJsFn)
    
    inline def setSetStartedUndefined: Self = StObject.set(x, "setStarted", js.undefined)
    
    inline def setSetSuccessful(value: Callback): Self = StObject.set(x, "setSuccessful", value.toJsFn)
    
    inline def setSetSuccessfulUndefined: Self = StObject.set(x, "setSuccessful", js.undefined)
    
    inline def setSetSynchronous(value: /* synchronous */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setSynchronous", js.Any.fromFunction1((t0: /* synchronous */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetSynchronousUndefined: Self = StObject.set(x, "setSynchronous", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setUrl", js.Any.fromFunction1((t0: /* url */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setWithCredentials", js.Any.fromFunction1((t0: /* withCredentials */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetWithCredentialsUndefined: Self = StObject.set(x, "setWithCredentials", js.undefined)
    
    inline def setSorters(value: Array): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
    
    inline def setWasSuccessful(value: CallbackTo[Boolean]): Self = StObject.set(x, "wasSuccessful", value.toJsFn)
    
    inline def setWasSuccessfulUndefined: Self = StObject.set(x, "wasSuccessful", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
