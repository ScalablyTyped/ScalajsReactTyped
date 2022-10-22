package typingsJapgolly.awsLambda.triggerSesMod

import typingsJapgolly.awsLambda.awsLambdaStrings.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptLambdaAction extends StObject {
  
  var functionArn: String
  
  var invocationType: String
  
  var topicArn: js.UndefOr[String] = js.undefined
  
  var `type`: Lambda
}
object SESReceiptLambdaAction {
  
  inline def apply(functionArn: String, invocationType: String): SESReceiptLambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Lambda")
    __obj.asInstanceOf[SESReceiptLambdaAction]
  }
  
  extension [Self <: SESReceiptLambdaAction](x: Self) {
    
    inline def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
    
    inline def setInvocationType(value: String): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    
    inline def setType(value: Lambda): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
