package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultSet extends IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of count
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of loaded
  		* @returns Boolean
  		*/
  var getLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of records
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of success
  		* @returns Boolean
  		*/
  var getSuccess: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of total
  		* @returns Number
  		*/
  var getTotal: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.undefined
  /** [Method] Sets the value of count
  		* @param count Number The new value.
  		*/
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of loaded
  		* @param loaded Boolean The new value.
  		*/
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Ext.data.Model[] The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of success
  		* @param success Boolean The new value.
  		*/
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of total
  		* @param total Number The new value.
  		*/
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.undefined
}

object IResultSet {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    count: Int | Double = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLoaded: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getMessage: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSuccess: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getTotal: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    loaded: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    records: Array = null,
    self: IClass = null,
    setCount: /* count */ js.UndefOr[Double] => Callback = null,
    setLoaded: /* loaded */ js.UndefOr[Boolean] => Callback = null,
    setMessage: /* message */ js.UndefOr[String] => Callback = null,
    setRecords: /* records */ js.UndefOr[Array] => Callback = null,
    setSuccess: /* success */ js.UndefOr[Boolean] => Callback = null,
    setTotal: /* total */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined,
    total: Int | Double = null,
    uses: Array = null
  ): IResultSet = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLoaded.foreach(p => __obj.updateDynamic("getLoaded")(p.toJsFn))
    getMessage.foreach(p => __obj.updateDynamic("getMessage")(p.toJsFn))
    getRecords.foreach(p => __obj.updateDynamic("getRecords")(p.toJsFn))
    getSuccess.foreach(p => __obj.updateDynamic("getSuccess")(p.toJsFn))
    getTotal.foreach(p => __obj.updateDynamic("getTotal")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCount != null) __obj.updateDynamic("setCount")(js.Any.fromFunction1((t0: /* count */ js.UndefOr[scala.Double]) => setCount(t0).runNow()))
    if (setLoaded != null) __obj.updateDynamic("setLoaded")(js.Any.fromFunction1((t0: /* loaded */ js.UndefOr[scala.Boolean]) => setLoaded(t0).runNow()))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1((t0: /* message */ js.UndefOr[java.lang.String]) => setMessage(t0).runNow()))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1((t0: /* records */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setRecords(t0).runNow()))
    if (setSuccess != null) __obj.updateDynamic("setSuccess")(js.Any.fromFunction1((t0: /* success */ js.UndefOr[scala.Boolean]) => setSuccess(t0).runNow()))
    if (setTotal != null) __obj.updateDynamic("setTotal")(js.Any.fromFunction1((t0: /* total */ js.UndefOr[scala.Double]) => setTotal(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResultSet]
  }
}

