package typingsJapgolly.relayRuntime.relayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayRuntimeStrings.fetch
import typingsJapgolly.relayRuntime.relayRuntimeStrings.insert
import typingsJapgolly.relayRuntime.relayRuntimeStrings.update
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.AnonEdges[TEdge]
  - typingsJapgolly.relayRuntime.AnonEdgeData[TEdge]
  - typingsJapgolly.relayRuntime.AnonEdge[TEdge]
*/
trait ConnectionEvent[TEdge] extends js.Object

object ConnectionEvent {
  @scala.inline
  def AnonEdges[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
  @scala.inline
  def AnonEdgeData[TEdge](edgeData: StringDictionary[TEdge], kind: update): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(edgeData = edgeData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
  @scala.inline
  def AnonEdge[TEdge](args: Variables, edge: TEdge, kind: insert): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
}

