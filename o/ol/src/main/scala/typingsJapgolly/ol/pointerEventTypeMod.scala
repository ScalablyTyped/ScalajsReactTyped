package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/EventType", JSImport.Namespace)
@js.native
object pointerEventTypeMod extends js.Object {
  @js.native
  sealed trait EventType extends js.Object
  
  @js.native
  object EventType extends js.Object {
    @js.native
    sealed trait POINTERCANCEL extends EventType
    
    @js.native
    sealed trait POINTERDOWN extends EventType
    
    @js.native
    sealed trait POINTERENTER extends EventType
    
    @js.native
    sealed trait POINTERLEAVE extends EventType
    
    @js.native
    sealed trait POINTERMOVE extends EventType
    
    @js.native
    sealed trait POINTEROUT extends EventType
    
    @js.native
    sealed trait POINTEROVER extends EventType
    
    @js.native
    sealed trait POINTERUP extends EventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "pointercancel" */ val POINTERCANCEL: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERCANCEL with String = js.native
    /* "pointerdown" */ val POINTERDOWN: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERDOWN with String = js.native
    /* "pointerenter" */ val POINTERENTER: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERENTER with String = js.native
    /* "pointerleave" */ val POINTERLEAVE: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERLEAVE with String = js.native
    /* "pointermove" */ val POINTERMOVE: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERMOVE with String = js.native
    /* "pointerout" */ val POINTEROUT: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTEROUT with String = js.native
    /* "pointerover" */ val POINTEROVER: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTEROVER with String = js.native
    /* "pointerup" */ val POINTERUP: typingsJapgolly.ol.pointerEventTypeMod.EventType.POINTERUP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
  }
  
}

