package typingsJapgolly.d3.d3Mod

import org.scalajs.dom.raw.Document
import typingsJapgolly.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "html")
@js.native
object html extends js.Object {
  def apply(url: String): js.Promise[Document] = js.native
  def apply(url: String, init: RequestInit): js.Promise[Document] = js.native
}

