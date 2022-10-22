package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.triggerCodepipelineMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionConfiguration extends StObject {
  
  var actionConfiguration: Configuration
  
  var artifactCredentials: Credentials
  
  var continuationToken: js.UndefOr[String] = js.undefined
  
  var encryptionKey: js.UndefOr[EncryptionKeytypeKMS] = js.undefined
  
  var inputArtifacts: js.Array[typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact]
  
  var outputArtifacts: js.Array[typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact]
}
object ActionConfiguration {
  
  inline def apply(
    actionConfiguration: Configuration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact],
    outputArtifacts: js.Array[typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact]
  ): ActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration.asInstanceOf[js.Any], artifactCredentials = artifactCredentials.asInstanceOf[js.Any], inputArtifacts = inputArtifacts.asInstanceOf[js.Any], outputArtifacts = outputArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfiguration]
  }
  
  extension [Self <: ActionConfiguration](x: Self) {
    
    inline def setActionConfiguration(value: Configuration): Self = StObject.set(x, "actionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setArtifactCredentials(value: Credentials): Self = StObject.set(x, "artifactCredentials", value.asInstanceOf[js.Any])
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKeytypeKMS): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setInputArtifacts(value: js.Array[typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact]): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsVarargs(value: typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact*): Self = StObject.set(x, "inputArtifacts", js.Array(value*))
    
    inline def setOutputArtifacts(value: js.Array[typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact]): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsVarargs(value: typingsJapgolly.awsLambda.triggerCodepipelineMod.Artifact*): Self = StObject.set(x, "outputArtifacts", js.Array(value*))
  }
}
