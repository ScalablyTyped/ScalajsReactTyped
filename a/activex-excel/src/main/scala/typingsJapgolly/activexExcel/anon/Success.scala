package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  val Success: Boolean
  
  val Wb: Workbook
}
object Success {
  
  inline def apply(Success: Boolean, Wb: Workbook): Success = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setWb(value: Workbook): Self = StObject.set(x, "Wb", value.asInstanceOf[js.Any])
  }
}
