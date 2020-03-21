package typingsJapgolly.three.webGLRenderStatesMod

import typingsJapgolly.three.cameraMod.Camera
import typingsJapgolly.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderStates", "WebGLRenderStates")
@js.native
class WebGLRenderStates () extends js.Object {
  def dispose(): Unit = js.native
  def get(scene: Scene, camera: Camera): WebGLRenderState = js.native
}

