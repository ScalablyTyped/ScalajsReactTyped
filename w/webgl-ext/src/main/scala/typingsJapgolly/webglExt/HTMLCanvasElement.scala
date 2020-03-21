package typingsJapgolly.webglExt

import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.webglExt.webglExtStrings.`experimental-webgl`
import typingsJapgolly.webglExt.webglExtStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends js.Object {
  @JSName("getContext")
  def getContext_experimentalwebgl(contextId: `experimental-webgl`): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
  @JSName("getContext")
  def getContext_experimentalwebgl(contextId: `experimental-webgl`, contextAttributes: WebGLContextAttributes): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, contextAttributes: WebGLContextAttributes): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
}

