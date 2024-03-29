package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeSettings extends StObject {
  
  /**
    * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of the action display in the pipeline.
    */
  var entityUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
  
  /**
    * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the external system, such as the console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS CodePipeline console and provides a link to the execution entity of the external action.
    */
  var executionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
  
  /**
    * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or change the configuration of the external action.
    */
  var revisionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
  
  /**
    * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of the action provided by that service.
    */
  var thirdPartyConfigurationUrl: js.UndefOr[Url] = js.undefined
}
object ActionTypeSettings {
  
  inline def apply(): ActionTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionTypeSettings]
  }
  
  extension [Self <: ActionTypeSettings](x: Self) {
    
    inline def setEntityUrlTemplate(value: UrlTemplate): Self = StObject.set(x, "entityUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setEntityUrlTemplateUndefined: Self = StObject.set(x, "entityUrlTemplate", js.undefined)
    
    inline def setExecutionUrlTemplate(value: UrlTemplate): Self = StObject.set(x, "executionUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setExecutionUrlTemplateUndefined: Self = StObject.set(x, "executionUrlTemplate", js.undefined)
    
    inline def setRevisionUrlTemplate(value: UrlTemplate): Self = StObject.set(x, "revisionUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setRevisionUrlTemplateUndefined: Self = StObject.set(x, "revisionUrlTemplate", js.undefined)
    
    inline def setThirdPartyConfigurationUrl(value: Url): Self = StObject.set(x, "thirdPartyConfigurationUrl", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyConfigurationUrlUndefined: Self = StObject.set(x, "thirdPartyConfigurationUrl", js.undefined)
  }
}
