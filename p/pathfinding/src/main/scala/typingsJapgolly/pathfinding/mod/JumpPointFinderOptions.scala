package typingsJapgolly.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpPointFinderOptions
  extends StObject
     with Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
}
object JumpPointFinderOptions {
  
  inline def apply(): JumpPointFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpPointFinderOptions]
  }
  
  extension [Self <: JumpPointFinderOptions](x: Self) {
    
    inline def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    inline def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
  }
}
