package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.ArrowFunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFunctionExpression_
  extends Node
     with BlockParent
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  var async: Boolean
  var body: BlockStatement_ | Expression
  var expression: Boolean
  var generator: Boolean
  var id: Identifier_
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation_] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.undefined
  @JSName("type")
  var type_ArrowFunctionExpression_ : ArrowFunctionExpression
}

object ArrowFunctionExpression_ {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_ | Expression,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: ArrowFunctionExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation_ = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ = null
  ): ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFunctionExpression_]
  }
}

