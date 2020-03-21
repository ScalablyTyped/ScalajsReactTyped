package typingsJapgolly.vueServerRenderer.mod

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def renderToStream(vm: Vue): Readable = js.native
  def renderToStream(vm: Vue, context: js.Object): Readable = js.native
  def renderToString(vm: Vue): js.Promise[String] = js.native
  def renderToString(vm: Vue, callback: RenderCallback): Unit = js.native
  def renderToString(vm: Vue, context: js.Object): js.Promise[String] = js.native
  def renderToString(vm: Vue, context: js.Object, callback: RenderCallback): Unit = js.native
}

