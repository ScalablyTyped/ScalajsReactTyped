package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.Event
import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.SendAction
import typingsJapgolly.xstate.typesMod.SendActionOptions
import typingsJapgolly.xstate.typesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[_]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: Event[_], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
}

