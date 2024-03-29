package typingsJapgolly.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDatasetAction extends StObject {
  
  /**
    * The ARN of the role that gives permission to the system to access required resources to run the containerAction. This includes, at minimum, permission to retrieve the dataset contents that are the input to the containerized application.
    */
  var executionRoleArn: RoleArn
  
  /**
    * The ARN of the Docker container stored in your account. The Docker container contains an application and required support libraries and is used to generate dataset contents.
    */
  var image: Image
  
  /**
    * Configuration of the resource that executes the containerAction.
    */
  var resourceConfiguration: ResourceConfiguration
  
  /**
    * The values of variables used in the context of the execution of the containerized application (basically, parameters passed to the application). Each variable must have a name and a value given by one of stringValue, datasetContentVersionValue, or outputFileUriValue.
    */
  var variables: js.UndefOr[Variables] = js.undefined
}
object ContainerDatasetAction {
  
  inline def apply(executionRoleArn: RoleArn, image: Image, resourceConfiguration: ResourceConfiguration): ContainerDatasetAction = {
    val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], resourceConfiguration = resourceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDatasetAction]
  }
  
  extension [Self <: ContainerDatasetAction](x: Self) {
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setResourceConfiguration(value: ResourceConfiguration): Self = StObject.set(x, "resourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
