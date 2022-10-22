package typingsJapgolly.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayRotationMode extends StObject
@JSImport("openseadragon", "OverlayRotationMode")
@js.native
object OverlayRotationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayRotationMode & Double] = js.native
  
  @js.native
  sealed trait BOUNDING_BOX
    extends StObject
       with OverlayRotationMode
  /* 2 */ val BOUNDING_BOX: typingsJapgolly.openseadragon.mod.OverlayRotationMode.BOUNDING_BOX & Double = js.native
  
  @js.native
  sealed trait EXACT
    extends StObject
       with OverlayRotationMode
  /* 1 */ val EXACT: typingsJapgolly.openseadragon.mod.OverlayRotationMode.EXACT & Double = js.native
  
  @js.native
  sealed trait NO_ROTATION
    extends StObject
       with OverlayRotationMode
  /* 0 */ val NO_ROTATION: typingsJapgolly.openseadragon.mod.OverlayRotationMode.NO_ROTATION & Double = js.native
}
