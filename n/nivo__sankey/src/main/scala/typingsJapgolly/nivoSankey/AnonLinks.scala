package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoSankey.mod.SankeyDataLink
import typingsJapgolly.nivoSankey.mod.SankeyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinks extends js.Object {
  var links: js.Array[SankeyDataLink]
  var nodes: js.Array[SankeyDataNode]
}

object AnonLinks {
  @scala.inline
  def apply(links: js.Array[SankeyDataLink], nodes: js.Array[SankeyDataNode]): AnonLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLinks]
  }
}

