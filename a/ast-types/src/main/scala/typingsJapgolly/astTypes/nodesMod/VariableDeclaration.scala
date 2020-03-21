package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.`var`
import typingsJapgolly.astTypes.astTypesStrings.const
import typingsJapgolly.astTypes.astTypesStrings.let
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait VariableDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declarations: js.Array[VariableDeclaratorKind | IdentifierKind]
  var kind: `var` | let | const
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclaratorKind | IdentifierKind],
    kind: `var` | let | const,
    `type`: typingsJapgolly.astTypes.astTypesStrings.VariableDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
}

