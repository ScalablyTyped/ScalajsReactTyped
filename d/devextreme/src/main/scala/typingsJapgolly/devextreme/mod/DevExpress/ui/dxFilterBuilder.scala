package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typingsJapgolly.devextreme.mod.DevExpress.events.Cancelable
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFilterBuilder
  extends StObject
     with Widget[dxFilterBuilderOptions] {
  
  /**
    * Gets a filter expression that contains only operations supported by the DataSource.
    */
  def getFilterExpression(): String | js.Array[Any] | js.Function = js.native
}
object dxFilterBuilder {
  
  type ContentReadyEvent = EventInfo[dxFilterBuilder]
  
  type CustomOperation = dxFilterBuilderCustomOperation
  
  trait CustomOperationEditorTemplate extends StObject {
    
    val field: Field
    
    val setValue: js.Function
    
    val value: js.UndefOr[String | Double | js.Date] = js.undefined
  }
  object CustomOperationEditorTemplate {
    
    inline def apply(field: Field, setValue: js.Function): CustomOperationEditorTemplate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomOperationEditorTemplate]
    }
    
    extension [Self <: CustomOperationEditorTemplate](x: Self) {
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DisposingEvent = EventInfo[dxFilterBuilder]
  
  trait EditorPreparedEvent
    extends StObject
       with EventInfo[dxFilterBuilder] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: DxElement_[HTMLElement]
    
    val editorName: String
    
    val filterOperation: js.UndefOr[String] = js.undefined
    
    val readOnly: Boolean
    
    val rtlEnabled: Boolean
    
    val setValue: Any
    
    val updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparedEvent {
    
    inline def apply(
      component: dxFilterBuilder,
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      editorName: String,
      element: DxElement_[HTMLElement],
      readOnly: Boolean,
      rtlEnabled: Boolean,
      setValue: Any
    ): EditorPreparedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparedEvent]
    }
    
    extension [Self <: EditorPreparedEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
      
      inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait EditorPreparingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxFilterBuilder] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    var editorName: String
    
    var editorOptions: js.UndefOr[Any] = js.undefined
    
    val filterOperation: js.UndefOr[String] = js.undefined
    
    val readOnly: Boolean
    
    val rtlEnabled: Boolean
    
    val setValue: Any
    
    var updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparingEvent {
    
    inline def apply(
      component: dxFilterBuilder,
      disabled: Boolean,
      editorName: String,
      element: DxElement_[HTMLElement],
      readOnly: Boolean,
      rtlEnabled: Boolean,
      setValue: Any
    ): EditorPreparingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparingEvent]
    }
    
    extension [Self <: EditorPreparingEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setEditorElementUndefined: Self = StObject.set(x, "editorElement", js.undefined)
      
      inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
      
      inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Field = dxFilterBuilderField
  
  trait FieldEditorTemplate extends StObject {
    
    val field: Field
    
    val filterOperation: js.UndefOr[String] = js.undefined
    
    val setValue: js.Function
    
    val value: js.UndefOr[String | Double | js.Date] = js.undefined
  }
  object FieldEditorTemplate {
    
    inline def apply(field: Field, setValue: js.Function): FieldEditorTemplate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], setValue = setValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEditorTemplate]
    }
    
    extension [Self <: FieldEditorTemplate](x: Self) {
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
      
      inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.Equalssign
    - typingsJapgolly.devextreme.devextremeStrings.LessthansignGreaterthansign
    - typingsJapgolly.devextreme.devextremeStrings.Lessthansign
    - typingsJapgolly.devextreme.devextremeStrings.LessthansignEqualssign
    - typingsJapgolly.devextreme.devextremeStrings.Greaterthansign
    - typingsJapgolly.devextreme.devextremeStrings.GreaterthansignEqualssign
    - typingsJapgolly.devextreme.devextremeStrings.contains
    - typingsJapgolly.devextreme.devextremeStrings.endswith
    - typingsJapgolly.devextreme.devextremeStrings.isblank
    - typingsJapgolly.devextreme.devextremeStrings.isnotblank
    - typingsJapgolly.devextreme.devextremeStrings.notcontains
    - typingsJapgolly.devextreme.devextremeStrings.startswith
    - typingsJapgolly.devextreme.devextremeStrings.between
  */
  trait FilterBuilderOperation extends StObject
  object FilterBuilderOperation {
    
    inline def Equalssign: typingsJapgolly.devextreme.devextremeStrings.Equalssign = "=".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.Equalssign]
    
    inline def Greaterthansign: typingsJapgolly.devextreme.devextremeStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.devextreme.devextremeStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.devextreme.devextremeStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.devextreme.devextremeStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.LessthansignEqualssign]
    
    inline def LessthansignGreaterthansign: typingsJapgolly.devextreme.devextremeStrings.LessthansignGreaterthansign = "<>".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.LessthansignGreaterthansign]
    
    inline def between: typingsJapgolly.devextreme.devextremeStrings.between = "between".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.between]
    
    inline def contains: typingsJapgolly.devextreme.devextremeStrings.contains = "contains".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.contains]
    
    inline def endswith: typingsJapgolly.devextreme.devextremeStrings.endswith = "endswith".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.endswith]
    
    inline def isblank: typingsJapgolly.devextreme.devextremeStrings.isblank = "isblank".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.isblank]
    
    inline def isnotblank: typingsJapgolly.devextreme.devextremeStrings.isnotblank = "isnotblank".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.isnotblank]
    
    inline def notcontains: typingsJapgolly.devextreme.devextremeStrings.notcontains = "notcontains".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.notcontains]
    
    inline def startswith: typingsJapgolly.devextreme.devextremeStrings.startswith = "startswith".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.startswith]
  }
  
  type FilterLookupDataSource[T] = Exclude[DataSourceLike[T, Any], String | (DataSource[Any, Any])]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.and
    - typingsJapgolly.devextreme.devextremeStrings.or
    - typingsJapgolly.devextreme.devextremeStrings.notAnd
    - typingsJapgolly.devextreme.devextremeStrings.notOr
  */
  trait GroupOperation extends StObject
  object GroupOperation {
    
    inline def and: typingsJapgolly.devextreme.devextremeStrings.and = "and".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.and]
    
    inline def notAnd: typingsJapgolly.devextreme.devextremeStrings.notAnd = "notAnd".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.notAnd]
    
    inline def notOr: typingsJapgolly.devextreme.devextremeStrings.notOr = "notOr".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.notOr]
    
    inline def or: typingsJapgolly.devextreme.devextremeStrings.or = "or".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.or]
  }
  
  type InitializedEvent = InitializedEventInfo[dxFilterBuilder]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFilterBuilder]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFilterBuilder, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFilterBuilderOptions
  
  trait ValueChangedEvent
    extends StObject
       with EventInfo[dxFilterBuilder] {
    
    val previousValue: js.UndefOr[Any] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object ValueChangedEvent {
    
    inline def apply(component: dxFilterBuilder, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    extension [Self <: ValueChangedEvent](x: Self) {
      
      inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
