package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStreamEncryptionInput extends StObject {
  
  /**
    * The encryption type. The only valid value is KMS.
    */
  var EncryptionType: typingsJapgolly.awsSdk.clientsKinesisMod.EncryptionType
  
  /**
    * The GUID for the customer-managed Amazon Web Services KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: typingsJapgolly.awsSdk.clientsKinesisMod.KeyId
  
  /**
    * The name of the stream on which to stop encrypting records.
    */
  var StreamName: typingsJapgolly.awsSdk.clientsKinesisMod.StreamName
}
object StopStreamEncryptionInput {
  
  inline def apply(EncryptionType: EncryptionType, KeyId: KeyId, StreamName: StreamName): StopStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamEncryptionInput]
  }
  
  extension [Self <: StopStreamEncryptionInput](x: Self) {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
