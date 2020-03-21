package typingsJapgolly.vueServerRenderer.mod

import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleRenderer extends js.Object {
  def renderToStream(): Readable = js.native
  def renderToStream(context: js.Object): Readable = js.native
  def renderToString(): js.Promise[String] = js.native
  def renderToString(callback: RenderCallback): Unit = js.native
  def renderToString(context: js.Object): js.Promise[String] = js.native
  def renderToString(context: js.Object, callback: RenderCallback): Unit = js.native
}

