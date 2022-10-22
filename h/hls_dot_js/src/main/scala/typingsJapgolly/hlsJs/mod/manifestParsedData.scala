package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestParsedData extends StObject {
  
  var altAudio: Boolean
  
  var audio: Boolean
  
  var audioTracks: js.Array[MediaPlaylist]
  
  var firstLevel: Double
  
  var levels: js.Array[Level]
  
  var stats: LoaderStats
  
  var subtitleTracks: js.Array[MediaPlaylist]
  
  var video: Boolean
}
object ManifestParsedData {
  
  inline def apply(
    altAudio: Boolean,
    audio: Boolean,
    audioTracks: js.Array[MediaPlaylist],
    firstLevel: Double,
    levels: js.Array[Level],
    stats: LoaderStats,
    subtitleTracks: js.Array[MediaPlaylist],
    video: Boolean
  ): ManifestParsedData = {
    val __obj = js.Dynamic.literal(altAudio = altAudio.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], audioTracks = audioTracks.asInstanceOf[js.Any], firstLevel = firstLevel.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subtitleTracks = subtitleTracks.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestParsedData]
  }
  
  extension [Self <: ManifestParsedData](x: Self) {
    
    inline def setAltAudio(value: Boolean): Self = StObject.set(x, "altAudio", value.asInstanceOf[js.Any])
    
    inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioTracks(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksVarargs(value: MediaPlaylist*): Self = StObject.set(x, "audioTracks", js.Array(value*))
    
    inline def setFirstLevel(value: Double): Self = StObject.set(x, "firstLevel", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTracks(value: js.Array[MediaPlaylist]): Self = StObject.set(x, "subtitleTracks", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTracksVarargs(value: MediaPlaylist*): Self = StObject.set(x, "subtitleTracks", js.Array(value*))
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
