package typingsJapgolly.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object remoteLoggingMod {
  type LogData = java.lang.String | typingsJapgolly.expo.remoteLoggingMod.LogErrorData
  type TransportErrorListener = js.Function1[/* event */ typingsJapgolly.expo.AnonResponse, scala.Unit]
}
