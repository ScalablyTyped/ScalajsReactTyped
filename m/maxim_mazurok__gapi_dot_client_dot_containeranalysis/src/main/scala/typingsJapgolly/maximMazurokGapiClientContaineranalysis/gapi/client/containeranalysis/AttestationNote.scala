package typingsJapgolly.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttestationNote extends StObject {
  
  /** Hint hints at the purpose of the attestation authority. */
  var hint: js.UndefOr[Hint] = js.undefined
}
object AttestationNote {
  
  inline def apply(): AttestationNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttestationNote]
  }
  
  extension [Self <: AttestationNote](x: Self) {
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
