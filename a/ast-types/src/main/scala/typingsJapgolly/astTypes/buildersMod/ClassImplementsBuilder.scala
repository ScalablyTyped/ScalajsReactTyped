package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeParameters
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassImplements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassImplementsBuilder extends js.Object {
  def apply(id: IdentifierKind): ClassImplements = js.native
  def from(params: AnonTypeParameters): ClassImplements = js.native
}

