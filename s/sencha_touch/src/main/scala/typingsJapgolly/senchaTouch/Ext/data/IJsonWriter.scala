package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonWriter
  extends typingsJapgolly.senchaTouch.Ext.data.writer.IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of allowSingle
  		* @returns Boolean
  		*/
  var getAllowSingle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of encode
  		* @returns Boolean
  		*/
  var getEncode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of encodeRequest
  		* @returns Boolean
  		*/
  var getEncodeRequest: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of rootProperty
  		* @returns String
  		*/
  var getRootProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of allowSingle
  		* @param allowSingle Boolean The new value.
  		*/
  var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of encode
  		* @param encode Boolean The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of encodeRequest
  		* @param encodeRequest Boolean The new value.
  		*/
  var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.undefined
}

object IJsonWriter {
  @scala.inline
  def apply(
    alias: Array = null,
    allowSingle: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    encode: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    getAllowSingle: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getEncode: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getEncodeRequest: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getNameProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRecordData: /* record */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getRootProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getWriteAllFields: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    nameProperty: String = null,
    platformConfig: js.Any = null,
    root: String = null,
    rootProperty: String = null,
    self: IClass = null,
    setAllowSingle: /* allowSingle */ js.UndefOr[Boolean] => Callback = null,
    setEncode: /* encode */ js.UndefOr[Boolean] => Callback = null,
    setEncodeRequest: /* encodeRequest */ js.UndefOr[Boolean] => Callback = null,
    setNameProperty: /* nameProperty */ js.UndefOr[String] => Callback = null,
    setRootProperty: /* rootProperty */ js.UndefOr[String] => Callback = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => CallbackTo[IRequest] = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined
  ): IJsonWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSingle)) __obj.updateDynamic("allowSingle")(allowSingle.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAllowSingle.foreach(p => __obj.updateDynamic("getAllowSingle")(p.toJsFn))
    getEncode.foreach(p => __obj.updateDynamic("getEncode")(p.toJsFn))
    getEncodeRequest.foreach(p => __obj.updateDynamic("getEncodeRequest")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getNameProperty.foreach(p => __obj.updateDynamic("getNameProperty")(p.toJsFn))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[js.Any]) => getRecordData(t0).runNow()))
    getRootProperty.foreach(p => __obj.updateDynamic("getRootProperty")(p.toJsFn))
    getWriteAllFields.foreach(p => __obj.updateDynamic("getWriteAllFields")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootProperty != null) __obj.updateDynamic("rootProperty")(rootProperty.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowSingle != null) __obj.updateDynamic("setAllowSingle")(js.Any.fromFunction1((t0: /* allowSingle */ js.UndefOr[scala.Boolean]) => setAllowSingle(t0).runNow()))
    if (setEncode != null) __obj.updateDynamic("setEncode")(js.Any.fromFunction1((t0: /* encode */ js.UndefOr[scala.Boolean]) => setEncode(t0).runNow()))
    if (setEncodeRequest != null) __obj.updateDynamic("setEncodeRequest")(js.Any.fromFunction1((t0: /* encodeRequest */ js.UndefOr[scala.Boolean]) => setEncodeRequest(t0).runNow()))
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1((t0: /* nameProperty */ js.UndefOr[java.lang.String]) => setNameProperty(t0).runNow()))
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(js.Any.fromFunction1((t0: /* rootProperty */ js.UndefOr[java.lang.String]) => setRootProperty(t0).runNow()))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1((t0: /* writeAllFields */ js.UndefOr[scala.Boolean]) => setWriteAllFields(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest]) => write(t0).runNow()))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonWriter]
  }
}

