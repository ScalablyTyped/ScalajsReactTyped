package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonPattern
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteralBuilder extends js.Object {
  def apply(pattern: String, flags: String): RegExpLiteral = js.native
  def from(params: AnonPattern): RegExpLiteral = js.native
}

