package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSHPublicKey extends StObject {
  
  /**
    * The MD5 message digest of the SSH public key.
    */
  var Fingerprint: publicKeyFingerprintType
  
  /**
    * The SSH public key.
    */
  var SSHPublicKeyBody: publicKeyMaterialType
  
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType
  
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType
  
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType
}
object SSHPublicKey {
  
  inline def apply(
    Fingerprint: publicKeyFingerprintType,
    SSHPublicKeyBody: publicKeyMaterialType,
    SSHPublicKeyId: publicKeyIdType,
    Status: statusType,
    UserName: userNameType
  ): SSHPublicKey = {
    val __obj = js.Dynamic.literal(Fingerprint = Fingerprint.asInstanceOf[js.Any], SSHPublicKeyBody = SSHPublicKeyBody.asInstanceOf[js.Any], SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHPublicKey]
  }
  
  extension [Self <: SSHPublicKey](x: Self) {
    
    inline def setFingerprint(value: publicKeyFingerprintType): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSSHPublicKeyBody(value: publicKeyMaterialType): Self = StObject.set(x, "SSHPublicKeyBody", value.asInstanceOf[js.Any])
    
    inline def setSSHPublicKeyId(value: publicKeyIdType): Self = StObject.set(x, "SSHPublicKeyId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUploadDate(value: js.Date): Self = StObject.set(x, "UploadDate", value.asInstanceOf[js.Any])
    
    inline def setUploadDateUndefined: Self = StObject.set(x, "UploadDate", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
