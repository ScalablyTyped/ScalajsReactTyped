package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IXTemplate
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IComboBox
  extends typingsJapgolly.extjs.Ext.form.field.IPicker {
  /** [Method] A method called when the filtering caused by the doQuery call is complete and the store has been either filtered loca
  		* @param queryPlan Object An object containing details about the query was executed.
  		*/
  var afterQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var allQuery: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_IComboBox: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] A method which may modify aspects of how the store is to be filtered if queryMode is local  of loaded if queryMod
  		* @param queryPlan Object An object containing details about the query to be executed.
  		*/
  var beforeQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  @JSName("beforeReset")
  var beforeReset_IComboBox: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Binds a store to this instance
  		* @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** [Method] Clears any value currently set in the ComboBox  */
  var clearValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultListConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var delimiter: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.undefined
  /** [Method] Executes a query to filter the dropdown list
  		* @param queryString String The string to use to filter available items by matching against the configured valueField.
  		* @param forceAll Boolean true to force the query to execute even if there are currently fewer characters in the field than the minimum specified by the minChars config option. It also clears any filter previously saved in the current store.
  		* @param rawQuery Boolean Pass as true if the raw typed value is being used as the query string. This causes the resulting store load to leave the raw value undisturbed.
  		* @returns Boolean true if the query was permitted to run, false if it was cancelled by a beforequery handler.
  		*/
  var doQuery: js.UndefOr[
    js.Function3[
      /* queryString */ js.UndefOr[String], 
      /* forceAll */ js.UndefOr[Boolean], 
      /* rawQuery */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enableRegEx: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.XTemplate) */
  var fieldSubTpl: js.UndefOr[IXTemplate] = js.undefined
  /** [Method] Finds the record by searching for a specific field value combination
  		* @param field String The name of the field to test.
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecord: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], IModel]
  ] = js.undefined
  /** [Method] Finds the record by searching values in the displayField
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecordByDisplay: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Finds the record by searching values in the valueField
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecordByValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Config Option] (Boolean) */
  var forceSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the store associated with this ComboBox
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_IComboBox: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  @JSName("getValue")
  var getValue_IComboBox: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var growToLongestValue: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var lastQuery: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var minChars: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Object
  		* @param initial Object
  		*/
  var onBindStore: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean], Unit]
  ] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var queryCaching: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var queryDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var queryMode: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var queryParam: js.UndefOr[String] = js.undefined
  /** [Method] Selects an item by a Model or by a key value
  		* @param r Object
  		*/
  var select: js.UndefOr[js.Function1[/* r */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var selectOnTab: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store/String/Array) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var transform: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var triggerAction: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var typeAhead: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var typeAheadDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var valueNotFoundText: js.UndefOr[String] = js.undefined
}

object IComboBox {
  @scala.inline
  def apply(
    IPicker: typingsJapgolly.extjs.Ext.form.field.IPicker = null,
    afterQuery: /* queryPlan */ js.UndefOr[js.Any] => Callback = null,
    allQuery: String = null,
    anyMatch: js.UndefOr[Boolean] = js.undefined,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    beforeBlur: js.UndefOr[Callback] = js.undefined,
    beforeQuery: /* queryPlan */ js.UndefOr[js.Any] => Callback = null,
    beforeReset: js.UndefOr[Callback] = js.undefined,
    bindStore: js.UndefOr[js.Any] => Callback = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearValue: js.UndefOr[Callback] = js.undefined,
    defaultListConfig: js.Any = null,
    delimiter: String = null,
    displayField: String = null,
    doQuery: (/* queryString */ js.UndefOr[String], /* forceAll */ js.UndefOr[Boolean], /* rawQuery */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    enableRegEx: js.UndefOr[Boolean] = js.undefined,
    fieldSubTpl: IXTemplate = null,
    findRecord: (/* field */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => CallbackTo[IModel] = null,
    findRecordByDisplay: /* value */ js.UndefOr[js.Any] => CallbackTo[IModel] = null,
    findRecordByValue: /* value */ js.UndefOr[js.Any] => CallbackTo[IModel] = null,
    forceSelection: js.UndefOr[Boolean] = js.undefined,
    getStore: js.UndefOr[CallbackTo[IAbstractStore | IStore]] = js.undefined,
    getStoreListeners: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _]) = null,
    getSubmitValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    growToLongestValue: js.UndefOr[Boolean] = js.undefined,
    hiddenName: String = null,
    lastQuery: String = null,
    listConfig: js.Any = null,
    minChars: Int | Double = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onBindStore: (js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean]) => Callback = null,
    onUnbindStore: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) = null,
    pageSize: Int | Double = null,
    queryCaching: js.UndefOr[Boolean] = js.undefined,
    queryDelay: Int | Double = null,
    queryMode: String = null,
    queryParam: String = null,
    select: /* r */ js.UndefOr[js.Any] => Callback = null,
    selectOnTab: js.UndefOr[Boolean] = js.undefined,
    store: js.Any = null,
    transform: js.Any = null,
    triggerAction: String = null,
    typeAhead: js.UndefOr[Boolean] = js.undefined,
    typeAheadDelay: Int | Double = null,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null,
    valueField: String = null,
    valueNotFoundText: String = null
  ): IComboBox = {
    val __obj = js.Dynamic.literal()
    if (IPicker != null) js.Dynamic.global.Object.assign(__obj, IPicker)
    if (afterQuery != null) __obj.updateDynamic("afterQuery")(js.Any.fromFunction1((t0: /* queryPlan */ js.UndefOr[js.Any]) => afterQuery(t0).runNow()))
    if (allQuery != null) __obj.updateDynamic("allQuery")(allQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(anyMatch)) __obj.updateDynamic("anyMatch")(anyMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    beforeBlur.foreach(p => __obj.updateDynamic("beforeBlur")(p.toJsFn))
    if (beforeQuery != null) __obj.updateDynamic("beforeQuery")(js.Any.fromFunction1((t0: /* queryPlan */ js.UndefOr[js.Any]) => beforeQuery(t0).runNow()))
    beforeReset.foreach(p => __obj.updateDynamic("beforeReset")(p.toJsFn))
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => bindStore(t0).runNow()))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => bindStoreListeners(t0).runNow()))
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    clearValue.foreach(p => __obj.updateDynamic("clearValue")(p.toJsFn))
    if (defaultListConfig != null) __obj.updateDynamic("defaultListConfig")(defaultListConfig.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (doQuery != null) __obj.updateDynamic("doQuery")(js.Any.fromFunction3((t0: /* queryString */ js.UndefOr[java.lang.String], t1: /* forceAll */ js.UndefOr[scala.Boolean], t2: /* rawQuery */ js.UndefOr[scala.Boolean]) => doQuery(t0, t1, t2).runNow()))
    if (!js.isUndefined(enableRegEx)) __obj.updateDynamic("enableRegEx")(enableRegEx.asInstanceOf[js.Any])
    if (fieldSubTpl != null) __obj.updateDynamic("fieldSubTpl")(fieldSubTpl.asInstanceOf[js.Any])
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any]) => findRecord(t0, t1).runNow()))
    if (findRecordByDisplay != null) __obj.updateDynamic("findRecordByDisplay")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => findRecordByDisplay(t0).runNow()))
    if (findRecordByValue != null) __obj.updateDynamic("findRecordByValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => findRecordByValue(t0).runNow()))
    if (!js.isUndefined(forceSelection)) __obj.updateDynamic("forceSelection")(forceSelection.asInstanceOf[js.Any])
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners.asInstanceOf[js.Any])
    getSubmitValue.foreach(p => __obj.updateDynamic("getSubmitValue")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (!js.isUndefined(growToLongestValue)) __obj.updateDynamic("growToLongestValue")(growToLongestValue.asInstanceOf[js.Any])
    if (hiddenName != null) __obj.updateDynamic("hiddenName")(hiddenName.asInstanceOf[js.Any])
    if (lastQuery != null) __obj.updateDynamic("lastQuery")(lastQuery.asInstanceOf[js.Any])
    if (listConfig != null) __obj.updateDynamic("listConfig")(listConfig.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2((t0: js.UndefOr[js.Any | typingsJapgolly.extjs.Ext.data.IAbstractStore], t1: js.UndefOr[js.Any | scala.Boolean]) => onBindStore(t0, t1).runNow()))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(queryCaching)) __obj.updateDynamic("queryCaching")(queryCaching.asInstanceOf[js.Any])
    if (queryDelay != null) __obj.updateDynamic("queryDelay")(queryDelay.asInstanceOf[js.Any])
    if (queryMode != null) __obj.updateDynamic("queryMode")(queryMode.asInstanceOf[js.Any])
    if (queryParam != null) __obj.updateDynamic("queryParam")(queryParam.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* r */ js.UndefOr[js.Any]) => select(t0).runNow()))
    if (!js.isUndefined(selectOnTab)) __obj.updateDynamic("selectOnTab")(selectOnTab.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (triggerAction != null) __obj.updateDynamic("triggerAction")(triggerAction.asInstanceOf[js.Any])
    if (!js.isUndefined(typeAhead)) __obj.updateDynamic("typeAhead")(typeAhead.asInstanceOf[js.Any])
    if (typeAheadDelay != null) __obj.updateDynamic("typeAheadDelay")(typeAheadDelay.asInstanceOf[js.Any])
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => unbindStoreListeners(t0).runNow()))
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (valueNotFoundText != null) __obj.updateDynamic("valueNotFoundText")(valueNotFoundText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBox]
  }
}

