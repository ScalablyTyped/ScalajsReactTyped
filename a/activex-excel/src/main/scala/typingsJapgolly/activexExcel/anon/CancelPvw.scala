package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelPvw extends StObject {
  
  var Cancel: Boolean
  
  val Pvw: ProtectedViewWindow
}
object CancelPvw {
  
  inline def apply(Cancel: Boolean, Pvw: ProtectedViewWindow): CancelPvw = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvw]
  }
  
  extension [Self <: CancelPvw](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setPvw(value: ProtectedViewWindow): Self = StObject.set(x, "Pvw", value.asInstanceOf[js.Any])
  }
}
