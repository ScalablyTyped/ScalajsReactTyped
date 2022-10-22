package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libTypesMod.MachineOptionsGuards
import typingsJapgolly.xstate.libTypesMod.Prop
import typingsJapgolly.xstate.xstateStrings.eventsCausingGuards
import typingsJapgolly.xstate.xstateStrings.indexedEvents
import typingsJapgolly.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guards[TContext, TResolvedTypesMeta] extends StObject {
  
  var guards: js.UndefOr[
    MachineOptionsGuards[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingGuards], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
    ]
  ] = js.undefined
}
object Guards {
  
  inline def apply[TContext, TResolvedTypesMeta](): Guards[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guards[TContext, TResolvedTypesMeta]]
  }
  
  extension [Self <: Guards[?, ?], TContext, TResolvedTypesMeta](x: Self & (Guards[TContext, TResolvedTypesMeta])) {
    
    inline def setGuards(
      value: MachineOptionsGuards[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingGuards], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
        ]
    ): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    inline def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
  }
}
