package typingsJapgolly.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.handlerMod.Callback
import typingsJapgolly.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerKinesisFirehoseTransformationMod {
  
  trait FirehoseRecordMetadata extends StObject {
    
    var approximateArrivalTimestamp: Double
    
    var partitionKey: String
    
    var sequenceNumber: String
    
    var shardId: String
    
    var subsequenceNumber: String
  }
  object FirehoseRecordMetadata {
    
    inline def apply(
      approximateArrivalTimestamp: Double,
      partitionKey: String,
      sequenceNumber: String,
      shardId: String,
      subsequenceNumber: String
    ): FirehoseRecordMetadata = {
      val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], shardId = shardId.asInstanceOf[js.Any], subsequenceNumber = subsequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseRecordMetadata]
    }
    
    extension [Self <: FirehoseRecordMetadata](x: Self) {
      
      inline def setApproximateArrivalTimestamp(value: Double): Self = StObject.set(x, "approximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setShardId(value: String): Self = StObject.set(x, "shardId", value.asInstanceOf[js.Any])
      
      inline def setSubsequenceNumber(value: String): Self = StObject.set(x, "subsequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.Ok
    - typingsJapgolly.awsLambda.awsLambdaStrings.Dropped
    - typingsJapgolly.awsLambda.awsLambdaStrings.ProcessingFailed
  */
  trait FirehoseRecordTransformationStatus extends StObject
  object FirehoseRecordTransformationStatus {
    
    inline def Dropped: typingsJapgolly.awsLambda.awsLambdaStrings.Dropped = "Dropped".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Dropped]
    
    inline def Ok: typingsJapgolly.awsLambda.awsLambdaStrings.Ok = "Ok".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.Ok]
    
    inline def ProcessingFailed: typingsJapgolly.awsLambda.awsLambdaStrings.ProcessingFailed = "ProcessingFailed".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.ProcessingFailed]
  }
  
  type FirehoseTransformationCallback = Callback[FirehoseTransformationResult]
  
  trait FirehoseTransformationEvent extends StObject {
    
    var deliveryStreamArn: String
    
    var invocationId: String
    
    var records: js.Array[FirehoseTransformationEventRecord]
    
    var region: String
    
    var sourceKinesisStreamArn: js.UndefOr[String] = js.undefined
  }
  object FirehoseTransformationEvent {
    
    inline def apply(
      deliveryStreamArn: String,
      invocationId: String,
      records: js.Array[FirehoseTransformationEventRecord],
      region: String
    ): FirehoseTransformationEvent = {
      val __obj = js.Dynamic.literal(deliveryStreamArn = deliveryStreamArn.asInstanceOf[js.Any], invocationId = invocationId.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationEvent]
    }
    
    extension [Self <: FirehoseTransformationEvent](x: Self) {
      
      inline def setDeliveryStreamArn(value: String): Self = StObject.set(x, "deliveryStreamArn", value.asInstanceOf[js.Any])
      
      inline def setInvocationId(value: String): Self = StObject.set(x, "invocationId", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: js.Array[FirehoseTransformationEventRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: FirehoseTransformationEventRecord*): Self = StObject.set(x, "records", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setSourceKinesisStreamArn(value: String): Self = StObject.set(x, "sourceKinesisStreamArn", value.asInstanceOf[js.Any])
      
      inline def setSourceKinesisStreamArnUndefined: Self = StObject.set(x, "sourceKinesisStreamArn", js.undefined)
    }
  }
  
  trait FirehoseTransformationEventRecord extends StObject {
    
    var approximateArrivalTimestamp: Double
    
    /** Base64 encoded */
    var data: String
    
    var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.undefined
    
    var recordId: String
  }
  object FirehoseTransformationEventRecord {
    
    inline def apply(approximateArrivalTimestamp: Double, data: String, recordId: String): FirehoseTransformationEventRecord = {
      val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationEventRecord]
    }
    
    extension [Self <: FirehoseTransformationEventRecord](x: Self) {
      
      inline def setApproximateArrivalTimestamp(value: Double): Self = StObject.set(x, "approximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKinesisRecordMetadata(value: FirehoseRecordMetadata): Self = StObject.set(x, "kinesisRecordMetadata", value.asInstanceOf[js.Any])
      
      inline def setKinesisRecordMetadataUndefined: Self = StObject.set(x, "kinesisRecordMetadata", js.undefined)
      
      inline def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    }
  }
  
  type FirehoseTransformationHandler = Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  
  trait FirehoseTransformationMetadata extends StObject {
    
    var partitionKeys: StringDictionary[String]
  }
  object FirehoseTransformationMetadata {
    
    inline def apply(partitionKeys: StringDictionary[String]): FirehoseTransformationMetadata = {
      val __obj = js.Dynamic.literal(partitionKeys = partitionKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationMetadata]
    }
    
    extension [Self <: FirehoseTransformationMetadata](x: Self) {
      
      inline def setPartitionKeys(value: StringDictionary[String]): Self = StObject.set(x, "partitionKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirehoseTransformationResult extends StObject {
    
    var records: js.Array[FirehoseTransformationResultRecord]
  }
  object FirehoseTransformationResult {
    
    inline def apply(records: js.Array[FirehoseTransformationResultRecord]): FirehoseTransformationResult = {
      val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationResult]
    }
    
    extension [Self <: FirehoseTransformationResult](x: Self) {
      
      inline def setRecords(value: js.Array[FirehoseTransformationResultRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: FirehoseTransformationResultRecord*): Self = StObject.set(x, "records", js.Array(value*))
    }
  }
  
  trait FirehoseTransformationResultRecord extends StObject {
    
    /** Encode in Base64 */
    var data: String
    
    var metadata: js.UndefOr[FirehoseTransformationMetadata] = js.undefined
    
    var recordId: String
    
    var result: FirehoseRecordTransformationStatus
  }
  object FirehoseTransformationResultRecord {
    
    inline def apply(data: String, recordId: String, result: FirehoseRecordTransformationStatus): FirehoseTransformationResultRecord = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationResultRecord]
    }
    
    extension [Self <: FirehoseTransformationResultRecord](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: FirehoseTransformationMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
      
      inline def setResult(value: FirehoseRecordTransformationStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
