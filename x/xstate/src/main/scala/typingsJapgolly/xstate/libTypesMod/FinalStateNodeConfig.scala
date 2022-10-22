package typingsJapgolly.xstate.libTypesMod

import typingsJapgolly.xstate.xstateStrings.`final`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalStateNodeConfig[TContext, TEvent /* <: EventObject */]
  extends StObject
     with AtomicStateNodeConfig[TContext, TEvent] {
  
  @JSName("type")
  var type_FinalStateNodeConfig: `final`
}
object FinalStateNodeConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](initial: Unit, onDone: Unit, states: Unit): FinalStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], onDone = onDone.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("final")
    __obj.asInstanceOf[FinalStateNodeConfig[TContext, TEvent]]
  }
  
  extension [Self <: FinalStateNodeConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (FinalStateNodeConfig[TContext, TEvent])) {
    
    inline def setType(value: `final`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
