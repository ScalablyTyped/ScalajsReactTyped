package typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLCapabilities", "WebGLCapabilities")
@js.native
class WebGLCapabilities protected () extends js.Object {
  def this(gl: WebGLRenderingContext, extensions: js.Any, parameters: WebGLCapabilitiesParameters) = this()
  var floatFragmentTextures: js.Any = js.native
  var floatVertexTextures: js.Any = js.native
  var logarithmicDepthBuffer: js.Any = js.native
  var maxAttributes: js.Any = js.native
  var maxCubemapSize: js.Any = js.native
  var maxFragmentUniforms: js.Any = js.native
  var maxTextureSize: js.Any = js.native
  var maxTextures: js.Any = js.native
  var maxVaryings: js.Any = js.native
  var maxVertexTextures: js.Any = js.native
  var maxVertexUniforms: js.Any = js.native
  var precision: js.Any = js.native
  var vertexTextures: js.Any = js.native
  def getMaxAnisotropy(): Double = js.native
  def getMaxPrecision(precision: String): String = js.native
}

