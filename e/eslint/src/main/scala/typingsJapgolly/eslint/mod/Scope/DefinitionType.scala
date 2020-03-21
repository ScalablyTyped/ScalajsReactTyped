package typingsJapgolly.eslint.mod.Scope

import typingsJapgolly.eslint.eslintStrings.ClassName
import typingsJapgolly.eslint.eslintStrings.FunctionName
import typingsJapgolly.eslint.eslintStrings.ImplicitGlobalVariable
import typingsJapgolly.eslint.eslintStrings.ImportBinding
import typingsJapgolly.eslint.eslintStrings.Parameter
import typingsJapgolly.eslint.eslintStrings.TDZ
import typingsJapgolly.estree.mod.ArrowFunctionExpression
import typingsJapgolly.estree.mod.CatchClause
import typingsJapgolly.estree.mod.ClassDeclaration
import typingsJapgolly.estree.mod.ClassExpression
import typingsJapgolly.estree.mod.FunctionDeclaration
import typingsJapgolly.estree.mod.FunctionExpression
import typingsJapgolly.estree.mod.ImportDeclaration
import typingsJapgolly.estree.mod.ImportDefaultSpecifier
import typingsJapgolly.estree.mod.ImportNamespaceSpecifier
import typingsJapgolly.estree.mod.ImportSpecifier
import typingsJapgolly.estree.mod.Program
import typingsJapgolly.estree.mod.VariableDeclaration
import typingsJapgolly.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eslint.AnonNode
  - typingsJapgolly.eslint.AnonParent
  - typingsJapgolly.eslint.AnonType
  - typingsJapgolly.eslint.AnonNodeParent
  - typingsJapgolly.eslint.AnonParentType
  - typingsJapgolly.eslint.AnonNodeParentType
  - typingsJapgolly.eslint.AnonNodeAny
  - typingsJapgolly.eslint.AnonNodeVariableDeclarator
*/
trait DefinitionType extends js.Object

object DefinitionType {
  @scala.inline
  def AnonParentType(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNode(node: CatchClause, parent: Null, `type`: typingsJapgolly.eslint.eslintStrings.CatchClause): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNodeAny(node: js.Any, parent: Null, `type`: TDZ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNodeParentType(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonType(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNodeVariableDeclarator(
    node: VariableDeclarator,
    parent: VariableDeclaration,
    `type`: typingsJapgolly.eslint.eslintStrings.Variable
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonParent(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def AnonNodeParent(node: Program, parent: Null, `type`: ImplicitGlobalVariable): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
}

