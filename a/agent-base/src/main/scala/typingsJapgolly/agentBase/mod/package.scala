package typingsJapgolly.agentBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AgentCallback = js.Function2[
    /* req */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[typingsJapgolly.agentBase.AnonSecureEndpoint], 
    scala.Unit
  ]
}
