package typingsJapgolly.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherLyricsParams extends StObject {
  
  var q_artist: js.UndefOr[String] = js.undefined
  
  var q_track: js.UndefOr[String] = js.undefined
}
object MatcherLyricsParams {
  
  inline def apply(): MatcherLyricsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherLyricsParams]
  }
  
  extension [Self <: MatcherLyricsParams](x: Self) {
    
    inline def setQ_artist(value: String): Self = StObject.set(x, "q_artist", value.asInstanceOf[js.Any])
    
    inline def setQ_artistUndefined: Self = StObject.set(x, "q_artist", js.undefined)
    
    inline def setQ_track(value: String): Self = StObject.set(x, "q_track", value.asInstanceOf[js.Any])
    
    inline def setQ_trackUndefined: Self = StObject.set(x, "q_track", js.undefined)
  }
}
