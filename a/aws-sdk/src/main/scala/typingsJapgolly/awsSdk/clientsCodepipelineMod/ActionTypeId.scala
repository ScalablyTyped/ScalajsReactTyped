package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeId extends StObject {
  
  /**
    * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Valid categories are limited to one of the following values.    Source   Build   Test   Deploy   Invoke   Approval  
    */
  var category: ActionCategory
  
  /**
    * The creator of the action being called. There are three valid values for the Owner field in the action category section within your pipeline structure: AWS, ThirdParty, and Custom. For more information, see Valid Action Types and Providers in CodePipeline.
    */
  var owner: ActionOwner
  
  /**
    * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy. For more information, see Valid Action Types and Providers in CodePipeline.
    */
  var provider: ActionProvider
  
  /**
    * A string that describes the action version.
    */
  var version: Version
}
object ActionTypeId {
  
  inline def apply(category: ActionCategory, owner: ActionOwner, provider: ActionProvider, version: Version): ActionTypeId = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeId]
  }
  
  extension [Self <: ActionTypeId](x: Self) {
    
    inline def setCategory(value: ActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: ActionOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ActionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
