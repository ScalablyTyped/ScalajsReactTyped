package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationClip extends StObject {
  
  var duration: Double
  
  var name: String
  
  def optimize(): AnimationClip
  
  def resetDuration(): Unit
  
  var results: js.Array[Any]
  
  var tracks: js.Array[KeyframeTrack]
  
  def trim(): AnimationClip
  
  var uuid: String
}
object AnimationClip {
  
  inline def apply(
    duration: Double,
    name: String,
    optimize: CallbackTo[AnimationClip],
    resetDuration: Callback,
    results: js.Array[Any],
    tracks: js.Array[KeyframeTrack],
    trim: CallbackTo[AnimationClip],
    uuid: String
  ): AnimationClip = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optimize = optimize.toJsFn, resetDuration = resetDuration.toJsFn, results = results.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], trim = trim.toJsFn, uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationClip]
  }
  
  extension [Self <: AnimationClip](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptimize(value: CallbackTo[AnimationClip]): Self = StObject.set(x, "optimize", value.toJsFn)
    
    inline def setResetDuration(value: Callback): Self = StObject.set(x, "resetDuration", value.toJsFn)
    
    inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTracks(value: js.Array[KeyframeTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: KeyframeTrack*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setTrim(value: CallbackTo[AnimationClip]): Self = StObject.set(x, "trim", value.toJsFn)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
