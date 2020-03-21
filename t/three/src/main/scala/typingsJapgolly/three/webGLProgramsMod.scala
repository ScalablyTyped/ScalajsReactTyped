package typingsJapgolly.three

import typingsJapgolly.three.shaderMaterialMod.ShaderMaterial
import typingsJapgolly.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.webGLExtensionsMod.WebGLExtensions
import typingsJapgolly.three.webGLProgramMod.WebGLProgram
import typingsJapgolly.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLPrograms", JSImport.Namespace)
@js.native
object webGLProgramsMod extends js.Object {
  @js.native
  class WebGLPrograms protected () extends js.Object {
    def this(renderer: WebGLRenderer, extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    var programs: js.Array[WebGLProgram] = js.native
    def acquireProgram(material: ShaderMaterial, parameters: js.Any, code: String): WebGLProgram = js.native
    def getParameters(material: ShaderMaterial, lights: js.Any, fog: js.Any, nClipPlanes: Double, `object`: js.Any): js.Any = js.native
    def getProgramCode(material: ShaderMaterial, parameters: js.Any): String = js.native
    def releaseProgram(program: WebGLProgram): Unit = js.native
  }
  
}

