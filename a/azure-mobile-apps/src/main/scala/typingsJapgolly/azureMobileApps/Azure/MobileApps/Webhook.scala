package typingsJapgolly.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webhook extends StObject {
  
  var url: String
}
object Webhook {
  
  inline def apply(url: String): Webhook = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  
  extension [Self <: Webhook](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
