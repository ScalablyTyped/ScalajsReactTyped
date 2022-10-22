package typingsJapgolly.videoJs.mod.videojs

import typingsJapgolly.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChaptersTrackMenuItemOptions
  extends StObject
     with MenuItemOptions {
  
  var cue: TextTrackCue
  
  var track: TextTrack
}
object ChaptersTrackMenuItemOptions {
  
  inline def apply(cue: TextTrackCue, track: TextTrack): ChaptersTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaptersTrackMenuItemOptions]
  }
  
  extension [Self <: ChaptersTrackMenuItemOptions](x: Self) {
    
    inline def setCue(value: TextTrackCue): Self = StObject.set(x, "cue", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
