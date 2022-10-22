package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Cells: CellRange
  
  def Delete(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Column_typekey")
  var PowerPointDotColumn_typekey: Column
  
  def Select(): Unit
  
  var Width: Double
}
object Column {
  
  inline def apply(
    Application: Application,
    Cells: CellRange,
    Delete: Callback,
    Parent: Any,
    PowerPointDotColumn_typekey: Column,
    Select: Callback,
    Width: Double
  ): Column = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Delete = Delete.toJsFn, Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn, Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Column_typekey")(PowerPointDotColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCells(value: CellRange): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotColumn_typekey(value: Column): Self = StObject.set(x, "PowerPoint.Column_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
