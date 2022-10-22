package typingsJapgolly.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name for the branch, for the job. 
    */
  var branchName: BranchName
  
  /**
    *  An optional file map that contains the file name as the key and the file content md5 hash as the value. If this argument is provided, the service will generate a unique upload URL per file. Otherwise, the service will only generate a single upload URL for the zipped files. 
    */
  var fileMap: js.UndefOr[FileMap] = js.undefined
}
object CreateDeploymentRequest {
  
  inline def apply(appId: AppId, branchName: BranchName): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  extension [Self <: CreateDeploymentRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setFileMap(value: FileMap): Self = StObject.set(x, "fileMap", value.asInstanceOf[js.Any])
    
    inline def setFileMapUndefined: Self = StObject.set(x, "fileMap", js.undefined)
  }
}
