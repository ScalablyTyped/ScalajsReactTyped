package typingsJapgolly.eslint

import typingsJapgolly.eslint.mod.Scope.DefinitionType
import typingsJapgolly.estree.mod.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends DefinitionType {
  var node: CatchClause
  var parent: Null
  var `type`: typingsJapgolly.eslint.eslintStrings.CatchClause
}

object AnonNode {
  @scala.inline
  def apply(node: CatchClause, parent: Null, `type`: typingsJapgolly.eslint.eslintStrings.CatchClause): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

