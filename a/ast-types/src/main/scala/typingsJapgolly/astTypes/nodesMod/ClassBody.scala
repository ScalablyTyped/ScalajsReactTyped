package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.ClassMethodKind
import typingsJapgolly.astTypes.kindsMod.ClassPrivateMethodKind
import typingsJapgolly.astTypes.kindsMod.ClassPrivatePropertyKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.MethodDefinitionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSDeclareMethodKind
import typingsJapgolly.astTypes.kindsMod.TSIndexSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSMethodSignatureKind
import typingsJapgolly.astTypes.kindsMod.TSPropertySignatureKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ClassBody extends ASTNode {
  var body: js.Array[
    MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typingsJapgolly.astTypes.astTypesStrings.ClassBody,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody]
  }
}

