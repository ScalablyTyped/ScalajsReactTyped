package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTable extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var AutoScaleFont: Any
  
  val Border: ChartBorder
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Font: ChartFont
  
  val Format: ChartFormat
  
  var HasBorderHorizontal: Boolean
  
  var HasBorderOutline: Boolean
  
  var HasBorderVertical: Boolean
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.DataTable_typekey")
  var PowerPointDotDataTable_typekey: DataTable
  
  def Select(): Unit
  
  var ShowLegendKey: Boolean
}
object DataTable {
  
  inline def apply(
    Application: Application,
    AutoScaleFont: Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: Callback,
    Font: ChartFont,
    Format: ChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    Parent: Any,
    PowerPointDotDataTable_typekey: DataTable,
    Select: Callback,
    ShowLegendKey: Boolean
  ): DataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn, ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.DataTable_typekey")(PowerPointDotDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
  
  extension [Self <: DataTable](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleFont(value: Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHasBorderHorizontal(value: Boolean): Self = StObject.set(x, "HasBorderHorizontal", value.asInstanceOf[js.Any])
    
    inline def setHasBorderOutline(value: Boolean): Self = StObject.set(x, "HasBorderOutline", value.asInstanceOf[js.Any])
    
    inline def setHasBorderVertical(value: Boolean): Self = StObject.set(x, "HasBorderVertical", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotDataTable_typekey(value: DataTable): Self = StObject.set(x, "PowerPoint.DataTable_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setShowLegendKey(value: Boolean): Self = StObject.set(x, "ShowLegendKey", value.asInstanceOf[js.Any])
  }
}
