package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.Workbook
import typingsJapgolly.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShWb extends StObject {
  
  val Sh: Worksheet
  
  val Wb: Workbook
}
object ShWb {
  
  inline def apply(Sh: Worksheet, Wb: Workbook): ShWb = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWb]
  }
  
  extension [Self <: ShWb](x: Self) {
    
    inline def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
