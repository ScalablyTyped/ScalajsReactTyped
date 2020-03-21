package typingsJapgolly.libxslt.mod

import typingsJapgolly.libxmljs.mod.Document
import typingsJapgolly.libxslt.internalTypesMod.ParseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt", "parse")
@js.native
object parse extends js.Object {
  def apply(source: String): Stylesheet = js.native
  def apply(source: String, callback: ParseCallback): Unit = js.native
  def apply(source: Document): Stylesheet = js.native
  def apply(source: Document, callback: ParseCallback): Unit = js.native
}

