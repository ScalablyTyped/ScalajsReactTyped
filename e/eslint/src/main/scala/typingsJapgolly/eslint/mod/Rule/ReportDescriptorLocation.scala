package typingsJapgolly.eslint.mod.Rule

import typingsJapgolly.eslint.AnonColumn
import typingsJapgolly.eslint.mod.AST.SourceLocation
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eslint.AnonNodeNode
  - typingsJapgolly.eslint.AnonLoc
*/
trait ReportDescriptorLocation extends js.Object

object ReportDescriptorLocation {
  @scala.inline
  def AnonNodeNode(node: Node): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
  @scala.inline
  def AnonLoc(loc: SourceLocation | AnonColumn): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}

