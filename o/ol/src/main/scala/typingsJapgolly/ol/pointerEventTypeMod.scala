package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventTypeMod {
  
  @JSImport("ol/pointer/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType & String] = js.native
    
    /* "pointercancel" */ val POINTERCANCEL: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERCANCEL & String = js.native
    
    /* "pointerdown" */ val POINTERDOWN: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERDOWN & String = js.native
    
    /* "pointerenter" */ val POINTERENTER: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERENTER & String = js.native
    
    /* "pointerleave" */ val POINTERLEAVE: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERLEAVE & String = js.native
    
    /* "pointermove" */ val POINTERMOVE: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERMOVE & String = js.native
    
    /* "pointerout" */ val POINTEROUT: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTEROUT & String = js.native
    
    /* "pointerover" */ val POINTEROVER: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTEROVER & String = js.native
    
    /* "pointerup" */ val POINTERUP: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERUP & String = js.native
  }
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("ol/pointer/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @js.native
    sealed trait POINTERCANCEL
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTERDOWN
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTERENTER
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTERLEAVE
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTERMOVE
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTEROUT
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTEROVER
      extends StObject
         with EventType
    
    @js.native
    sealed trait POINTERUP
      extends StObject
         with EventType
  }
}
