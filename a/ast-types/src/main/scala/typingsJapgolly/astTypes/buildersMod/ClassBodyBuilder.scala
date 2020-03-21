package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBodyCommentsLoc
import typingsJapgolly.astTypes.kindsMod.ClassMethodKind
import typingsJapgolly.astTypes.kindsMod.ClassPrivateMethodKind
import typingsJapgolly.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyKind
import typingsJapgolly.astTypes.kindsMod.MethodDefinitionKind
import typingsJapgolly.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSDeclareMethodKind
import typingsJapgolly.astTypes.kindsMod.TSIndexSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSMethodSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSPropertySignatureKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody = js.native
  def from(params: AnonBodyCommentsLoc): ClassBody = js.native
}

