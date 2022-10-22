package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartData extends StObject {
  
  def Activate(): Unit
  
  def BreakLink(): Unit
  
  val IsLinked: Boolean
  
  /* private */ @JSName("Word.ChartData_typekey")
  var WordDotChartData_typekey: ChartData
  
  val Workbook: Any
}
object ChartData {
  
  inline def apply(
    Activate: Callback,
    BreakLink: Callback,
    IsLinked: Boolean,
    WordDotChartData_typekey: ChartData,
    Workbook: Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, BreakLink = BreakLink.toJsFn, IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartData_typekey")(WordDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  
  extension [Self <: ChartData](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setBreakLink(value: Callback): Self = StObject.set(x, "BreakLink", value.toJsFn)
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "IsLinked", value.asInstanceOf[js.Any])
    
    inline def setWordDotChartData_typekey(value: ChartData): Self = StObject.set(x, "Word.ChartData_typekey", value.asInstanceOf[js.Any])
    
    inline def setWorkbook(value: Any): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
  }
}
