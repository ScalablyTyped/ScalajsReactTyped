package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebhookConversion describes how to call a conversion webhook
  */
trait WebhookConversionPatch extends StObject {
  
  /**
    * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
    */
  var clientConfig: WebhookClientConfigPatch
  
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
    */
  var conversionReviewVersions: js.Array[String]
}
object WebhookConversionPatch {
  
  inline def apply(clientConfig: WebhookClientConfigPatch, conversionReviewVersions: js.Array[String]): WebhookConversionPatch = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookConversionPatch]
  }
  
  extension [Self <: WebhookConversionPatch](x: Self) {
    
    inline def setClientConfig(value: WebhookClientConfigPatch): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
    
    inline def setConversionReviewVersions(value: js.Array[String]): Self = StObject.set(x, "conversionReviewVersions", value.asInstanceOf[js.Any])
    
    inline def setConversionReviewVersionsVarargs(value: String*): Self = StObject.set(x, "conversionReviewVersions", js.Array(value*))
  }
}
