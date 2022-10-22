package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var Cancel: Boolean
  
  val Sh: Worksheet
  
  def Target(Address: String): Range
  def Target(RowIndex: Double): Range
  def Target(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Target")
  val Target_Original: Range
}
object Target {
  
  inline def apply(Cancel: Boolean, Sh: Worksheet, Target: Range): Target = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setSh(value: Worksheet): Self = StObject.set(x, "Sh", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Range): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
