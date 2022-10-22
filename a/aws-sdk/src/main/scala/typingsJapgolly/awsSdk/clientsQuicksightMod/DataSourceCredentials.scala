package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceCredentials extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When CopySourceArn is not null, the credential pair from the data source in the ARN is used as the credentials for the DataSourceCredentials structure.
    */
  var CopySourceArn: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.CopySourceArn] = js.undefined
  
  /**
    * Credential pair. For more information, see  CredentialPair .
    */
  var CredentialPair: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.CredentialPair] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the secret associated with the data source in Amazon Secrets Manager.
    */
  var SecretArn: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.SecretArn] = js.undefined
}
object DataSourceCredentials {
  
  inline def apply(): DataSourceCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceCredentials]
  }
  
  extension [Self <: DataSourceCredentials](x: Self) {
    
    inline def setCopySourceArn(value: CopySourceArn): Self = StObject.set(x, "CopySourceArn", value.asInstanceOf[js.Any])
    
    inline def setCopySourceArnUndefined: Self = StObject.set(x, "CopySourceArn", js.undefined)
    
    inline def setCredentialPair(value: CredentialPair): Self = StObject.set(x, "CredentialPair", value.asInstanceOf[js.Any])
    
    inline def setCredentialPairUndefined: Self = StObject.set(x, "CredentialPair", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
  }
}
