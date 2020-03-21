package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.colorMod.Color
import typingsJapgolly.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/renderer/WebGLRenderer", JSImport.Namespace)
@js.native
object webGLRendererMod extends js.Object {
  @js.native
  class WebGLRenderer () extends Renderer {
    def setClearColor(color: Color): Unit = js.native
  }
  
  /* static members */
  @js.native
  object WebGLRenderer extends js.Object {
    def create(): WebGLRenderer = js.native
  }
  
}

