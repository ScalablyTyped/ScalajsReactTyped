package typingsJapgolly.tslint

import typingsJapgolly.tslint.mod.Rules.AbstractRule
import typingsJapgolly.tslint.ruleMod.IRuleMetadata
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/typedefRule", JSImport.Namespace)
@js.native
object typedefRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  def isNodeArray(nodeOrArray: Node): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = js.native
  def isNodeArray(nodeOrArray: NodeArray[Node]): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
}

