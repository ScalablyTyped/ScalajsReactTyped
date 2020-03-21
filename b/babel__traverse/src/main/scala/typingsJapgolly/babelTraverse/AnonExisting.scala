package typingsJapgolly.babelTraverse

import typingsJapgolly.babelTraverse.babelTraverseStrings.`var`
import typingsJapgolly.babelTraverse.babelTraverseStrings.const
import typingsJapgolly.babelTraverse.babelTraverseStrings.let
import typingsJapgolly.babelTraverse.mod.Binding
import typingsJapgolly.babelTraverse.mod.Node
import typingsJapgolly.babelTraverse.mod.NodePath
import typingsJapgolly.babelTraverse.mod.Scope
import typingsJapgolly.babelTypes.mod.Identifier_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExisting extends js.Object {
  var existing: Binding
  var identifier: Identifier_
  var kind: `var` | let | const
  var path: NodePath[Node]
  var scope: Scope
}

object AnonExisting {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier_,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): AnonExisting = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExisting]
  }
}

