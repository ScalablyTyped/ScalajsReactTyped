package typingsJapgolly.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UNIFORM_SCALING
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsRequestEntryMod.PutRecordsRequestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
    - typingsJapgolly.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def AddTagsToStreamInput(StreamName: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsJapgolly.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput]
    }
    
    inline def CreateStreamInput(ShardCount: Double, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput = {
      val __obj = js.Dynamic.literal(ShardCount = ShardCount.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput]
    }
    
    inline def DecreaseStreamRetentionPeriodInput(RetentionPeriodHours: Double, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput]
    }
    
    inline def DeleteStreamInput(StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput]
    }
    
    inline def DeregisterStreamConsumerInput(): typingsJapgolly.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput]
    }
    
    inline def DescribeLimitsInput(): typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    inline def DescribeStreamConsumerInput(): typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput]
    }
    
    inline def DescribeStreamInput(StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput]
    }
    
    inline def DescribeStreamSummaryInput(StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput]
    }
    
    inline def DisableEnhancedMonitoringInput(
      ShardLevelMetrics: (js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]) | (js.Iterable[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]),
      StreamName: String
    ): typingsJapgolly.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput]
    }
    
    inline def EnableEnhancedMonitoringInput(
      ShardLevelMetrics: (js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]) | (js.Iterable[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]),
      StreamName: String
    ): typingsJapgolly.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput]
    }
    
    inline def GetRecordsInput(ShardIterator: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput = {
      val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput]
    }
    
    inline def GetShardIteratorInput(
      ShardId: String,
      ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
      StreamName: String
    ): typingsJapgolly.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput = {
      val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput]
    }
    
    inline def IncreaseStreamRetentionPeriodInput(RetentionPeriodHours: Double, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput]
    }
    
    inline def ListShardsInput(): typingsJapgolly.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput]
    }
    
    inline def ListStreamConsumersInput(StreamARN: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput = {
      val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput]
    }
    
    inline def ListStreamsInput(): typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput]
    }
    
    inline def ListTagsForStreamInput(StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput]
    }
    
    inline def MergeShardsInput(AdjacentShardToMerge: String, ShardToMerge: String, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput = {
      val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput]
    }
    
    inline def PutRecordInput(
      Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      PartitionKey: String,
      StreamName: String
    ): typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput]
    }
    
    inline def PutRecordsInput(
      Records: js.Array[PutRecordsRequestEntry] | js.Iterable[PutRecordsRequestEntry],
      StreamName: String
    ): typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput]
    }
    
    inline def RegisterStreamConsumerInput(ConsumerName: String, StreamARN: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal(ConsumerName = ConsumerName.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput]
    }
    
    inline def RemoveTagsFromStreamInput(StreamName: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput]
    }
    
    inline def SplitShardInput(NewStartingHashKey: String, ShardToSplit: String, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput = {
      val __obj = js.Dynamic.literal(NewStartingHashKey = NewStartingHashKey.asInstanceOf[js.Any], ShardToSplit = ShardToSplit.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput]
    }
    
    inline def StartStreamEncryptionInput(EncryptionType: NONE | KMS | String, KeyId: String, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput]
    }
    
    inline def StopStreamEncryptionInput(EncryptionType: NONE | KMS | String, KeyId: String, StreamName: String): typingsJapgolly.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput]
    }
    
    inline def UpdateShardCountInput(ScalingType: UNIFORM_SCALING | String, StreamName: String, TargetShardCount: Double): typingsJapgolly.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput = {
      val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput]
    }
  }
}
