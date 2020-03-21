package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsIdLoc
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.PrivateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateNameBuilder extends js.Object {
  def apply(id: IdentifierKind): PrivateName = js.native
  def from(params: AnonCommentsIdLoc): PrivateName = js.native
}

