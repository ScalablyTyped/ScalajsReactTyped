package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jukebox extends StObject {
  
  def musicScrub(time: Double): Unit
  
  var onSound: Double
  
  var onTrack: Double
  
  def pressLoopMusic(): Unit
  
  def pressMusicAuto(): Unit
  
  def pressMusicShuffle(): Unit
  
  def pressPlayMusic(): Unit
  
  def reset(): Unit
  
  def setSound(id: Double): Unit
  
  def setTrack(id: Double, dontPlay: Boolean): Unit
  
  var sounds: js.Array[String]
  
  var trackAuto: Boolean
  
  var trackLooped: Boolean
  
  var trackShuffle: Boolean
  
  var tracks: js.Array[Any]
  
  def updateMusicCurrentTime(noLoop: Boolean): Unit
}
object Jukebox {
  
  inline def apply(
    musicScrub: Double => Callback,
    onSound: Double,
    onTrack: Double,
    pressLoopMusic: Callback,
    pressMusicAuto: Callback,
    pressMusicShuffle: Callback,
    pressPlayMusic: Callback,
    reset: Callback,
    setSound: Double => Callback,
    setTrack: (Double, Boolean) => Callback,
    sounds: js.Array[String],
    trackAuto: Boolean,
    trackLooped: Boolean,
    trackShuffle: Boolean,
    tracks: js.Array[Any],
    updateMusicCurrentTime: Boolean => Callback
  ): Jukebox = {
    val __obj = js.Dynamic.literal(musicScrub = js.Any.fromFunction1((t0: Double) => musicScrub(t0).runNow()), onSound = onSound.asInstanceOf[js.Any], onTrack = onTrack.asInstanceOf[js.Any], pressLoopMusic = pressLoopMusic.toJsFn, pressMusicAuto = pressMusicAuto.toJsFn, pressMusicShuffle = pressMusicShuffle.toJsFn, pressPlayMusic = pressPlayMusic.toJsFn, reset = reset.toJsFn, setSound = js.Any.fromFunction1((t0: Double) => setSound(t0).runNow()), setTrack = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setTrack(t0, t1)).runNow()), sounds = sounds.asInstanceOf[js.Any], trackAuto = trackAuto.asInstanceOf[js.Any], trackLooped = trackLooped.asInstanceOf[js.Any], trackShuffle = trackShuffle.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], updateMusicCurrentTime = js.Any.fromFunction1((t0: Boolean) => updateMusicCurrentTime(t0).runNow()))
    __obj.asInstanceOf[Jukebox]
  }
  
  extension [Self <: Jukebox](x: Self) {
    
    inline def setMusicScrub(value: Double => Callback): Self = StObject.set(x, "musicScrub", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOnSound(value: Double): Self = StObject.set(x, "onSound", value.asInstanceOf[js.Any])
    
    inline def setOnTrack(value: Double): Self = StObject.set(x, "onTrack", value.asInstanceOf[js.Any])
    
    inline def setPressLoopMusic(value: Callback): Self = StObject.set(x, "pressLoopMusic", value.toJsFn)
    
    inline def setPressMusicAuto(value: Callback): Self = StObject.set(x, "pressMusicAuto", value.toJsFn)
    
    inline def setPressMusicShuffle(value: Callback): Self = StObject.set(x, "pressMusicShuffle", value.toJsFn)
    
    inline def setPressPlayMusic(value: Callback): Self = StObject.set(x, "pressPlayMusic", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetSound(value: Double => Callback): Self = StObject.set(x, "setSound", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTrack(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setTrack", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSounds(value: js.Array[String]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
    
    inline def setSoundsVarargs(value: String*): Self = StObject.set(x, "sounds", js.Array(value*))
    
    inline def setTrackAuto(value: Boolean): Self = StObject.set(x, "trackAuto", value.asInstanceOf[js.Any])
    
    inline def setTrackLooped(value: Boolean): Self = StObject.set(x, "trackLooped", value.asInstanceOf[js.Any])
    
    inline def setTrackShuffle(value: Boolean): Self = StObject.set(x, "trackShuffle", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[Any]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: Any*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setUpdateMusicCurrentTime(value: Boolean => Callback): Self = StObject.set(x, "updateMusicCurrentTime", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
