package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglContextEventTypeMod {
  
  @JSImport("ol/webgl/ContextEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ContextEventType & String] = js.native
    
    /* "webglcontextlost" */ val LOST: typingsJapgolly.ol.webglContextEventTypeMod.ContextEventType.LOST & String = js.native
    
    /* "webglcontextrestored" */ val RESTORED: typingsJapgolly.ol.webglContextEventTypeMod.ContextEventType.RESTORED & String = js.native
  }
  
  @js.native
  sealed trait ContextEventType extends StObject
  @JSImport("ol/webgl/ContextEventType", "ContextEventType")
  @js.native
  object ContextEventType extends StObject {
    
    @js.native
    sealed trait LOST
      extends StObject
         with ContextEventType
    
    @js.native
    sealed trait RESTORED
      extends StObject
         with ContextEventType
  }
}
