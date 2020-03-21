package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
trait TSMappedType extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean | Plussign | `-_`
  var readonly: Boolean | Plussign | `-_`
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSMappedType
  var typeAnnotation: TSTypeKind | Null
  var typeParameter: TSTypeParameterKind
}

object TSMappedType {
  @scala.inline
  def apply(
    optional: Boolean | Plussign | `-_`,
    readonly: Boolean | Plussign | `-_`,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSMappedType,
    typeParameter: TSTypeParameterKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TSTypeKind = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMappedType]
  }
}

