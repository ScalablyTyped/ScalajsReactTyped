package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.Chart
import typingsJapgolly.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sh extends StObject {
  
  val Sh: Chart | Worksheet
}
object Sh {
  
  inline def apply(Sh: Chart | Worksheet): Sh = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sh]
  }
  
  extension [Self <: Sh](x: Self) {
    
    inline def setSh(value: Chart | Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
  }
}
