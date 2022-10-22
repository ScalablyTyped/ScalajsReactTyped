package typingsJapgolly.stripe.anon

import typingsJapgolly.stripe.mod.Stripe.Apps.SecretsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secrets extends StObject {
  
  var secrets: SecretsResource
}
object Secrets {
  
  inline def apply(secrets: SecretsResource): Secrets = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secrets]
  }
  
  extension [Self <: Secrets](x: Self) {
    
    inline def setSecrets(value: SecretsResource): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
  }
}
