package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSoftwareUpdateJobRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  var S3UrlSignerRole: typingsJapgolly.awsSdk.clientsGreengrassMod.S3UrlSignerRole
  
  var SoftwareToUpdate: typingsJapgolly.awsSdk.clientsGreengrassMod.SoftwareToUpdate
  
  var UpdateAgentLogLevel: js.UndefOr[typingsJapgolly.awsSdk.clientsGreengrassMod.UpdateAgentLogLevel] = js.undefined
  
  var UpdateTargets: typingsJapgolly.awsSdk.clientsGreengrassMod.UpdateTargets
  
  var UpdateTargetsArchitecture: typingsJapgolly.awsSdk.clientsGreengrassMod.UpdateTargetsArchitecture
  
  var UpdateTargetsOperatingSystem: typingsJapgolly.awsSdk.clientsGreengrassMod.UpdateTargetsOperatingSystem
}
object CreateSoftwareUpdateJobRequest {
  
  inline def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole.asInstanceOf[js.Any], SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets.asInstanceOf[js.Any], UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
  
  extension [Self <: CreateSoftwareUpdateJobRequest](x: Self) {
    
    inline def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    inline def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    inline def setS3UrlSignerRole(value: S3UrlSignerRole): Self = StObject.set(x, "S3UrlSignerRole", value.asInstanceOf[js.Any])
    
    inline def setSoftwareToUpdate(value: SoftwareToUpdate): Self = StObject.set(x, "SoftwareToUpdate", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgentLogLevel(value: UpdateAgentLogLevel): Self = StObject.set(x, "UpdateAgentLogLevel", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgentLogLevelUndefined: Self = StObject.set(x, "UpdateAgentLogLevel", js.undefined)
    
    inline def setUpdateTargets(value: UpdateTargets): Self = StObject.set(x, "UpdateTargets", value.asInstanceOf[js.Any])
    
    inline def setUpdateTargetsArchitecture(value: UpdateTargetsArchitecture): Self = StObject.set(x, "UpdateTargetsArchitecture", value.asInstanceOf[js.Any])
    
    inline def setUpdateTargetsOperatingSystem(value: UpdateTargetsOperatingSystem): Self = StObject.set(x, "UpdateTargetsOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setUpdateTargetsVarargs(value: string*): Self = StObject.set(x, "UpdateTargets", js.Array(value*))
  }
}
