package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLoc
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierBuilder extends js.Object {
  def apply(name: String): Identifier = js.native
  def from(params: AnonLoc): Identifier = js.native
}

