package typingsJapgolly.xstate.typesMod

import typingsJapgolly.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] extends StateNode[TContext, TStateSchema, TEvent, TTypestate]

