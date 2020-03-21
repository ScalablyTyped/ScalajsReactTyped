package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.OptionalCallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait OptionalCallExpression_
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_]
  var callee: Expression
  var optional: Boolean
  var typeArguments: TypeParameterInstantiation_ | Null
  var typeParameters: TSTypeParameterInstantiation_ | Null
  @JSName("type")
  var type_OptionalCallExpression_ : OptionalCallExpression
}

object OptionalCallExpression_ {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_],
    callee: Expression,
    optional: Boolean,
    `type`: OptionalCallExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeArguments: TypeParameterInstantiation_ = null,
    typeParameters: TSTypeParameterInstantiation_ = null
  ): OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalCallExpression_]
  }
}

