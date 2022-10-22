package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionDeclaration extends StObject {
  
  /**
    * Specifies the action type and the provider of the action.
    */
  var actionTypeId: ActionTypeId
  
  /**
    * The action's configuration. These are key-value pairs that specify input values for an action. For more information, see Action Structure Requirements in CodePipeline. For the list of configuration properties for the AWS CloudFormation action type in CodePipeline, see Configuration Properties Reference in the AWS CloudFormation User Guide. For template snippets with examples, see Using Parameter Override Functions with CodePipeline Pipelines in the AWS CloudFormation User Guide. The values can be represented in either JSON or YAML format. For example, the JSON configuration item format is as follows:   JSON:   "Configuration" : { Key : Value }, 
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
  
  /**
    * The name or ID of the artifact consumed by the action, such as a test or build artifact.
    */
  var inputArtifacts: js.UndefOr[InputArtifactList] = js.undefined
  
  /**
    * The action declaration's name.
    */
  var name: ActionName
  
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.undefined
  
  /**
    * The name or ID of the result of the action declaration, such as a test or build artifact.
    */
  var outputArtifacts: js.UndefOr[OutputArtifactList] = js.undefined
  
  /**
    * The action declaration's AWS Region, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.undefined
  
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The order in which actions are run.
    */
  var runOrder: js.UndefOr[ActionRunOrder] = js.undefined
}
object ActionDeclaration {
  
  inline def apply(actionTypeId: ActionTypeId, name: ActionName): ActionDeclaration = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDeclaration]
  }
  
  extension [Self <: ActionDeclaration](x: Self) {
    
    inline def setActionTypeId(value: ActionTypeId): Self = StObject.set(x, "actionTypeId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ActionConfigurationMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setInputArtifacts(value: InputArtifactList): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsUndefined: Self = StObject.set(x, "inputArtifacts", js.undefined)
    
    inline def setInputArtifactsVarargs(value: InputArtifact*): Self = StObject.set(x, "inputArtifacts", js.Array(value*))
    
    inline def setName(value: ActionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: ActionNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOutputArtifacts(value: OutputArtifactList): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsUndefined: Self = StObject.set(x, "outputArtifacts", js.undefined)
    
    inline def setOutputArtifactsVarargs(value: OutputArtifact*): Self = StObject.set(x, "outputArtifacts", js.Array(value*))
    
    inline def setRegion(value: AWSRegionName): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setRunOrder(value: ActionRunOrder): Self = StObject.set(x, "runOrder", value.asInstanceOf[js.Any])
    
    inline def setRunOrderUndefined: Self = StObject.set(x, "runOrder", js.undefined)
  }
}
