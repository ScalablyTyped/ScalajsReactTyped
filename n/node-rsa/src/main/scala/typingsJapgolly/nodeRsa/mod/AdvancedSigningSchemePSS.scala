package typingsJapgolly.nodeRsa.mod

import typingsJapgolly.nodeRsa.nodeRsaStrings.pss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSigningSchemePSS
  extends StObject
     with AdvancedSigningScheme {
  
  var hash: HashingAlgorithm
  
  var saltLength: Double
  
  var scheme: pss
}
object AdvancedSigningSchemePSS {
  
  inline def apply(hash: HashingAlgorithm, saltLength: Double): AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = "pss")
    __obj.asInstanceOf[AdvancedSigningSchemePSS]
  }
  
  extension [Self <: AdvancedSigningSchemePSS](x: Self) {
    
    inline def setHash(value: HashingAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: pss): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
