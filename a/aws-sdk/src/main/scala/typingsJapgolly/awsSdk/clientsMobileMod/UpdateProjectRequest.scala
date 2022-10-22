package typingsJapgolly.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectRequest extends StObject {
  
  /**
    *  ZIP or YAML file which contains project configuration to be updated. This should be the contents of the file downloaded from the URL provided in an export project operation. 
    */
  var contents: js.UndefOr[Contents] = js.undefined
  
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId
}
object UpdateProjectRequest {
  
  inline def apply(projectId: ProjectId): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  extension [Self <: UpdateProjectRequest](x: Self) {
    
    inline def setContents(value: Contents): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
