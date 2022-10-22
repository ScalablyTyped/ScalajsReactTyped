package typingsJapgolly.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinderOptions
  extends StObject
     with Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object FinderOptions {
  
  inline def apply(): FinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinderOptions]
  }
  
  extension [Self <: FinderOptions](x: Self) {
    
    inline def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    inline def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
