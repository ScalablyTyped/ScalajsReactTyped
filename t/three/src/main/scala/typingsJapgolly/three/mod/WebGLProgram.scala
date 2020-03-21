package typingsJapgolly.three.mod

import typingsJapgolly.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typingsJapgolly.three.webGLProgramMod.WebGLProgram {
  def this(
    renderer: typingsJapgolly.three.webGLRendererMod.WebGLRenderer,
    extensions: typingsJapgolly.three.webGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typingsJapgolly.three.shaderMaterialMod.ShaderMaterial,
    shader: typingsJapgolly.three.webGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

