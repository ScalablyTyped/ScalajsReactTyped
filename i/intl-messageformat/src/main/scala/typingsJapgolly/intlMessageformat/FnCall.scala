package typingsJapgolly.intlMessageformat

import typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement
import typingsJapgolly.intlMessageformatParser.mod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(input: String): js.Array[MessageFormatElement] = js.native
  def apply(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
}

