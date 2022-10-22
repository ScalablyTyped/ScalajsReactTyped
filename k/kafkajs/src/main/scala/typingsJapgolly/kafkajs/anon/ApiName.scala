package typingsJapgolly.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiName extends StObject {
  
  var apiKey: Double
  
  var apiName: String
  
  var apiVersion: Double
  
  var broker: String
  
  var clientId: String
  
  var correlationId: Double
  
  var createdAt: Double
  
  var pendingDuration: Double
  
  var sentAt: Double
}
object ApiName {
  
  inline def apply(
    apiKey: Double,
    apiName: String,
    apiVersion: Double,
    broker: String,
    clientId: String,
    correlationId: Double,
    createdAt: Double,
    pendingDuration: Double,
    sentAt: Double
  ): ApiName = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], broker = broker.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], pendingDuration = pendingDuration.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiName]
  }
  
  extension [Self <: ApiName](x: Self) {
    
    inline def setApiKey(value: Double): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    inline def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setBroker(value: String): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationId(value: Double): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setPendingDuration(value: Double): Self = StObject.set(x, "pendingDuration", value.asInstanceOf[js.Any])
    
    inline def setSentAt(value: Double): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
  }
}
