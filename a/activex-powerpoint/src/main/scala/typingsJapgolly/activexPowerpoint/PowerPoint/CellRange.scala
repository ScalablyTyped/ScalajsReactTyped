package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellRange extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Borders: typingsJapgolly.activexPowerpoint.PowerPoint.Borders
  
  val Count: Double
  
  def Item(Index: Double): Cell
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.CellRange_typekey")
  var PowerPointDotCellRange_typekey: CellRange
}
object CellRange {
  
  inline def apply(
    Application: Application,
    Borders: Borders,
    Count: Double,
    Item: Double => Cell,
    Parent: Any,
    PowerPointDotCellRange_typekey: CellRange
  ): CellRange = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CellRange_typekey")(PowerPointDotCellRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRange]
  }
  
  extension [Self <: CellRange](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Cell): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCellRange_typekey(value: CellRange): Self = StObject.set(x, "PowerPoint.CellRange_typekey", value.asInstanceOf[js.Any])
  }
}
