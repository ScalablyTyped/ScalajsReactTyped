package typingsJapgolly.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlAnchor extends StObject
@JSImport("openseadragon", "ControlAnchor")
@js.native
object ControlAnchor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlAnchor & Double] = js.native
  
  @js.native
  sealed trait ABSOLUTE
    extends StObject
       with ControlAnchor
  /* 5 */ val ABSOLUTE: typingsJapgolly.openseadragon.mod.ControlAnchor.ABSOLUTE & Double = js.native
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends StObject
       with ControlAnchor
  /* 3 */ val BOTTOM_LEFT: typingsJapgolly.openseadragon.mod.ControlAnchor.BOTTOM_LEFT & Double = js.native
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends StObject
       with ControlAnchor
  /* 4 */ val BOTTOM_RIGHT: typingsJapgolly.openseadragon.mod.ControlAnchor.BOTTOM_RIGHT & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with ControlAnchor
  /* 0 */ val NONE: typingsJapgolly.openseadragon.mod.ControlAnchor.NONE & Double = js.native
  
  @js.native
  sealed trait TOP_LEFT
    extends StObject
       with ControlAnchor
  /* 1 */ val TOP_LEFT: typingsJapgolly.openseadragon.mod.ControlAnchor.TOP_LEFT & Double = js.native
  
  @js.native
  sealed trait TOP_RIGHT
    extends StObject
       with ControlAnchor
  /* 2 */ val TOP_RIGHT: typingsJapgolly.openseadragon.mod.ControlAnchor.TOP_RIGHT & Double = js.native
}
