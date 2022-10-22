package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficPattern extends StObject {
  
  /**
    * Defines the phases traffic specification.
    */
  var Phases: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.Phases] = js.undefined
  
  /**
    * Defines the traffic patterns.
    */
  var TrafficType: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.TrafficType] = js.undefined
}
object TrafficPattern {
  
  inline def apply(): TrafficPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficPattern]
  }
  
  extension [Self <: TrafficPattern](x: Self) {
    
    inline def setPhases(value: Phases): Self = StObject.set(x, "Phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesUndefined: Self = StObject.set(x, "Phases", js.undefined)
    
    inline def setPhasesVarargs(value: Phase*): Self = StObject.set(x, "Phases", js.Array(value*))
    
    inline def setTrafficType(value: TrafficType): Self = StObject.set(x, "TrafficType", value.asInstanceOf[js.Any])
    
    inline def setTrafficTypeUndefined: Self = StObject.set(x, "TrafficType", js.undefined)
  }
}
