package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * Describes the number of in-application streams to create. 
    */
  var InputParallelism: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.InputParallelism] = js.undefined
  
  /**
    * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor. 
    */
  var InputProcessingConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfiguration] = js.undefined
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
    */
  var InputSchema: SourceSchema
  
  /**
    * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
    */
  var KinesisFirehoseInput: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseInput] = js.undefined
  
  /**
    * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInput: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsInput] = js.undefined
  
  /**
    * The name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Kinesis Data Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with the names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
    */
  var NamePrefix: InAppStreamName
}
object Input {
  
  inline def apply(InputSchema: SourceSchema, NamePrefix: InAppStreamName): Input = {
    val __obj = js.Dynamic.literal(InputSchema = InputSchema.asInstanceOf[js.Any], NamePrefix = NamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setInputParallelism(value: InputParallelism): Self = StObject.set(x, "InputParallelism", value.asInstanceOf[js.Any])
    
    inline def setInputParallelismUndefined: Self = StObject.set(x, "InputParallelism", js.undefined)
    
    inline def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = StObject.set(x, "InputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "InputProcessingConfiguration", js.undefined)
    
    inline def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseInput(value: KinesisFirehoseInput): Self = StObject.set(x, "KinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseInputUndefined: Self = StObject.set(x, "KinesisFirehoseInput", js.undefined)
    
    inline def setKinesisStreamsInput(value: KinesisStreamsInput): Self = StObject.set(x, "KinesisStreamsInput", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamsInputUndefined: Self = StObject.set(x, "KinesisStreamsInput", js.undefined)
    
    inline def setNamePrefix(value: InAppStreamName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
  }
}
