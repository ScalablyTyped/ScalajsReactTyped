package typingsJapgolly.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSSEAttestationNote extends StObject {
  
  /** DSSEHint hints at the purpose of the attestation authority. */
  var hint: js.UndefOr[DSSEHint] = js.undefined
}
object DSSEAttestationNote {
  
  inline def apply(): DSSEAttestationNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSSEAttestationNote]
  }
  
  extension [Self <: DSSEAttestationNote](x: Self) {
    
    inline def setHint(value: DSSEHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
