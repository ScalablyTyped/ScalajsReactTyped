package typingsJapgolly.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Hub {
  type HubCreator = js.Function2[
    /* url */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsJapgolly.signalr.SignalR.Hub.Options], 
    typingsJapgolly.signalr.SignalR.Hub.Connection
  ]
}
