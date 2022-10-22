package typingsJapgolly.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentAccountConnectionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment account connection.
    */
  var arn: EnvironmentAccountConnectionArn
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined components in the associated environment account. It determines the scope of infrastructure that a component can provision in the account. The environment account connection must have a componentRoleArn to allow directly defined components to be associated with any environments running in the account. For more information about components, see Proton components in the Proton User Guide.
    */
  var componentRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the environment account that's connected to the environment account connection.
    */
  var environmentAccountId: AwsAccountId
  
  /**
    * The name of the environment that's associated with the environment account connection.
    */
  var environmentName: ResourceName
  
  /**
    * The ID of the environment account connection.
    */
  var id: EnvironmentAccountConnectionId
  
  /**
    * The time when the environment account connection was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The ID of the management account that's connected to the environment account connection.
    */
  var managementAccountId: AwsAccountId
  
  /**
    * The time when the environment account connection request was made.
    */
  var requestedAt: js.Date
  
  /**
    * The IAM service role that's associated with the environment account connection.
    */
  var roleArn: Arn
  
  /**
    * The status of the environment account connection.
    */
  var status: EnvironmentAccountConnectionStatus
}
object EnvironmentAccountConnectionSummary {
  
  inline def apply(
    arn: EnvironmentAccountConnectionArn,
    environmentAccountId: AwsAccountId,
    environmentName: ResourceName,
    id: EnvironmentAccountConnectionId,
    lastModifiedAt: js.Date,
    managementAccountId: AwsAccountId,
    requestedAt: js.Date,
    roleArn: Arn,
    status: EnvironmentAccountConnectionStatus
  ): EnvironmentAccountConnectionSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], environmentAccountId = environmentAccountId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], managementAccountId = managementAccountId.asInstanceOf[js.Any], requestedAt = requestedAt.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentAccountConnectionSummary]
  }
  
  extension [Self <: EnvironmentAccountConnectionSummary](x: Self) {
    
    inline def setArn(value: EnvironmentAccountConnectionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArn(value: Arn): Self = StObject.set(x, "componentRoleArn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArnUndefined: Self = StObject.set(x, "componentRoleArn", js.undefined)
    
    inline def setEnvironmentAccountId(value: AwsAccountId): Self = StObject.set(x, "environmentAccountId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setManagementAccountId(value: AwsAccountId): Self = StObject.set(x, "managementAccountId", value.asInstanceOf[js.Any])
    
    inline def setRequestedAt(value: js.Date): Self = StObject.set(x, "requestedAt", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EnvironmentAccountConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
