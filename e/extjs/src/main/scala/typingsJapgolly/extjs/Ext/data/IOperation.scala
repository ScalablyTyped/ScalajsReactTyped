package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Property] (RegExp) */
  var actionCommitRecordsRe: js.UndefOr[js.RegExp] = js.undefined
  /** [Property] (RegExp) */
  var actionSkipSyncRe: js.UndefOr[js.RegExp] = js.undefined
  /** [Method] Checks whether this operation should cause writing to occur
  		* @returns Boolean Whether the operation should cause a write to occur.
  		*/
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method is called to commit data to this instance s records given the records in the server response
  		* @param serverRecords Ext.data.Model[] An array of Ext.data.Model objects returned by the server.
  		*/
  var commitRecords: js.UndefOr[js.Function1[/* serverRecords */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the error string or object that was set using setException
  		* @returns String/Object The error object
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the records associated with this operation
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the ResultSet object if set by the Proxy
  		* @returns Ext.data.ResultSet The ResultSet object
  		*/
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  /** [Config Option] (Ext.util.Grouper[]) */
  var groupers: js.UndefOr[Array] = js.undefined
  /** [Method] Returns true if this Operation encountered an exception see also getError
  		* @returns Boolean True if there was an exception
  		*/
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been completed
  		* @returns Boolean True if the Operation is complete
  		*/
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started but has not yet completed
  		* @returns Boolean True if the Operation is currently running
  		*/
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started
  		* @returns Boolean True if the Operation has started
  		*/
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the Operation as having experienced an exception
  		* @param error String/Object error string/object
  		*/
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if the Operation has completed and was successful
  		* @returns Boolean True if successful
  		*/
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IOperation {
  @scala.inline
  def apply(
    action: String = null,
    actionCommitRecordsRe: js.RegExp = null,
    actionSkipSyncRe: js.RegExp = null,
    alias: Array = null,
    allowWrite: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    alternateClassName: js.Any = null,
    batch: IBatch = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callback: js.Any = null,
    commitRecords: /* serverRecords */ js.UndefOr[Array] => Callback = null,
    config: js.Any = null,
    extend: String = null,
    filters: Array = null,
    getError: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getResultSet: js.UndefOr[CallbackTo[IResultSet]] = js.undefined,
    groupers: Array = null,
    hasException: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IOperation] = null,
    isComplete: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isRunning: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isStarted: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    limit: Int | Double = null,
    mixins: js.Any = null,
    params: js.Any = null,
    requires: Array = null,
    scope: js.Any = null,
    self: IClass = null,
    setCompleted: js.UndefOr[Callback] = js.undefined,
    setException: /* error */ js.UndefOr[js.Any] => Callback = null,
    setStarted: js.UndefOr[Callback] = js.undefined,
    setSuccessful: js.UndefOr[Callback] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    start: Int | Double = null,
    statics: js.Any = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null,
    wasSuccessful: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionCommitRecordsRe != null) __obj.updateDynamic("actionCommitRecordsRe")(actionCommitRecordsRe.asInstanceOf[js.Any])
    if (actionSkipSyncRe != null) __obj.updateDynamic("actionSkipSyncRe")(actionSkipSyncRe.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    allowWrite.foreach(p => __obj.updateDynamic("allowWrite")(p.toJsFn))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (commitRecords != null) __obj.updateDynamic("commitRecords")(js.Any.fromFunction1((t0: /* serverRecords */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => commitRecords(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    getError.foreach(p => __obj.updateDynamic("getError")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getRecords.foreach(p => __obj.updateDynamic("getRecords")(p.toJsFn))
    getResultSet.foreach(p => __obj.updateDynamic("getResultSet")(p.toJsFn))
    if (groupers != null) __obj.updateDynamic("groupers")(groupers.asInstanceOf[js.Any])
    hasException.foreach(p => __obj.updateDynamic("hasException")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isComplete.foreach(p => __obj.updateDynamic("isComplete")(p.toJsFn))
    isRunning.foreach(p => __obj.updateDynamic("isRunning")(p.toJsFn))
    isStarted.foreach(p => __obj.updateDynamic("isStarted")(p.toJsFn))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    setCompleted.foreach(p => __obj.updateDynamic("setCompleted")(p.toJsFn))
    if (setException != null) __obj.updateDynamic("setException")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => setException(t0).runNow()))
    setStarted.foreach(p => __obj.updateDynamic("setStarted")(p.toJsFn))
    setSuccessful.foreach(p => __obj.updateDynamic("setSuccessful")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    wasSuccessful.foreach(p => __obj.updateDynamic("wasSuccessful")(p.toJsFn))
    __obj.asInstanceOf[IOperation]
  }
}

