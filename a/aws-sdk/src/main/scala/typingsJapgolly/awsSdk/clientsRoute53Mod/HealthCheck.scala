package typingsJapgolly.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheck extends StObject {
  
  /**
    * A unique string that you specified when you created the health check.
    */
  var CallerReference: HealthCheckNonce
  
  /**
    * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
    */
  var CloudWatchAlarmConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53Mod.CloudWatchAlarmConfiguration] = js.undefined
  
  /**
    * A complex type that contains detailed information about one health check.
    */
  var HealthCheckConfig: typingsJapgolly.awsSdk.clientsRoute53Mod.HealthCheckConfig
  
  /**
    * The version of the health check. You can optionally pass this value in a call to UpdateHealthCheck to prevent overwriting another change to the health check.
    */
  var HealthCheckVersion: typingsJapgolly.awsSdk.clientsRoute53Mod.HealthCheckVersion
  
  /**
    * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long. 
    */
  var Id: HealthCheckId
  
  /**
    * If the health check was created by another service, the service that created the health check. When a health check is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var LinkedService: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53Mod.LinkedService] = js.undefined
}
object HealthCheck {
  
  inline def apply(
    CallerReference: HealthCheckNonce,
    HealthCheckConfig: HealthCheckConfig,
    HealthCheckVersion: HealthCheckVersion,
    Id: HealthCheckId
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], HealthCheckConfig = HealthCheckConfig.asInstanceOf[js.Any], HealthCheckVersion = HealthCheckVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
  
  extension [Self <: HealthCheck](x: Self) {
    
    inline def setCallerReference(value: HealthCheckNonce): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchAlarmConfiguration(value: CloudWatchAlarmConfiguration): Self = StObject.set(x, "CloudWatchAlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchAlarmConfigurationUndefined: Self = StObject.set(x, "CloudWatchAlarmConfiguration", js.undefined)
    
    inline def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckVersion(value: HealthCheckVersion): Self = StObject.set(x, "HealthCheckVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: HealthCheckId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLinkedService(value: LinkedService): Self = StObject.set(x, "LinkedService", value.asInstanceOf[js.Any])
    
    inline def setLinkedServiceUndefined: Self = StObject.set(x, "LinkedService", js.undefined)
  }
}
