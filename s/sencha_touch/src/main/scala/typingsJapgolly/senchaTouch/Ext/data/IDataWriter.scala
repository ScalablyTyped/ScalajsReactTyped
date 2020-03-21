package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataWriter extends IBase {
  /** [Method] Returns the value of nameProperty
  		* @returns String
  		*/
  var getNameProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Object The record that we are writing to the server.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of writeAllFields
  		* @returns Boolean
  		*/
  var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of nameProperty
  		* @param nameProperty String The new value.
  		*/
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of writeAllFields
  		* @param writeAllFields Boolean The new value.
  		*/
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object.
  		* @returns Ext.data.Request The modified request object.
  		*/
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.undefined
}

object IDataWriter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getNameProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRecordData: /* record */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getWriteAllFields: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    nameProperty: String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setNameProperty: /* nameProperty */ js.UndefOr[String] => Callback = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => CallbackTo[IRequest] = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined
  ): IDataWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getNameProperty.foreach(p => __obj.updateDynamic("getNameProperty")(p.toJsFn))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[js.Any]) => getRecordData(t0).runNow()))
    getWriteAllFields.foreach(p => __obj.updateDynamic("getWriteAllFields")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1((t0: /* nameProperty */ js.UndefOr[java.lang.String]) => setNameProperty(t0).runNow()))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1((t0: /* writeAllFields */ js.UndefOr[scala.Boolean]) => setWriteAllFields(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest]) => write(t0).runNow()))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataWriter]
  }
}

