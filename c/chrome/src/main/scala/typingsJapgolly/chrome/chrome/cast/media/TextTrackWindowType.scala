package typingsJapgolly.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackWindowType extends StObject
@JSGlobal("chrome.cast.media.TextTrackWindowType")
@js.native
object TextTrackWindowType extends StObject {
  
  @js.native
  sealed trait NONE
    extends StObject
       with TextTrackWindowType
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with TextTrackWindowType
  
  @js.native
  sealed trait ROUNDED_CORNERS
    extends StObject
       with TextTrackWindowType
}
