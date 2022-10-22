package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.SlicerCacheLevels
import typingsJapgolly.activexExcel.Excel.SlicerItems
import typingsJapgolly.activexExcel.Excel.SlicerPivotTables
import typingsJapgolly.activexExcel.Excel.Slicers
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlPivotTableSourceType
import typingsJapgolly.activexExcel.Excel.XlSlicerCrossFilterType
import typingsJapgolly.activexExcel.Excel.XlSlicerSort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SlicerCache")
@js.native
/* private */ open class SlicerCache ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.SlicerCache {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def ClearManualFilter(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SlicerCache_typekey")
  var ExcelDotSlicerCache_typekey: typingsJapgolly.activexExcel.Excel.SlicerCache = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val OLAP: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def PivotTables(Index: String): typingsJapgolly.activexExcel.Excel.PivotTable = js.native
  /* CompleteClass */
  override def PivotTables(Index: Double): typingsJapgolly.activexExcel.Excel.PivotTable = js.native
  /* CompleteClass */
  @JSName("PivotTables")
  override val PivotTables_Original: SlicerPivotTables = js.native
  
  /* CompleteClass */
  var ShowAllItems: Boolean = js.native
  
  /* CompleteClass */
  override def SlicerCacheLevels(): typingsJapgolly.activexExcel.Excel.SlicerCacheLevel = js.native
  /* CompleteClass */
  override def SlicerCacheLevels(Level: String): typingsJapgolly.activexExcel.Excel.SlicerCacheLevel = js.native
  /* CompleteClass */
  override def SlicerCacheLevels(Level: Double): typingsJapgolly.activexExcel.Excel.SlicerCacheLevel = js.native
  /* CompleteClass */
  @JSName("SlicerCacheLevels")
  override val SlicerCacheLevels_Original: SlicerCacheLevels = js.native
  
  /* CompleteClass */
  override def SlicerItems(Index: String): typingsJapgolly.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  override def SlicerItems(Index: Double): typingsJapgolly.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  @JSName("SlicerItems")
  override val SlicerItems_Original: SlicerItems = js.native
  
  /* CompleteClass */
  override def Slicers(Index: String): typingsJapgolly.activexExcel.Excel.Slicer = js.native
  /* CompleteClass */
  override def Slicers(Index: Double): typingsJapgolly.activexExcel.Excel.Slicer = js.native
  /* CompleteClass */
  @JSName("Slicers")
  override val Slicers_Original: Slicers = js.native
  
  /* CompleteClass */
  var SortItems: XlSlicerSort = js.native
  
  /* CompleteClass */
  var SortUsingCustomLists: Boolean = js.native
  
  /* CompleteClass */
  override val SourceName: String = js.native
  
  /* CompleteClass */
  override val SourceType: XlPivotTableSourceType = js.native
  
  /* CompleteClass */
  override def VisibleSlicerItems(Index: String): typingsJapgolly.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  override def VisibleSlicerItems(Index: Double): typingsJapgolly.activexExcel.Excel.SlicerItem = js.native
  
  /* CompleteClass */
  var VisibleSlicerItemsList: Any = js.native
  
  /* CompleteClass */
  @JSName("VisibleSlicerItems")
  override val VisibleSlicerItems_Original: SlicerItems = js.native
  
  /* CompleteClass */
  override val WorkbookConnection: typingsJapgolly.activexExcel.Excel.WorkbookConnection = js.native
}
