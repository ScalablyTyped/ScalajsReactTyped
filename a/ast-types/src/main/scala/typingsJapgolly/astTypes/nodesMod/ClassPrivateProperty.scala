package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.`private`
import typingsJapgolly.astTypes.astTypesStrings.`protected`
import typingsJapgolly.astTypes.astTypesStrings.minus
import typingsJapgolly.astTypes.astTypesStrings.plus
import typingsJapgolly.astTypes.astTypesStrings.public
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PrivateNameKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.ClassProperty, 'type' | 'key' | 'value'> */
trait ClassPrivateProperty extends ASTNode {
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var key: PrivateNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var static: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassPrivateProperty
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  var value: ExpressionKind | Null
  var variance: js.UndefOr[VarianceKind | plus | minus] = js.undefined
}

object ClassPrivateProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: PrivateNameKind,
    static: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ClassPrivateProperty,
    access: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null,
    value: ExpressionKind = null,
    variance: VarianceKind | plus | minus = null
  ): ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrivateProperty]
  }
}

