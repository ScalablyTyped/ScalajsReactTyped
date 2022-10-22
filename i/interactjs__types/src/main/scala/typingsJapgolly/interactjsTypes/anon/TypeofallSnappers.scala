package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.modifiersSnapPointerMod.SnapFunction
import typingsJapgolly.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofallSnappers extends StObject {
  
  def edgeTarget(): Unit
  
  def elements(): Unit
  
  def grid(grid: GridOptions): SnapFunction & CoordFields
}
object TypeofallSnappers {
  
  inline def apply(edgeTarget: Callback, elements: Callback, grid: GridOptions => SnapFunction & CoordFields): TypeofallSnappers = {
    val __obj = js.Dynamic.literal(edgeTarget = edgeTarget.toJsFn, elements = elements.toJsFn, grid = js.Any.fromFunction1(grid))
    __obj.asInstanceOf[TypeofallSnappers]
  }
  
  extension [Self <: TypeofallSnappers](x: Self) {
    
    inline def setEdgeTarget(value: Callback): Self = StObject.set(x, "edgeTarget", value.toJsFn)
    
    inline def setElements(value: Callback): Self = StObject.set(x, "elements", value.toJsFn)
    
    inline def setGrid(value: GridOptions => SnapFunction & CoordFields): Self = StObject.set(x, "grid", js.Any.fromFunction1(value))
  }
}
