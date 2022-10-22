package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Lens scene. Accessible through global.scene. */
trait ScriptScene
  extends StObject
     with ScriptObject {
  
  /** Creates a new Render Target texture with a RenderTargetProvider as its control property. */
  def createRenderTargetTexture(): Texture
  
  /** Adds a new SceneObject named name to the scene. */
  def createSceneObject(name: String): SceneObject
  
  /**
    * Returns a string describing the currently active device camera. Returns “back” if the rear-facing ( World: aka) camera is active. Returns “front” if the front-facing ( Selfie: aka) camera is
    * active. Otherwise, the camera is not initialized.
    */
  def getCameraType(): String
  
  /** Returns the root SceneObject at index index in the current scene. */
  def getRootObject(index: Double): SceneObject
  
  /** Returns the number of SceneObjects in the current scene. */
  def getRootObjectsCount(): Double
  
  /** Returns whether or not the scene is currently being recorded. */
  def isRecording(): Boolean
}
object ScriptScene {
  
  inline def apply(
    createRenderTargetTexture: CallbackTo[Texture],
    createSceneObject: String => SceneObject,
    getCameraType: CallbackTo[String],
    getRootObject: Double => SceneObject,
    getRootObjectsCount: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    isRecording: CallbackTo[Boolean]
  ): ScriptScene = {
    val __obj = js.Dynamic.literal(createRenderTargetTexture = createRenderTargetTexture.toJsFn, createSceneObject = js.Any.fromFunction1(createSceneObject), getCameraType = getCameraType.toJsFn, getRootObject = js.Any.fromFunction1(getRootObject), getRootObjectsCount = getRootObjectsCount.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), isRecording = isRecording.toJsFn)
    __obj.asInstanceOf[ScriptScene]
  }
  
  extension [Self <: ScriptScene](x: Self) {
    
    inline def setCreateRenderTargetTexture(value: CallbackTo[Texture]): Self = StObject.set(x, "createRenderTargetTexture", value.toJsFn)
    
    inline def setCreateSceneObject(value: String => SceneObject): Self = StObject.set(x, "createSceneObject", js.Any.fromFunction1(value))
    
    inline def setGetCameraType(value: CallbackTo[String]): Self = StObject.set(x, "getCameraType", value.toJsFn)
    
    inline def setGetRootObject(value: Double => SceneObject): Self = StObject.set(x, "getRootObject", js.Any.fromFunction1(value))
    
    inline def setGetRootObjectsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getRootObjectsCount", value.toJsFn)
    
    inline def setIsRecording(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRecording", value.toJsFn)
  }
}
