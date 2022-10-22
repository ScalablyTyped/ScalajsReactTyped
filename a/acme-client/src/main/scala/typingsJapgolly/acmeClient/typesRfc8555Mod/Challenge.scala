package typingsJapgolly.acmeClient.typesRfc8555Mod

import typingsJapgolly.acmeClient.acmeClientStrings.invalid
import typingsJapgolly.acmeClient.acmeClientStrings.pending
import typingsJapgolly.acmeClient.acmeClientStrings.processing
import typingsJapgolly.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.acmeClient.typesRfc8555Mod.HttpChallenge
  - typingsJapgolly.acmeClient.typesRfc8555Mod.DnsChallenge
*/
trait Challenge extends StObject
object Challenge {
  
  inline def DnsChallenge(status: pending | processing | valid | invalid, token: String, url: String): typingsJapgolly.acmeClient.typesRfc8555Mod.DnsChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dns-01")
    __obj.asInstanceOf[typingsJapgolly.acmeClient.typesRfc8555Mod.DnsChallenge]
  }
  
  inline def HttpChallenge(status: pending | processing | valid | invalid, token: String, url: String): typingsJapgolly.acmeClient.typesRfc8555Mod.HttpChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http-01")
    __obj.asInstanceOf[typingsJapgolly.acmeClient.typesRfc8555Mod.HttpChallenge]
  }
}
