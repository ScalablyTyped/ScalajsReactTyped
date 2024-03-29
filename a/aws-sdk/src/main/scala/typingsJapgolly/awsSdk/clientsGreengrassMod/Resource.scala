package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The resource ID, used to refer to a resource in the Lambda function configuration. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
    */
  var Id: string
  
  /**
    * The descriptive resource name, which is displayed on the AWS IoT Greengrass console. Max length 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
    */
  var Name: string
  
  /**
    * A container of data for all resource types.
    */
  var ResourceDataContainer: typingsJapgolly.awsSdk.clientsGreengrassMod.ResourceDataContainer
}
object Resource {
  
  inline def apply(Id: string, Name: string, ResourceDataContainer: ResourceDataContainer): Resource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ResourceDataContainer = ResourceDataContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceDataContainer(value: ResourceDataContainer): Self = StObject.set(x, "ResourceDataContainer", value.asInstanceOf[js.Any])
  }
}
