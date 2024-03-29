package typingsJapgolly.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorDependenciesResponse extends StObject {
  
  var id: String
  
  var isMonitored: Boolean
  
  var licensesPolicy: Any
  
  var ok: Boolean
  
  @JSName("org")
  var org_ : String
  
  var path: String
  
  var projectName: String
  
  var trialStarted: Boolean
  
  var uri: String
}
object MonitorDependenciesResponse {
  
  inline def apply(
    id: String,
    isMonitored: Boolean,
    licensesPolicy: Any,
    ok: Boolean,
    org_ : String,
    path: String,
    projectName: String,
    trialStarted: Boolean,
    uri: String
  ): MonitorDependenciesResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isMonitored = isMonitored.asInstanceOf[js.Any], licensesPolicy = licensesPolicy.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], trialStarted = trialStarted.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorDependenciesResponse]
  }
  
  extension [Self <: MonitorDependenciesResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsMonitored(value: Boolean): Self = StObject.set(x, "isMonitored", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicy(value: Any): Self = StObject.set(x, "licensesPolicy", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setTrialStarted(value: Boolean): Self = StObject.set(x, "trialStarted", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
