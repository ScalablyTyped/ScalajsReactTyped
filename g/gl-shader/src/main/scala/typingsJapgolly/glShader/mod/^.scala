package typingsJapgolly.glShader.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glShader.AnonAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-shader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(gl: WebGLRenderingContext, options: AnonAttributes): Shader = js.native
  def apply(gl: WebGLRenderingContext, vertex: String, fragment: String): Shader = js.native
  def apply(gl: WebGLRenderingContext, vertex: String, fragment: String, uniforms: js.Array[Parameter]): Shader = js.native
  def apply(
    gl: WebGLRenderingContext,
    vertex: String,
    fragment: String,
    uniforms: js.Array[Parameter],
    attributes: js.Array[Parameter]
  ): Shader = js.native
}

