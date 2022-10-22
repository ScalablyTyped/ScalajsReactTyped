package typingsJapgolly.acmeClient.typesRfc8555Mod

import typingsJapgolly.acmeClient.acmeClientStrings.`dns-01`
import typingsJapgolly.acmeClient.acmeClientStrings.invalid
import typingsJapgolly.acmeClient.acmeClientStrings.pending
import typingsJapgolly.acmeClient.acmeClientStrings.processing
import typingsJapgolly.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsChallenge
  extends StObject
     with ChallengeAbstract
     with Challenge {
  
  var token: String
  
  @JSName("type")
  var type_DnsChallenge: `dns-01`
}
object DnsChallenge {
  
  inline def apply(status: pending | processing | valid | invalid, token: String, url: String): DnsChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dns-01")
    __obj.asInstanceOf[DnsChallenge]
  }
  
  extension [Self <: DnsChallenge](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setType(value: `dns-01`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
