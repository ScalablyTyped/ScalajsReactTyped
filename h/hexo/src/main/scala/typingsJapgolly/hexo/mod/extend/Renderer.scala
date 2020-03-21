package typingsJapgolly.hexo.mod.extend

import typingsJapgolly.hexo.hexoBooleans.`false`
import typingsJapgolly.hexo.hexoBooleans.`true`
import typingsJapgolly.hexo.mod.HexoRendererData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def register(
    srcExt: String,
    outExt: String,
    fn: js.Function2[/* data */ HexoRendererData, /* options */ js.Any, js.Promise[String]]
  ): Unit = js.native
  @JSName("register")
  def register_false(
    srcExt: String,
    outExt: String,
    fn: js.Function2[/* data */ HexoRendererData, /* options */ js.Any, js.Promise[String]],
    sync: `false`
  ): Unit = js.native
  @JSName("register")
  def register_true(
    srcExt: String,
    outExt: String,
    fn: js.Function2[/* data */ HexoRendererData, /* options */ js.Any, String],
    sync: `true`
  ): Unit = js.native
}

