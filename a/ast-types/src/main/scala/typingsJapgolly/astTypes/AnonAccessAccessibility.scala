package typingsJapgolly.astTypes

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

trait AnonAccessAccessibility extends js.Object {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var params: js.Array[PatternKind]
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object AnonAccessAccessibility {
  @scala.inline
  def apply(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind],
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    async: js.UndefOr[Boolean] = js.undefined,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[DecoratorKind] = null,
    generator: js.UndefOr[Boolean] = js.undefined,
    kind: get | set | method | constructor = null,
    loc: SourceLocationKind = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    static: js.UndefOr[Boolean] = js.undefined,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): AnonAccessAccessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessAccessibility]
  }
}

