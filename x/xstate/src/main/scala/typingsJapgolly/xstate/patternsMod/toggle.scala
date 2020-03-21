package typingsJapgolly.xstate.patternsMod

import typingsJapgolly.std.Record
import typingsJapgolly.xstate.AnonTypeTEventType
import typingsJapgolly.xstate.typesMod.AtomicStateNodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/patterns", "toggle")
@js.native
object toggle extends js.Object {
  def apply[TEventType /* <: String */](onState: String, offState: String, eventType: TEventType): Record[String, AtomicStateNodeConfig[_, AnonTypeTEventType[TEventType]]] = js.native
}

