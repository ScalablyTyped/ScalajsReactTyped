package typingsJapgolly.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionMap extends StObject {
  
  var state: js.UndefOr[StateValue] = js.undefined
}
object TransitionMap {
  
  inline def apply(): TransitionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionMap]
  }
  
  extension [Self <: TransitionMap](x: Self) {
    
    inline def setState(value: StateValue): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
