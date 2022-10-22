package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTD extends StObject {
  
  /* private */ @JSName("Excel.RTD_typekey")
  var ExcelDotRTD_typekey: RTD
  
  def RefreshData(): Unit
  
  def RestartServers(): Unit
  
  var ThrottleInterval: Double
}
object RTD {
  
  inline def apply(
    ExcelDotRTD_typekey: RTD,
    RefreshData: Callback,
    RestartServers: Callback,
    ThrottleInterval: Double
  ): RTD = {
    val __obj = js.Dynamic.literal(RefreshData = RefreshData.toJsFn, RestartServers = RestartServers.toJsFn, ThrottleInterval = ThrottleInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.RTD_typekey")(ExcelDotRTD_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTD]
  }
  
  extension [Self <: RTD](x: Self) {
    
    inline def setExcelDotRTD_typekey(value: RTD): Self = StObject.set(x, "Excel.RTD_typekey", value.asInstanceOf[js.Any])
    
    inline def setRefreshData(value: Callback): Self = StObject.set(x, "RefreshData", value.toJsFn)
    
    inline def setRestartServers(value: Callback): Self = StObject.set(x, "RestartServers", value.toJsFn)
    
    inline def setThrottleInterval(value: Double): Self = StObject.set(x, "ThrottleInterval", value.asInstanceOf[js.Any])
  }
}
