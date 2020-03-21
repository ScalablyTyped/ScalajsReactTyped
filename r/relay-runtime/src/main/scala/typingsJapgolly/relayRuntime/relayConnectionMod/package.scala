package typingsJapgolly.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayConnectionMod {
  type ConnectionID = java.lang.String
  type ConnectionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.relayRuntime.relayConnectionMod.ConnectionRecord]
  type GetConnectionEvents = js.Function1[
    /* connectionID */ typingsJapgolly.relayRuntime.relayConnectionMod.ConnectionID, 
    js.Array[typingsJapgolly.relayRuntime.relayConnectionMod.ConnectionInternalEvent]
  ]
}
