package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderEventTypeMod {
  
  @JSImport("ol/render/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType & String] = js.native
    
    /* "postcompose" */ val POSTCOMPOSE: typingsJapgolly.ol.renderEventTypeMod.EventType.POSTCOMPOSE & String = js.native
    
    /* "postrender" */ val POSTRENDER: typingsJapgolly.ol.renderEventTypeMod.EventType.POSTRENDER & String = js.native
    
    /* "precompose" */ val PRECOMPOSE: typingsJapgolly.ol.renderEventTypeMod.EventType.PRECOMPOSE & String = js.native
    
    /* "prerender" */ val PRERENDER: typingsJapgolly.ol.renderEventTypeMod.EventType.PRERENDER & String = js.native
    
    /* "rendercomplete" */ val RENDERCOMPLETE: typingsJapgolly.ol.renderEventTypeMod.EventType.RENDERCOMPLETE & String = js.native
  }
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("ol/render/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @js.native
    sealed trait POSTCOMPOSE
      extends StObject
         with EventType
    
    @js.native
    sealed trait POSTRENDER
      extends StObject
         with EventType
    
    @js.native
    sealed trait PRECOMPOSE
      extends StObject
         with EventType
    
    @js.native
    sealed trait PRERENDER
      extends StObject
         with EventType
    
    @js.native
    sealed trait RENDERCOMPLETE
      extends StObject
         with EventType
  }
}
