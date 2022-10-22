package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var DataType: XlParameterDataType
  
  /* private */ @JSName("Excel.Parameter_typekey")
  var ExcelDotParameter_typekey: Parameter
  
  var Name: String
  
  val Parent: Any
  
  val PromptString: String
  
  var RefreshOnChange: Boolean
  
  def SetParam(Type: XlParameterType, Value: Any): Unit
  
  def SourceRange(Address: String): Range
  def SourceRange(RowIndex: Double): Range
  def SourceRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("SourceRange")
  val SourceRange_Original: Range
  
  val Type: XlParameterType
  
  val Value: Any
}
object Parameter {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    DataType: XlParameterDataType,
    ExcelDotParameter_typekey: Parameter,
    Name: String,
    Parent: Any,
    PromptString: String,
    RefreshOnChange: Boolean,
    SetParam: (XlParameterType, Any) => Callback,
    SourceRange: Range,
    Type: XlParameterType,
    Value: Any
  ): Parameter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PromptString = PromptString.asInstanceOf[js.Any], RefreshOnChange = RefreshOnChange.asInstanceOf[js.Any], SetParam = js.Any.fromFunction2((t0: XlParameterType, t1: Any) => (SetParam(t0, t1)).runNow()), SourceRange = SourceRange.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Parameter_typekey")(ExcelDotParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: XlParameterDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setExcelDotParameter_typekey(value: Parameter): Self = StObject.set(x, "Excel.Parameter_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPromptString(value: String): Self = StObject.set(x, "PromptString", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnChange(value: Boolean): Self = StObject.set(x, "RefreshOnChange", value.asInstanceOf[js.Any])
    
    inline def setSetParam(value: (XlParameterType, Any) => Callback): Self = StObject.set(x, "SetParam", js.Any.fromFunction2((t0: XlParameterType, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSourceRange(value: Range): Self = StObject.set(x, "SourceRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
