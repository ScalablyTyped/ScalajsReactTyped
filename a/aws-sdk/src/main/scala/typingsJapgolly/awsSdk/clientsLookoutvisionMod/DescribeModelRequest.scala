package typingsJapgolly.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelRequest extends StObject {
  
  /**
    * The version of the model that you want to describe.
    */
  var ModelVersion: typingsJapgolly.awsSdk.clientsLookoutvisionMod.ModelVersion
  
  /**
    * The project that contains the version of a model that you want to describe.
    */
  var ProjectName: typingsJapgolly.awsSdk.clientsLookoutvisionMod.ProjectName
}
object DescribeModelRequest {
  
  inline def apply(ModelVersion: ModelVersion, ProjectName: ProjectName): DescribeModelRequest = {
    val __obj = js.Dynamic.literal(ModelVersion = ModelVersion.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelRequest]
  }
  
  extension [Self <: DescribeModelRequest](x: Self) {
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
