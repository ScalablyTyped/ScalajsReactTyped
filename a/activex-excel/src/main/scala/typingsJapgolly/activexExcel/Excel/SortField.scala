package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortField extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var CustomOrder: Any
  
  var DataOption: XlSortDataOption
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.SortField_typekey")
  var ExcelDotSortField_typekey: SortField
  
  def Key(Address: String): Range
  def Key(RowIndex: Double): Range
  def Key(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Key")
  val Key_Original: Range
  
  def ModifyKey(Key: Range): Unit
  
  var Order: XlSortOrder
  
  val Parent: Any
  
  var Priority: Double
  
  def SetIcon(Icon: Icon): Unit
  
  var SortOn: XlSortOn
  
  val SortOnValue: Any
}
object SortField {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    CustomOrder: Any,
    DataOption: XlSortDataOption,
    Delete: Callback,
    ExcelDotSortField_typekey: SortField,
    Key: Range,
    ModifyKey: Range => Callback,
    Order: XlSortOrder,
    Parent: Any,
    Priority: Double,
    SetIcon: Icon => Callback,
    SortOn: XlSortOn,
    SortOnValue: Any
  ): SortField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomOrder = CustomOrder.asInstanceOf[js.Any], DataOption = DataOption.asInstanceOf[js.Any], Delete = Delete.toJsFn, Key = Key.asInstanceOf[js.Any], ModifyKey = js.Any.fromFunction1((t0: Range) => ModifyKey(t0).runNow()), Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], SetIcon = js.Any.fromFunction1((t0: Icon) => SetIcon(t0).runNow()), SortOn = SortOn.asInstanceOf[js.Any], SortOnValue = SortOnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SortField_typekey")(ExcelDotSortField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  
  extension [Self <: SortField](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCustomOrder(value: Any): Self = StObject.set(x, "CustomOrder", value.asInstanceOf[js.Any])
    
    inline def setDataOption(value: XlSortDataOption): Self = StObject.set(x, "DataOption", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotSortField_typekey(value: SortField): Self = StObject.set(x, "Excel.SortField_typekey", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Range): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setModifyKey(value: Range => Callback): Self = StObject.set(x, "ModifyKey", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setOrder(value: XlSortOrder): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setSetIcon(value: Icon => Callback): Self = StObject.set(x, "SetIcon", js.Any.fromFunction1((t0: Icon) => value(t0).runNow()))
    
    inline def setSortOn(value: XlSortOn): Self = StObject.set(x, "SortOn", value.asInstanceOf[js.Any])
    
    inline def setSortOnValue(value: Any): Self = StObject.set(x, "SortOnValue", value.asInstanceOf[js.Any])
  }
}
