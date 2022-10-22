package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotCell extends StObject {
  
  def AllocateChange(): Unit
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val CellChanged: XlCellChangedState
  
  def ColumnItems(Field: String): typingsJapgolly.activexExcel.Excel.PivotItem
  def ColumnItems(Field: Double): typingsJapgolly.activexExcel.Excel.PivotItem
  @JSName("ColumnItems")
  val ColumnItems_Original: PivotItemList
  
  val Creator: XlCreator
  
  val CustomSubtotalFunction: XlConsolidationFunction
  
  val DataField: typingsJapgolly.activexExcel.Excel.PivotField
  
  val DataSourceValue: Any
  
  def DiscardChange(): Unit
  
  val Dummy18: String
  
  /* private */ @JSName("Excel.PivotCell_typekey")
  var ExcelDotPivotCell_typekey: PivotCell
  
  val MDX: String
  
  val Parent: Any
  
  val PivotCellType: XlPivotCellType
  
  val PivotColumnLine: PivotLine
  
  val PivotField: typingsJapgolly.activexExcel.Excel.PivotField
  
  val PivotItem: typingsJapgolly.activexExcel.Excel.PivotItem
  
  val PivotRowLine: PivotLine
  
  val PivotTable: typingsJapgolly.activexExcel.Excel.PivotTable
  
  def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range
  def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range
  def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range
  @JSName("Range")
  val Range_Original: Range
  
  def RowItems(Field: String): typingsJapgolly.activexExcel.Excel.PivotItem
  def RowItems(Field: Double): typingsJapgolly.activexExcel.Excel.PivotItem
  @JSName("RowItems")
  val RowItems_Original: PivotItemList
}
object PivotCell {
  
  inline def apply(
    AllocateChange: Callback,
    Application: Application,
    CellChanged: XlCellChangedState,
    ColumnItems: PivotItemList,
    Creator: XlCreator,
    CustomSubtotalFunction: XlConsolidationFunction,
    DataField: PivotField,
    DataSourceValue: Any,
    DiscardChange: Callback,
    Dummy18: String,
    ExcelDotPivotCell_typekey: PivotCell,
    MDX: String,
    Parent: Any,
    PivotCellType: XlPivotCellType,
    PivotColumnLine: PivotLine,
    PivotField: PivotField,
    PivotItem: PivotItem,
    PivotRowLine: PivotLine,
    PivotTable: PivotTable,
    Range: Range,
    RowItems: PivotItemList
  ): PivotCell = {
    val __obj = js.Dynamic.literal(AllocateChange = AllocateChange.toJsFn, Application = Application.asInstanceOf[js.Any], CellChanged = CellChanged.asInstanceOf[js.Any], ColumnItems = ColumnItems.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomSubtotalFunction = CustomSubtotalFunction.asInstanceOf[js.Any], DataField = DataField.asInstanceOf[js.Any], DataSourceValue = DataSourceValue.asInstanceOf[js.Any], DiscardChange = DiscardChange.toJsFn, Dummy18 = Dummy18.asInstanceOf[js.Any], MDX = MDX.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotCellType = PivotCellType.asInstanceOf[js.Any], PivotColumnLine = PivotColumnLine.asInstanceOf[js.Any], PivotField = PivotField.asInstanceOf[js.Any], PivotItem = PivotItem.asInstanceOf[js.Any], PivotRowLine = PivotRowLine.asInstanceOf[js.Any], PivotTable = PivotTable.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RowItems = RowItems.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotCell_typekey")(ExcelDotPivotCell_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotCell]
  }
  
  extension [Self <: PivotCell](x: Self) {
    
    inline def setAllocateChange(value: Callback): Self = StObject.set(x, "AllocateChange", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCellChanged(value: XlCellChangedState): Self = StObject.set(x, "CellChanged", value.asInstanceOf[js.Any])
    
    inline def setColumnItems(value: PivotItemList): Self = StObject.set(x, "ColumnItems", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCustomSubtotalFunction(value: XlConsolidationFunction): Self = StObject.set(x, "CustomSubtotalFunction", value.asInstanceOf[js.Any])
    
    inline def setDataField(value: PivotField): Self = StObject.set(x, "DataField", value.asInstanceOf[js.Any])
    
    inline def setDataSourceValue(value: Any): Self = StObject.set(x, "DataSourceValue", value.asInstanceOf[js.Any])
    
    inline def setDiscardChange(value: Callback): Self = StObject.set(x, "DiscardChange", value.toJsFn)
    
    inline def setDummy18(value: String): Self = StObject.set(x, "Dummy18", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPivotCell_typekey(value: PivotCell): Self = StObject.set(x, "Excel.PivotCell_typekey", value.asInstanceOf[js.Any])
    
    inline def setMDX(value: String): Self = StObject.set(x, "MDX", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPivotCellType(value: XlPivotCellType): Self = StObject.set(x, "PivotCellType", value.asInstanceOf[js.Any])
    
    inline def setPivotColumnLine(value: PivotLine): Self = StObject.set(x, "PivotColumnLine", value.asInstanceOf[js.Any])
    
    inline def setPivotField(value: PivotField): Self = StObject.set(x, "PivotField", value.asInstanceOf[js.Any])
    
    inline def setPivotItem(value: PivotItem): Self = StObject.set(x, "PivotItem", value.asInstanceOf[js.Any])
    
    inline def setPivotRowLine(value: PivotLine): Self = StObject.set(x, "PivotRowLine", value.asInstanceOf[js.Any])
    
    inline def setPivotTable(value: PivotTable): Self = StObject.set(x, "PivotTable", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRowItems(value: PivotItemList): Self = StObject.set(x, "RowItems", value.asInstanceOf[js.Any])
  }
}
