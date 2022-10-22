package typingsJapgolly.cassandraDriver.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreConnectionsPerHost extends StObject {
  
  var coreConnectionsPerHost: js.UndefOr[NumberDictionary[Double]] = js.undefined
  
  var heartBeatInterval: js.UndefOr[Double] = js.undefined
  
  var maxRequestsPerConnection: js.UndefOr[Double] = js.undefined
  
  var warmup: js.UndefOr[Boolean] = js.undefined
}
object CoreConnectionsPerHost {
  
  inline def apply(): CoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreConnectionsPerHost]
  }
  
  extension [Self <: CoreConnectionsPerHost](x: Self) {
    
    inline def setCoreConnectionsPerHost(value: NumberDictionary[Double]): Self = StObject.set(x, "coreConnectionsPerHost", value.asInstanceOf[js.Any])
    
    inline def setCoreConnectionsPerHostUndefined: Self = StObject.set(x, "coreConnectionsPerHost", js.undefined)
    
    inline def setHeartBeatInterval(value: Double): Self = StObject.set(x, "heartBeatInterval", value.asInstanceOf[js.Any])
    
    inline def setHeartBeatIntervalUndefined: Self = StObject.set(x, "heartBeatInterval", js.undefined)
    
    inline def setMaxRequestsPerConnection(value: Double): Self = StObject.set(x, "maxRequestsPerConnection", value.asInstanceOf[js.Any])
    
    inline def setMaxRequestsPerConnectionUndefined: Self = StObject.set(x, "maxRequestsPerConnection", js.undefined)
    
    inline def setWarmup(value: Boolean): Self = StObject.set(x, "warmup", value.asInstanceOf[js.Any])
    
    inline def setWarmupUndefined: Self = StObject.set(x, "warmup", js.undefined)
  }
}
