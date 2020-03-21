package typingsJapgolly.webgl2

import org.scalajs.dom.raw.WebGLContextAttributes
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.webgl2.webgl2Strings.`experimental-webgl2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends HTMLElement {
  @JSName("getContext")
  def getContext_experimentalwebgl2(contextId: `experimental-webgl2`): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_experimentalwebgl2(contextId: `experimental-webgl2`, contextAttributes: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: typingsJapgolly.webgl2.webgl2Strings.webgl2): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: typingsJapgolly.webgl2.webgl2Strings.webgl2, contextAttributes: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
}

