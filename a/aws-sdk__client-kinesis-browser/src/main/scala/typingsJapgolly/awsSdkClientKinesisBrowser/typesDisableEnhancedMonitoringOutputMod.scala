package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDisableEnhancedMonitoringOutputMod {
  
  trait DisableEnhancedMonitoringOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Represents the current state of the metrics that are in the enhanced state before the operation.</p>
      */
    var CurrentShardLevelMetrics: js.UndefOr[
        js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
      ] = js.undefined
    
    /**
      * <p>Represents the list of all the metrics that would be in the enhanced state after the operation.</p>
      */
    var DesiredShardLevelMetrics: js.UndefOr[
        js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
      ] = js.undefined
    
    /**
      * <p>The name of the Kinesis data stream.</p>
      */
    var StreamName: js.UndefOr[String] = js.undefined
  }
  object DisableEnhancedMonitoringOutput {
    
    inline def apply($metadata: ResponseMetadata): DisableEnhancedMonitoringOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableEnhancedMonitoringOutput]
    }
    
    extension [Self <: DisableEnhancedMonitoringOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCurrentShardLevelMetrics(
        value: js.Array[
              IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
            ]
      ): Self = StObject.set(x, "CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
      
      inline def setCurrentShardLevelMetricsUndefined: Self = StObject.set(x, "CurrentShardLevelMetrics", js.undefined)
      
      inline def setCurrentShardLevelMetricsVarargs(
        value: (IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String)*
      ): Self = StObject.set(x, "CurrentShardLevelMetrics", js.Array(value*))
      
      inline def setDesiredShardLevelMetrics(
        value: js.Array[
              IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
            ]
      ): Self = StObject.set(x, "DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
      
      inline def setDesiredShardLevelMetricsUndefined: Self = StObject.set(x, "DesiredShardLevelMetrics", js.undefined)
      
      inline def setDesiredShardLevelMetricsVarargs(
        value: (IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String)*
      ): Self = StObject.set(x, "DesiredShardLevelMetrics", js.Array(value*))
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    }
  }
}
