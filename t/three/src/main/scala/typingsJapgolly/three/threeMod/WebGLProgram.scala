package typingsJapgolly.three.threeMod

import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typingsJapgolly.three.srcRenderersWebglWebGLProgramMod.WebGLProgram {
  def this(
    renderer: typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer,
    extensions: typingsJapgolly.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typingsJapgolly.three.srcMaterialsShaderMaterialMod.ShaderMaterial,
    shader: typingsJapgolly.three.srcRenderersWebglWebGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

