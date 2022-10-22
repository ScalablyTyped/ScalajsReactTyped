package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlicerCacheLevel extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Count: Double
  
  val Creator: XlCreator
  
  var CrossFilterType: XlSlicerCrossFilterType
  
  /* private */ @JSName("Excel.SlicerCacheLevel_typekey")
  var ExcelDotSlicerCacheLevel_typekey: SlicerCacheLevel
  
  val Name: String
  
  val Ordinal: Double
  
  val Parent: Any
  
  def SlicerItems(Index: String): SlicerItem
  def SlicerItems(Index: Double): SlicerItem
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems
  
  var SortItems: XlSlicerSort
  
  val VisibleSlicerItemsList: Any
}
object SlicerCacheLevel {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: XlCreator,
    CrossFilterType: XlSlicerCrossFilterType,
    ExcelDotSlicerCacheLevel_typekey: SlicerCacheLevel,
    Name: String,
    Ordinal: Double,
    Parent: Any,
    SlicerItems: SlicerItems,
    SortItems: XlSlicerSort,
    VisibleSlicerItemsList: Any
  ): SlicerCacheLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CrossFilterType = CrossFilterType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Ordinal = Ordinal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlicerItems = SlicerItems.asInstanceOf[js.Any], SortItems = SortItems.asInstanceOf[js.Any], VisibleSlicerItemsList = VisibleSlicerItemsList.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SlicerCacheLevel_typekey")(ExcelDotSlicerCacheLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerCacheLevel]
  }
  
  extension [Self <: SlicerCacheLevel](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCrossFilterType(value: XlSlicerCrossFilterType): Self = StObject.set(x, "CrossFilterType", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSlicerCacheLevel_typekey(value: SlicerCacheLevel): Self = StObject.set(x, "Excel.SlicerCacheLevel_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "Ordinal", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSlicerItems(value: SlicerItems): Self = StObject.set(x, "SlicerItems", value.asInstanceOf[js.Any])
    
    inline def setSortItems(value: XlSlicerSort): Self = StObject.set(x, "SortItems", value.asInstanceOf[js.Any])
    
    inline def setVisibleSlicerItemsList(value: Any): Self = StObject.set(x, "VisibleSlicerItemsList", value.asInstanceOf[js.Any])
  }
}
