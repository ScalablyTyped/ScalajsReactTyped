package typingsJapgolly.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.FunctionDeclaration
  - typingsJapgolly.estree.mod.FunctionExpression
  - typingsJapgolly.estree.mod.ArrowFunctionExpression
*/
trait Function extends Node

object Function {
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsJapgolly.estree.estreeStrings.FunctionDeclaration,
    async: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Function = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Function]
  }
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsJapgolly.estree.estreeStrings.FunctionExpression,
    async: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Function = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Function]
  }
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typingsJapgolly.estree.estreeStrings.ArrowFunctionExpression,
    async: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Function = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Function]
  }
}

