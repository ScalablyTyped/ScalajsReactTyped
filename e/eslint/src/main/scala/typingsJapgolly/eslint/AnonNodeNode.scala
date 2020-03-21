package typingsJapgolly.eslint

import typingsJapgolly.eslint.mod.Rule.ReportDescriptorLocation
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeNode extends ReportDescriptorLocation {
  var node: Node
}

object AnonNodeNode {
  @scala.inline
  def apply(node: Node): AnonNodeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNodeNode]
  }
}

