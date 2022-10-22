package typingsJapgolly.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayPlacement extends StObject
@JSImport("openseadragon", "OverlayPlacement")
@js.native
object OverlayPlacement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayPlacement & Double] = js.native
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with OverlayPlacement
  /* 6 */ val BOTTOM: typingsJapgolly.openseadragon.mod.OverlayPlacement.BOTTOM & Double = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends StObject
       with OverlayPlacement
  /* 7 */ val BOTTOM_LEFT: typingsJapgolly.openseadragon.mod.OverlayPlacement.BOTTOM_LEFT & Double = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends StObject
       with OverlayPlacement
  /* 5 */ val BOTTOM_RIGHT: typingsJapgolly.openseadragon.mod.OverlayPlacement.BOTTOM_RIGHT & Double = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with OverlayPlacement
  /* 0 */ val CENTER: typingsJapgolly.openseadragon.mod.OverlayPlacement.CENTER & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with OverlayPlacement
  /* 8 */ val LEFT: typingsJapgolly.openseadragon.mod.OverlayPlacement.LEFT & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with OverlayPlacement
  /* 4 */ val RIGHT: typingsJapgolly.openseadragon.mod.OverlayPlacement.RIGHT & Double = js.native
  
  @js.native
  sealed trait TOP
    extends StObject
       with OverlayPlacement
  /* 2 */ val TOP: typingsJapgolly.openseadragon.mod.OverlayPlacement.TOP & Double = js.native
  
  @js.native
  sealed trait TOP_LEFT
    extends StObject
       with OverlayPlacement
  /* 1 */ val TOP_LEFT: typingsJapgolly.openseadragon.mod.OverlayPlacement.TOP_LEFT & Double = js.native
  
  @js.native
  sealed trait TOP_RIGHT
    extends StObject
       with OverlayPlacement
  /* 3 */ val TOP_RIGHT: typingsJapgolly.openseadragon.mod.OverlayPlacement.TOP_RIGHT & Double = js.native
}
