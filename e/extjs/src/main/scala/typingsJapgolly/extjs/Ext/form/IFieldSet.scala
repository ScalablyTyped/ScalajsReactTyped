package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.container.IContainer
import typingsJapgolly.extjs.Ext.panel.ITool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ trait IFieldSet extends IContainer {
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
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    checkboxCmp: typingsJapgolly.extjs.Ext.form.field.ICheckbox = null,
    checkboxName: String = null,
    checkboxToggle: js.UndefOr[Boolean] = js.undefined,
    collapse: js.UndefOr[CallbackTo[IFieldSet]] = js.undefined,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    createCheckboxCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    createTitleCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    createToggleCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    expand: js.UndefOr[CallbackTo[IFieldSet]] = js.undefined,
    fieldDefaults: js.Any = null,
    initFieldAncestor: js.UndefOr[Callback] = js.undefined,
    legend: IComponent = null,
    onFieldErrorChange: (js.UndefOr[ILabelable], js.UndefOr[String]) => Callback = null,
    onFieldValidityChange: (js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Callback = null,
    setTitle: /* title */ js.UndefOr[String] => CallbackTo[IFieldSet] = null,
    title: String = null,
    toggle: js.UndefOr[Callback] = js.undefined,
    toggleCmp: ITool = null,
    toggleOnTitleClick: js.UndefOr[Boolean] = js.undefined
  ): IFieldSet = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (checkboxCmp != null) __obj.updateDynamic("checkboxCmp")(checkboxCmp.asInstanceOf[js.Any])
    if (checkboxName != null) __obj.updateDynamic("checkboxName")(checkboxName.asInstanceOf[js.Any])
    if (!js.isUndefined(checkboxToggle)) __obj.updateDynamic("checkboxToggle")(checkboxToggle.asInstanceOf[js.Any])
    collapse.foreach(p => __obj.updateDynamic("collapse")(p.toJsFn))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    createCheckboxCmp.foreach(p => __obj.updateDynamic("createCheckboxCmp")(p.toJsFn))
    createTitleCmp.foreach(p => __obj.updateDynamic("createTitleCmp")(p.toJsFn))
    createToggleCmp.foreach(p => __obj.updateDynamic("createToggleCmp")(p.toJsFn))
    expand.foreach(p => __obj.updateDynamic("expand")(p.toJsFn))
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults.asInstanceOf[js.Any])
    initFieldAncestor.foreach(p => __obj.updateDynamic("initFieldAncestor")(p.toJsFn))
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.ILabelable], t1: js.UndefOr[java.lang.String]) => onFieldErrorChange(t0, t1).runNow()))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: js.UndefOr[scala.Boolean]) => onFieldValidityChange(t0, t1).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    toggle.foreach(p => __obj.updateDynamic("toggle")(p.toJsFn))
    if (toggleCmp != null) __obj.updateDynamic("toggleCmp")(toggleCmp.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnTitleClick)) __obj.updateDynamic("toggleOnTitleClick")(toggleOnTitleClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldSet]
  }
}

