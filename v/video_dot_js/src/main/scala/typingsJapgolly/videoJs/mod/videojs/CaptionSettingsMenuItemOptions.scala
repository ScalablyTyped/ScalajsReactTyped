package typingsJapgolly.videoJs.mod.videojs

import typingsJapgolly.videoJs.mod.videojs.TextTrack.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSettingsMenuItemOptions
  extends StObject
     with TextTrackMenuItemOptions {
  
  var kind: Kind
}
object CaptionSettingsMenuItemOptions {
  
  inline def apply(kind: Kind, track: TextTrack): CaptionSettingsMenuItemOptions = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsMenuItemOptions]
  }
  
  extension [Self <: CaptionSettingsMenuItemOptions](x: Self) {
    
    inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
