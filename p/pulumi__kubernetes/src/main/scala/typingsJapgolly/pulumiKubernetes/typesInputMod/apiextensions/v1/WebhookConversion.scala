package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebhookConversion describes how to call a conversion webhook
  */
trait WebhookConversion extends StObject {
  
  /**
    * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
    */
  var clientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.undefined
  
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
    */
  var conversionReviewVersions: Input[js.Array[Input[String]]]
}
object WebhookConversion {
  
  inline def apply(conversionReviewVersions: Input[js.Array[Input[String]]]): WebhookConversion = {
    val __obj = js.Dynamic.literal(conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookConversion]
  }
  
  extension [Self <: WebhookConversion](x: Self) {
    
    inline def setClientConfig(value: Input[WebhookClientConfig]): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
    
    inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
    
    inline def setConversionReviewVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "conversionReviewVersions", value.asInstanceOf[js.Any])
    
    inline def setConversionReviewVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "conversionReviewVersions", js.Array(value*))
  }
}
