package typingsJapgolly.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverConfig extends StObject {
  
  /**
    * The main Region of the endpoint.
    */
  var Primary: typingsJapgolly.awsSdk.clientsEventbridgeMod.Primary
  
  /**
    * The Region that events are routed to when failover is triggered or event replication is enabled.
    */
  var Secondary: typingsJapgolly.awsSdk.clientsEventbridgeMod.Secondary
}
object FailoverConfig {
  
  inline def apply(Primary: Primary, Secondary: Secondary): FailoverConfig = {
    val __obj = js.Dynamic.literal(Primary = Primary.asInstanceOf[js.Any], Secondary = Secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverConfig]
  }
  
  extension [Self <: FailoverConfig](x: Self) {
    
    inline def setPrimary(value: Primary): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: Secondary): Self = StObject.set(x, "Secondary", value.asInstanceOf[js.Any])
  }
}
