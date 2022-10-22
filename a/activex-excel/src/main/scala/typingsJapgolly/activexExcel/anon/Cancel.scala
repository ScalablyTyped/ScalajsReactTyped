package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.ProtectedViewWindow
import typingsJapgolly.activexExcel.Excel.XlProtectedViewCloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var Cancel: Boolean
  
  val Pvw: ProtectedViewWindow
  
  val Reason: XlProtectedViewCloseReason
}
object Cancel {
  
  inline def apply(Cancel: Boolean, Pvw: ProtectedViewWindow, Reason: XlProtectedViewCloseReason): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setPvw(value: ProtectedViewWindow): Self = StObject.set(x, "Pvw", value.asInstanceOf[js.Any])
    
    inline def setReason(value: XlProtectedViewCloseReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
