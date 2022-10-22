package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.form.IFieldContainer
import typingsJapgolly.extjs.Ext.toolbar.IToolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ trait IHtmlEditor
  extends StObject
     with IFieldContainer {
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterIFrameTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterTextAreaTpl: js.UndefOr[Any] = js.undefined
  
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
    * @param fn Object A function containing the transaction code
    */
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeIFrameTpl: js.UndefOr[Any] = js.undefined
  
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeTextAreaTpl: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var buttonTips: js.UndefOr[Any] = js.undefined
  
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] If you need want custom HTML cleanup this is the method you should override
    * @param html String The HTML to be cleaned
    * @returns String The cleaned HTML
    */
  var cleanHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], String]] = js.undefined
  
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var createLinkText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultLinkValue: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableAlignments: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableColors: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableFont: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableFontSize: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableFormat: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableLinks: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableLists: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enableSourceEdit: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Executes a Midas editor command directly on the editor document
    * @param cmd String The Midas command
    * @param value String/Boolean The value to pass to the command
    */
  var execCmd: js.UndefOr[js.Function2[/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  var extractFileInput: js.UndefOr[js.Function0[Any | HTMLElement]] = js.undefined
  
  /** [Method] Try to focus this component
    * @param selectText Object
    * @param delay Object
    * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
    */
  @JSName("focus")
  var focus_IHtmlEditor: js.UndefOr[
    js.Function2[/* selectText */ js.UndefOr[Any], /* delay */ js.UndefOr[Any], IComponent]
  ] = js.undefined
  
  /** [Config Option] (String[]) */
  var fontFamilies: js.UndefOr[Array] = js.undefined
  
  /** [Method] Called when the editor initializes the iframe with HTML contents  */
  var getDocMarkup: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
    * @param value Object The value to get errors for (defaults to the current field value)
    * @returns String[] All error messages for this field; an empty Array if none.
    */
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[Any], Any | Array]] = js.undefined
  
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getModelData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the name attribute of the field
    * @returns String name The field name
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  var getSubmitData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the editor s toolbar
    * @returns Ext.toolbar.Toolbar
    */
  var getToolbar: js.UndefOr[js.Function0[IToolbar]] = js.undefined
  
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var iframeAttrTpl: js.UndefOr[Any] = js.undefined
  
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Inserts the passed text at the current cursor position
    * @param text String
    */
  var insertAtCursor: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Method] Returns whether two field values are logically equal
    * @param value1 Object
    * @param value2 Object
    * @returns Boolean True if the values are equal, false if inequal.
    */
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Any | Boolean]] = js.undefined
  
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  var isFileUpload: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
    * @returns Boolean True if the value is valid, else false
    */
  var isValid: js.UndefOr[js.Function0[Any | Boolean]] = js.undefined
  
  /** [Method] Associate one or more error messages with this field
    * @param errors String/String[] The error message(s) for the field.
    */
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Property] (Object) */
  var originalValue: js.UndefOr[Any] = js.undefined
  
  /** [Method] Pushes the value of the textarea into the iframe editor  */
  var pushValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Executes a Midas editor command on the editor document and performs necessary focus and toolbar updates
    * @param cmd String The Midas command
    * @param value String/Boolean The value to pass to the command
    */
  var relayCmd: js.UndefOr[js.Function2[/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the read only state of this field
    * @param readOnly Boolean Whether the field should be read only.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets a data value into the field and runs the change detection and validation
    * @param value Object
    * @returns any this
    */
  var setValue: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Syncs the contents of the editor iframe with the textarea  */
  var syncValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Toggles the editor between standard and source edit mode
    * @param sourceEditMode Boolean True for source edit, false for standard
    */
  var toggleSourceEdit: js.UndefOr[js.Function1[/* sourceEditMode */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object The initial value
    * @returns Object The modified initial value
    */
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Triggers a toolbar update by reading the markup state of the current selection in the editor  */
  var updateToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
    * @returns any True if the value is valid, else false
    */
  var validate: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var value: js.UndefOr[Any] = js.undefined
}
object IHtmlEditor {
  
  inline def apply(): IHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHtmlEditor]
  }
  
  extension [Self <: IHtmlEditor](x: Self) {
    
    inline def setAfterIFrameTpl(value: Any): Self = StObject.set(x, "afterIFrameTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterIFrameTplUndefined: Self = StObject.set(x, "afterIFrameTpl", js.undefined)
    
    inline def setAfterTextAreaTpl(value: Any): Self = StObject.set(x, "afterTextAreaTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterTextAreaTplUndefined: Self = StObject.set(x, "afterTextAreaTpl", js.undefined)
    
    inline def setBatchChanges(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "batchChanges", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
    
    inline def setBeforeIFrameTpl(value: Any): Self = StObject.set(x, "beforeIFrameTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeIFrameTplUndefined: Self = StObject.set(x, "beforeIFrameTpl", js.undefined)
    
    inline def setBeforeReset(value: Callback): Self = StObject.set(x, "beforeReset", value.toJsFn)
    
    inline def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    inline def setBeforeTextAreaTpl(value: Any): Self = StObject.set(x, "beforeTextAreaTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeTextAreaTplUndefined: Self = StObject.set(x, "beforeTextAreaTpl", js.undefined)
    
    inline def setButtonTips(value: Any): Self = StObject.set(x, "buttonTips", value.asInstanceOf[js.Any])
    
    inline def setButtonTipsUndefined: Self = StObject.set(x, "buttonTips", js.undefined)
    
    inline def setCheckChange(value: Callback): Self = StObject.set(x, "checkChange", value.toJsFn)
    
    inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    inline def setCheckDirty(value: Callback): Self = StObject.set(x, "checkDirty", value.toJsFn)
    
    inline def setCheckDirtyUndefined: Self = StObject.set(x, "checkDirty", js.undefined)
    
    inline def setCleanHtml(value: /* html */ js.UndefOr[String] => String): Self = StObject.set(x, "cleanHtml", js.Any.fromFunction1(value))
    
    inline def setCleanHtmlUndefined: Self = StObject.set(x, "cleanHtml", js.undefined)
    
    inline def setClearInvalid(value: Callback): Self = StObject.set(x, "clearInvalid", value.toJsFn)
    
    inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    inline def setCreateLinkText(value: String): Self = StObject.set(x, "createLinkText", value.asInstanceOf[js.Any])
    
    inline def setCreateLinkTextUndefined: Self = StObject.set(x, "createLinkText", js.undefined)
    
    inline def setDefaultButtonUI(value: String): Self = StObject.set(x, "defaultButtonUI", value.asInstanceOf[js.Any])
    
    inline def setDefaultButtonUIUndefined: Self = StObject.set(x, "defaultButtonUI", js.undefined)
    
    inline def setDefaultLinkValue(value: String): Self = StObject.set(x, "defaultLinkValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultLinkValueUndefined: Self = StObject.set(x, "defaultLinkValue", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setEnableAlignments(value: Boolean): Self = StObject.set(x, "enableAlignments", value.asInstanceOf[js.Any])
    
    inline def setEnableAlignmentsUndefined: Self = StObject.set(x, "enableAlignments", js.undefined)
    
    inline def setEnableColors(value: Boolean): Self = StObject.set(x, "enableColors", value.asInstanceOf[js.Any])
    
    inline def setEnableColorsUndefined: Self = StObject.set(x, "enableColors", js.undefined)
    
    inline def setEnableFont(value: Boolean): Self = StObject.set(x, "enableFont", value.asInstanceOf[js.Any])
    
    inline def setEnableFontSize(value: Boolean): Self = StObject.set(x, "enableFontSize", value.asInstanceOf[js.Any])
    
    inline def setEnableFontSizeUndefined: Self = StObject.set(x, "enableFontSize", js.undefined)
    
    inline def setEnableFontUndefined: Self = StObject.set(x, "enableFont", js.undefined)
    
    inline def setEnableFormat(value: Boolean): Self = StObject.set(x, "enableFormat", value.asInstanceOf[js.Any])
    
    inline def setEnableFormatUndefined: Self = StObject.set(x, "enableFormat", js.undefined)
    
    inline def setEnableLinks(value: Boolean): Self = StObject.set(x, "enableLinks", value.asInstanceOf[js.Any])
    
    inline def setEnableLinksUndefined: Self = StObject.set(x, "enableLinks", js.undefined)
    
    inline def setEnableLists(value: Boolean): Self = StObject.set(x, "enableLists", value.asInstanceOf[js.Any])
    
    inline def setEnableListsUndefined: Self = StObject.set(x, "enableLists", js.undefined)
    
    inline def setEnableSourceEdit(value: Boolean): Self = StObject.set(x, "enableSourceEdit", value.asInstanceOf[js.Any])
    
    inline def setEnableSourceEditUndefined: Self = StObject.set(x, "enableSourceEdit", js.undefined)
    
    inline def setExecCmd(value: (/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "execCmd", js.Any.fromFunction2((t0: /* cmd */ js.UndefOr[String], t1: /* value */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setExecCmdUndefined: Self = StObject.set(x, "execCmd", js.undefined)
    
    inline def setExtractFileInput(value: CallbackTo[Any | HTMLElement]): Self = StObject.set(x, "extractFileInput", value.toJsFn)
    
    inline def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    inline def setFocus(value: (/* selectText */ js.UndefOr[Any], /* delay */ js.UndefOr[Any]) => IComponent): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFontFamilies(value: Array): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    inline def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
    
    inline def setGetDocMarkup(value: Callback): Self = StObject.set(x, "getDocMarkup", value.toJsFn)
    
    inline def setGetDocMarkupUndefined: Self = StObject.set(x, "getDocMarkup", js.undefined)
    
    inline def setGetErrors(value: js.UndefOr[Any] => Any | Array): Self = StObject.set(x, "getErrors", js.Any.fromFunction1(value))
    
    inline def setGetErrorsUndefined: Self = StObject.set(x, "getErrors", js.undefined)
    
    inline def setGetModelData(value: CallbackTo[Any]): Self = StObject.set(x, "getModelData", value.toJsFn)
    
    inline def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetSubmitData(value: CallbackTo[Any]): Self = StObject.set(x, "getSubmitData", value.toJsFn)
    
    inline def setGetSubmitDataUndefined: Self = StObject.set(x, "getSubmitData", js.undefined)
    
    inline def setGetToolbar(value: CallbackTo[IToolbar]): Self = StObject.set(x, "getToolbar", value.toJsFn)
    
    inline def setGetToolbarUndefined: Self = StObject.set(x, "getToolbar", js.undefined)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setIframeAttrTpl(value: Any): Self = StObject.set(x, "iframeAttrTpl", value.asInstanceOf[js.Any])
    
    inline def setIframeAttrTplUndefined: Self = StObject.set(x, "iframeAttrTpl", js.undefined)
    
    inline def setInitField(value: Callback): Self = StObject.set(x, "initField", value.toJsFn)
    
    inline def setInitFieldUndefined: Self = StObject.set(x, "initField", js.undefined)
    
    inline def setInitValue(value: Callback): Self = StObject.set(x, "initValue", value.toJsFn)
    
    inline def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    inline def setInsertAtCursor(value: /* text */ js.UndefOr[String] => Callback): Self = StObject.set(x, "insertAtCursor", js.Any.fromFunction1((t0: /* text */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setInsertAtCursorUndefined: Self = StObject.set(x, "insertAtCursor", js.undefined)
    
    inline def setIsDirty(value: CallbackTo[Any | Boolean]): Self = StObject.set(x, "isDirty", value.toJsFn)
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsEqual(value: (js.UndefOr[Any], js.UndefOr[Any]) => Any | Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    
    inline def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    inline def setIsFileUpload(value: CallbackTo[Any | Boolean]): Self = StObject.set(x, "isFileUpload", value.toJsFn)
    
    inline def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    inline def setIsFormField(value: Boolean): Self = StObject.set(x, "isFormField", value.asInstanceOf[js.Any])
    
    inline def setIsFormFieldUndefined: Self = StObject.set(x, "isFormField", js.undefined)
    
    inline def setIsValid(value: CallbackTo[Any | Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setMarkInvalid(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "markInvalid", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setPushValue(value: Callback): Self = StObject.set(x, "pushValue", value.toJsFn)
    
    inline def setPushValueUndefined: Self = StObject.set(x, "pushValue", js.undefined)
    
    inline def setRelayCmd(value: (/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "relayCmd", js.Any.fromFunction2((t0: /* cmd */ js.UndefOr[String], t1: /* value */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setRelayCmdUndefined: Self = StObject.set(x, "relayCmd", js.undefined)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetOriginalValue(value: Callback): Self = StObject.set(x, "resetOriginalValue", value.toJsFn)
    
    inline def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    inline def setSetValue(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setSubmitValue(value: Boolean): Self = StObject.set(x, "submitValue", value.asInstanceOf[js.Any])
    
    inline def setSubmitValueUndefined: Self = StObject.set(x, "submitValue", js.undefined)
    
    inline def setSyncValue(value: Callback): Self = StObject.set(x, "syncValue", value.toJsFn)
    
    inline def setSyncValueUndefined: Self = StObject.set(x, "syncValue", js.undefined)
    
    inline def setToggleSourceEdit(value: /* sourceEditMode */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "toggleSourceEdit", js.Any.fromFunction1((t0: /* sourceEditMode */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setToggleSourceEditUndefined: Self = StObject.set(x, "toggleSourceEdit", js.undefined)
    
    inline def setTransformOriginalValue(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    inline def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
    
    inline def setUpdateToolbar(value: Callback): Self = StObject.set(x, "updateToolbar", value.toJsFn)
    
    inline def setUpdateToolbarUndefined: Self = StObject.set(x, "updateToolbar", js.undefined)
    
    inline def setValidate(value: CallbackTo[Any]): Self = StObject.set(x, "validate", value.toJsFn)
    
    inline def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
