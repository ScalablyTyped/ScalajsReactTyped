package typingsJapgolly.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrackType extends StObject
@JSGlobal("chrome.cast.media.TrackType")
@js.native
object TrackType extends StObject {
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with TrackType
  
  @js.native
  sealed trait TEXT
    extends StObject
       with TrackType
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with TrackType
}
