package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEventType", JSImport.Namespace)
@js.native
object mapBrowserEventTypeMod extends js.Object {
  @js.native
  sealed trait MapBrowserEventType extends js.Object
  
  @js.native
  object MapBrowserEventType extends js.Object {
    @js.native
    sealed trait CLICK extends MapBrowserEventType
    
    @js.native
    sealed trait DBLCLICK extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERCANCEL extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERDOWN extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERDRAG extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERENTER extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERLEAVE extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERMOVE extends MapBrowserEventType
    
    @js.native
    sealed trait POINTEROUT extends MapBrowserEventType
    
    @js.native
    sealed trait POINTEROVER extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERUP extends MapBrowserEventType
    
    @js.native
    sealed trait SINGLECLICK extends MapBrowserEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "click" */ val CLICK: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.CLICK with String = js.native
    /* "dblclick" */ val DBLCLICK: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.DBLCLICK with String = js.native
    /* "pointercancel" */ val POINTERCANCEL: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERCANCEL with String = js.native
    /* "pointerdown" */ val POINTERDOWN: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERDOWN with String = js.native
    /* "pointerdrag" */ val POINTERDRAG: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERDRAG with String = js.native
    /* "pointerenter" */ val POINTERENTER: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERENTER with String = js.native
    /* "pointerleave" */ val POINTERLEAVE: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERLEAVE with String = js.native
    /* "pointermove" */ val POINTERMOVE: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERMOVE with String = js.native
    /* "pointerout" */ val POINTEROUT: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTEROUT with String = js.native
    /* "pointerover" */ val POINTEROVER: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTEROVER with String = js.native
    /* "pointerup" */ val POINTERUP: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERUP with String = js.native
    /* "singleclick" */ val SINGLECLICK: typingsJapgolly.ol.mapBrowserEventTypeMod.MapBrowserEventType.SINGLECLICK with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapBrowserEventType with String] = js.native
  }
  
}

