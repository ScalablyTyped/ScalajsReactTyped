package typingsJapgolly.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheck extends StObject {
  
  /**
    * The number of consecutive health checks successes required before moving the instance to the Healthy state.
    */
  var HealthyThreshold: typingsJapgolly.awsSdk.clientsElbMod.HealthyThreshold
  
  /**
    * The approximate interval, in seconds, between health checks of an individual instance.
    */
  var Interval: HealthCheckInterval
  
  /**
    * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1) through 65535. TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a health check simply attempts to open a TCP connection to the instance on the specified port. Failure to connect within the configured timeout is considered unhealthy. SSL is also specified as SSL: port pair, for example, SSL:5000. For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is issued to the instance on the given port and path. Any answer other than "200 OK" within the timeout period is considered unhealthy. The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
    */
  var Target: HealthCheckTarget
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check. This value must be less than the Interval value.
    */
  var Timeout: HealthCheckTimeout
  
  /**
    * The number of consecutive health check failures required before moving the instance to the Unhealthy state.
    */
  var UnhealthyThreshold: typingsJapgolly.awsSdk.clientsElbMod.UnhealthyThreshold
}
object HealthCheck {
  
  inline def apply(
    HealthyThreshold: HealthyThreshold,
    Interval: HealthCheckInterval,
    Target: HealthCheckTarget,
    Timeout: HealthCheckTimeout,
    UnhealthyThreshold: UnhealthyThreshold
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(HealthyThreshold = HealthyThreshold.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], UnhealthyThreshold = UnhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  
  extension [Self <: HealthCheck](x: Self) {
    
    inline def setHealthyThreshold(value: HealthyThreshold): Self = StObject.set(x, "HealthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: HealthCheckInterval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HealthCheckTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: HealthCheckTimeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThreshold(value: UnhealthyThreshold): Self = StObject.set(x, "UnhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
