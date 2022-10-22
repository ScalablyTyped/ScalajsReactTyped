package typingsJapgolly.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait floatingButtonEdge extends StObject
@JSImport("instabug-reactnative", "floatingButtonEdge")
@js.native
object floatingButtonEdge extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[floatingButtonEdge & Double] = js.native
  
  @js.native
  sealed trait left
    extends StObject
       with floatingButtonEdge
  /* 0 */ val left: typingsJapgolly.instabugReactnative.mod.floatingButtonEdge.left & Double = js.native
  
  @js.native
  sealed trait right
    extends StObject
       with floatingButtonEdge
  /* 1 */ val right: typingsJapgolly.instabugReactnative.mod.floatingButtonEdge.right & Double = js.native
}
