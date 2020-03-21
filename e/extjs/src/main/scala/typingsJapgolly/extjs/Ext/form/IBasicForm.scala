package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.container.IContainer
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import typingsJapgolly.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicForm extends IObservable {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Method] Calls Ext applyIf for all field in this form with the passed object
  		* @param obj Object The object to be applied
  		* @returns Ext.form.Basic this
  		*/
  var applyIfToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Method] Calls Ext apply for all fields in this form with the passed object
  		* @param obj Object The object to be applied
  		* @returns Ext.form.Basic this
  		*/
  var applyToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Check whether the dirty state of the entire form has changed since it was last checked and if so fire the dirtychang  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Check whether the validity of the entire form has changed since it was last checked and if so fire the validitychang  */
  var checkValidity: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Clears all invalid field messages in this form
  		* @returns Ext.form.Basic this
  		*/
  var clearInvalid: js.UndefOr[js.Function0[IBasic]] = js.undefined
  /** [Method] Destroys this object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Performs a predefined action an implementation of Ext form action Action to perform application specific processing
  		* @param action String/Ext.form.action.Action The name of the predefined action type, or instance of Ext.form.action.Action to perform.
  		* @param options Object The options to pass to the Ext.form.action.Action that will get created, if the action argument is a String. All of the config options listed below are supported by both the submit and load actions unless otherwise noted (custom actions could also accept other config options):
  		* @returns Ext.form.Basic this
  		*/
  var doAction: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], IBasic]
  ] = js.undefined
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var errorReader: js.UndefOr[js.Any] = js.undefined
  /** [Method] Find a specific Ext form field Field in this form by id or name
  		* @param id String The value to search for (specify either a id or name or hiddenName).
  		* @returns any The first matching field, or null if none was found.
  		*/
  var findField: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getModelData  method to collect the values
  		* @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
  		* @returns Object
  		*/
  var getFieldValues: js.UndefOr[js.Function1[/* dirtyOnly */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Return all the Ext form field Field components in the owner container
  		* @returns Ext.util.MixedCollection Collection of the Field objects
  		*/
  var getFields: js.UndefOr[js.Function0[IMixedCollection]] = js.undefined
  /** [Method] Returns the last Ext data Model instance that was loaded via loadRecord
  		* @returns Ext.data.Model The record
  		*/
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getSubmitData  method to collect the values
  		* @param asString Boolean If true, will return the key/value collection as a single URL-encoded param string.
  		* @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
  		* @param includeEmptyText Boolean If true, the configured emptyText of empty fields will be used.
  		* @param useDataValues Boolean If true, the getModelData method is used to retrieve values from fields, otherwise the getSubmitData method is used.
  		* @returns String/Object
  		*/
  var getValues: js.UndefOr[
    js.Function4[
      /* asString */ js.UndefOr[Boolean], 
      /* dirtyOnly */ js.UndefOr[Boolean], 
      /* includeEmptyText */ js.UndefOr[Boolean], 
      /* useDataValues */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns true if the form contains any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if the form contains a file upload field
  		* @returns Boolean
  		*/
  var hasUpload: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if any fields in this form have changed from their original values
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if client side validation on the form is successful
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var jsonSubmit: js.UndefOr[Boolean] = js.undefined
  /** [Method] Shortcut to do a load action
  		* @param options Object The options to pass to the action (see doAction for details)
  		* @returns Ext.form.Basic this
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Method] Loads an Ext data Model into this form by calling setValues with the record data
  		* @param record Ext.data.Model The record to load
  		* @returns Ext.form.Basic this
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
  /** [Method] Mark fields in this form invalid in bulk
  		* @param errors Object/Object[]/Ext.data.Errors Either an array in the form [{id:'fieldId', msg:'The message'}, ...], an object hash of {id: msg, id2: msg2}, or a Ext.data.Errors object.
  		* @returns Ext.form.Basic this
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.container.Container) */
  var owner: js.UndefOr[IContainer] = js.undefined
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets all fields in this form
  		* @param resetRecord Boolean True to unbind any record set by loadRecord
  		* @returns Ext.form.Basic this
  		*/
  var reset: js.UndefOr[js.Function1[/* resetRecord */ js.UndefOr[Boolean], IBasic]] = js.undefined
  /** [Method] Set values for fields in this form in bulk
  		* @param values Object/Object[] Either an array in the form: [{id:'clientName', value:'Fred. Olsen Lines'}, {id:'portOfLoading', value:'FXT'}, {id:'portOfDischarge', value:'OSL'} ]  or an object hash of the form: {  clientName: 'Fred. Olsen Lines',  portOfLoading: 'FXT',  portOfDischarge: 'OSL' }
  		* @returns Ext.form.Basic this
  		*/
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.undefined
  /** [Method] Shortcut to do a submit action
  		* @param options Object The options to pass to the action (see doAction for details).
  		* @returns Ext.form.Basic this
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
  		* @param record Ext.data.Model The record to edit
  		* @returns Ext.form.Basic this
  		*/
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var waitMsgTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.undefined
}

object IBasicForm {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    applyIfToFields: /* obj */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    applyToFields: /* obj */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    baseParams: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    checkDirty: js.UndefOr[Callback] = js.undefined,
    checkValidity: js.UndefOr[Callback] = js.undefined,
    clearInvalid: js.UndefOr[CallbackTo[IBasic]] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    doAction: (/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IBasic] = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    errorReader: js.Any = null,
    extend: String = null,
    findField: /* id */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getFieldValues: /* dirtyOnly */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getFields: js.UndefOr[CallbackTo[IMixedCollection]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getRecord: js.UndefOr[CallbackTo[IModel]] = js.undefined,
    getValues: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    hasInvalidField: js.UndefOr[Callback] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hasUpload: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IBasicForm] = null,
    isDirty: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    jsonSubmit: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    loadRecord: /* record */ js.UndefOr[IModel] => CallbackTo[IBasic] = null,
    markInvalid: /* errors */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    method: String = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    owner: IContainer = null,
    paramOrder: js.Any = null,
    paramsAsHash: js.UndefOr[Boolean] = js.undefined,
    reader: js.Any = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    reset: /* resetRecord */ js.UndefOr[Boolean] => CallbackTo[IBasic] = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setValues: /* values */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    standardSubmit: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    submit: /* options */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    timeout: Int | Double = null,
    trackResetOnLoad: js.UndefOr[Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    updateRecord: /* record */ js.UndefOr[IModel] => CallbackTo[IBasic] = null,
    url: String = null,
    uses: Array = null,
    waitMsgTarget: js.Any = null,
    waitTitle: String = null
  ): IBasicForm = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (applyIfToFields != null) __obj.updateDynamic("applyIfToFields")(js.Any.fromFunction1((t0: /* obj */ js.UndefOr[js.Any]) => applyIfToFields(t0).runNow()))
    if (applyToFields != null) __obj.updateDynamic("applyToFields")(js.Any.fromFunction1((t0: /* obj */ js.UndefOr[js.Any]) => applyToFields(t0).runNow()))
    if (baseParams != null) __obj.updateDynamic("baseParams")(baseParams.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    checkDirty.foreach(p => __obj.updateDynamic("checkDirty")(p.toJsFn))
    checkValidity.foreach(p => __obj.updateDynamic("checkValidity")(p.toJsFn))
    clearInvalid.foreach(p => __obj.updateDynamic("clearInvalid")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (doAction != null) __obj.updateDynamic("doAction")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[js.Any], t1: /* options */ js.UndefOr[js.Any]) => doAction(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (errorReader != null) __obj.updateDynamic("errorReader")(errorReader.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findField != null) __obj.updateDynamic("findField")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => findField(t0).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (getFieldValues != null) __obj.updateDynamic("getFieldValues")(js.Any.fromFunction1((t0: /* dirtyOnly */ js.UndefOr[scala.Boolean]) => getFieldValues(t0).runNow()))
    getFields.foreach(p => __obj.updateDynamic("getFields")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getRecord.foreach(p => __obj.updateDynamic("getRecord")(p.toJsFn))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction4((t0: /* asString */ js.UndefOr[scala.Boolean], t1: /* dirtyOnly */ js.UndefOr[scala.Boolean], t2: /* includeEmptyText */ js.UndefOr[scala.Boolean], t3: /* useDataValues */ js.UndefOr[scala.Boolean]) => getValues(t0, t1, t2, t3).runNow()))
    hasInvalidField.foreach(p => __obj.updateDynamic("hasInvalidField")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    hasUpload.foreach(p => __obj.updateDynamic("hasUpload")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (!js.isUndefined(jsonSubmit)) __obj.updateDynamic("jsonSubmit")(jsonSubmit.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => loadRecord(t0).runNow()))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1((t0: /* errors */ js.UndefOr[js.Any]) => markInvalid(t0).runNow()))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (paramOrder != null) __obj.updateDynamic("paramOrder")(paramOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(paramsAsHash)) __obj.updateDynamic("paramsAsHash")(paramsAsHash.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: /* resetRecord */ js.UndefOr[scala.Boolean]) => reset(t0).runNow()))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[js.Any]) => setValues(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (!js.isUndefined(standardSubmit)) __obj.updateDynamic("standardSubmit")(standardSubmit.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => submit(t0).runNow()))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResetOnLoad)) __obj.updateDynamic("trackResetOnLoad")(trackResetOnLoad.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (updateRecord != null) __obj.updateDynamic("updateRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => updateRecord(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (waitMsgTarget != null) __obj.updateDynamic("waitMsgTarget")(waitMsgTarget.asInstanceOf[js.Any])
    if (waitTitle != null) __obj.updateDynamic("waitTitle")(waitTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicForm]
  }
}

