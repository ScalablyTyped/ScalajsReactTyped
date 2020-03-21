package typingsJapgolly.three

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLIndexedBufferRenderer", JSImport.Namespace)
@js.native
object webGLIndexedBufferRendererMod extends js.Object {
  @js.native
  class WebGLIndexedBufferRenderer protected () extends js.Object {
    def this(gl: WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
    def render(start: js.Any, count: Double): Unit = js.native
    def renderInstances(geometry: js.Any, start: js.Any, count: Double): Unit = js.native
    def setIndex(index: js.Any): Unit = js.native
    def setMode(value: js.Any): Unit = js.native
  }
  
}

