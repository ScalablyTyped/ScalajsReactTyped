package typingsJapgolly.eslint

import typingsJapgolly.eslint.eslintStrings.ImportBinding
import typingsJapgolly.eslint.mod.Scope.DefinitionType
import typingsJapgolly.estree.mod.ImportDeclaration
import typingsJapgolly.estree.mod.ImportDefaultSpecifier
import typingsJapgolly.estree.mod.ImportNamespaceSpecifier
import typingsJapgolly.estree.mod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentType extends DefinitionType {
  var node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier
  var parent: ImportDeclaration
  var `type`: ImportBinding
}

object AnonParentType {
  @scala.inline
  def apply(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): AnonParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentType]
  }
}

