package typingsJapgolly.phaser.spine.webgl

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.phaser.spine.Restorable
import typingsJapgolly.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.ManagedWebGLRenderingContext")
@js.native
class ManagedWebGLRenderingContext protected () extends js.Object {
  def this(canvasOrContext: HTMLCanvasElement) = this()
  def this(canvasOrContext: WebGLRenderingContext) = this()
  def this(canvasOrContext: HTMLCanvasElement, contextConfig: js.Any) = this()
  def this(canvasOrContext: WebGLRenderingContext, contextConfig: js.Any) = this()
  var canvas: HTMLCanvasElement | OffscreenCanvas = js.native
  var gl: WebGLRenderingContext = js.native
  var restorables: js.Any = js.native
  def addRestorable(restorable: Restorable): Unit = js.native
  def removeRestorable(restorable: Restorable): Unit = js.native
}

