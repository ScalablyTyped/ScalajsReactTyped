package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseEnvironmentCompletedEvent extends StObject {
  
  var createdByName: String
  
  var definitionId: Double
  
  var definitionName: String
  
  var environment: ReleaseEnvironment
  
  var environmentId: Double
  
  var projectName: String
  
  var reason: DeploymentReason
  
  var releaseCreatedBy: IdentityRef
  
  var releaseLogsUri: String
  
  var releaseName: String
  
  var status: String
  
  var title: String
  
  var webAccessUri: String
}
object ReleaseEnvironmentCompletedEvent {
  
  inline def apply(
    createdByName: String,
    definitionId: Double,
    definitionName: String,
    environment: ReleaseEnvironment,
    environmentId: Double,
    projectName: String,
    reason: DeploymentReason,
    releaseCreatedBy: IdentityRef,
    releaseLogsUri: String,
    releaseName: String,
    status: String,
    title: String,
    webAccessUri: String
  ): ReleaseEnvironmentCompletedEvent = {
    val __obj = js.Dynamic.literal(createdByName = createdByName.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionName = definitionName.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseLogsUri = releaseLogsUri.asInstanceOf[js.Any], releaseName = releaseName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
  
  extension [Self <: ReleaseEnvironmentCompletedEvent](x: Self) {
    
    inline def setCreatedByName(value: String): Self = StObject.set(x, "createdByName", value.asInstanceOf[js.Any])
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionName(value: String): Self = StObject.set(x, "definitionName", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: ReleaseEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DeploymentReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReleaseCreatedBy(value: IdentityRef): Self = StObject.set(x, "releaseCreatedBy", value.asInstanceOf[js.Any])
    
    inline def setReleaseLogsUri(value: String): Self = StObject.set(x, "releaseLogsUri", value.asInstanceOf[js.Any])
    
    inline def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWebAccessUri(value: String): Self = StObject.set(x, "webAccessUri", value.asInstanceOf[js.Any])
  }
}
