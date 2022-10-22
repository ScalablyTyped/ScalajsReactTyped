package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * The approximate time that the record was inserted into the stream.
    */
  var ApproximateArrivalTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MiB).
    */
  var Data: typingsJapgolly.awsSdk.clientsKinesisMod.Data
  
  /**
    * The encryption type used on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed Amazon Web Services KMS key.  
    */
  var EncryptionType: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisMod.EncryptionType] = js.undefined
  
  /**
    * Identifies which shard in the stream the data record is assigned to.
    */
  var PartitionKey: typingsJapgolly.awsSdk.clientsKinesisMod.PartitionKey
  
  /**
    * The unique identifier of the record within its shard.
    */
  var SequenceNumber: typingsJapgolly.awsSdk.clientsKinesisMod.SequenceNumber
}
object Record {
  
  inline def apply(Data: Data, PartitionKey: PartitionKey, SequenceNumber: SequenceNumber): Record = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setApproximateArrivalTimestamp(value: js.Date): Self = StObject.set(x, "ApproximateArrivalTimestamp", value.asInstanceOf[js.Any])
    
    inline def setApproximateArrivalTimestampUndefined: Self = StObject.set(x, "ApproximateArrivalTimestamp", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
  }
}
