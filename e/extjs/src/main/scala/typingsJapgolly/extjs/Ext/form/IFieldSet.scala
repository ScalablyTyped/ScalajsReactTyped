package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.container.IContainer
import typingsJapgolly.extjs.Ext.panel.ITool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IFieldSet
  extends StObject
     with IContainer {
  
  /** [Property] (Ext.form.field.Checkbox) */
  var checkboxCmp: js.UndefOr[typingsJapgolly.extjs.Ext.form.field.ICheckbox] = js.undefined
  
  /** [Config Option] (String) */
  var checkboxName: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var checkboxToggle: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Collapses the fieldset
    * @returns Ext.form.FieldSet this
    */
  var collapse: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Creates the checkbox component
    * @returns Ext.Component
    */
  var createCheckboxCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Creates the legend title component
    * @returns Ext.Component
    */
  var createTitleCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Creates the toggle button component
    * @returns Ext.Component
    */
  var createToggleCmp: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Expands the fieldset
    * @returns Ext.form.FieldSet this
    */
  var expand: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[Any] = js.undefined
  
  /** [Method] The supplied default state gathering method for the AbstractComponent class
    * @returns Object
    */
  @JSName("getState")
  var getState_IFieldSet: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Ext.Component) */
  var legend: js.UndefOr[IComponent] = js.undefined
  
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
  
  /** [Method] Sets the title of this fieldset
    * @param title String The new title.
    * @returns Ext.form.FieldSet this
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  
  /** [Method] Toggle the fieldset s collapsed state to the opposite of what it is currently  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Ext.panel.Tool) */
  var toggleCmp: js.UndefOr[ITool] = js.undefined
  
  /** [Config Option] (Boolean) */
  var toggleOnTitleClick: js.UndefOr[Boolean] = js.undefined
}
object IFieldSet {
  
  inline def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  
  extension [Self <: IFieldSet](x: Self) {
    
    inline def setCheckboxCmp(value: typingsJapgolly.extjs.Ext.form.field.ICheckbox): Self = StObject.set(x, "checkboxCmp", value.asInstanceOf[js.Any])
    
    inline def setCheckboxCmpUndefined: Self = StObject.set(x, "checkboxCmp", js.undefined)
    
    inline def setCheckboxName(value: String): Self = StObject.set(x, "checkboxName", value.asInstanceOf[js.Any])
    
    inline def setCheckboxNameUndefined: Self = StObject.set(x, "checkboxName", js.undefined)
    
    inline def setCheckboxToggle(value: Boolean): Self = StObject.set(x, "checkboxToggle", value.asInstanceOf[js.Any])
    
    inline def setCheckboxToggleUndefined: Self = StObject.set(x, "checkboxToggle", js.undefined)
    
    inline def setCollapse(value: CallbackTo[IFieldSet]): Self = StObject.set(x, "collapse", value.toJsFn)
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setCreateCheckboxCmp(value: CallbackTo[IComponent]): Self = StObject.set(x, "createCheckboxCmp", value.toJsFn)
    
    inline def setCreateCheckboxCmpUndefined: Self = StObject.set(x, "createCheckboxCmp", js.undefined)
    
    inline def setCreateTitleCmp(value: CallbackTo[IComponent]): Self = StObject.set(x, "createTitleCmp", value.toJsFn)
    
    inline def setCreateTitleCmpUndefined: Self = StObject.set(x, "createTitleCmp", js.undefined)
    
    inline def setCreateToggleCmp(value: CallbackTo[IComponent]): Self = StObject.set(x, "createToggleCmp", value.toJsFn)
    
    inline def setCreateToggleCmpUndefined: Self = StObject.set(x, "createToggleCmp", js.undefined)
    
    inline def setExpand(value: CallbackTo[IFieldSet]): Self = StObject.set(x, "expand", value.toJsFn)
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFieldDefaults(value: Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    inline def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    inline def setGetState(value: CallbackTo[Any]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    inline def setInitFieldAncestor(value: Callback): Self = StObject.set(x, "initFieldAncestor", value.toJsFn)
    
    inline def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    inline def setLegend(value: IComponent): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Callback): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2((t0: js.UndefOr[ILabelable], t1: js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    inline def setOnFieldValidityChange(value: (js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[String] => IFieldSet): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    
    inline def setToggleCmp(value: ITool): Self = StObject.set(x, "toggleCmp", value.asInstanceOf[js.Any])
    
    inline def setToggleCmpUndefined: Self = StObject.set(x, "toggleCmp", js.undefined)
    
    inline def setToggleOnTitleClick(value: Boolean): Self = StObject.set(x, "toggleOnTitleClick", value.asInstanceOf[js.Any])
    
    inline def setToggleOnTitleClickUndefined: Self = StObject.set(x, "toggleOnTitleClick", js.undefined)
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
