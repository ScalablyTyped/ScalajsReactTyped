package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.Event
import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.RaiseAction
import typingsJapgolly.xstate.typesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent]) = js.native
}

