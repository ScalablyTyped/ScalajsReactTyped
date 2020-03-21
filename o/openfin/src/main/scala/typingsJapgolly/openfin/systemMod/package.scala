package typingsJapgolly.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemMod {
  type MonitorEvent[Topic, Type] = typingsJapgolly.openfin.monitorMod.MonitorInfo with (typingsJapgolly.openfin.eventsBaseMod.BaseEvent[Topic, Type])
}
