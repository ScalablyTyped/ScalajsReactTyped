package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsEventTypeMod {
  
  @JSImport("ol/events/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType & String] = js.native
    
    /* "blur" */ val BLUR: typingsJapgolly.ol.eventsEventTypeMod.EventType.BLUR & String = js.native
    
    /* "change" */ val CHANGE: typingsJapgolly.ol.eventsEventTypeMod.EventType.CHANGE & String = js.native
    
    /* "clear" */ val CLEAR: typingsJapgolly.ol.eventsEventTypeMod.EventType.CLEAR & String = js.native
    
    /* "click" */ val CLICK: typingsJapgolly.ol.eventsEventTypeMod.EventType.CLICK & String = js.native
    
    /* "contextmenu" */ val CONTEXTMENU: typingsJapgolly.ol.eventsEventTypeMod.EventType.CONTEXTMENU & String = js.native
    
    /* "dblclick" */ val DBLCLICK: typingsJapgolly.ol.eventsEventTypeMod.EventType.DBLCLICK & String = js.native
    
    /* "dragenter" */ val DRAGENTER: typingsJapgolly.ol.eventsEventTypeMod.EventType.DRAGENTER & String = js.native
    
    /* "dragover" */ val DRAGOVER: typingsJapgolly.ol.eventsEventTypeMod.EventType.DRAGOVER & String = js.native
    
    /* "drop" */ val DROP: typingsJapgolly.ol.eventsEventTypeMod.EventType.DROP & String = js.native
    
    /* "error" */ val ERROR: typingsJapgolly.ol.eventsEventTypeMod.EventType.ERROR & String = js.native
    
    /* "focus" */ val FOCUS: typingsJapgolly.ol.eventsEventTypeMod.EventType.FOCUS & String = js.native
    
    /* "keydown" */ val KEYDOWN: typingsJapgolly.ol.eventsEventTypeMod.EventType.KEYDOWN & String = js.native
    
    /* "keypress" */ val KEYPRESS: typingsJapgolly.ol.eventsEventTypeMod.EventType.KEYPRESS & String = js.native
    
    /* "load" */ val LOAD: typingsJapgolly.ol.eventsEventTypeMod.EventType.LOAD & String = js.native
    
    /* "resize" */ val RESIZE: typingsJapgolly.ol.eventsEventTypeMod.EventType.RESIZE & String = js.native
    
    /* "touchmove" */ val TOUCHMOVE: typingsJapgolly.ol.eventsEventTypeMod.EventType.TOUCHMOVE & String = js.native
    
    /* "wheel" */ val WHEEL: typingsJapgolly.ol.eventsEventTypeMod.EventType.WHEEL & String = js.native
  }
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("ol/events/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @js.native
    sealed trait BLUR
      extends StObject
         with EventType
    
    @js.native
    sealed trait CHANGE
      extends StObject
         with EventType
    
    @js.native
    sealed trait CLEAR
      extends StObject
         with EventType
    
    @js.native
    sealed trait CLICK
      extends StObject
         with EventType
    
    @js.native
    sealed trait CONTEXTMENU
      extends StObject
         with EventType
    
    @js.native
    sealed trait DBLCLICK
      extends StObject
         with EventType
    
    @js.native
    sealed trait DRAGENTER
      extends StObject
         with EventType
    
    @js.native
    sealed trait DRAGOVER
      extends StObject
         with EventType
    
    @js.native
    sealed trait DROP
      extends StObject
         with EventType
    
    @js.native
    sealed trait ERROR
      extends StObject
         with EventType
    
    @js.native
    sealed trait FOCUS
      extends StObject
         with EventType
    
    @js.native
    sealed trait KEYDOWN
      extends StObject
         with EventType
    
    @js.native
    sealed trait KEYPRESS
      extends StObject
         with EventType
    
    @js.native
    sealed trait LOAD
      extends StObject
         with EventType
    
    @js.native
    sealed trait RESIZE
      extends StObject
         with EventType
    
    @js.native
    sealed trait TOUCHMOVE
      extends StObject
         with EventType
    
    @js.native
    sealed trait WHEEL
      extends StObject
         with EventType
  }
}
