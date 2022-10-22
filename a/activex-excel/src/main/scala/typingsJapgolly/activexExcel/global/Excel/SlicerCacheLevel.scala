package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.SlicerItems
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlSlicerCrossFilterType
import typingsJapgolly.activexExcel.Excel.XlSlicerSort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SlicerCacheLevel")
@js.native
/* private */ open class SlicerCacheLevel ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.SlicerCacheLevel {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SlicerCacheLevel_typekey")
  var ExcelDotSlicerCacheLevel_typekey: typingsJapgolly.activexExcel.Excel.SlicerCacheLevel = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Ordinal: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def SlicerItems(Index: String): typingsJapgolly.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  override def SlicerItems(Index: Double): typingsJapgolly.activexExcel.Excel.SlicerItem = js.native
  /* CompleteClass */
  @JSName("SlicerItems")
  override val SlicerItems_Original: SlicerItems = js.native
  
  /* CompleteClass */
  var SortItems: XlSlicerSort = js.native
  
  /* CompleteClass */
  override val VisibleSlicerItemsList: Any = js.native
}
