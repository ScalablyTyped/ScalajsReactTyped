package typingsJapgolly.eslint

import typingsJapgolly.eslint.eslintStrings.Parameter
import typingsJapgolly.eslint.mod.Scope.DefinitionType
import typingsJapgolly.estree.mod.ArrowFunctionExpression
import typingsJapgolly.estree.mod.FunctionDeclaration
import typingsJapgolly.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeParentType extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression
  var parent: Null
  var `type`: Parameter
}

object AnonNodeParentType {
  @scala.inline
  def apply(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): AnonNodeParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeParentType]
  }
}

