package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeParameterInstantiation */
trait TSImportType extends ASTNode {
  var argument: StringLiteralKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var qualifier: js.UndefOr[IdentifierKind | TSQualifiedNameKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSImportType
  var typeParameters: TSTypeParameterInstantiationKind | Null
}

object TSImportType {
  @scala.inline
  def apply(
    argument: StringLiteralKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSImportType,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    qualifier: IdentifierKind | TSQualifiedNameKind = null,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSImportType]
  }
}

