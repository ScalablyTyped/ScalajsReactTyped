package typingsJapgolly.jsonld.mod

import typingsJapgolly.jsonld.jsonldSpecMod.Context
import typingsJapgolly.jsonld.jsonldSpecMod.Document
import typingsJapgolly.jsonld.jsonldSpecMod.JsonLdObj
import typingsJapgolly.jsonld.mod.Options.Compact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "compact")
@js.native
object compact extends js.Object {
  def apply(input: Document): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, ctx: Context, options: Compact): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, options: Compact, callback: Callback[JsonLdObj]): Unit = js.native
}

