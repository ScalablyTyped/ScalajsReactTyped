package typingsJapgolly.onionoo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Onionoo {
  type Bandwidth = typingsJapgolly.onionoo.mod.Onionoo.Response[
    typingsJapgolly.onionoo.mod.Onionoo.NodeBandwidth, 
    typingsJapgolly.onionoo.mod.Onionoo.NodeBandwidth
  ]
  type Clients = typingsJapgolly.onionoo.mod.Onionoo.Response[js.UndefOr[scala.Nothing], typingsJapgolly.onionoo.mod.Onionoo.BridgeClients]
  type Details = typingsJapgolly.onionoo.mod.Onionoo.Response[
    typingsJapgolly.onionoo.mod.Onionoo.Relay, 
    typingsJapgolly.onionoo.mod.Onionoo.Bridge
  ]
  type Summary = typingsJapgolly.onionoo.mod.Onionoo.Response[
    typingsJapgolly.onionoo.mod.Onionoo.RelaySummary, 
    typingsJapgolly.onionoo.mod.Onionoo.BridgeSummary
  ]
  type Uptime = typingsJapgolly.onionoo.mod.Onionoo.Response[
    typingsJapgolly.onionoo.mod.Onionoo.RelayUptime, 
    typingsJapgolly.onionoo.mod.Onionoo.BridgeUptime
  ]
  type Weights = typingsJapgolly.onionoo.mod.Onionoo.Response[typingsJapgolly.onionoo.mod.Onionoo.RelayWeights, js.UndefOr[scala.Nothing]]
}
