package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Borders: typingsJapgolly.activexPowerpoint.PowerPoint.Borders
  
  def Merge(MergeTo: Cell): Unit
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: Cell
  
  def Select(): Unit
  
  val Selected: Boolean
  
  val Shape: typingsJapgolly.activexPowerpoint.PowerPoint.Shape
  
  def Split(NumRows: Double, NumColumns: Double): Unit
}
object Cell {
  
  inline def apply(
    Application: Application,
    Borders: Borders,
    Merge: Cell => Callback,
    Parent: Any,
    PowerPointDotCell_typekey: Cell,
    Select: Callback,
    Selected: Boolean,
    Shape: Shape,
    Split: (Double, Double) => Callback
  ): Cell = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Merge = js.Any.fromFunction1((t0: Cell) => Merge(t0).runNow()), Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn, Selected = Selected.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Split = js.Any.fromFunction2((t0: Double, t1: Double) => (Split(t0, t1)).runNow()))
    __obj.updateDynamic("PowerPoint.Cell_typekey")(PowerPointDotCell_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  extension [Self <: Cell](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: Cell => Callback): Self = StObject.set(x, "Merge", js.Any.fromFunction1((t0: Cell) => value(t0).runNow()))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCell_typekey(value: Cell): Self = StObject.set(x, "PowerPoint.Cell_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: (Double, Double) => Callback): Self = StObject.set(x, "Split", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
