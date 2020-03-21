package typingsJapgolly.jsonld.mod

import typingsJapgolly.jsonld.jsonldSpecMod.Document
import typingsJapgolly.jsonld.jsonldSpecMod.JsonLdArray
import typingsJapgolly.jsonld.mod.Options.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "expand")
@js.native
object expand extends js.Object {
  def apply(input: Document): js.Promise[JsonLdArray] = js.native
  def apply(input: Document, callback: Callback[JsonLdArray]): Unit = js.native
  def apply(input: Document, options: Expand): js.Promise[JsonLdArray] = js.native
  def apply(input: Document, options: Expand, callback: Callback[JsonLdArray]): Unit = js.native
}

