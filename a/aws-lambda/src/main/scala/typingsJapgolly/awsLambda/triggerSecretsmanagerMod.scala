package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerSecretsmanagerMod {
  
  trait SecretsManagerRotationEvent extends StObject {
    
    var ClientRequestToken: String
    
    var SecretId: String
    
    var Step: SecretsManagerRotationEventStep
  }
  object SecretsManagerRotationEvent {
    
    inline def apply(ClientRequestToken: String, SecretId: String, Step: SecretsManagerRotationEventStep): SecretsManagerRotationEvent = {
      val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretsManagerRotationEvent]
    }
    
    extension [Self <: SecretsManagerRotationEvent](x: Self) {
      
      inline def setClientRequestToken(value: String): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setSecretId(value: String): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
      
      inline def setStep(value: SecretsManagerRotationEventStep): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.createSecret
    - typingsJapgolly.awsLambda.awsLambdaStrings.setSecret
    - typingsJapgolly.awsLambda.awsLambdaStrings.testSecret
    - typingsJapgolly.awsLambda.awsLambdaStrings.finishSecret
  */
  trait SecretsManagerRotationEventStep extends StObject
  object SecretsManagerRotationEventStep {
    
    inline def createSecret: typingsJapgolly.awsLambda.awsLambdaStrings.createSecret = "createSecret".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.createSecret]
    
    inline def finishSecret: typingsJapgolly.awsLambda.awsLambdaStrings.finishSecret = "finishSecret".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.finishSecret]
    
    inline def setSecret: typingsJapgolly.awsLambda.awsLambdaStrings.setSecret = "setSecret".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.setSecret]
    
    inline def testSecret: typingsJapgolly.awsLambda.awsLambdaStrings.testSecret = "testSecret".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.testSecret]
  }
  
  type SecretsManagerRotationHandler = Handler[SecretsManagerRotationEvent, Unit]
}
