package typingsJapgolly.d3.d3Mod

import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "image")
@js.native
object image extends js.Object {
  def apply(url: String): js.Promise[HTMLImageElement] = js.native
  def apply(url: String, init: Partial[HTMLImageElement]): js.Promise[HTMLImageElement] = js.native
}

