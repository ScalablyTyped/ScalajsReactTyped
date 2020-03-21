package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IFormPanel
  extends typingsJapgolly.extjs.Ext.panel.IPanel {
  /** [Method] Forces each field within the form panel to check if its value has changed  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Provides access to the Form which this Panel contains
  		* @returns Ext.form.Basic The Form which this Panel contains.
  		*/
  var getForm: js.UndefOr[js.Function0[IBasic]] = js.undefined
  /** [Method] Returns the currently loaded Ext data Model instance if one was loaded via loadRecord
  		* @returns Ext.data.Model The loaded instance
  		*/
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Convenience function for fetching the current value of each field in the form
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
  /** [Method] Convenience function to check if the form has any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Convenience function to check if the form has any dirty fields
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience function to check if the form has all valid fields
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic load call
  		* @param options Object The options to pass to the action (see Ext.form.Basic.load and Ext.form.Basic.doAction for details)
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Ext.data.Model The record to load
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[js.Function2[js.UndefOr[ILabelable], js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var pollForChanges: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var pollInterval: js.UndefOr[Double] = js.undefined
  /** [Method] Start an interval task to continuously poll all the fields in the form for changes in their values
  		* @param interval Number The interval in milliseconds at which the check should run.
  		*/
  var startPolling: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Stop a running interval task that was started by startPolling  */
  var stopPolling: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic submit call
  		* @param options Object The options to pass to the action (see Ext.form.Basic.submit and Ext.form.Basic.doAction for details)
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
  		* @param record Ext.data.Model The record to edit
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
}

object IFormPanel {
  @scala.inline
  def apply(
    IPanel: typingsJapgolly.extjs.Ext.panel.IPanel = null,
    checkChange: js.UndefOr[Callback] = js.undefined,
    fieldDefaults: js.Any = null,
    getForm: js.UndefOr[CallbackTo[IBasic]] = js.undefined,
    getRecord: js.UndefOr[CallbackTo[IModel]] = js.undefined,
    getValues: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    hasInvalidField: js.UndefOr[Callback] = js.undefined,
    initFieldAncestor: js.UndefOr[Callback] = js.undefined,
    isDirty: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    load: /* options */ js.UndefOr[js.Any] => Callback = null,
    loadRecord: /* record */ js.UndefOr[IModel] => CallbackTo[IBasic] = null,
    onFieldErrorChange: (js.UndefOr[ILabelable], js.UndefOr[String]) => Callback = null,
    onFieldValidityChange: (js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Callback = null,
    pollForChanges: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    startPolling: /* interval */ js.UndefOr[Double] => Callback = null,
    stopPolling: js.UndefOr[Callback] = js.undefined,
    submit: /* options */ js.UndefOr[js.Any] => Callback = null,
    updateRecord: /* record */ js.UndefOr[IModel] => CallbackTo[IBasic] = null
  ): IFormPanel = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    checkChange.foreach(p => __obj.updateDynamic("checkChange")(p.toJsFn))
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults.asInstanceOf[js.Any])
    getForm.foreach(p => __obj.updateDynamic("getForm")(p.toJsFn))
    getRecord.foreach(p => __obj.updateDynamic("getRecord")(p.toJsFn))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction4((t0: /* asString */ js.UndefOr[scala.Boolean], t1: /* dirtyOnly */ js.UndefOr[scala.Boolean], t2: /* includeEmptyText */ js.UndefOr[scala.Boolean], t3: /* useDataValues */ js.UndefOr[scala.Boolean]) => getValues(t0, t1, t2, t3).runNow()))
    hasInvalidField.foreach(p => __obj.updateDynamic("hasInvalidField")(p.toJsFn))
    initFieldAncestor.foreach(p => __obj.updateDynamic("initFieldAncestor")(p.toJsFn))
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => loadRecord(t0).runNow()))
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.ILabelable], t1: js.UndefOr[java.lang.String]) => onFieldErrorChange(t0, t1).runNow()))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: js.UndefOr[scala.Boolean]) => onFieldValidityChange(t0, t1).runNow()))
    if (!js.isUndefined(pollForChanges)) __obj.updateDynamic("pollForChanges")(pollForChanges.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (startPolling != null) __obj.updateDynamic("startPolling")(js.Any.fromFunction1((t0: /* interval */ js.UndefOr[scala.Double]) => startPolling(t0).runNow()))
    stopPolling.foreach(p => __obj.updateDynamic("stopPolling")(p.toJsFn))
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => submit(t0).runNow()))
    if (updateRecord != null) __obj.updateDynamic("updateRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => updateRecord(t0).runNow()))
    __obj.asInstanceOf[IFormPanel]
  }
}

