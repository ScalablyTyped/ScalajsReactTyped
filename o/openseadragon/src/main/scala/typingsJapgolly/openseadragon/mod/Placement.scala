package typingsJapgolly.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Placement extends StObject
@JSImport("openseadragon", "Placement")
@js.native
object Placement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement & Double] = js.native
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with Placement
  /* 6 */ val BOTTOM: typingsJapgolly.openseadragon.mod.Placement.BOTTOM & Double = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends StObject
       with Placement
  /* 7 */ val BOTTOM_LEFT: typingsJapgolly.openseadragon.mod.Placement.BOTTOM_LEFT & Double = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends StObject
       with Placement
  /* 5 */ val BOTTOM_RIGHT: typingsJapgolly.openseadragon.mod.Placement.BOTTOM_RIGHT & Double = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with Placement
  /* 0 */ val CENTER: typingsJapgolly.openseadragon.mod.Placement.CENTER & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with Placement
  /* 8 */ val LEFT: typingsJapgolly.openseadragon.mod.Placement.LEFT & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with Placement
  /* 4 */ val RIGHT: typingsJapgolly.openseadragon.mod.Placement.RIGHT & Double = js.native
  
  @js.native
  sealed trait TOP
    extends StObject
       with Placement
  /* 2 */ val TOP: typingsJapgolly.openseadragon.mod.Placement.TOP & Double = js.native
  
  @js.native
  sealed trait TOP_LEFT
    extends StObject
       with Placement
  /* 1 */ val TOP_LEFT: typingsJapgolly.openseadragon.mod.Placement.TOP_LEFT & Double = js.native
  
  @js.native
  sealed trait TOP_RIGHT
    extends StObject
       with Placement
  /* 3 */ val TOP_RIGHT: typingsJapgolly.openseadragon.mod.Placement.TOP_RIGHT & Double = js.native
}
