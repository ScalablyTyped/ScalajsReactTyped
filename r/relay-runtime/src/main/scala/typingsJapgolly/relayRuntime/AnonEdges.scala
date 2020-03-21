package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayConnectionMod.ConnectionEvent
import typingsJapgolly.relayRuntime.relayConnectionMod.PageInfo
import typingsJapgolly.relayRuntime.relayRuntimeStrings.fetch
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdges[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables
  var edges: js.Array[TEdge]
  var kind: fetch
  var pageInfo: PageInfo
}

object AnonEdges {
  @scala.inline
  def apply[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): AnonEdges[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEdges[TEdge]]
  }
}

