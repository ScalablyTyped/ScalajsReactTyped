package typingsJapgolly.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateScramSecretRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string
  
  /**
    * 
    List of AWS Secrets Manager secret ARNs.
    
    */
  var SecretArnList: listOfString
}
object BatchDisassociateScramSecretRequest {
  
  inline def apply(ClusterArn: string, SecretArnList: listOfString): BatchDisassociateScramSecretRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], SecretArnList = SecretArnList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateScramSecretRequest]
  }
  
  extension [Self <: BatchDisassociateScramSecretRequest](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnList(value: listOfString): Self = StObject.set(x, "SecretArnList", value.asInstanceOf[js.Any])
    
    inline def setSecretArnListVarargs(value: string*): Self = StObject.set(x, "SecretArnList", js.Array(value*))
  }
}
