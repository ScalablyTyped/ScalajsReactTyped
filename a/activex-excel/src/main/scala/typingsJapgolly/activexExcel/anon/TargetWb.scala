package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.PivotTable
import typingsJapgolly.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetWb extends StObject {
  
  val Target: PivotTable
  
  val Wb: Workbook
}
object TargetWb {
  
  inline def apply(Target: PivotTable, Wb: Workbook): TargetWb = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetWb]
  }
  
  extension [Self <: TargetWb](x: Self) {
    
    inline def setTarget(value: PivotTable): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
