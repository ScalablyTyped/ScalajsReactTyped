package typingsJapgolly.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackRateChangeRequested event. */
trait PlaybackRateChangeRequestedEventArgs extends StObject {
  
  /** Gets the requested playback rate. */
  var requestedPlaybackRate: Double
}
object PlaybackRateChangeRequestedEventArgs {
  
  inline def apply(requestedPlaybackRate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackRate = requestedPlaybackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
  
  extension [Self <: PlaybackRateChangeRequestedEventArgs](x: Self) {
    
    inline def setRequestedPlaybackRate(value: Double): Self = StObject.set(x, "requestedPlaybackRate", value.asInstanceOf[js.Any])
  }
}
