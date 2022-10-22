package typingsJapgolly.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorModelDefinition extends StObject {
  
  /**
    * The state that is entered at the creation of each detector (instance).
    */
  var initialStateName: StateName
  
  /**
    * Information about the states of the detector.
    */
  var states: States
}
object DetectorModelDefinition {
  
  inline def apply(initialStateName: StateName, states: States): DetectorModelDefinition = {
    val __obj = js.Dynamic.literal(initialStateName = initialStateName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelDefinition]
  }
  
  extension [Self <: DetectorModelDefinition](x: Self) {
    
    inline def setInitialStateName(value: StateName): Self = StObject.set(x, "initialStateName", value.asInstanceOf[js.Any])
    
    inline def setStates(value: States): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: State*): Self = StObject.set(x, "states", js.Array(value*))
  }
}
