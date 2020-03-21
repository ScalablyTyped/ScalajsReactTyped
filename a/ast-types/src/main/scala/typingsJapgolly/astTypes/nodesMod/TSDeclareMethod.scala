package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.`private`
import typingsJapgolly.astTypes.astTypesStrings.`protected`
import typingsJapgolly.astTypes.astTypesStrings.constructor
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.method
import typingsJapgolly.astTypes.astTypesStrings.public
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DecoratorKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NoopKind
import typingsJapgolly.astTypes.kindsMod.NumericLiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/nodes.TSHasOptionalTypeParameters */
trait TSDeclareMethod extends ASTNode {
  var `abstract`: Boolean
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var async: Boolean
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var generator: Boolean
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind
  var kind: get | set | method | constructor
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: Boolean
  var params: js.Array[PatternKind]
  var returnType: TSTypeAnnotationKind | NoopKind | Null
  var static: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSDeclareMethod
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    kind: get | set | method | constructor,
    optional: Boolean,
    params: js.Array[PatternKind],
    static: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.TSDeclareMethod,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod]
  }
}

