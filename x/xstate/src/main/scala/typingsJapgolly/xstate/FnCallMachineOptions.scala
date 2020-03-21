package typingsJapgolly.xstate

import typingsJapgolly.xstate.interpreterMod.Interpreter
import typingsJapgolly.xstate.typesMod.EventObject
import typingsJapgolly.xstate.typesMod.StateMachine
import typingsJapgolly.xstate.typesMod.StateSchema
import typingsJapgolly.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallMachineOptions extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
}

