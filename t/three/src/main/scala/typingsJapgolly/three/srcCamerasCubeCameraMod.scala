package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcRenderersWebGLRenderTargetCubeMod.WebGLRenderTargetCube
import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsJapgolly.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/CubeCamera", JSImport.Namespace)
@js.native
object srcCamerasCubeCameraMod extends js.Object {
  @js.native
  class CubeCamera () extends Object3D {
    def this(near: Double) = this()
    def this(near: Double, far: Double) = this()
    def this(near: Double, far: Double, cubeResolution: Double) = this()
    var renderTarget: WebGLRenderTargetCube = js.native
    @JSName("type")
    var type_CubeCamera: typingsJapgolly.three.threeStrings.CubeCamera = js.native
    def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
  }
  
}

