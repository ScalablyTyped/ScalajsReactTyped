package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pvw extends StObject {
  
  val Pvw: ProtectedViewWindow
}
object Pvw {
  
  inline def apply(Pvw: ProtectedViewWindow): Pvw = {
    val __obj = js.Dynamic.literal(Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pvw]
  }
  
  extension [Self <: Pvw](x: Self) {
    
    inline def setPvw(value: ProtectedViewWindow): Self = StObject.set(x, "Pvw", value.asInstanceOf[js.Any])
  }
}
