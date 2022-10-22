package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventSourceMappingRequest extends StObject {
  
  /**
    * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK) event source.
    */
  var AmazonManagedKafkaEventSourceConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.AmazonManagedKafkaEventSourceConfig] = js.undefined
  
  /**
    * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit for synchronous invocation (6 MB).    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 10,000.    Amazon Simple Queue Service - Default 10. For standard queues the max is 10,000. For FIFO queues the max is 10.    Amazon Managed Streaming for Apache Kafka - Default 100. Max 10,000.    Self-managed Apache Kafka - Default 100. Max 10,000.    Amazon MQ (ActiveMQ and RabbitMQ) - Default 100. Max 10,000.  
    */
  var BatchSize: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.BatchSize] = js.undefined
  
  /**
    * (Streams only) If the function returns an error, split the batch in two and retry.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.BisectBatchOnFunctionError] = js.undefined
  
  /**
    * (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.DestinationConfig] = js.undefined
  
  /**
    * When true, the event source mapping is active. When false, Lambda pauses polling and invocation. Default: True
    */
  var Enabled: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Enabled] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.    Amazon Managed Streaming for Apache Kafka - The ARN of the cluster.  
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * (Streams and Amazon SQS) An object that defines the filter criteria that determine whether Lambda should process an event. For more information, see Lambda event filtering.
    */
  var FilterCriteria: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.FilterCriteria] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: typingsJapgolly.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * (Streams and Amazon SQS) A list of current response type enums applied to the event source mapping.
    */
  var FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList] = js.undefined
  
  /**
    * (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends gathering records before invoking the function. Default: 0 Related setting: When you set BatchSize to a value greater than 10, you must set MaximumBatchingWindowInSeconds to at least 1.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Streams only) Discard records older than the specified age. The default value is infinite (-1).
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.MaximumRecordAgeInSeconds] = js.undefined
  
  /**
    * (Streams only) Discard records after the specified number of retries. The default value is infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined
  
  /**
    * (Streams only) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.ParallelizationFactor] = js.undefined
  
  /**
    *  (MQ) The name of the Amazon MQ broker destination queue to consume. 
    */
  var Queues: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Queues] = js.undefined
  
  /**
    * The self-managed Apache Kafka cluster to receive records from.
    */
  var SelfManagedEventSource: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.SelfManagedEventSource] = js.undefined
  
  /**
    * Specific configuration settings for a self-managed Apache Kafka event source.
    */
  var SelfManagedKafkaEventSourceConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.SelfManagedKafkaEventSourceConfig] = js.undefined
  
  /**
    * An array of authentication protocols or VPC components required to secure your event source.
    */
  var SourceAccessConfigurations: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.SourceAccessConfigurations] = js.undefined
  
  /**
    * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon MSK Streams sources. AT_TIMESTAMP is supported only for Amazon Kinesis streams.
    */
  var StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined
  
  /**
    * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
    */
  var StartingPositionTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Kafka topic.
    */
  var Topics: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Topics] = js.undefined
  
  /**
    * (Streams only) The duration in seconds of a processing window. The range is between 1 second and 900 seconds.
    */
  var TumblingWindowInSeconds: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.TumblingWindowInSeconds] = js.undefined
}
object CreateEventSourceMappingRequest {
  
  inline def apply(FunctionName: FunctionName): CreateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSourceMappingRequest]
  }
  
  extension [Self <: CreateEventSourceMappingRequest](x: Self) {
    
    inline def setAmazonManagedKafkaEventSourceConfig(value: AmazonManagedKafkaEventSourceConfig): Self = StObject.set(x, "AmazonManagedKafkaEventSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setAmazonManagedKafkaEventSourceConfigUndefined: Self = StObject.set(x, "AmazonManagedKafkaEventSourceConfig", js.undefined)
    
    inline def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = StObject.set(x, "BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "BisectBatchOnFunctionError", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "FilterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "FilterCriteria", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionResponseTypes(value: FunctionResponseTypeList): Self = StObject.set(x, "FunctionResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setFunctionResponseTypesUndefined: Self = StObject.set(x, "FunctionResponseTypes", js.undefined)
    
    inline def setFunctionResponseTypesVarargs(value: FunctionResponseType*): Self = StObject.set(x, "FunctionResponseTypes", js.Array(value*))
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    inline def setParallelizationFactor(value: ParallelizationFactor): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    inline def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value*))
    
    inline def setSelfManagedEventSource(value: SelfManagedEventSource): Self = StObject.set(x, "SelfManagedEventSource", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedEventSourceUndefined: Self = StObject.set(x, "SelfManagedEventSource", js.undefined)
    
    inline def setSelfManagedKafkaEventSourceConfig(value: SelfManagedKafkaEventSourceConfig): Self = StObject.set(x, "SelfManagedKafkaEventSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedKafkaEventSourceConfigUndefined: Self = StObject.set(x, "SelfManagedKafkaEventSourceConfig", js.undefined)
    
    inline def setSourceAccessConfigurations(value: SourceAccessConfigurations): Self = StObject.set(x, "SourceAccessConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSourceAccessConfigurationsUndefined: Self = StObject.set(x, "SourceAccessConfigurations", js.undefined)
    
    inline def setSourceAccessConfigurationsVarargs(value: SourceAccessConfiguration*): Self = StObject.set(x, "SourceAccessConfigurations", js.Array(value*))
    
    inline def setStartingPosition(value: EventSourcePosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionTimestamp(value: js.Date): Self = StObject.set(x, "StartingPositionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionTimestampUndefined: Self = StObject.set(x, "StartingPositionTimestamp", js.undefined)
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    inline def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    inline def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value*))
    
    inline def setTumblingWindowInSeconds(value: TumblingWindowInSeconds): Self = StObject.set(x, "TumblingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTumblingWindowInSecondsUndefined: Self = StObject.set(x, "TumblingWindowInSeconds", js.undefined)
  }
}
