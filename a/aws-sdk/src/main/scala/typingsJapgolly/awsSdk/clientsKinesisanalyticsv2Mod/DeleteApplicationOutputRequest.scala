package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationOutputRequest extends StObject {
  
  /**
    * The application name.
    */
  var ApplicationName: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  
  /**
    * The ID of the configuration to delete. Each output configuration that is added to the application (either when the application is created or later) using the AddApplicationOutput operation has a unique ID. You need to provide the ID to uniquely identify the output configuration that you want to delete from the application configuration. You can use the DescribeApplication operation to get the specific OutputId. 
    */
  var OutputId: Id
}
object DeleteApplicationOutputRequest {
  
  inline def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, OutputId: Id): DeleteApplicationOutputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], OutputId = OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationOutputRequest]
  }
  
  extension [Self <: DeleteApplicationOutputRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setOutputId(value: Id): Self = StObject.set(x, "OutputId", value.asInstanceOf[js.Any])
  }
}
