package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScale extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def AppliesTo(Address: String): Range
  def AppliesTo(RowIndex: Double): Range
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("AppliesTo")
  val AppliesTo_Original: Range
  
  def ColorScaleCriteria(Index: Double): ColorScaleCriterion
  @JSName("ColorScaleCriteria")
  val ColorScaleCriteria_Original: ColorScaleCriteria
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.ColorScale_typekey")
  var ExcelDotColorScale_typekey: ColorScale
  
  var Formula: String
  
  def ModifyAppliesToRange(Range: Range): Unit
  
  val PTCondition: Boolean
  
  val Parent: Any
  
  var Priority: Double
  
  var ScopeType: XlPivotConditionScope
  
  def SetFirstPriority(): Unit
  
  def SetLastPriority(): Unit
  
  val StopIfTrue: Boolean
  
  val Type: Double
}
object ColorScale {
  
  inline def apply(
    Application: Application,
    AppliesTo: Range,
    ColorScaleCriteria: ColorScaleCriteria,
    Creator: XlCreator,
    Delete: Callback,
    ExcelDotColorScale_typekey: ColorScale,
    Formula: String,
    ModifyAppliesToRange: Range => Callback,
    PTCondition: Boolean,
    Parent: Any,
    Priority: Double,
    ScopeType: XlPivotConditionScope,
    SetFirstPriority: Callback,
    SetLastPriority: Callback,
    StopIfTrue: Boolean,
    Type: Double
  ): ColorScale = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppliesTo = AppliesTo.asInstanceOf[js.Any], ColorScaleCriteria = ColorScaleCriteria.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Formula = Formula.asInstanceOf[js.Any], ModifyAppliesToRange = js.Any.fromFunction1((t0: Range) => ModifyAppliesToRange(t0).runNow()), PTCondition = PTCondition.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ScopeType = ScopeType.asInstanceOf[js.Any], SetFirstPriority = SetFirstPriority.toJsFn, SetLastPriority = SetLastPriority.toJsFn, StopIfTrue = StopIfTrue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ColorScale_typekey")(ExcelDotColorScale_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScale]
  }
  
  extension [Self <: ColorScale](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAppliesTo(value: Range): Self = StObject.set(x, "AppliesTo", value.asInstanceOf[js.Any])
    
    inline def setColorScaleCriteria(value: ColorScaleCriteria): Self = StObject.set(x, "ColorScaleCriteria", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotColorScale_typekey(value: ColorScale): Self = StObject.set(x, "Excel.ColorScale_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setModifyAppliesToRange(value: Range => Callback): Self = StObject.set(x, "ModifyAppliesToRange", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setPTCondition(value: Boolean): Self = StObject.set(x, "PTCondition", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setScopeType(value: XlPivotConditionScope): Self = StObject.set(x, "ScopeType", value.asInstanceOf[js.Any])
    
    inline def setSetFirstPriority(value: Callback): Self = StObject.set(x, "SetFirstPriority", value.toJsFn)
    
    inline def setSetLastPriority(value: Callback): Self = StObject.set(x, "SetLastPriority", value.toJsFn)
    
    inline def setStopIfTrue(value: Boolean): Self = StObject.set(x, "StopIfTrue", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
