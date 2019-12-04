package typingsJapgolly.three

import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsJapgolly.three.srcRenderersWebglWebGLObjectsMod.WebGLObjects
import typingsJapgolly.three.srcRenderersWebglWebGLRenderListsMod.WebGLRenderLists
import typingsJapgolly.three.srcRenderersWebglWebGLStateMod.WebGLState
import typingsJapgolly.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLBackground", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLBackgroundMod extends js.Object {
  @js.native
  class WebGLBackground protected () extends js.Object {
    def this(renderer: WebGLRenderer, state: WebGLState, objects: WebGLObjects, premultipliedAlpha: js.Any) = this()
    def getClearAlpha(): Unit = js.native
    def getClearColor(): Unit = js.native
    def render(renderList: WebGLRenderLists, scene: Scene, camera: js.Any, forceClear: js.Any): Unit = js.native
    def setClearAlpha(alpha: js.Any): Unit = js.native
    def setClearColor(color: Color, alpha: js.Any): Unit = js.native
  }
  
}

