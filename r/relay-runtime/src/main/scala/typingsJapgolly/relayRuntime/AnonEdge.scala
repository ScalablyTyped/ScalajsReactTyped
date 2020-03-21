package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.relayConnectionMod.ConnectionEvent
import typingsJapgolly.relayRuntime.relayRuntimeStrings.insert
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdge[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables
  var edge: TEdge
  var kind: insert
}

object AnonEdge {
  @scala.inline
  def apply[TEdge](args: Variables, edge: TEdge, kind: insert): AnonEdge[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEdge[TEdge]]
  }
}

