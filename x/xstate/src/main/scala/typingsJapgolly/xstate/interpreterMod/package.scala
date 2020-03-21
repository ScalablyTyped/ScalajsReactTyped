package typingsJapgolly.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  type EventListener[TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener = js.Function0[scala.Unit]
  type StateListener[TContext, TEvent /* <: typingsJapgolly.xstate.typesMod.EventObject */, TTypestate /* <: typingsJapgolly.xstate.typesMod.Typestate[TContext] */] = js.Function2[
    /* state */ typingsJapgolly.xstate.stateMod.State[TContext, TEvent, js.Any, TTypestate], 
    /* event */ TEvent, 
    scala.Unit
  ]
}
