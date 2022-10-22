package typingsJapgolly.musicmatch.mod

import typingsJapgolly.musicmatch.musicmatchStrings.bad_characters
import typingsJapgolly.musicmatch.musicmatchStrings.lines_too_long
import typingsJapgolly.musicmatch.musicmatchStrings.wrong_attribution
import typingsJapgolly.musicmatch.musicmatchStrings.wrong_formatting
import typingsJapgolly.musicmatch.musicmatchStrings.wrong_lyrics
import typingsJapgolly.musicmatch.musicmatchStrings.wrong_verses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackLyricsFeedbackParams extends StObject {
  
  var feedback: js.UndefOr[
    wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
  ] = js.undefined
  
  var lyrics_id: js.UndefOr[Double] = js.undefined
  
  var track_id: js.UndefOr[Double] = js.undefined
}
object TrackLyricsFeedbackParams {
  
  inline def apply(): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
  
  extension [Self <: TrackLyricsFeedbackParams](x: Self) {
    
    inline def setFeedback(
      value: wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
    ): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setLyrics_id(value: Double): Self = StObject.set(x, "lyrics_id", value.asInstanceOf[js.Any])
    
    inline def setLyrics_idUndefined: Self = StObject.set(x, "lyrics_id", js.undefined)
    
    inline def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
    
    inline def setTrack_idUndefined: Self = StObject.set(x, "track_id", js.undefined)
  }
}
