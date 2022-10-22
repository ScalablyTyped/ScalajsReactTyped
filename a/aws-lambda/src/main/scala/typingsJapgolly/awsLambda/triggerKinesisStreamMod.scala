package typingsJapgolly.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.anon.End
import typingsJapgolly.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerKinesisStreamMod {
  
  trait KinesisStreamBatchItemFailure extends StObject {
    
    var itemIdentifier: String
  }
  object KinesisStreamBatchItemFailure {
    
    inline def apply(itemIdentifier: String): KinesisStreamBatchItemFailure = {
      val __obj = js.Dynamic.literal(itemIdentifier = itemIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamBatchItemFailure]
    }
    
    extension [Self <: KinesisStreamBatchItemFailure](x: Self) {
      
      inline def setItemIdentifier(value: String): Self = StObject.set(x, "itemIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait KinesisStreamBatchResponse extends StObject {
    
    var batchItemFailures: js.Array[KinesisStreamBatchItemFailure]
  }
  object KinesisStreamBatchResponse {
    
    inline def apply(batchItemFailures: js.Array[KinesisStreamBatchItemFailure]): KinesisStreamBatchResponse = {
      val __obj = js.Dynamic.literal(batchItemFailures = batchItemFailures.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamBatchResponse]
    }
    
    extension [Self <: KinesisStreamBatchResponse](x: Self) {
      
      inline def setBatchItemFailures(value: js.Array[KinesisStreamBatchItemFailure]): Self = StObject.set(x, "batchItemFailures", value.asInstanceOf[js.Any])
      
      inline def setBatchItemFailuresVarargs(value: KinesisStreamBatchItemFailure*): Self = StObject.set(x, "batchItemFailures", js.Array(value*))
    }
  }
  
  trait KinesisStreamEvent extends StObject {
    
    var Records: js.Array[KinesisStreamRecord]
  }
  object KinesisStreamEvent {
    
    inline def apply(Records: js.Array[KinesisStreamRecord]): KinesisStreamEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamEvent]
    }
    
    extension [Self <: KinesisStreamEvent](x: Self) {
      
      inline def setRecords(value: js.Array[KinesisStreamRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: KinesisStreamRecord*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  type KinesisStreamHandler = Handler[KinesisStreamEvent, KinesisStreamBatchResponse | Unit]
  
  trait KinesisStreamRecord extends StObject {
    
    var awsRegion: String
    
    var eventID: String
    
    var eventName: String
    
    var eventSource: String
    
    var eventSourceARN: String
    
    var eventVersion: String
    
    var invokeIdentityArn: String
    
    var kinesis: KinesisStreamRecordPayload
  }
  object KinesisStreamRecord {
    
    inline def apply(
      awsRegion: String,
      eventID: String,
      eventName: String,
      eventSource: String,
      eventSourceARN: String,
      eventVersion: String,
      invokeIdentityArn: String,
      kinesis: KinesisStreamRecordPayload
    ): KinesisStreamRecord = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamRecord]
    }
    
    extension [Self <: KinesisStreamRecord](x: Self) {
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setInvokeIdentityArn(value: String): Self = StObject.set(x, "invokeIdentityArn", value.asInstanceOf[js.Any])
      
      inline def setKinesis(value: KinesisStreamRecordPayload): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    }
  }
  
  trait KinesisStreamRecordPayload extends StObject {
    
    var approximateArrivalTimestamp: Double
    
    var data: String
    
    var kinesisSchemaVersion: String
    
    var partitionKey: String
    
    var sequenceNumber: String
  }
  object KinesisStreamRecordPayload {
    
    inline def apply(
      approximateArrivalTimestamp: Double,
      data: String,
      kinesisSchemaVersion: String,
      partitionKey: String,
      sequenceNumber: String
    ): KinesisStreamRecordPayload = {
      val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamRecordPayload]
    }
    
    extension [Self <: KinesisStreamRecordPayload](x: Self) {
      
      inline def setApproximateArrivalTimestamp(value: Double): Self = StObject.set(x, "approximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKinesisSchemaVersion(value: String): Self = StObject.set(x, "kinesisSchemaVersion", value.asInstanceOf[js.Any])
      
      inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<aws-lambda.aws-lambda/trigger/kinesis-stream.KinesisStreamBatchResponse> */
  trait KinesisStreamStateResponse extends StObject {
    
    var batchItemFailures: js.UndefOr[js.Array[KinesisStreamBatchItemFailure]] = js.undefined
    
    var state: StringDictionary[Any]
  }
  object KinesisStreamStateResponse {
    
    inline def apply(state: StringDictionary[Any]): KinesisStreamStateResponse = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamStateResponse]
    }
    
    extension [Self <: KinesisStreamStateResponse](x: Self) {
      
      inline def setBatchItemFailures(value: js.Array[KinesisStreamBatchItemFailure]): Self = StObject.set(x, "batchItemFailures", value.asInstanceOf[js.Any])
      
      inline def setBatchItemFailuresUndefined: Self = StObject.set(x, "batchItemFailures", js.undefined)
      
      inline def setBatchItemFailuresVarargs(value: KinesisStreamBatchItemFailure*): Self = StObject.set(x, "batchItemFailures", js.Array(value*))
      
      inline def setState(value: StringDictionary[Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait KinesisStreamTumblingWindowEvent
    extends StObject
       with KinesisStreamEvent {
    
    var isFinalInvokeForWindow: Boolean
    
    var isWindowTerminatedEarly: Boolean
    
    var state: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var window: End
  }
  object KinesisStreamTumblingWindowEvent {
    
    inline def apply(
      Records: js.Array[KinesisStreamRecord],
      isFinalInvokeForWindow: Boolean,
      isWindowTerminatedEarly: Boolean,
      window: End
    ): KinesisStreamTumblingWindowEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], isFinalInvokeForWindow = isFinalInvokeForWindow.asInstanceOf[js.Any], isWindowTerminatedEarly = isWindowTerminatedEarly.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamTumblingWindowEvent]
    }
    
    extension [Self <: KinesisStreamTumblingWindowEvent](x: Self) {
      
      inline def setIsFinalInvokeForWindow(value: Boolean): Self = StObject.set(x, "isFinalInvokeForWindow", value.asInstanceOf[js.Any])
      
      inline def setIsWindowTerminatedEarly(value: Boolean): Self = StObject.set(x, "isWindowTerminatedEarly", value.asInstanceOf[js.Any])
      
      inline def setState(value: StringDictionary[Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setWindow(value: End): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  type KinesisStreamTumblingWindowHandler = Handler[KinesisStreamTumblingWindowEvent, KinesisStreamStateResponse | Unit]
}
