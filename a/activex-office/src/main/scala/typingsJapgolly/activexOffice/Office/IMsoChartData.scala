package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoChartData extends StObject {
  
  def Activate(): Unit
  
  def ActivateChartDataWindow(): Unit
  
  def BreakLink(): Unit
  
  val IsLinked: Boolean
  
  /* private */ @JSName("Office.IMsoChartData_typekey")
  var OfficeDotIMsoChartData_typekey: IMsoChartData
  
  val Workbook: Any
}
object IMsoChartData {
  
  inline def apply(
    Activate: Callback,
    ActivateChartDataWindow: Callback,
    BreakLink: Callback,
    IsLinked: Boolean,
    OfficeDotIMsoChartData_typekey: IMsoChartData,
    Workbook: Any
  ): IMsoChartData = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, ActivateChartDataWindow = ActivateChartDataWindow.toJsFn, BreakLink = BreakLink.toJsFn, IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartData_typekey")(OfficeDotIMsoChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartData]
  }
  
  extension [Self <: IMsoChartData](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setActivateChartDataWindow(value: Callback): Self = StObject.set(x, "ActivateChartDataWindow", value.toJsFn)
    
    inline def setBreakLink(value: Callback): Self = StObject.set(x, "BreakLink", value.toJsFn)
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "IsLinked", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoChartData_typekey(value: IMsoChartData): Self = StObject.set(x, "Office.IMsoChartData_typekey", value.asInstanceOf[js.Any])
    
    inline def setWorkbook(value: Any): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
  }
}
