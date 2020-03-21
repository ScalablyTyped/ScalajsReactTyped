package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSModuleBlockKind
import typingsJapgolly.astTypes.kindsMod.TSModuleDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait TSModuleDeclaration extends ASTNode {
  var body: TSModuleBlockKind | TSModuleDeclarationKind | Null
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declare: Boolean
  var global: Boolean
  var id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    declare: Boolean,
    global: Boolean,
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSModuleDeclaration,
    body: TSModuleBlockKind | TSModuleDeclarationKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

