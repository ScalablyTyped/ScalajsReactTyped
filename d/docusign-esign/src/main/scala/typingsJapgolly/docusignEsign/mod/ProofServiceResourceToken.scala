package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofServiceResourceToken extends StObject {
  
  var ResourceToken: js.UndefOr[String] = js.undefined
}
object ProofServiceResourceToken {
  
  inline def apply(): ProofServiceResourceToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofServiceResourceToken]
  }
  
  extension [Self <: ProofServiceResourceToken](x: Self) {
    
    inline def setResourceToken(value: String): Self = StObject.set(x, "ResourceToken", value.asInstanceOf[js.Any])
    
    inline def setResourceTokenUndefined: Self = StObject.set(x, "ResourceToken", js.undefined)
  }
}
