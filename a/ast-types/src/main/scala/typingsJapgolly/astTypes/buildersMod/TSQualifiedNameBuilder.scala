package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLeftLoc
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQualifiedNameBuilder extends js.Object {
  def apply(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def from(params: AnonCommentsLeftLoc): TSQualifiedName = js.native
}

