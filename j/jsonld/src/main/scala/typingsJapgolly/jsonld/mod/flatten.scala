package typingsJapgolly.jsonld.mod

import typingsJapgolly.jsonld.jsonldSpecMod.Context
import typingsJapgolly.jsonld.jsonldSpecMod.Document
import typingsJapgolly.jsonld.jsonldSpecMod.JsonLdObj
import typingsJapgolly.jsonld.mod.Options.Flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "flatten")
@js.native
object flatten extends js.Object {
  def apply(input: Document): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Null, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, ctx: Null, options: Flatten, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, ctx: Context): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, ctx: Context, options: Flatten): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, options: Flatten, callback: Callback[JsonLdObj]): Unit = js.native
}

