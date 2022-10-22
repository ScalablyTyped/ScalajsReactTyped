package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IPanel
  extends StObject
     with typingsJapgolly.extjs.Ext.panel.IPanel {
  
  /** [Method] Forces each field within the form panel to check if its value has changed  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[Any] = js.undefined
  
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
      Any
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
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
    * @param record Ext.data.Model The record to edit
    * @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
    */
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.undefined
}
object IPanel {
  
  inline def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  extension [Self <: IPanel](x: Self) {
    
    inline def setCheckChange(value: Callback): Self = StObject.set(x, "checkChange", value.toJsFn)
    
    inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    inline def setFieldDefaults(value: Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    inline def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    inline def setGetForm(value: CallbackTo[IBasic]): Self = StObject.set(x, "getForm", value.toJsFn)
    
    inline def setGetFormUndefined: Self = StObject.set(x, "getForm", js.undefined)
    
    inline def setGetRecord(value: CallbackTo[IModel]): Self = StObject.set(x, "getRecord", value.toJsFn)
    
    inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    inline def setGetValues(
      value: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => Any
    ): Self = StObject.set(x, "getValues", js.Any.fromFunction4(value))
    
    inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    inline def setHasInvalidField(value: Callback): Self = StObject.set(x, "hasInvalidField", value.toJsFn)
    
    inline def setHasInvalidFieldUndefined: Self = StObject.set(x, "hasInvalidField", js.undefined)
    
    inline def setInitFieldAncestor(value: Callback): Self = StObject.set(x, "initFieldAncestor", value.toJsFn)
    
    inline def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    inline def setIsDirty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirty", value.toJsFn)
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setLoad(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setLoadRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = StObject.set(x, "loadRecord", js.Any.fromFunction1(value))
    
    inline def setLoadRecordUndefined: Self = StObject.set(x, "loadRecord", js.undefined)
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Callback): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2((t0: js.UndefOr[ILabelable], t1: js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    inline def setOnFieldValidityChange(value: (js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
    
    inline def setPollForChanges(value: Boolean): Self = StObject.set(x, "pollForChanges", value.asInstanceOf[js.Any])
    
    inline def setPollForChangesUndefined: Self = StObject.set(x, "pollForChanges", js.undefined)
    
    inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    
    inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    
    inline def setStartPolling(value: /* interval */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "startPolling", js.Any.fromFunction1((t0: /* interval */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setStartPollingUndefined: Self = StObject.set(x, "startPolling", js.undefined)
    
    inline def setStopPolling(value: Callback): Self = StObject.set(x, "stopPolling", value.toJsFn)
    
    inline def setStopPollingUndefined: Self = StObject.set(x, "stopPolling", js.undefined)
    
    inline def setSubmit(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "submit", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setUpdateRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = StObject.set(x, "updateRecord", js.Any.fromFunction1(value))
    
    inline def setUpdateRecordUndefined: Self = StObject.set(x, "updateRecord", js.undefined)
  }
}
