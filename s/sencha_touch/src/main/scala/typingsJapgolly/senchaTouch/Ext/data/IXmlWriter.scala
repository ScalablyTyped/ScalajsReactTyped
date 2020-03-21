package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlWriter
  extends typingsJapgolly.senchaTouch.Ext.data.writer.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of defaultDocumentRoot
  		* @returns String
  		*/
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of documentRoot
  		* @returns String
  		*/
  var getDocumentRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns String
  		*/
  var getHeader: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of defaultDocumentRoot
  		* @param defaultDocumentRoot String The new value.
  		*/
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of documentRoot
  		* @param documentRoot String The new value.
  		*/
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header String The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method]
  		* @param request Object
  		* @param data Array
  		* @returns Object
  		*/
  var writeRecords: js.UndefOr[js.Function2[/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array], _]] = js.undefined
}

object IXmlWriter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    defaultDocumentRoot: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    documentRoot: String = null,
    extend: String = null,
    getDefaultDocumentRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDocumentRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getHeader: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getNameProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRecord: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRecordData: /* record */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getWriteAllFields: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    header: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    nameProperty: String = null,
    platformConfig: js.Any = null,
    record: String = null,
    self: IClass = null,
    setDefaultDocumentRoot: /* defaultDocumentRoot */ js.UndefOr[String] => Callback = null,
    setDocumentRoot: /* documentRoot */ js.UndefOr[String] => Callback = null,
    setHeader: /* header */ js.UndefOr[String] => Callback = null,
    setNameProperty: /* nameProperty */ js.UndefOr[String] => Callback = null,
    setRecord: /* record */ js.UndefOr[String] => Callback = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => CallbackTo[IRequest] = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined,
    writeRecords: (/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array]) => CallbackTo[js.Any] = null
  ): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultDocumentRoot != null) __obj.updateDynamic("defaultDocumentRoot")(defaultDocumentRoot.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (documentRoot != null) __obj.updateDynamic("documentRoot")(documentRoot.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDefaultDocumentRoot.foreach(p => __obj.updateDynamic("getDefaultDocumentRoot")(p.toJsFn))
    getDocumentRoot.foreach(p => __obj.updateDynamic("getDocumentRoot")(p.toJsFn))
    getHeader.foreach(p => __obj.updateDynamic("getHeader")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getNameProperty.foreach(p => __obj.updateDynamic("getNameProperty")(p.toJsFn))
    getRecord.foreach(p => __obj.updateDynamic("getRecord")(p.toJsFn))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[js.Any]) => getRecordData(t0).runNow()))
    getWriteAllFields.foreach(p => __obj.updateDynamic("getWriteAllFields")(p.toJsFn))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDefaultDocumentRoot != null) __obj.updateDynamic("setDefaultDocumentRoot")(js.Any.fromFunction1((t0: /* defaultDocumentRoot */ js.UndefOr[java.lang.String]) => setDefaultDocumentRoot(t0).runNow()))
    if (setDocumentRoot != null) __obj.updateDynamic("setDocumentRoot")(js.Any.fromFunction1((t0: /* documentRoot */ js.UndefOr[java.lang.String]) => setDocumentRoot(t0).runNow()))
    if (setHeader != null) __obj.updateDynamic("setHeader")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[java.lang.String]) => setHeader(t0).runNow()))
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1((t0: /* nameProperty */ js.UndefOr[java.lang.String]) => setNameProperty(t0).runNow()))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[java.lang.String]) => setRecord(t0).runNow()))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1((t0: /* writeAllFields */ js.UndefOr[scala.Boolean]) => setWriteAllFields(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRequest]) => write(t0).runNow()))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields.asInstanceOf[js.Any])
    if (writeRecords != null) __obj.updateDynamic("writeRecords")(js.Any.fromFunction2((t0: /* request */ js.UndefOr[js.Any], t1: /* data */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => writeRecords(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlWriter]
  }
}

