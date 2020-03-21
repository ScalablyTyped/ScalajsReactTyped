package typingsJapgolly.forceGraph.mod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLink extends GraphEntity {
  var source: String | GraphNode
  var target: String | GraphNode
  var `type`: String
}

object GraphLink {
  @scala.inline
  def apply(id: String, source: String | GraphNode, target: String | GraphNode, `type`: String): GraphLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphLink]
  }
}

