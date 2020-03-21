package typingsJapgolly.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object socketMod {
  type CommandHandlers = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* frame */ typingsJapgolly.node.streamMod.Writable, 
      /* callback */ typingsJapgolly.stompit.socketMod.commandHandler, 
      scala.Unit
    ]
  ]
  type Heartbeat = js.Array[scala.Double]
  type commandHandler = js.Function1[/* frame */ typingsJapgolly.node.streamMod.Writable, scala.Unit]
}
