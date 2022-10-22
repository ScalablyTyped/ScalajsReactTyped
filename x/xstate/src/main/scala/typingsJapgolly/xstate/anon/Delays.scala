package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libTypesMod.MachineOptionsDelays
import typingsJapgolly.xstate.libTypesMod.Prop
import typingsJapgolly.xstate.xstateStrings.eventsCausingDelays
import typingsJapgolly.xstate.xstateStrings.indexedEvents
import typingsJapgolly.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delays[TContext, TResolvedTypesMeta] extends StObject {
  
  var delays: js.UndefOr[
    MachineOptionsDelays[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingDelays], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
    ]
  ] = js.undefined
}
object Delays {
  
  inline def apply[TContext, TResolvedTypesMeta](): Delays[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delays[TContext, TResolvedTypesMeta]]
  }
  
  extension [Self <: Delays[?, ?], TContext, TResolvedTypesMeta](x: Self & (Delays[TContext, TResolvedTypesMeta])) {
    
    inline def setDelays(
      value: MachineOptionsDelays[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingDelays], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
        ]
    ): Self = StObject.set(x, "delays", value.asInstanceOf[js.Any])
    
    inline def setDelaysUndefined: Self = StObject.set(x, "delays", js.undefined)
  }
}
