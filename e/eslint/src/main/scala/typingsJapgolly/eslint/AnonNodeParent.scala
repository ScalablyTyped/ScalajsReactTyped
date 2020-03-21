package typingsJapgolly.eslint

import typingsJapgolly.eslint.eslintStrings.ImplicitGlobalVariable
import typingsJapgolly.eslint.mod.Scope.DefinitionType
import typingsJapgolly.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeParent extends DefinitionType {
  var node: Program
  var parent: Null
  var `type`: ImplicitGlobalVariable
}

object AnonNodeParent {
  @scala.inline
  def apply(node: Program, parent: Null, `type`: ImplicitGlobalVariable): AnonNodeParent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeParent]
  }
}

