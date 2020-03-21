package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonMembers
import typingsJapgolly.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSIndexSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSMethodSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSPropertySignatureKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeLiteralBuilder extends js.Object {
  def apply(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral = js.native
  def from(params: AnonMembers): TSTypeLiteral = js.native
}

