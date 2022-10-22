package typingsJapgolly.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for MediaPlayerRateChanged events. */
trait MediaPlayerRateChangedEventArgs extends StObject {
  
  /** Gets the new playback rate for the media. */
  var newRate: Double
}
object MediaPlayerRateChangedEventArgs {
  
  inline def apply(newRate: Double): MediaPlayerRateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newRate = newRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerRateChangedEventArgs]
  }
  
  extension [Self <: MediaPlayerRateChangedEventArgs](x: Self) {
    
    inline def setNewRate(value: Double): Self = StObject.set(x, "newRate", value.asInstanceOf[js.Any])
  }
}
