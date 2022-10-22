package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slicer extends StObject {
  
  val ActiveItem: SlicerItem
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var Caption: String
  
  var ColumnWidth: Double
  
  def Copy(): Unit
  
  val Creator: XlCreator
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  var DisableMoveResizeUI: Boolean
  
  var DisplayHeader: Boolean
  
  /* private */ @JSName("Excel.Slicer_typekey")
  var ExcelDotSlicer_typekey: Slicer
  
  var Height: Double
  
  var Left: Double
  
  var Locked: Boolean
  
  var Name: String
  
  var NumberOfColumns: Double
  
  val Parent: Any
  
  var RowHeight: Double
  
  val Shape: typingsJapgolly.activexExcel.Excel.Shape
  
  val SlicerCache: typingsJapgolly.activexExcel.Excel.SlicerCache
  
  val SlicerCacheLevel: typingsJapgolly.activexExcel.Excel.SlicerCacheLevel
  
  var Style: Any
  
  var Top: Double
  
  var Width: Double
}
object Slicer {
  
  inline def apply(
    ActiveItem: SlicerItem,
    Application: Application,
    Caption: String,
    ColumnWidth: Double,
    Copy: Callback,
    Creator: XlCreator,
    Cut: Callback,
    Delete: Callback,
    DisableMoveResizeUI: Boolean,
    DisplayHeader: Boolean,
    ExcelDotSlicer_typekey: Slicer,
    Height: Double,
    Left: Double,
    Locked: Boolean,
    Name: String,
    NumberOfColumns: Double,
    Parent: Any,
    RowHeight: Double,
    Shape: Shape,
    SlicerCache: SlicerCache,
    SlicerCacheLevel: SlicerCacheLevel,
    Style: Any,
    Top: Double,
    Width: Double
  ): Slicer = {
    val __obj = js.Dynamic.literal(ActiveItem = ActiveItem.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], ColumnWidth = ColumnWidth.asInstanceOf[js.Any], Copy = Copy.toJsFn, Creator = Creator.asInstanceOf[js.Any], Cut = Cut.toJsFn, Delete = Delete.toJsFn, DisableMoveResizeUI = DisableMoveResizeUI.asInstanceOf[js.Any], DisplayHeader = DisplayHeader.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfColumns = NumberOfColumns.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], SlicerCache = SlicerCache.asInstanceOf[js.Any], SlicerCacheLevel = SlicerCacheLevel.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Slicer_typekey")(ExcelDotSlicer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slicer]
  }
  
  extension [Self <: Slicer](x: Self) {
    
    inline def setActiveItem(value: SlicerItem): Self = StObject.set(x, "ActiveItem", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "ColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: Callback): Self = StObject.set(x, "Cut", value.toJsFn)
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDisableMoveResizeUI(value: Boolean): Self = StObject.set(x, "DisableMoveResizeUI", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeader(value: Boolean): Self = StObject.set(x, "DisplayHeader", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSlicer_typekey(value: Slicer): Self = StObject.set(x, "Excel.Slicer_typekey", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumberOfColumns(value: Double): Self = StObject.set(x, "NumberOfColumns", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "RowHeight", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setSlicerCache(value: SlicerCache): Self = StObject.set(x, "SlicerCache", value.asInstanceOf[js.Any])
    
    inline def setSlicerCacheLevel(value: SlicerCacheLevel): Self = StObject.set(x, "SlicerCacheLevel", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
