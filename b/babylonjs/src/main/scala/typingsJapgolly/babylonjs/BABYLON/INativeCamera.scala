package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MediaTrackConstraints
import typingsJapgolly.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INativeCamera extends StObject {
  
  def createVideo(constraints: MediaTrackConstraints): Any
  
  def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit
}
object INativeCamera {
  
  inline def apply(
    createVideo: MediaTrackConstraints => Any,
    updateVideoTexture: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Callback
  ): INativeCamera = {
    val __obj = js.Dynamic.literal(createVideo = js.Any.fromFunction1(createVideo), updateVideoTexture = js.Any.fromFunction3((t0: Nullable[InternalTexture], t1: HTMLVideoElement, t2: Boolean) => (updateVideoTexture(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[INativeCamera]
  }
  
  extension [Self <: INativeCamera](x: Self) {
    
    inline def setCreateVideo(value: MediaTrackConstraints => Any): Self = StObject.set(x, "createVideo", js.Any.fromFunction1(value))
    
    inline def setUpdateVideoTexture(value: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Callback): Self = StObject.set(x, "updateVideoTexture", js.Any.fromFunction3((t0: Nullable[InternalTexture], t1: HTMLVideoElement, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
