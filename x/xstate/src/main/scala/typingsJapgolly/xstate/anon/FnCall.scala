package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libInterpreterMod.Interpreter
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.InterpreterOptions
import typingsJapgolly.xstate.libTypesMod.StateSchema
import typingsJapgolly.xstate.libTypesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta](
    machine: /* import warning: importer.ImportType#apply Failed type conversion: xstate.xstate/lib/typegenTypes.AreAllImplementationsAssumedToBeProvided<TResolvedTypesMeta, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TResolvedTypesMeta, 'resolved'>, 'missingImplementations'>> extends true ? xstate.xstate/lib/types.StateMachine<TContext, TStateSchema, TEvent, TTypestate, any, any, TResolvedTypesMeta> : 'Some implementations missing' */ js.Any,
    options: InterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate, TResolvedTypesMeta] = js.native
}
