package typingsJapgolly.jsonld.mod

import typingsJapgolly.jsonld.jsonldSpecMod.Document
import typingsJapgolly.jsonld.mod.Options.Normalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "normalize")
@js.native
object normalize extends js.Object {
  def apply(input: Document): js.Promise[String] = js.native
  def apply(input: Document, callback: Callback[String]): Unit = js.native
  def apply(input: Document, options: Normalize): js.Promise[String] = js.native
  def apply(input: Document, options: Normalize, callback: Callback[String]): Unit = js.native
}

