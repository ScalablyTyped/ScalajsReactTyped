package typingsJapgolly.jsonld.mod

import typingsJapgolly.jsonld.jsonldSpecMod.Document
import typingsJapgolly.jsonld.jsonldSpecMod.Frame
import typingsJapgolly.jsonld.jsonldSpecMod.JsonLdObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "frame")
@js.native
object frame extends js.Object {
  def apply(input: Document, frame: Frame): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, frame: Frame, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, frame: Frame, options: typingsJapgolly.jsonld.mod.Options.Frame): js.Promise[JsonLdObj] = js.native
  def apply(
    input: Document,
    frame: Frame,
    options: typingsJapgolly.jsonld.mod.Options.Frame,
    callback: Callback[JsonLdObj]
  ): Unit = js.native
}

