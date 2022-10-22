package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceDefinitionVersionResponse extends StObject {
  
  /**
    * Arn of the resource definition version.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the resource definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.undefined
  
  /**
    * Information about the definition.
    */
  var Definition: js.UndefOr[ResourceDefinitionVersion] = js.undefined
  
  /**
    * The ID of the resource definition version.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The version of the resource definition version.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object GetResourceDefinitionVersionResponse {
  
  inline def apply(): GetResourceDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceDefinitionVersionResponse]
  }
  
  extension [Self <: GetResourceDefinitionVersionResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDefinition(value: ResourceDefinitionVersion): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
