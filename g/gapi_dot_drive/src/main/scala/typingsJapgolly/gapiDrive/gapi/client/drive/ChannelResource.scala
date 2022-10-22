package typingsJapgolly.gapiDrive.gapi.client.drive

import typingsJapgolly.gapiDrive.gapiDriveStrings.apiNumbersignchannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelResource extends StObject {
  
  var expiration: Double
  
  var id: String
  
  var kind: apiNumbersignchannel
  
  var resourceId: String
  
  var resourceUri: String
  
  var token: String
}
object ChannelResource {
  
  inline def apply(expiration: Double, id: String, resourceId: String, resourceUri: String, token: String): ChannelResource = {
    val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "api#channel", resourceId = resourceId.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelResource]
  }
  
  extension [Self <: ChannelResource](x: Self) {
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: apiNumbersignchannel): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
