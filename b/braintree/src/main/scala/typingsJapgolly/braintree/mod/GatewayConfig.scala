package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.mod.KeyGatewayConfig
  - typingsJapgolly.braintree.mod.ClientGatewayConfig
  - typingsJapgolly.braintree.mod.AccessTokenGatewayConfig
*/
trait GatewayConfig extends StObject
object GatewayConfig {
  
  inline def AccessTokenGatewayConfig(accessToken: String): typingsJapgolly.braintree.mod.AccessTokenGatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.braintree.mod.AccessTokenGatewayConfig]
  }
  
  inline def ClientGatewayConfig(clientId: String, clientSecret: String): typingsJapgolly.braintree.mod.ClientGatewayConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.braintree.mod.ClientGatewayConfig]
  }
  
  inline def KeyGatewayConfig(environment: Environment, merchantId: String, privateKey: String, publicKey: String): typingsJapgolly.braintree.mod.KeyGatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], merchantId = merchantId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.braintree.mod.KeyGatewayConfig]
  }
}
