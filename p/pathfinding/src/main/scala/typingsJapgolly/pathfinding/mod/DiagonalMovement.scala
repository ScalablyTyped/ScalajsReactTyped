package typingsJapgolly.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagonalMovement extends StObject
@JSImport("pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagonalMovement & Double] = js.native
  
  @js.native
  sealed trait Always
    extends StObject
       with DiagonalMovement
  /* 1 */ val Always: typingsJapgolly.pathfinding.mod.DiagonalMovement.Always & Double = js.native
  
  @js.native
  sealed trait IfAtMostOneObstacle
    extends StObject
       with DiagonalMovement
  /* 3 */ val IfAtMostOneObstacle: typingsJapgolly.pathfinding.mod.DiagonalMovement.IfAtMostOneObstacle & Double = js.native
  
  @js.native
  sealed trait Never
    extends StObject
       with DiagonalMovement
  /* 2 */ val Never: typingsJapgolly.pathfinding.mod.DiagonalMovement.Never & Double = js.native
  
  @js.native
  sealed trait OnlyWhenNoObstacles
    extends StObject
       with DiagonalMovement
  /* 4 */ val OnlyWhenNoObstacles: typingsJapgolly.pathfinding.mod.DiagonalMovement.OnlyWhenNoObstacles & Double = js.native
}
