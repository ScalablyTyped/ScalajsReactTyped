package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libTypesMod.MachineOptionsActions
import typingsJapgolly.xstate.libTypesMod.Prop
import typingsJapgolly.xstate.xstateStrings.eventsCausingActions
import typingsJapgolly.xstate.xstateStrings.indexedActions
import typingsJapgolly.xstate.xstateStrings.indexedEvents
import typingsJapgolly.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[TContext, TResolvedTypesMeta] extends StObject {
  
  var actions: js.UndefOr[
    MachineOptionsActions[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingActions], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedActions]
    ]
  ] = js.undefined
}
object `2` {
  
  inline def apply[TContext, TResolvedTypesMeta](): `2`[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TContext, TResolvedTypesMeta]]
  }
  
  extension [Self <: `2`[?, ?], TContext, TResolvedTypesMeta](x: Self & (`2`[TContext, TResolvedTypesMeta])) {
    
    inline def setActions(
      value: MachineOptionsActions[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingActions], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedActions]
        ]
    ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
  }
}
