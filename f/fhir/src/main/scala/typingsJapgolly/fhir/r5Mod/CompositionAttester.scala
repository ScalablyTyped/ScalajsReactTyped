package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionAttester
  extends StObject
     with BackboneElement {
  
  var _time: js.UndefOr[Element] = js.undefined
  
  /**
    * The type of attestation the authenticator offers.
    */
  var mode: CodeableConcept
  
  /**
    * Who attested the composition in the specified way.
    */
  var party: js.UndefOr[Reference] = js.undefined
  
  /**
    * When the composition was attested by the party.
    */
  var time: js.UndefOr[String] = js.undefined
}
object CompositionAttester {
  
  inline def apply(mode: CodeableConcept): CompositionAttester = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionAttester]
  }
  
  extension [Self <: CompositionAttester](x: Self) {
    
    inline def setMode(value: CodeableConcept): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    inline def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
  }
}
