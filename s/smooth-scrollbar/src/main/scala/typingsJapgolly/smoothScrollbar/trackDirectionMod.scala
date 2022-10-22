package typingsJapgolly.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackDirectionMod {
  
  @js.native
  sealed trait TrackDirection extends StObject
  @JSImport("smooth-scrollbar/track/direction", "TrackDirection")
  @js.native
  object TrackDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackDirection & String] = js.native
    
    @js.native
    sealed trait X
      extends StObject
         with TrackDirection
    /* "x" */ val X: typingsJapgolly.smoothScrollbar.trackDirectionMod.TrackDirection.X & String = js.native
    
    @js.native
    sealed trait Y
      extends StObject
         with TrackDirection
    /* "y" */ val Y: typingsJapgolly.smoothScrollbar.trackDirectionMod.TrackDirection.Y & String = js.native
  }
}
