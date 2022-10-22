package typingsJapgolly.d3OrgChart.anon

import typingsJapgolly.d3Hierarchy.mod.HierarchyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reverse[Datum] extends StObject {
  
  def reverse[T](a: js.Array[T]): js.Array[T]
  
  def sizeColumn(node: HierarchyNode[Datum]): Double
  
  def sizeRow(node: HierarchyNode[Datum]): Double
}
object Reverse {
  
  inline def apply[Datum](
    reverse: js.Array[Any] => js.Array[Any],
    sizeColumn: HierarchyNode[Datum] => Double,
    sizeRow: HierarchyNode[Datum] => Double
  ): Reverse[Datum] = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse), sizeColumn = js.Any.fromFunction1(sizeColumn), sizeRow = js.Any.fromFunction1(sizeRow))
    __obj.asInstanceOf[Reverse[Datum]]
  }
  
  extension [Self <: Reverse[?], Datum](x: Self & Reverse[Datum]) {
    
    inline def setReverse(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction1(value))
    
    inline def setSizeColumn(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "sizeColumn", js.Any.fromFunction1(value))
    
    inline def setSizeRow(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "sizeRow", js.Any.fromFunction1(value))
  }
}
