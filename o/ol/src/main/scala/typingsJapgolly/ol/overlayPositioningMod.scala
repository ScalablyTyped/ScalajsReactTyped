package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/OverlayPositioning", JSImport.Namespace)
@js.native
object overlayPositioningMod extends js.Object {
  @js.native
  sealed trait OverlayPositioning extends js.Object
  
  @js.native
  object OverlayPositioning extends js.Object {
    @js.native
    sealed trait BOTTOM_CENTER extends OverlayPositioning
    
    @js.native
    sealed trait BOTTOM_LEFT extends OverlayPositioning
    
    @js.native
    sealed trait BOTTOM_RIGHT extends OverlayPositioning
    
    @js.native
    sealed trait CENTER_CENTER extends OverlayPositioning
    
    @js.native
    sealed trait CENTER_LEFT extends OverlayPositioning
    
    @js.native
    sealed trait CENTER_RIGHT extends OverlayPositioning
    
    @js.native
    sealed trait TOP_CENTER extends OverlayPositioning
    
    @js.native
    sealed trait TOP_LEFT extends OverlayPositioning
    
    @js.native
    sealed trait TOP_RIGHT extends OverlayPositioning
    
  }
  
  @js.native
  object default extends js.Object {
    /* "bottom-center" */ val BOTTOM_CENTER: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_CENTER with String = js.native
    /* "bottom-left" */ val BOTTOM_LEFT: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_LEFT with String = js.native
    /* "bottom-right" */ val BOTTOM_RIGHT: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_RIGHT with String = js.native
    /* "center-center" */ val CENTER_CENTER: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.CENTER_CENTER with String = js.native
    /* "center-left" */ val CENTER_LEFT: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.CENTER_LEFT with String = js.native
    /* "center-right" */ val CENTER_RIGHT: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.CENTER_RIGHT with String = js.native
    /* "top-center" */ val TOP_CENTER: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.TOP_CENTER with String = js.native
    /* "top-left" */ val TOP_LEFT: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.TOP_LEFT with String = js.native
    /* "top-right" */ val TOP_RIGHT: typingsJapgolly.ol.overlayPositioningMod.OverlayPositioning.TOP_RIGHT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OverlayPositioning with String] = js.native
  }
  
}

