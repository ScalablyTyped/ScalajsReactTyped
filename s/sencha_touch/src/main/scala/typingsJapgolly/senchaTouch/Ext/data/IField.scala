package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends IBase {
  /** [Config Option] (Boolean) */
  var allowNull: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of allowNull
  		* @returns Boolean
  		*/
  var getAllowNull: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of bubbleEvents
  		* @returns String
  		*/
  var getBubbleEvents: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of convert
  		* @returns Function
  		*/
  var getConvert: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of dateFormat
  		* @returns String
  		*/
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of decode
  		* @returns Object
  		*/
  var getDecode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultValue
  		* @returns Object
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of encode
  		* @returns Object
  		*/
  var getEncode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of mapping
  		* @returns String/Number
  		*/
  var getMapping: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of persist
  		* @returns Boolean
  		*/
  var getPersist: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of sortDir
  		* @returns String
  		*/
  var getSortDir: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of sortType
  		* @returns Function
  		*/
  var getSortType: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String/Object
  		*/
  var getType: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of allowNull
  		* @param allowNull Boolean The new value.
  		*/
  var setAllowNull: js.UndefOr[js.Function1[/* allowNull */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String The new value.
  		*/
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of convert
  		* @param convert Function The new value.
  		*/
  var setConvert: js.UndefOr[js.Function1[/* convert */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of decode
  		* @param decode Object The new value.
  		*/
  var setDecode: js.UndefOr[js.Function1[/* decode */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Object The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of encode
  		* @param encode Object The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of mapping
  		* @param mapping String/Number The new value.
  		*/
  var setMapping: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of persist
  		* @param persist Boolean The new value.
  		*/
  var setPersist: js.UndefOr[js.Function1[/* persist */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of sortDir
  		* @param sortDir String The new value.
  		*/
  var setSortDir: js.UndefOr[js.Function1[/* sortDir */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of sortType
  		* @param sortType Function The new value.
  		*/
  var setSortType: js.UndefOr[js.Function1[/* sortType */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String/Object The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.undefined
  /** [Config Option] (Function) */
  var sortType: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    alias: Array = null,
    allowNull: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    convert: js.Any = null,
    dateFormat: String = null,
    defaultValue: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getAllowNull: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[String]] = js.undefined,
    getConvert: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDateFormat: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDecode: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaultValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getEncode: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMapping: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPersist: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getSortDir: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSortType: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getType: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mapping: js.Any = null,
    mixins: js.Any = null,
    name: String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAllowNull: /* allowNull */ js.UndefOr[Boolean] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[String] => Callback = null,
    setConvert: /* convert */ js.UndefOr[js.Any] => Callback = null,
    setDateFormat: /* dateFormat */ js.UndefOr[String] => Callback = null,
    setDecode: /* decode */ js.UndefOr[js.Any] => Callback = null,
    setDefaultValue: /* defaultValue */ js.UndefOr[js.Any] => Callback = null,
    setEncode: /* encode */ js.UndefOr[js.Any] => Callback = null,
    setMapping: /* mapping */ js.UndefOr[js.Any] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setPersist: /* persist */ js.UndefOr[Boolean] => Callback = null,
    setSortDir: /* sortDir */ js.UndefOr[String] => Callback = null,
    setSortType: /* sortType */ js.UndefOr[js.Any] => Callback = null,
    setType: /* type */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortDir: String = null,
    sortType: js.Any = null,
    statics: js.Any = null,
    `type`: js.Any = null,
    useNull: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAllowNull.foreach(p => __obj.updateDynamic("getAllowNull")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getConvert.foreach(p => __obj.updateDynamic("getConvert")(p.toJsFn))
    getDateFormat.foreach(p => __obj.updateDynamic("getDateFormat")(p.toJsFn))
    getDecode.foreach(p => __obj.updateDynamic("getDecode")(p.toJsFn))
    getDefaultValue.foreach(p => __obj.updateDynamic("getDefaultValue")(p.toJsFn))
    getEncode.foreach(p => __obj.updateDynamic("getEncode")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMapping.foreach(p => __obj.updateDynamic("getMapping")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getPersist.foreach(p => __obj.updateDynamic("getPersist")(p.toJsFn))
    getSortDir.foreach(p => __obj.updateDynamic("getSortDir")(p.toJsFn))
    getSortType.foreach(p => __obj.updateDynamic("getSortType")(p.toJsFn))
    getType.foreach(p => __obj.updateDynamic("getType")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowNull != null) __obj.updateDynamic("setAllowNull")(js.Any.fromFunction1((t0: /* allowNull */ js.UndefOr[scala.Boolean]) => setAllowNull(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[java.lang.String]) => setBubbleEvents(t0).runNow()))
    if (setConvert != null) __obj.updateDynamic("setConvert")(js.Any.fromFunction1((t0: /* convert */ js.UndefOr[js.Any]) => setConvert(t0).runNow()))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1((t0: /* dateFormat */ js.UndefOr[java.lang.String]) => setDateFormat(t0).runNow()))
    if (setDecode != null) __obj.updateDynamic("setDecode")(js.Any.fromFunction1((t0: /* decode */ js.UndefOr[js.Any]) => setDecode(t0).runNow()))
    if (setDefaultValue != null) __obj.updateDynamic("setDefaultValue")(js.Any.fromFunction1((t0: /* defaultValue */ js.UndefOr[js.Any]) => setDefaultValue(t0).runNow()))
    if (setEncode != null) __obj.updateDynamic("setEncode")(js.Any.fromFunction1((t0: /* encode */ js.UndefOr[js.Any]) => setEncode(t0).runNow()))
    if (setMapping != null) __obj.updateDynamic("setMapping")(js.Any.fromFunction1((t0: /* mapping */ js.UndefOr[js.Any]) => setMapping(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setPersist != null) __obj.updateDynamic("setPersist")(js.Any.fromFunction1((t0: /* persist */ js.UndefOr[scala.Boolean]) => setPersist(t0).runNow()))
    if (setSortDir != null) __obj.updateDynamic("setSortDir")(js.Any.fromFunction1((t0: /* sortDir */ js.UndefOr[java.lang.String]) => setSortDir(t0).runNow()))
    if (setSortType != null) __obj.updateDynamic("setSortType")(js.Any.fromFunction1((t0: /* sortType */ js.UndefOr[js.Any]) => setSortType(t0).runNow()))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: /* type */ js.UndefOr[js.Any]) => setType(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sortDir != null) __obj.updateDynamic("sortDir")(sortDir.asInstanceOf[js.Any])
    if (sortType != null) __obj.updateDynamic("sortType")(sortType.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useNull)) __obj.updateDynamic("useNull")(useNull.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

