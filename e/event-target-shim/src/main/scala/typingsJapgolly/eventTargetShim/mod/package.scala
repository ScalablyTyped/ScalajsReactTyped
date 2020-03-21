package typingsJapgolly.eventTargetShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventTarget[TEvents /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition */, TEventAttributes /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.Mode */] = typingsJapgolly.eventTargetShim.mod.EventTarget.EventAttributes[TEventAttributes] with (typingsJapgolly.eventTargetShim.AnonAddEventListener[TEvents, TMode])
}
