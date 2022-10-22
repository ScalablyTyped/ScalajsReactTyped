package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneRecorder extends StObject {
  
  /* private */ var _compareArray: Any
  
  /* private */ var _compareCollections: Any
  
  /* private */ var _compareObjects: Any
  
  /* private */ var _savedJSON: Any
  
  /* private */ var _trackedScene: Any
  
  /**
    * Get the delta between current state and original state
    * @returns a any containing the delta
    */
  def getDelta(): Any
  
  /**
    * Track a given scene. This means the current scene state will be considered the original state
    * @param scene defines the scene to track
    */
  def track(scene: Scene): Unit
}
object SceneRecorder {
  
  inline def apply(
    _compareArray: Any,
    _compareCollections: Any,
    _compareObjects: Any,
    _savedJSON: Any,
    _trackedScene: Any,
    getDelta: CallbackTo[Any],
    track: Scene => Callback
  ): SceneRecorder = {
    val __obj = js.Dynamic.literal(_compareArray = _compareArray.asInstanceOf[js.Any], _compareCollections = _compareCollections.asInstanceOf[js.Any], _compareObjects = _compareObjects.asInstanceOf[js.Any], _savedJSON = _savedJSON.asInstanceOf[js.Any], _trackedScene = _trackedScene.asInstanceOf[js.Any], getDelta = getDelta.toJsFn, track = js.Any.fromFunction1((t0: Scene) => track(t0).runNow()))
    __obj.asInstanceOf[SceneRecorder]
  }
  
  extension [Self <: SceneRecorder](x: Self) {
    
    inline def setGetDelta(value: CallbackTo[Any]): Self = StObject.set(x, "getDelta", value.toJsFn)
    
    inline def setTrack(value: Scene => Callback): Self = StObject.set(x, "track", js.Any.fromFunction1((t0: Scene) => value(t0).runNow()))
    
    inline def set_compareArray(value: Any): Self = StObject.set(x, "_compareArray", value.asInstanceOf[js.Any])
    
    inline def set_compareCollections(value: Any): Self = StObject.set(x, "_compareCollections", value.asInstanceOf[js.Any])
    
    inline def set_compareObjects(value: Any): Self = StObject.set(x, "_compareObjects", value.asInstanceOf[js.Any])
    
    inline def set_savedJSON(value: Any): Self = StObject.set(x, "_savedJSON", value.asInstanceOf[js.Any])
    
    inline def set_trackedScene(value: Any): Self = StObject.set(x, "_trackedScene", value.asInstanceOf[js.Any])
  }
}
