package typingsJapgolly.xstate.libTypesMod

import typingsJapgolly.xstate.anon.Context
import typingsJapgolly.xstate.libStateNodeMod.StateNode
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTransitionConfig[TContext, TEvent /* <: EventObject */]
  extends StObject
     with TransitionConfig[TContext, TEvent] {
  
  @JSName("target")
  var target_TargetTransitionConfig: TransitionTarget[TContext, TEvent]
}
object TargetTransitionConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](target: TransitionTarget[TContext, TEvent]): TargetTransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTransitionConfig[TContext, TEvent]]
  }
  
  extension [Self <: TargetTransitionConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (TargetTransitionConfig[TContext, TEvent])) {
    
    inline def setTarget(value: TransitionTarget[TContext, TEvent]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(
      value: (String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]))*
    ): Self = StObject.set(x, "target", js.Array(value*))
  }
}
