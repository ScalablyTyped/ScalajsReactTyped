package typingsJapgolly.three

import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcRenderersWebGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsJapgolly.three.srcScenesSceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasCubeCameraMod {
  
  @JSImport("three/src/cameras/CubeCamera", "CubeCamera")
  @js.native
  open class CubeCamera protected () extends Object3D[Event] {
    def this(near: Double, far: Double, renderTarget: WebGLCubeRenderTarget) = this()
    
    var renderTarget: WebGLCubeRenderTarget = js.native
    
    @JSName("type")
    var type_CubeCamera: typingsJapgolly.three.threeStrings.CubeCamera = js.native
    
    def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
  }
}
