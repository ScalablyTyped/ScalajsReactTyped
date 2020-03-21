package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBodyArrayComments
import typingsJapgolly.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSIndexSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSMethodSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSPropertySignatureKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSInterfaceBody = js.native
  def from(params: AnonBodyArrayComments): TSInterfaceBody = js.native
}

