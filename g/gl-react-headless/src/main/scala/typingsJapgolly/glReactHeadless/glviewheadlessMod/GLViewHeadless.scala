package typingsJapgolly.glReactHeadless.glviewheadlessMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react-headless/GLViewHeadless", "GLViewHeadless")
@js.native
class GLViewHeadless ()
  extends Component[GLViewHeadlessProps, js.Object, js.Any] {
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  var gl: js.UndefOr[WebGLRenderingContext] = js.native
  var webglContextAttributes: WebGLContextAttributes = js.native
  def captureAsBlob(): js.Promise[Blob] = js.native
  def captureAsDataURL(): String = js.native
  def onRef(ref: HTMLCanvasElement): Unit = js.native
  def simulateContextLost(): Unit = js.native
  def simulateContextRestored(): Unit = js.native
}

