package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarms {
  type AlarmEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[/* alarm */ typingsJapgolly.chromeApps.chrome.alarms.Alarm, scala.Unit]
  ]
}
