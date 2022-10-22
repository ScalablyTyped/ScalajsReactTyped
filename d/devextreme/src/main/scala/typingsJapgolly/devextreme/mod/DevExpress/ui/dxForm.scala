package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.Properties
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxValidationGroup.ValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxForm
  extends StObject
     with Widget[dxFormOptions] {
  
  /**
    * Gets a button&apos;s instance.
    */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
  
  /**
    * Gets an editor instance. Takes effect only if the form item is visible.
    */
  def getEditor(dataField: String): js.UndefOr[Editor[Properties]] = js.native
  
  /**
    * Gets a form item&apos;s configuration.
    */
  def itemOption(id: String): Any = js.native
  /**
    * Updates the value of a single item option.
    */
  def itemOption(id: String, option: String, value: Any): Unit = js.native
  /**
    * Updates the values of several item properties.
    */
  def itemOption(id: String, options: Any): Unit = js.native
  
  /**
    * Resets the editor&apos;s value to undefined.
    */
  def resetValues(): Unit = js.native
  
  /**
    * Updates a formData field and the corresponding editor.
    */
  def updateData(dataField: String, value: Any): Unit = js.native
  /**
    * Merges the passed `data` object with formData. Matching properties in formData are overwritten and new properties added.
    */
  def updateData(data: Any): Unit = js.native
  
  /**
    * Updates the dimensions of the UI component contents.
    */
  def updateDimensions(): DxPromise[Unit] = js.native
  
  /**
    * Validates the values of all editors on the form against the list of the validation rules specified for each form item.
    */
  def validate(): ValidationResult = js.native
}
object dxForm {
  
  type ButtonItem = dxFormButtonItem
  
  type ContentReadyEvent = EventInfo[dxForm]
  
  type DisposingEvent = EventInfo[dxForm]
  
  trait EditorEnterKeyEvent
    extends StObject
       with EventInfo[dxForm] {
    
    val dataField: js.UndefOr[String] = js.undefined
  }
  object EditorEnterKeyEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement]): EditorEnterKeyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorEnterKeyEvent]
    }
    
    extension [Self <: EditorEnterKeyEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    }
  }
  
  type EmptyItem = dxFormEmptyItem
  
  trait FieldDataChangedEvent
    extends StObject
       with EventInfo[dxForm] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object FieldDataChangedEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement]): FieldDataChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldDataChangedEvent]
    }
    
    extension [Self <: FieldDataChangedEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete
    - typingsJapgolly.devextreme.devextremeStrings.dxCalendar
    - typingsJapgolly.devextreme.devextremeStrings.dxCheckBox
    - typingsJapgolly.devextreme.devextremeStrings.dxColorBox
    - typingsJapgolly.devextreme.devextremeStrings.dxDateBox
    - typingsJapgolly.devextreme.devextremeStrings.dxDropDownBox
    - typingsJapgolly.devextreme.devextremeStrings.dxHtmlEditor
    - typingsJapgolly.devextreme.devextremeStrings.dxLookup
    - typingsJapgolly.devextreme.devextremeStrings.dxNumberBox
    - typingsJapgolly.devextreme.devextremeStrings.dxRadioGroup
    - typingsJapgolly.devextreme.devextremeStrings.dxRangeSlider
    - typingsJapgolly.devextreme.devextremeStrings.dxSelectBox
    - typingsJapgolly.devextreme.devextremeStrings.dxSlider
    - typingsJapgolly.devextreme.devextremeStrings.dxSwitch
    - typingsJapgolly.devextreme.devextremeStrings.dxTagBox
    - typingsJapgolly.devextreme.devextremeStrings.dxTextArea
    - typingsJapgolly.devextreme.devextremeStrings.dxTextBox
  */
  trait FormItemComponent extends StObject
  object FormItemComponent {
    
    inline def dxAutocomplete: typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete = "dxAutocomplete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxAutocomplete]
    
    inline def dxCalendar: typingsJapgolly.devextreme.devextremeStrings.dxCalendar = "dxCalendar".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxCalendar]
    
    inline def dxCheckBox: typingsJapgolly.devextreme.devextremeStrings.dxCheckBox = "dxCheckBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxCheckBox]
    
    inline def dxColorBox: typingsJapgolly.devextreme.devextremeStrings.dxColorBox = "dxColorBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxColorBox]
    
    inline def dxDateBox: typingsJapgolly.devextreme.devextremeStrings.dxDateBox = "dxDateBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxDateBox]
    
    inline def dxDropDownBox: typingsJapgolly.devextreme.devextremeStrings.dxDropDownBox = "dxDropDownBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxDropDownBox]
    
    inline def dxHtmlEditor: typingsJapgolly.devextreme.devextremeStrings.dxHtmlEditor = "dxHtmlEditor".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxHtmlEditor]
    
    inline def dxLookup: typingsJapgolly.devextreme.devextremeStrings.dxLookup = "dxLookup".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxLookup]
    
    inline def dxNumberBox: typingsJapgolly.devextreme.devextremeStrings.dxNumberBox = "dxNumberBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxNumberBox]
    
    inline def dxRadioGroup: typingsJapgolly.devextreme.devextremeStrings.dxRadioGroup = "dxRadioGroup".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxRadioGroup]
    
    inline def dxRangeSlider: typingsJapgolly.devextreme.devextremeStrings.dxRangeSlider = "dxRangeSlider".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxRangeSlider]
    
    inline def dxSelectBox: typingsJapgolly.devextreme.devextremeStrings.dxSelectBox = "dxSelectBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxSelectBox]
    
    inline def dxSlider: typingsJapgolly.devextreme.devextremeStrings.dxSlider = "dxSlider".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxSlider]
    
    inline def dxSwitch: typingsJapgolly.devextreme.devextremeStrings.dxSwitch = "dxSwitch".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxSwitch]
    
    inline def dxTagBox: typingsJapgolly.devextreme.devextremeStrings.dxTagBox = "dxTagBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxTagBox]
    
    inline def dxTextArea: typingsJapgolly.devextreme.devextremeStrings.dxTextArea = "dxTextArea".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxTextArea]
    
    inline def dxTextBox: typingsJapgolly.devextreme.devextremeStrings.dxTextBox = "dxTextBox".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dxTextBox]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.empty
    - typingsJapgolly.devextreme.devextremeStrings.group
    - typingsJapgolly.devextreme.devextremeStrings.simple
    - typingsJapgolly.devextreme.devextremeStrings.tabbed
    - typingsJapgolly.devextreme.devextremeStrings.button
  */
  trait FormItemType extends StObject
  object FormItemType {
    
    inline def button: typingsJapgolly.devextreme.devextremeStrings.button = "button".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.button]
    
    inline def empty: typingsJapgolly.devextreme.devextremeStrings.empty = "empty".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.empty]
    
    inline def group: typingsJapgolly.devextreme.devextremeStrings.group = "group".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.group]
    
    inline def simple: typingsJapgolly.devextreme.devextremeStrings.simple = "simple".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.simple]
    
    inline def tabbed: typingsJapgolly.devextreme.devextremeStrings.tabbed = "tabbed".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.tabbed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.static
    - typingsJapgolly.devextreme.devextremeStrings.floating
    - typingsJapgolly.devextreme.devextremeStrings.hidden
    - typingsJapgolly.devextreme.devextremeStrings.outside
  */
  trait FormLabelMode extends StObject
  object FormLabelMode {
    
    inline def floating: typingsJapgolly.devextreme.devextremeStrings.floating = "floating".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.floating]
    
    inline def hidden: typingsJapgolly.devextreme.devextremeStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.hidden]
    
    inline def outside: typingsJapgolly.devextreme.devextremeStrings.outside = "outside".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.outside]
    
    inline def static: typingsJapgolly.devextreme.devextremeStrings.static = "static".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.static]
  }
  
  type GroupItem = dxFormGroupItem
  
  trait GroupItemTemplateData extends StObject {
    
    val component: dxForm
    
    val formData: js.UndefOr[Any] = js.undefined
  }
  object GroupItemTemplateData {
    
    inline def apply(component: dxForm): GroupItemTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupItemTemplateData]
    }
    
    extension [Self <: GroupItemTemplateData](x: Self) {
      
      inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxForm]
  
  type Item = SimpleItem | GroupItem | TabbedItem | EmptyItem | ButtonItem
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.left
    - typingsJapgolly.devextreme.devextremeStrings.right
    - typingsJapgolly.devextreme.devextremeStrings.top
  */
  trait LabelLocation extends StObject
  object LabelLocation {
    
    inline def left: typingsJapgolly.devextreme.devextremeStrings.left = "left".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.left]
    
    inline def right: typingsJapgolly.devextreme.devextremeStrings.right = "right".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.right]
    
    inline def top: typingsJapgolly.devextreme.devextremeStrings.top = "top".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.top]
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxForm]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFormOptions
  
  type SimpleItem = dxFormSimpleItem
  
  trait SimpleItemTemplateData extends StObject {
    
    val component: dxForm
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val editorOptions: js.UndefOr[Any] = js.undefined
    
    val editorType: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object SimpleItemTemplateData {
    
    inline def apply(component: dxForm): SimpleItemTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleItemTemplateData]
    }
    
    extension [Self <: SimpleItemTemplateData](x: Self) {
      
      inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
      
      inline def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
      
      inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type TabbedItem = dxFormTabbedItem
}
