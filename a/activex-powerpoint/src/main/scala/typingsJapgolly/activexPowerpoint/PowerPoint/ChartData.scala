package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartData extends StObject {
  
  def Activate(): Unit
  
  def BreakLink(): Unit
  
  val IsLinked: Boolean
  
  /* private */ @JSName("PowerPoint.ChartData_typekey")
  var PowerPointDotChartData_typekey: ChartData
  
  val Workbook: Any
}
object ChartData {
  
  inline def apply(
    Activate: Callback,
    BreakLink: Callback,
    IsLinked: Boolean,
    PowerPointDotChartData_typekey: ChartData,
    Workbook: Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, BreakLink = BreakLink.toJsFn, IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartData_typekey")(PowerPointDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  
  extension [Self <: ChartData](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setBreakLink(value: Callback): Self = StObject.set(x, "BreakLink", value.toJsFn)
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "IsLinked", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartData_typekey(value: ChartData): Self = StObject.set(x, "PowerPoint.ChartData_typekey", value.asInstanceOf[js.Any])
    
    inline def setWorkbook(value: Any): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
  }
}
