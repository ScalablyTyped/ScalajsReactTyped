package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFilter extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def ApplyFilter(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.AutoFilter_typekey")
  var ExcelDotAutoFilter_typekey: AutoFilter
  
  val FilterMode: Boolean
  
  def Filters(Index: Double): Filter
  @JSName("Filters")
  val Filters_Original: Filters
  
  val Parent: Any
  
  def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range
  def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range
  def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range
  @JSName("Range")
  val Range_Original: Range
  
  def ShowAllData(): Unit
  
  val Sort: typingsJapgolly.activexExcel.Excel.Sort
}
object AutoFilter {
  
  inline def apply(
    Application: Application,
    ApplyFilter: Callback,
    Creator: XlCreator,
    ExcelDotAutoFilter_typekey: AutoFilter,
    FilterMode: Boolean,
    Filters: Filters,
    Parent: Any,
    Range: Range,
    ShowAllData: Callback,
    Sort: Sort
  ): AutoFilter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ApplyFilter = ApplyFilter.toJsFn, Creator = Creator.asInstanceOf[js.Any], FilterMode = FilterMode.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], ShowAllData = ShowAllData.toJsFn, Sort = Sort.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoFilter_typekey")(ExcelDotAutoFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilter]
  }
  
  extension [Self <: AutoFilter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplyFilter(value: Callback): Self = StObject.set(x, "ApplyFilter", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotAutoFilter_typekey(value: AutoFilter): Self = StObject.set(x, "Excel.AutoFilter_typekey", value.asInstanceOf[js.Any])
    
    inline def setFilterMode(value: Boolean): Self = StObject.set(x, "FilterMode", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setShowAllData(value: Callback): Self = StObject.set(x, "ShowAllData", value.toJsFn)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
  }
}
