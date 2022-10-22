package typingsJapgolly.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisConfiguration extends StObject {
  
  /**
    * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the number of records sent per API call.  This option is enabled by default. Record aggregation has important implications for processing records and requires de-aggregation in your stream consumer. To learn more, see KPL Key Concepts and Consumer De-aggregation in the Amazon Kinesis Data Streams Developer Guide.
    */
  var AggregationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
    */
  var StreamArn: Arn
}
object KinesisConfiguration {
  
  inline def apply(StreamArn: Arn): KinesisConfiguration = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisConfiguration]
  }
  
  extension [Self <: KinesisConfiguration](x: Self) {
    
    inline def setAggregationEnabled(value: Boolean): Self = StObject.set(x, "AggregationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAggregationEnabledUndefined: Self = StObject.set(x, "AggregationEnabled", js.undefined)
    
    inline def setStreamArn(value: Arn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}
