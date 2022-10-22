package typingsJapgolly.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateMultipartUploadInput extends StObject {
  
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String
  
  /**
    * The archive description that you are uploading in parts. The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB (4096 MB).
    */
  var archiveDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The size of each part except the last, in bytes. The last part can be smaller than this part size.
    */
  var partSize: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the vault.
    */
  var vaultName: String
}
object InitiateMultipartUploadInput {
  
  inline def apply(accountId: String, vaultName: String): InitiateMultipartUploadInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateMultipartUploadInput]
  }
  
  extension [Self <: InitiateMultipartUploadInput](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setArchiveDescription(value: String): Self = StObject.set(x, "archiveDescription", value.asInstanceOf[js.Any])
    
    inline def setArchiveDescriptionUndefined: Self = StObject.set(x, "archiveDescription", js.undefined)
    
    inline def setPartSize(value: String): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    
    inline def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
  }
}
