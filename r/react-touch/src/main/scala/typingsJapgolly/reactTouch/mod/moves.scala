package typingsJapgolly.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait moves extends StObject
@JSImport("react-touch", "moves")
@js.native
object moves extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[moves & Double] = js.native
  
  @js.native
  sealed trait DOWN
    extends StObject
       with moves
  /* 6 */ val DOWN: typingsJapgolly.reactTouch.mod.moves.DOWN & Double = js.native
  
  @js.native
  sealed trait DOWNLEFT
    extends StObject
       with moves
  /* 7 */ val DOWNLEFT: typingsJapgolly.reactTouch.mod.moves.DOWNLEFT & Double = js.native
  
  @js.native
  sealed trait DOWNRIGHT
    extends StObject
       with moves
  /* 5 */ val DOWNRIGHT: typingsJapgolly.reactTouch.mod.moves.DOWNRIGHT & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with moves
  /* 3 */ val LEFT: typingsJapgolly.reactTouch.mod.moves.LEFT & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with moves
  /* 4 */ val RIGHT: typingsJapgolly.reactTouch.mod.moves.RIGHT & Double = js.native
  
  @js.native
  sealed trait UP
    extends StObject
       with moves
  /* 1 */ val UP: typingsJapgolly.reactTouch.mod.moves.UP & Double = js.native
  
  @js.native
  sealed trait UPLEFT
    extends StObject
       with moves
  /* 0 */ val UPLEFT: typingsJapgolly.reactTouch.mod.moves.UPLEFT & Double = js.native
  
  @js.native
  sealed trait UPRIGHT
    extends StObject
       with moves
  /* 2 */ val UPRIGHT: typingsJapgolly.reactTouch.mod.moves.UPRIGHT & Double = js.native
}
