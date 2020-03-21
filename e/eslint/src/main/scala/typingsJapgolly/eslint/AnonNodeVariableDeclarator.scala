package typingsJapgolly.eslint

import typingsJapgolly.eslint.eslintStrings.Variable
import typingsJapgolly.eslint.mod.Scope.DefinitionType
import typingsJapgolly.estree.mod.VariableDeclaration
import typingsJapgolly.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeVariableDeclarator extends DefinitionType {
  var node: VariableDeclarator
  var parent: VariableDeclaration
  var `type`: Variable
}

object AnonNodeVariableDeclarator {
  @scala.inline
  def apply(node: VariableDeclarator, parent: VariableDeclaration, `type`: Variable): AnonNodeVariableDeclarator = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeVariableDeclarator]
  }
}

