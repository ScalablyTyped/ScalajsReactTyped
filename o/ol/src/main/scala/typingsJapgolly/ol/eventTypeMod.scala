package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/EventType", JSImport.Namespace)
@js.native
object eventTypeMod extends js.Object {
  @js.native
  sealed trait EventType extends js.Object
  
  @js.native
  object EventType extends js.Object {
    @js.native
    sealed trait BLUR extends EventType
    
    @js.native
    sealed trait CHANGE extends EventType
    
    @js.native
    sealed trait CLEAR extends EventType
    
    @js.native
    sealed trait CLICK extends EventType
    
    @js.native
    sealed trait CONTEXTMENU extends EventType
    
    @js.native
    sealed trait DBLCLICK extends EventType
    
    @js.native
    sealed trait DRAGENTER extends EventType
    
    @js.native
    sealed trait DRAGOVER extends EventType
    
    @js.native
    sealed trait DROP extends EventType
    
    @js.native
    sealed trait ERROR extends EventType
    
    @js.native
    sealed trait FOCUS extends EventType
    
    @js.native
    sealed trait KEYDOWN extends EventType
    
    @js.native
    sealed trait KEYPRESS extends EventType
    
    @js.native
    sealed trait LOAD extends EventType
    
    @js.native
    sealed trait RESIZE extends EventType
    
    @js.native
    sealed trait WHEEL extends EventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "blur" */ val BLUR: typingsJapgolly.ol.eventTypeMod.EventType.BLUR with String = js.native
    /* "change" */ val CHANGE: typingsJapgolly.ol.eventTypeMod.EventType.CHANGE with String = js.native
    /* "clear" */ val CLEAR: typingsJapgolly.ol.eventTypeMod.EventType.CLEAR with String = js.native
    /* "click" */ val CLICK: typingsJapgolly.ol.eventTypeMod.EventType.CLICK with String = js.native
    /* "contextmenu" */ val CONTEXTMENU: typingsJapgolly.ol.eventTypeMod.EventType.CONTEXTMENU with String = js.native
    /* "dblclick" */ val DBLCLICK: typingsJapgolly.ol.eventTypeMod.EventType.DBLCLICK with String = js.native
    /* "dragenter" */ val DRAGENTER: typingsJapgolly.ol.eventTypeMod.EventType.DRAGENTER with String = js.native
    /* "dragover" */ val DRAGOVER: typingsJapgolly.ol.eventTypeMod.EventType.DRAGOVER with String = js.native
    /* "drop" */ val DROP: typingsJapgolly.ol.eventTypeMod.EventType.DROP with String = js.native
    /* "error" */ val ERROR: typingsJapgolly.ol.eventTypeMod.EventType.ERROR with String = js.native
    /* "focus" */ val FOCUS: typingsJapgolly.ol.eventTypeMod.EventType.FOCUS with String = js.native
    /* "keydown" */ val KEYDOWN: typingsJapgolly.ol.eventTypeMod.EventType.KEYDOWN with String = js.native
    /* "keypress" */ val KEYPRESS: typingsJapgolly.ol.eventTypeMod.EventType.KEYPRESS with String = js.native
    /* "load" */ val LOAD: typingsJapgolly.ol.eventTypeMod.EventType.LOAD with String = js.native
    /* "resize" */ val RESIZE: typingsJapgolly.ol.eventTypeMod.EventType.RESIZE with String = js.native
    /* "wheel" */ val WHEEL: typingsJapgolly.ol.eventTypeMod.EventType.WHEEL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
  }
  
}

