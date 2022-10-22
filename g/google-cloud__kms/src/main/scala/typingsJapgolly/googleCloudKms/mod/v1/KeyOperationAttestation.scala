package typingsJapgolly.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOperationAttestation extends StObject {
  
  var format: AttestationFormat
}
object KeyOperationAttestation {
  
  inline def apply(format: AttestationFormat): KeyOperationAttestation = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOperationAttestation]
  }
  
  extension [Self <: KeyOperationAttestation](x: Self) {
    
    inline def setFormat(value: AttestationFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
